package org.rose.webservice.client.http.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Map;
import java.util.Properties;

import org.rose.webservice.client.http.Constant;
import org.rose.webservice.client.http.HttpConnection;
import org.rose.webservice.client.http.HttpConnectionContext;
import org.rose.webservice.client.http.HttpConnectionWithContext;
import org.rose.webservice.client.http.HttpUtils;
import org.rose.webservice.client.http.Streamable;

/**
 * @author yangyang
 * @since 2009-3-18
 */
public class HttpConnectionWithContextImpl implements HttpConnectionWithContext {
	private HttpConnection httpConnection;
	private HttpConnectionContext httpConnectionContext;

	public HttpConnectionWithContextImpl(HttpConnection httpConnection) {
		this.httpConnection = httpConnection;
	}

	@Override
	public void setHttpMethod(String httpMethod) {
		httpConnection.setHttpMethod(httpMethod);
	}

	@Override
	public void setRequestHeader(String name, String value) {
		httpConnection.setRequestHeader(name, value);
	}

	@Override
	public void setRequestParameter(String name, Object value) {
		httpConnection.setRequestParameter(name, value);
	}

	@Override
	public void setRequestStream(Streamable requestStream) {
		httpConnection.setRequestStream(requestStream);
	}

	@Override
	public InputStream getResponseStream() {
		return httpConnection.getResponseStream();
	}

	@Override
	public Reader getResponseReader() {
		return httpConnection.getResponseReader();
	}

	@Override
	public Properties getResponseHeaders() {
		return httpConnection.getResponseHeaders();
	}

	@Override
	public String getResponseHeader(String name) {
		return httpConnection.getResponseHeader(name);
	}

	@Override
	public int execute() throws IOException {
		if (httpConnectionContext != null) {
			if (httpConnectionContext.getHeaderProperties() != null) {
				for (Object key : httpConnectionContext.getHeaderProperties().keySet()) {
					if (key == null) {
						continue;
					}
					httpConnection.setRequestHeader(key.toString(), httpConnectionContext.getHeaderProperties()
							.getProperty(key.toString()));
				}
			}
			if (httpConnectionContext.getSoapAction() != null) {
				httpConnection.setRequestHeader(HttpConnection.HEADER_SOAP_ACTION,
						httpConnectionContext.getSoapAction());
			}

			if (httpConnectionContext.getSessionId() != null && httpConnectionContext.getSessionName() != null) {
				httpConnection.setRequestHeader(HttpConnection.HEADER_COOKIE, httpConnectionContext.getSessionName()
						+ "=" + httpConnectionContext.getSessionId());
			}

			if (HttpConnectionContext.AUTHENTICATION_BASIC.equals(httpConnectionContext.getAuthentication())) {
				httpConnection.setRequestHeader(
						HttpConnection.HEADER_AUTHORIZATION,
						HttpUtils.getBasicAuthorization(httpConnectionContext.getUsername(),
								httpConnectionContext.getPassword()));
			} else if (httpConnectionContext.getAuthentication() != null) {
				String authentication = httpConnectionContext.getAuthentication();
				throw new IllegalArgumentException("Not support authentication [" + authentication + "]");
			}

			if (httpConnectionContext.getZipType() != null) {
				httpConnection.setRequestHeader(HttpConnection.HEADER_CONTENT_ENCODING,
						httpConnectionContext.getZipType());
			}

			if (httpConnectionContext.isChunk()) {
				httpConnection.setRequestHeader(HttpConnection.HEADER_TRANSFER_ENCODING,
						HttpConnection.HEADER_VALUE_TRANSFER_ENCODING_CHUNK);
			}
		}

		int code = httpConnection.execute();

		String cookie = httpConnection.getResponseHeader(Constant.HTTP_SESSION_DEFAULT);
		if (null != cookie) {
			int beginIndex = cookie.indexOf("=");
			int endIndex = cookie.indexOf(";");
			httpConnectionContext.setSessionName(cookie.substring(0, beginIndex));
			if (endIndex == -1) {
				httpConnectionContext.setSessionId(cookie.substring(beginIndex + 1));
			} else {
				httpConnectionContext.setSessionId(cookie.substring(beginIndex + 1, endIndex));
			}
		}
		return code;
	}

	@Override
	public void close() {
		httpConnection.close();
	}

	@Override
	public String getResponseCharset() {
		return httpConnection.getResponseCharset();
	}

	@Override
	public int getResponseLength() {
		return httpConnection.getResponseLength();
	}

	@Override
	public void setRequestContentType(String contentType, String charset) {
		httpConnection.setRequestContentType(contentType, charset);
	}

	@Override
	public String getResponseContentType() {
		return httpConnection.getResponseContentType();
	}

	public HttpConnectionContext getHttpConnectionContext() {
		return httpConnectionContext;
	}

	public void setHttpConnectionContext(HttpConnectionContext httpConnectionContext) {
		this.httpConnectionContext = httpConnectionContext;
	}

	@Override
	public String getPath() {
		return httpConnection.getPath();
	}

	@Override
	public void setRequestParameters(Map<String, Object> requestParameters) {
		httpConnection.setRequestParameters(requestParameters);
	}

	@Override
	public String getUrlEncoding() {
		return httpConnection.getUrlEncoding();
	}

	@Override
	public void setUrlEncoding(String urlEncoding) {
		httpConnection.setUrlEncoding(urlEncoding);
	}
}
