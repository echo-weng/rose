package org.rose.webservice.client.http.impl;

import java.io.IOException;
import java.net.Socket;
import java.net.URL;

import javax.net.ssl.SSLSocketFactory;

import org.rose.webservice.client.http.HttpConnection;
import org.rose.webservice.client.http.HttpConnectionFactory;
import org.rose.webservice.client.http.HttpUtils;
import org.rose.webservice.client.http.URLStatus;
import org.rose.webservice.client.http.URLWrapper;

public class HttpSocketConnectionFactory extends BaseConnectionFactory implements HttpConnectionFactory {
	private SSLSocketFactory sslSocketFactory;

	public HttpSocketConnectionFactory() {
		this.initStatus();
	}

	@Override
	public HttpConnection getHttpConnection(URLWrapper urlWrapper) throws IOException {
		HttpSocketConnection httpSocketConnection = new HttpSocketConnection();
		URL url = urlWrapper.getURL();
		Socket socket = SocketUtils.createSocket(getSSLSocketFactory(), url, getURLSetting(urlWrapper.getAlias())
				.getConnectTimeout());
		socket.setSoTimeout(HttpUtils.getTimeoutMilliseconds(getURLSetting(urlWrapper.getAlias()).getTimeout()));
		socket.setKeepAlive(false);
		httpSocketConnection.setSocket(socket);
		httpSocketConnection.setPath(url.getPath());

		httpSocketConnection.setRequestParameters(HttpUtils.getParameters(url));

		URLStatus status = getURLStatus(urlWrapper.getUrlString());
		status.setRunningCount(status.getRunningCount() + 1);

		// TODO: how to release the running count
		return httpSocketConnection;
	}

	public SSLSocketFactory getSSLSocketFactory() {
		return sslSocketFactory;
	}

	public void setSSLSocketFactory(SSLSocketFactory sslSocketFactory) {
		this.sslSocketFactory = sslSocketFactory;
	}
}
