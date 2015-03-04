package org.rose.webservice.client;

import org.rose.webservice.CommonWebService;
import org.rose.webservice.client.http.HttpConnectionContext;
import org.rose.webservice.client.http.URLWrapper;
import org.rose.webservice.serializer.StreamSerializer;

/**
 * Object client realization is used to get some response by get or post
 */
public class WebServiceClient extends BaseClient implements ObjectClient {
	protected StreamSerializer streamSerializer;

	/**
	 * construction of WebServiceClient to initialize executor
	 */
    public WebServiceClient() {
        this.setExecutor(new RetryExecutor());
        this.setContentType(CommonWebService.CONTENT_TYPE_TEXT_XML);
    }

    /**
     * service to post/get request to server without http connection context
     * 
     * @param wrapper	   				<code>URLWrapper</code> url with alias
     * @param request   				<code>Object</code> request content usually is xml file
     */
    public Object service(URLWrapper urlWrapper, Object request) {
		return service(urlWrapper, request, new HttpConnectionContext());
	}

    /**
     * service to post/get request to server with http connection context
     * 
     * @param wrapper	   				<code>URLWrapper</code> url with alias
     * @param request   				<code>Object</code> request content usually is xml file
     * @param httpConnectionContext		<code>HttpConnectionContext</code>	http connection context contain session name and session id 
     */
	public Object service(URLWrapper urlWrapper, Object request,
			HttpConnectionContext httpConnectionContext) {
		HttpConnectionTemplate httpConnectionTemplate = createHttpConnectionTemplate(request);
        httpConnectionTemplate.setLog(CommonWebService.getStreamLog(urlWrapper.getAlias()));
		
        return execute(urlWrapper, httpConnectionContext, httpConnectionTemplate);
	}

	/**
	 * create http connection template instance
	 * 
	 * @param request					<code>Object</code> request content usually is xml file
	 * @return webServiceClientTemplate
	 */
    public HttpConnectionTemplate createHttpConnectionTemplate(Object request) {
        return new WebServiceClientTemplate(streamSerializer, request);
    }

    /**
     * get streamserializer
     * 
     * @param streamSerializer
     * @return streamSerializer
     */
	public StreamSerializer getStreamSerializer() {
		return streamSerializer;
	}

	/**
	 * set streamserializer
	 * 
	 * @param streamSerializer
	 */
	public void setStreamSerializer(StreamSerializer streamSerializer) {
		this.streamSerializer = streamSerializer;
	}

	/**
	 * get retry times
	 * 
	 * @return retry
	 */
	public int getRetry() {
        RetryExecutor retryExecutor = getRetryExecutor();
        return retryExecutor.getRetry();
	}

	/**
	 * get retry executor
	 * 
	 * @return retryExecutor
	 */
    private RetryExecutor getRetryExecutor() {
        if(!(getExecutor() instanceof RetryExecutor)) {
            throw new IllegalStateException("Not a retry executor");
        }
        return (RetryExecutor) getExecutor();
    }

    /**
     * set retry times
     * 
     * @param retry
     */
    public void setRetry(int retry) {
        RetryExecutor retryExecutor = getRetryExecutor();
        retryExecutor.setRetry(retry);
	}

    /**
     * get interval 
     * 
     * @return interval
     */
	public int getInterval() {
        RetryExecutor retryExecutor = getRetryExecutor();
        return retryExecutor.getInterval();
	}

	/**
	 * set interval
	 * 
	 * @param interval
	 */
	public void setInterval(int interval) {
        RetryExecutor retryExecutor = getRetryExecutor();
        retryExecutor.setInterval(interval);
	}

}
