package org.rose.webservice.client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.rose.webservice.CommonWebService;
import org.rose.webservice.client.http.HttpConnection;
import org.rose.webservice.client.http.StreamableString;
import org.rose.webservice.serializer.StreamSerializer;
import org.rose.webservice.util.IOUtils;

/**
 * template of WebServiceClient to prepare some parameters for http 
 * connection and get response from server,finish marshal and unmarshal
 */
public class WebServiceClientTemplate extends BaseHttpConnectionTemplate implements HttpConnectionTemplate {

	private StreamSerializer streamSerializer;

	private Object request;

	/**
	 * construction of WebServiceClientTemplate to initialize streamSerializer and content type
	 * 
	 * @param streamSerializer
	 * @param request
	 */
    public WebServiceClientTemplate(StreamSerializer streamSerializer,Object request) {
		this.streamSerializer = streamSerializer;
		this.request = request;
        this.setContentType(CommonWebService.CONTENT_TYPE_TEXT_XML);
	}

    /**
	 * set http method and request parameters
	 * 
	 * @param httpConnection <code>HttpConnection</code> http connection can post/get request parameter to server,instance such as link HttpSocketConnection/PoolableHttpSocketConnection/FixedURLConnection
	 */
	@Override
	public void beforeExecute(HttpConnection httpConnection) {
		super.beforeExecute(httpConnection);
        httpConnection.setHttpMethod(HttpConnection.METHOD_POST);
        if(getLog().isInfoEnabled()) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            streamSerializer.marshal(request, byteArrayOutputStream, CommonWebService.DEFAULT_ENCODING);
            String buffer;
            try {
                buffer = byteArrayOutputStream.toString(CommonWebService.DEFAULT_ENCODING);
            } catch (UnsupportedEncodingException e) {
                throw new WebServiceInvocationException(e);
            }
            getLog().info("Request >|" + buffer);
            httpConnection.setRequestStream(new StreamableString(buffer, this.getEncoding()));
        } else {
            httpConnection.setRequestStream(new StreamableObject(streamSerializer, request, this.getEncoding()));
        }
	}

	/**
	 * be used to get response from server
	 * 
	 * @param httpConnection	<code>HttpConnection</code> http connection can post/get request parameter to server,instance such as link HttpSocketConnection/PoolableHttpSocketConnection/FixedURLConnection
	 */
	@Override
	public Object afterExecute(HttpConnection httpConnection) throws IOException {
		InputStream inputStream = httpConnection.getResponseStream();
        String encoding = getEncoding(CommonWebService.DEFAULT_ENCODING);
        if(getLog().isInfoEnabled()) {
            String buffer = IOUtils.readAsString(inputStream, encoding);
            getLog().info("Response <|" + buffer);
            inputStream = new ByteArrayInputStream(buffer.getBytes(encoding));
        }
		return streamSerializer.unmarshal(inputStream, encoding);
	}

	/**
	 * get streamSerializer
	 * 
	 * @return streamSerializer
	 */
	public StreamSerializer getStreamSerializer() {
		return streamSerializer;
	}

	/**
	 * set streamSerializer
	 * 
	 * @param streamSerializer
	 */
	public void setStreamSerializer(StreamSerializer streamSerializer) {
		this.streamSerializer = streamSerializer;
	}

	/**
	 * get request
	 * 
	 * @return	request
	 */
	public Object getRequest() {
		return request;
	}

	/**
	 * set request
	 * 
	 * @param request
	 */
	public void setRequest(Object request) {
		this.request = request;
	}

}
