package com.rose.web.response;

/**
 * 虚拟结果类
 *
 * @author echo
 */
public abstract class AbstractRoseResponse implements RoseResponse{
	
	public static final String CONTENT_TYPE_TEXT_PLAIN = "text/plain";
	public static final String CONTENT_TYPE_TEXT_XML = "text/xml";
	public static final String DEFAULT_ENCODING = "UTF-8";

	public String getContentType() {
		return CONTENT_TYPE_TEXT_PLAIN;
	}

	public String getCharacterEncoding() {
		return DEFAULT_ENCODING;
	}

}
