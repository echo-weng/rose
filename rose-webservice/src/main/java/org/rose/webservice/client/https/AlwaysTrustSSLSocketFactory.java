package org.rose.webservice.client.https;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.rose.webservice.client.http.Constant;

/**
 * AlwaysTrustSSLSocketFactory is the default ssl socket factory which
 * will use the AlwaysX509TrustManager to check the certification and use
 * the default rules to create the ssl socket factory.
 *
 * @version 0.1, 2008-5-27 9:56:39
 * @see AlwaysX509TrustManager
 */
public final class AlwaysTrustSSLSocketFactory extends SSLSocketFactory {
    private SSLSocketFactory sslSocketFactory;

    public AlwaysTrustSSLSocketFactory() {
        try {
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, new TrustManager[]{new AlwaysX509TrustManager()}, new java.security.SecureRandom());
            sslSocketFactory = sslContext.getSocketFactory();
        } catch (NoSuchAlgorithmException e) {
            Constant.LOG.fatal("AlwaysTrustSSLSocketFactory init failed", e);
            throw new RuntimeException(e);
        } catch (KeyManagementException e) {
            Constant.LOG.fatal("AlwaysTrustSSLSocketFactory init failed", e);
            throw new RuntimeException(e);
        }
    }

    public String[] getDefaultCipherSuites() {
        return sslSocketFactory.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return sslSocketFactory.getSupportedCipherSuites();
    }

    public Socket createSocket(Socket socket, String s, int i, boolean b) throws IOException {
        return sslSocketFactory.createSocket(socket, s, i, b);
    }

    public Socket createSocket(String s, int i) throws IOException, UnknownHostException {
        return sslSocketFactory.createSocket(s, i);
    }

    public Socket createSocket(String s, int i, InetAddress inetAddress, int i1) throws IOException, UnknownHostException {
        return sslSocketFactory.createSocket(s,i,inetAddress, i1);
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return sslSocketFactory.createSocket(inetAddress, i);
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress1, int i1) throws IOException {
        return sslSocketFactory.createSocket(inetAddress, i, inetAddress1, i1);
    }

    public Socket createSocket() throws IOException {
        return sslSocketFactory.createSocket();
    }

    public static synchronized SocketFactory getDefault() {
        return new AlwaysTrustSSLSocketFactory();
    }
}

