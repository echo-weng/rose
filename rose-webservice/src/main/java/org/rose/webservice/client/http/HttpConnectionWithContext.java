package org.rose.webservice.client.http;

/**
 * @author yangyang
 * @since 2009-3-18
 */
public interface HttpConnectionWithContext extends HttpConnection {

    HttpConnectionContext getHttpConnectionContext();

    void setHttpConnectionContext(HttpConnectionContext httpConnectionContext);
}
