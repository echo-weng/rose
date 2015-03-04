package org.rose.webservice.client.http;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * The contants used in http implementation.
 * @since 2009-5-12
 */
public abstract class Constant {
	
    public static final String LINE_SEPARATOR = "\r\n";

    public static final int DEFAULT_CONNECT_TIMEOUT = 1000 * 3;

    public static final int DEFAULT_TIMEOUT = 1000 * 60 * 3;

    public static final String HTTP_META_DEFAULT_CHARSET = "US-ASCII";

    public static final String HTTP_BODY_DEFAULT_CHARSET = "UTF-8";
    
    public static final String HTTP_SESSION_DEFAULT = "Set-Cookie";
    
    public static final Log LOG = LogFactory.getLog(Constant.class.getPackage().getName());

}
