package org.rose.webservice.client;

import org.rose.webservice.client.http.HttpConnectionContext;
import org.rose.webservice.client.http.URLWrapper;
import org.rose.webservice.serializer.StreamSerializer;

/**
 * ObjectClient is used to send request object to get response object
 */
public interface ObjectClient extends Client {
    /**
     * send a request object to a url to get response object
     * @param urlWrapper url with alias
     * @param request the request
     * @return the response object
     */
    public Object service(URLWrapper urlWrapper, Object request);

    /**
     * send a request object to a url to get response object with http
     * connection context
     * @param urlWrapper url with alias
     * @param request the request
     * @param httpConnectionContext the http connection context
     * @return the response object
     */
    public Object service(URLWrapper urlWrapper, Object request,
			HttpConnectionContext httpConnectionContext);

    /**
     * set the stream serializer for object serializing
     * @param streamSerializer the object stream serializer
     */
	void setStreamSerializer(StreamSerializer streamSerializer);

    /**
     * set the retry count
     * @param retry the retry count
     * 
     */
    void setRetry(int retry);

    /**
     * set the interval by seconds between each retry
     * @param interval the interval by seconds
     * 
     */
	void setInterval(int interval);
}
