package org.rose.webservice.client.http.impl;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

import org.rose.webservice.client.http.HttpConnection;
import org.rose.webservice.client.http.HttpConnectionFactory;
import org.rose.webservice.client.http.HttpUtils;
import org.rose.webservice.client.http.URLStatus;
import org.rose.webservice.client.http.URLWrapper;

/**
 * Created by IntelliJ IDEA.
 * User: yangy
 * Date: 2009-2-15
 * Time: 23:30:39
 * To change this template use File | Settings | File Templates.
 */
public final class FixedURLConnectionFactory extends BaseConnectionFactory implements HttpConnectionFactory {
    public FixedURLConnectionFactory() {
        this.initStatus();
    }

    @Override
    public HttpConnection getHttpConnection(URLWrapper urlWrapper) throws IOException {
        URL url = urlWrapper.getURL();
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(HttpUtils.getTimeoutMilliseconds(getURLSetting(urlWrapper.getAlias()).getConnectTimeout()));
        httpURLConnection.setReadTimeout(HttpUtils.getTimeoutMilliseconds(getURLSetting(urlWrapper.getAlias()).getTimeout()));

        FixedURLConnection fixedURLConnection = new FixedURLConnection();
        fixedURLConnection.setHttpURLConnection(httpURLConnection);
        fixedURLConnection.setPath(url.getPath());

        fixedURLConnection.setRequestHeader(HttpConnection.HEADER_CONNECTION, HttpConnection.HEADER_VALUE_CONNECTION_CLOSE);

        URLStatus status = getURLStatus(urlWrapper.getUrlString());
        status.setRunningCount(status.getRunningCount() + 1);

        //TODO: how to release the running count
        return fixedURLConnection;
    }

    public void setSSLSocketFactory(SSLSocketFactory sslSocketFactory) {
        HttpsURLConnection.setDefaultSSLSocketFactory(sslSocketFactory);
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        HttpsURLConnection.setDefaultHostnameVerifier(hostnameVerifier);
    }
}
