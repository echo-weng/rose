package org.rose.webservice.client;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.rose.webservice.client.http.HttpConnection;

/**
 * 
 */
public interface HttpConnectionTemplate {
	/**
	 * file MIME type
	 * 
	 * @param contentType
	 */
	void setContentType(String contentType);

	/**
	 * post method params encoding Charset 
	 * 
	 * @param encoding
	 */

	void setEncoding(String encoding);

	/**
	 * get method URL encoding Charset 
	 * 
	 * @param urlEncoding
	 */
	void setUrlEncoding(String urlEncoding);

	/**
	 * prepare httpConnection's params(RequestHeader,RequestContentType,URLEncoding,HttpMethod,data) before execute
	 * 
	 * @param httpConnection           socket connection 
	 */
	void beforeExecute(HttpConnection httpConnection);
	/**
	 * get response and server's session(If necessary) from server 
	 * 
	 * @param httpConnection 			socket connection 
	 * @return always string 
	 * @throws IOException
	 */
	Object afterExecute(HttpConnection httpConnection) throws IOException;
	/**
	 * 
	 * @param log a new log instance binding with URL
	 */
	void setLog(Log log);
}
