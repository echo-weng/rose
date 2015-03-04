package org.rose.webservice.client.http.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;

import javax.net.ssl.SSLSocketFactory;

import org.rose.webservice.client.http.HttpUtils;

public abstract class SocketUtils {

    public static Socket createSocket(SSLSocketFactory sslSocketFactory, URL url, int connnectTimeout)
            throws IOException {
        int port = url.getPort();
        if (port == -1 && "http".equals(url.getProtocol())) {
            port = 80;
        } else if (port == -1 && "https".equals(url.getProtocol())) {
            port = 443;
        }

        Socket socket;
        if ("http".equals(url.getProtocol())) {
            socket = new Socket();
        } else if ("https".equals(url.getProtocol())) {
            socket = sslSocketFactory.createSocket();
        } else {
            throw new IllegalArgumentException("Illegal protocol [" + url.getProtocol() + "]");
        }

        InetSocketAddress inetSocketAddress =
                new InetSocketAddress(InetAddress.getByName(url.getHost()), port);
        socket.connect(inetSocketAddress, HttpUtils.getTimeoutMilliseconds(connnectTimeout));
        return socket;
    }
    
}
