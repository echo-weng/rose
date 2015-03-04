package org.rose.webservice.client;

import java.util.Map;

import org.rose.webservice.client.http.HttpConnection;
import org.rose.webservice.client.http.HttpConnectionContext;
import org.rose.webservice.client.http.URLWrapper;

/**
 * control session life cycle from begin to end method and provide service method to execute post/get request to server
 * 
 * @author OCEAN
 * 2009-8-3
 */
public class SessionAwareParameterClient extends BaseSessionAwareClient implements
		SessionAwareClient {

	/**
	 * 
     * Construction of SessionAwareParameterClient to initialize client and other parameters executor ,content type , encoding , http connection factory,url encoding
     * 
     */
    public SessionAwareParameterClient() {
        this.setClient(new ParameterClientImpl());
        this.getClient().setExecutor(this.getExecutor());
        this.getClient().setHttpConnectionFactory(this.getHttpConnectionFactory());
        this.setContentType(HttpConnection.DEFAULT_CONTENT_TYPE);
        this.setEncoding(this.getEncoding());
        this.setUrlEncoding(this.getUrlEncoding());
    }
    
    /**
     * service to execute post/get request to server
     * 
     * @param wrapper					<code>URLWrapper</code> url with alias
     * @param parameters				<code>Map</code> key and value of http request parameters
     * @param httpMethod				<code>String</code> http connection method
     * @param httpConnectionContext		<code>HttpConnectionContext</code>	http connection context contain session name and session id
     * @return	string 					response from server
     */
    public String service(URLWrapper wrapper, Map<String, Object> parameters, String httpMethod,
                          HttpConnectionContext httpConnectionContext) {
		ParameterClient parameterClient = (ParameterClient) getClient();
        return parameterClient.service(wrapper, parameters, httpMethod, httpConnectionContext);
	}

    /**
     * a session life begin 
     * 
     * @param wrapper					<code>URLWrapper</code> url with alias
     * @param parameters				<code>Map</code> key and value of http request parameters
     * @param httpMethod				<code>String</code> http connection method
     * @param httpConnectionContext		<code>HttpConnectionContext</code>	http connection context contain session name and session id
     * @return	string 					response from server
     */
    public String begin(URLWrapper wrapper, Map<String, Object> parameters, String httpMethod,
                        HttpConnectionContext httpConnectionContext) {
    	super.setBeginTime(httpConnectionContext.getBeginTime());
        ParameterClient parameterClient = (ParameterClient) getClient();
        return parameterClient.service(wrapper, parameters, httpMethod, httpConnectionContext);
    }

    /**
     * a session life end
     * 
     * @param wrapper					<code>URLWrapper</code> url with alias
     * @param parameters				<code>Map</code> key and value of http request parameters
     * @param httpMethod				<code>String</code> http connection method
     * @param httpConnectionContext		<code>HttpConnectionContext</code>	http connection context contain session name and session id
     * @return	string					response from server
     */
    public String end(URLWrapper wrapper, Map<String, Object> parameters, String httpMethod,
                      HttpConnectionContext httpConnectionContext) {
        ParameterClient parameterClient = (ParameterClient) getClient();
        return parameterClient.service(wrapper, parameters, httpMethod, httpConnectionContext);
    }


}
