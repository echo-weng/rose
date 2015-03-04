package org.rose.webservice.client;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;

import org.rose.webservice.CommonWebService;
import org.rose.webservice.client.http.HttpConnection;
import org.rose.webservice.client.http.HttpConnectionContext;
import org.rose.webservice.client.http.URLWrapper;
import org.rose.webservice.util.IOUtils;

/**
 * Simple client realization is used to get some response by get or post
 */
public class SimpleClientImpl extends BaseClient implements SimpleClient {

	/**
     * get the response from a url
     *
     * @param urlWrapper url with alias
     * @return the response string
     */
    public String get(URLWrapper wrapper) {
        return get(wrapper, new HttpConnectionContext());
    }

    /**
     * get the response from a url with a http connection context
     *
     * @param urlWrapper            url with alias
     * @param httpConnectionContext the http connection context
     * @return the response string
     */
    public String get(URLWrapper wrapper, HttpConnectionContext httpConnectionContext) {
        return executePostOrGet(wrapper, null, httpConnectionContext, HttpConnection.METHOD_GET);
    }

    /**
     * post some data to a url to get the response
     *
     * @param urlWrapper url with alias
     * @param data       the data to post
     * @return the response string
     */
    public String post(URLWrapper wrapper, String data) {
        return post(wrapper, data, new HttpConnectionContext());
    }

    /**
     * post some datastream to a url to get the response
     *
     * @param urlWrapper url with alias
     * @param dataStream the data stream to post
     * @return the response string
     */
    public InputStream post(URLWrapper wrapper, InputStream dataStream) {
        try {
            String data = IOUtils.readAsString(dataStream, this.getEncoding());
            return new ByteArrayInputStream(post(wrapper, data).getBytes(this.getEncoding()));
        } catch (IOException e) {
            throw new WebServiceInvocationException(e);
        }
    }

    /**
     * post some data in data reader to a url to get the response
     *
     * @param urlWrapper url with alias
     * @param dataReader the data in data reader to post
     * @return the response string
     */
    public Reader post(URLWrapper wrapper, Reader dataReader)  {
        try {
            String data = IOUtils.readAsString(dataReader);
            return new StringReader(post(wrapper, data));
        } catch (IOException e) {
            throw new WebServiceInvocationException(e);
        }
    }
    
    /**
     * get the response from a url with a http connection context
     *
     * @param urlWrapper            url with alias
     * @param data                  the data to post
     * @param httpConnectionContext the http connection context
     * @return the response string
     */
    public String post(URLWrapper wrapper, String data,
                       HttpConnectionContext connectionContext) {
        return executePostOrGet(wrapper, data, connectionContext, HttpConnection.METHOD_POST);
    }

    /**
     * post some datastream to a url to get the response
     *
     * @param urlWrapper            url with alias
     * @param dataStream            the data stream to post
     * @param httpConnectionContext the http connection context
     * @return the response string
     */
    public InputStream post(URLWrapper wrapper, InputStream dataStream,
                            HttpConnectionContext connectionContext) {
        try {
            String data = IOUtils.readAsString(dataStream, this.getEncoding());
            return new ByteArrayInputStream(post(wrapper, data, connectionContext).getBytes(this.getEncoding()));
        } catch (IOException e) {
            throw new WebServiceInvocationException(e);
        }
    }
    
    /**
     * post some data in data reader to a url to get the response
     *
     * @param urlWrapper            url with alias
     * @param dataReader            the data in data reader to post
     * @param httpConnectionContext the http connection context
     * @return the response string
     */
    public Reader post(URLWrapper wrapper, Reader dataReader,
                       HttpConnectionContext connectionContext) {
        try {
            String data = IOUtils.readAsString(dataReader);
            return new StringReader(post(wrapper, data, connectionContext));
        } catch (IOException e) {
            throw new WebServiceInvocationException(e);
        }
    }

    /**
     * get the response from a url with a http connection context use post/get method
     * 
     * @param urlWrapper			url with alias
     * @param data					the data to post or get
     * @param httpConnectionContext	the http connection context
     * @param method				http connection method
     * @return	string 				response from server
     */
    private String executePostOrGet(URLWrapper urlWrapper, String data,
                                    HttpConnectionContext httpConnectionContext, String method) {
        SimpleClientTemplate simpleClientTemplate = new SimpleClientTemplate();
        simpleClientTemplate.setHttpMethod(method);
        simpleClientTemplate.setData(data);
        simpleClientTemplate.setLog(CommonWebService.getStreamLog(urlWrapper.getAlias()));
        Object o = execute(urlWrapper, httpConnectionContext, simpleClientTemplate);
        return o.toString();
    }
}
