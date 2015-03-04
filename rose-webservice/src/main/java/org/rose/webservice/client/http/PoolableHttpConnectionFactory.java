package org.rose.webservice.client.http;

import java.io.IOException;

/**
 * @author yangyang
 * @since 2009-2-16
 */
public interface PoolableHttpConnectionFactory extends HttpConnectionFactory {
    
	int DEFAULT_CONNECTION_SIZE = 5;
   
    int DEFAULT_IDLE_TIMEOUT = 60 * 3;

    void setIdleTimeout(int second);

    void destroy();

    @Override
    HttpConnection getHttpConnection(URLWrapper urlWrapper) throws IOException;
}
