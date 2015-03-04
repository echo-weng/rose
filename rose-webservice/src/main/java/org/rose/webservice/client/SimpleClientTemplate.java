package org.rose.webservice.client;

import org.rose.webservice.client.http.HttpConnection;
import org.rose.webservice.client.http.StreamableString;

/**
 * template of SimpleClient to prepare some parameters for http connection and get response from server
 */
public class SimpleClientTemplate extends BaseHttpConnectionTemplate implements HttpConnectionTemplate {

	private String httpMethod;

	private String data;

	/**
	 * set http method and request parameters
	 * 
	 * @param httpConnection <code>HttpConnection</code> http connection can post/get request parameter to server,instance such as link HttpSocketConnection/PoolableHttpSocketConnection/FixedURLConnection
	 */
    @Override
	public void beforeExecute(HttpConnection httpConnection) {
		super.beforeExecute(httpConnection);
        httpConnection.setHttpMethod(getHttpMethod());
		if (HttpConnection.METHOD_POST.equals(getHttpMethod())) {
            if (getLog().isInfoEnabled()) {
                getLog().info("Request >|" + data);
            }
			httpConnection.setRequestStream(new StreamableString(data, getEncoding()));
		}
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
	
	/**
	 * get request data
	 * 
	 * @return data 
	 */
	public String getData() {
		return data;
	}
	
	/**
	 * set request data
	 * 
	 * @param string
	 */
	public void setData(String data) {
		this.data = data;
	}

}
