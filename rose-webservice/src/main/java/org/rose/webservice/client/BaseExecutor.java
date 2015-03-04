package org.rose.webservice.client;

import java.io.IOException;

import org.rose.webservice.CommonWebService;
import org.rose.webservice.client.http.HttpConnection;
import org.rose.webservice.client.http.HttpConnectionContext;
import org.rose.webservice.client.http.HttpConnectionFactory;
import org.rose.webservice.client.http.HttpConnectionWithContext;
import org.rose.webservice.client.http.URLWrapper;
import org.rose.webservice.client.http.impl.HttpConnectionWithContextImpl;
import org.rose.webservice.util.IOUtils;

/**
 * classes extends this base class have define method ,example:ControlExecutor 0
 */
public class BaseExecutor implements Executor {

	/**
	 * get http connection without http context
	 * 
	 * @param urlWrapper
	 *            <code>URLWrapper</code> url with alias
	 * @param httpConnectionFactory
	 *            <code>HttpConnectionFactory</code> be used to generate http
	 *            connection ,instance such as HttpSocketConnectionFactory/
	 *            PoolableHttpSocketConnectionFactory/FixedURLConnectionFactory
	 * @return httpConnection <code>HttpConnection</code> http connection can
	 *         post/get request parameter to server,instance such as link
	 *         HttpSocketConnection
	 *         /PoolableHttpSocketConnection/FixedURLConnection
	 * @throws WebServiceInvocationException
	 *             runtime exception
	 */
	private HttpConnection getHttpConnection(URLWrapper urlWrapper, HttpConnectionFactory httpConnectionFactory)
			throws WebServiceInvocationException {
		if (urlWrapper == null) {
			throw new IllegalArgumentException("the argument 'url' is required");
		}
		try {
			return httpConnectionFactory.getHttpConnection(urlWrapper);
		} catch (IOException e) {
			throw new WebServiceInvocationException(e);
		}
	}

	/**
	 * get http connection with http context
	 * 
	 * @param urlWrapper
	 *            <code>URLWrapper</code> url with alias
	 * @param httpConnectionContext
	 *            <code>HttpConnectionContext</code>http connection context
	 * @param httpConnectionFactory
	 *            <code>HttpConnectionFactory</code> be used to generate http
	 *            connection ,instance such as HttpSocketConnectionFactory/
	 *            PoolableHttpSocketConnectionFactory/FixedURLConnectionFactory
	 * @return httpConnectionWithContext <code>HttpConnectionWithContext</code>
	 *         be used to store sessionid in it
	 * @throws WebServiceInvocationException
	 * @throws IOException
	 */
	private HttpConnectionWithContext getHttpConnectionWithContext(URLWrapper urlWrapper,
			HttpConnectionContext httpConnectionContext, HttpConnectionFactory httpConnectionFactory)
			throws WebServiceInvocationException, IOException {
		HttpConnection httpConnection = httpConnectionFactory.getHttpConnection(urlWrapper);
		HttpConnectionWithContext httpConnectionWithContext = new HttpConnectionWithContextImpl(httpConnection);
		httpConnectionWithContext.setHttpConnectionContext(httpConnectionContext);
		return httpConnectionWithContext;
	}

	/**
	 * specific base execute method realization ,all client use this method to
	 * post/get parameters to server
	 * 
	 * @param wrapper
	 *            <code>URLWrapper</code> url with alias
	 * @param httpConnectionContext
	 *            <code>HttpConnectionContext</code>http connection context
	 * @param httpConnectionFactory
	 *            <code>HttpConnectionFactory</code> be used to generate http
	 *            connection ,instance such as HttpSocketConnectionFactory/
	 *            PoolableHttpSocketConnectionFactory/FixedURLConnectionFactory
	 * @param httpConnectionTemplate
	 *            <code>HttpConnectionTemplate</code>http connection (request
	 *            header , http method , content type , url encoding,parameters)
	 *            ready
	 * @return response object
	 */
	public Object execute(URLWrapper wrapper, HttpConnectionContext httpConnectionContext,
			HttpConnectionFactory httpConnectionFactory, HttpConnectionTemplate httpConnectionTemplate) {
		int statusCode;
		Object o = null;
		HttpConnection httpConnection = null;
		try {
			httpConnection = httpConnectionContext == null ? getHttpConnection(wrapper, httpConnectionFactory)
					: getHttpConnectionWithContext(wrapper, httpConnectionContext, httpConnectionFactory);
			if (null != httpConnectionTemplate) {
				httpConnectionTemplate.beforeExecute(httpConnection);
			}
			statusCode = httpConnection.execute();
			if (HttpConnection.STATUS_OK != statusCode) {
				if (HttpConnection.STATUS_FOUND != statusCode) {
					String content;
					try {
						content = IOUtils.readAsString(httpConnection.getResponseReader());
					} catch (IOException e) {
						content = "unknown";
					}
					throw new WebServiceInvocationException("Http unexpected response with code [" + statusCode + "], "
							+ "content [" + content + "]");
				}
			}
			if (null != httpConnectionTemplate) {
				o = httpConnectionTemplate.afterExecute(httpConnection);
			}

		} catch (IOException e) {

			throw new WebServiceInvocationException(e);
		} finally {
			if (httpConnection != null) {
				try {
					httpConnection.close();
				} catch (Exception e) {
					CommonWebService.LOG.error("Close httpConnection [" + httpConnection + "] failed", e);
				}
			}
		}

		return o;
	}
}
