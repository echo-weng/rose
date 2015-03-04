package org.rose.webservice.client;

import org.rose.webservice.client.http.HttpConnectionContext;
import org.rose.webservice.client.http.HttpConnectionFactory;
import org.rose.webservice.client.http.URLWrapper;

public interface Executor {
	/**
	 * Classes implementing this interface have a define execute request method
	 * 
	 * @param wrapper					url with alias
	 * @param httpConnectionContext		http content context
	 * @param httpConnectionFactory 	be use to generate http connection ,instance such as HttpSocketConnectionFactory/PoolableHttpSocketConnectionFactory/FixedURLConnectionFactory
	 * @param httpConnectionTemplate	http connection (request header , http method , content type , url encoding,parameters) ready
	 * @return response object
	 */
	Object execute(URLWrapper wrapper,
			HttpConnectionContext httpConnectionContext,
			HttpConnectionFactory httpConnectionFactory,
			HttpConnectionTemplate httpConnectionTemplate);

}
