package org.rose.webservice.client;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.rose.webservice.CommonWebService;
import org.rose.webservice.client.http.HttpConnection;
import org.rose.webservice.util.IOUtils;

/**
 * base to initialize some parameters of httpConection such as (url encoding ,
 * request header , content type , encoding) and get response from server
 */
public class BaseHttpConnectionTemplate implements HttpConnectionTemplate {
	private String urlEncoding;

	private String contentType;

	private String encoding;
	private Log log;

	/**
	 * be used to set request header , content type , url encoding , parameters
	 * encoding
	 * 
	 * @param httpConnection
	 *            http connection
	 */
	@Override
	public void beforeExecute(HttpConnection httpConnection) {
		httpConnection.setUrlEncoding(urlEncoding);
		httpConnection.setRequestContentType(contentType, encoding);
		httpConnection.setRequestHeader(HttpConnection.HEADER_ACCEPT_ENCODING,
				HttpConnection.HEADER_VALUE_CONTENT_ENCODING_GZIP);
	}

	/**
	 * be used to get response from server
	 * 
	 * @param httpConnection
	 *            <code>HttpConnection</code> http connection can post/get
	 *            request parameter to server,instance such as link
	 *            HttpSocketConnection
	 *            /PoolableHttpSocketConnection/FixedURLConnection
	 */
	@Override
	public Object afterExecute(HttpConnection httpConnection) throws IOException {
		String result = IOUtils.readAsString(httpConnection.getResponseReader());
		if (getLog().isInfoEnabled()) {
			getLog().info("Response >|" + result);
		}
		return result;
	}

	/**
	 * get url encoding
	 * 
	 * @return urlEncoding
	 */
	public String getUrlEncoding() {
		return urlEncoding;
	}

	/**
	 * set url encoding
	 * 
	 * @param urlEncoding
	 */
	public void setUrlEncoding(String urlEncoding) {
		this.urlEncoding = urlEncoding;
	}

	/**
	 * get content type
	 * 
	 * @return contentType
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * set content type
	 * 
	 * @param content
	 *            type
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * get encoding
	 * 
	 * @return encoding
	 */
	public String getEncoding() {
		return encoding == null ? CommonWebService.DEFAULT_ENCODING : encoding;
	}

	/**
	 * set encoding
	 * 
	 * @param encoding
	 */
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	/**
	 * get encoding
	 * 
	 * @param defaultEncoding
	 * @return encoding
	 */
	public String getEncoding(String defaultEncoding) {
		return encoding == null ? defaultEncoding : encoding;
	}

	/**
	 * get log
	 * 
	 * @return log
	 */
	public Log getLog() {
		return log != null ? log : CommonWebService.getStreamLog("unknown");
	}

	/**
	 * set log
	 * 
	 * @param log
	 */
	public void setLog(Log log) {
		this.log = log;
	}
}
