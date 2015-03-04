package org.rose.webservice.client;

import java.util.Map;

import org.rose.webservice.client.http.HttpConnection;

/**
 * template of ParameterClient to prepare some parameters for http connection and get response from server
 * 
 * @author OCEAN
 * 2009-8-3
 */
public class ParameterClientTemplate extends BaseHttpConnectionTemplate
		implements HttpConnectionTemplate {
	
	private String httpMethod;

	private Map<String, Object> parameters;

	/**
	 * Construction of ParameterClientTemplate with parameters and http method
	 * 
	 * @param parameters	<code>Map</code> key and value of http request parameters
	 * @param httpMethod	<code>String</code> http connection method
	 */
	public ParameterClientTemplate(Map<String, Object> parameters,
			String httpMethod) {
		this.parameters = parameters;
		this.httpMethod = httpMethod;
	}

	/**
	 * get request parameters 
	 * 
	 * @return parameters      <code>Map</code> key and value of http request parameters
	 */
	public Map<String, Object> getParameters() {
		return parameters;
	}

	/**
	 * set request parameters  
	 * 
	 * @param parameters	<code>Map</code> key and value of http request parameters
	 */
	public void setParameters(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	/**
	 * set http method and request parameters
	 * 
	 * @param httpConnection <code>HttpConnection</code> http connection can post/get request parameter to server,instance such as link HttpSocketConnection/PoolableHttpSocketConnection/FixedURLConnection
	 */
	public void beforeExecute(HttpConnection httpConnection) {
		super.beforeExecute(httpConnection);
		httpConnection.setHttpMethod(getHttpMethod());
		httpConnection.setRequestParameters(parameters);
	}

	/**
	 * get http method
	 * 
	 * @return string	post/get
	 */
	public String getHttpMethod() {
		return httpMethod;
	}

	/**
	 * set http method
	 * 
	 * @param httpMethod	http method  post or get
	 */
	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}
}
