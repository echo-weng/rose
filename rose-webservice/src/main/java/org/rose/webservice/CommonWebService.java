package org.rose.webservice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author Norther
 * 
 */
public abstract class CommonWebService {

	public static final Log LOG = LogFactory.getLog(CommonWebService.class);
	
	public static final String CONTENT_TYPE_TEXT_PLAIN = "text/plain";
	public static final String CONTENT_TYPE_TEXT_XML = "text/xml";
	public static final String DEFAULT_ENCODING = "UTF-8";

    public static Log getStreamLog(String urlAlias) {
        return LogFactory.getLog(CommonWebService.class.getPackage().getName() + ".StreamLog." + urlAlias);
    }

}
