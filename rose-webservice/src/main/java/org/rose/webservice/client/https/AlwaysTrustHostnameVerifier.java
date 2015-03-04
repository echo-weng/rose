package org.rose.webservice.client.https;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import org.rose.webservice.client.http.Constant;

/**
 * @since 2009-5-8
 */
public final class AlwaysTrustHostnameVerifier implements HostnameVerifier {
    public boolean verify(String s, SSLSession sslSession) {
        Constant.LOG.warn("Ignore host name verifying");
        return true;
    }
}
