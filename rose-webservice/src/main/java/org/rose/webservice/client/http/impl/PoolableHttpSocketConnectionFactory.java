package org.rose.webservice.client.http.impl;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLSocketFactory;

import org.rose.webservice.client.http.Constant;
import org.rose.webservice.client.http.HttpConnection;
import org.rose.webservice.client.http.HttpUtils;
import org.rose.webservice.client.http.PoolableHttpConnectionFactory;
import org.rose.webservice.client.http.URLPoolSetting;
import org.rose.webservice.client.http.URLSetting;
import org.rose.webservice.client.http.URLStatus;
import org.rose.webservice.client.http.URLWrapper;

/**
 * @author yangyang
 * @since 2009-3-17
 */
public class PoolableHttpSocketConnectionFactory extends BaseConnectionFactory implements PoolableHttpConnectionFactory {
    public static final String SEPARATOR = ":";

    private HashMap<String, SocketPool> socketPools = new HashMap<String, SocketPool>();

    private int idleTimeout = DEFAULT_IDLE_TIMEOUT;

    private boolean idleCheck;

    private ScheduledExecutorService idleCheckScheduler;

    private SSLSocketFactory sslSocketFactory;

    public PoolableHttpSocketConnectionFactory() {
        idleCheck = false;
    }

    @Override
    public HttpConnection getHttpConnection(URLWrapper urlWrapper) throws IOException {
        PoolableHttpSocketConnection httpSocketConnection = new PoolableHttpSocketConnection();
        URL url = urlWrapper.getURL();
        SocketPool socketPool = socketPools.get(urlWrapper.getUrlString());
        if (socketPool == null) {
            socketPool = getSocketPool(urlWrapper);
        }

        httpSocketConnection.setSocketWrapper(socketPool.getSocketWrapper());
        httpSocketConnection.setPath(url.getPath());
        httpSocketConnection.setRequestParameters(HttpUtils.getParameters(url));
        httpSocketConnection.setPoolableHttpSocketConnectionFactory(this);
        return httpSocketConnection;
    }

    private synchronized SocketPool getSocketPool(URLWrapper urlWrapper) throws IOException {
        SocketPool socketPool = socketPools.get(urlWrapper.getUrlString());
        if (socketPool == null) {
            socketPool = new SocketPool((URLPoolSetting) getURLSetting(urlWrapper.getAlias()),
                    urlWrapper.getUrlString());
            socketPool.setSSLSocketFactory(this.getSSLSocketFactory());
            socketPools.put(urlWrapper.getUrlString(), socketPool);
        }
        socketPool.setSocketPoolSetting((URLPoolSetting) getURLSetting(urlWrapper.getAlias()));
        return socketPool;
    }

    public void release(SocketWrapper socketWrapper) {
        if (socketWrapper == null) {
            throw new IllegalArgumentException("Release socket is null");
        }
        socketPools.get(socketWrapper.getURL()).release(socketWrapper);
        if (!idleCheck) {
            scheduleIdleCheck();
        }
    }

    @Override
    public void setIdleTimeout(int second) {
        idleTimeout = second;
    }

    @Override
    public void destroy() {
        for (SocketPool socketPool : this.socketPools.values()) {
            socketPool.closeIdleSocket(-1);
        }
    }

    private synchronized void scheduleIdleCheck() {
        if (idleCheck) {
            return;
        }
        if (Constant.LOG.isDebugEnabled()) {
            Constant.LOG.debug("Idle socket checking scheduled at " + idleTimeout + " second delay");
        }

        Runnable runnable = new Runnable() {
            public void run() {
                closeIdleSocket();

                if (needIdleCheck()) {
                    scheduleIdleCheck();
                } else {
                    idleCheckScheduler.shutdown();
                    idleCheckScheduler = null;
                    idleCheck = false;
                    if (Constant.LOG.isDebugEnabled()) {
                        Constant.LOG.debug("No idle socket");
                    }
                }
            }
        };
        idleCheckScheduler = idleCheckScheduler == null ? Executors.newSingleThreadScheduledExecutor() : idleCheckScheduler;
        idleCheckScheduler.scheduleAtFixedRate(runnable, idleTimeout, idleTimeout/2, TimeUnit.SECONDS);
        idleCheck = true;
    }

    private boolean needIdleCheck() {
        if (Constant.LOG.isDebugEnabled()) {
            Constant.LOG.debug("Idle socket checking");
        }
        for (SocketPool socketPool : this.socketPools.values()) {
            if (socketPool.hasIdleSocket()) {
                return true;
            }
        }
        return false;
    }

    private synchronized void closeIdleSocket() {
        if (Constant.LOG.isDebugEnabled()) {
            Constant.LOG.debug("Idle socket closing");
        }
        for (SocketPool socketPool : this.socketPools.values()) {
            socketPool.closeIdleSocket(HttpUtils.getTimeoutMilliseconds(idleTimeout));
        }
    }

    public SSLSocketFactory getSSLSocketFactory() {
        return sslSocketFactory;
    }

    public void setSSLSocketFactory(SSLSocketFactory sslSocketFactory) {
        this.sslSocketFactory = sslSocketFactory;
    }

    @Override
    public HashMap<String, URLStatus> getStatus() {
        HashMap<String, URLStatus> statuses = new HashMap<String, URLStatus>();
        for (String url : socketPools.keySet()) {
            statuses.put(url, socketPools.get(url).getPoolStatus());
        }
        return statuses;
    }

    @Override
    public URLSetting getDefaultSetting() {
        URLPoolSetting defaultSettingURL = (URLPoolSetting) this.defaultSetting;
        if (defaultSettingURL == null) {
            defaultSettingURL = new URLPoolSetting();
            defaultSettingURL.setTimeout(Constant.DEFAULT_TIMEOUT);
            defaultSettingURL.setConnectTimeout(Constant.DEFAULT_CONNECT_TIMEOUT);
            defaultSettingURL.setMaxSize(DEFAULT_CONNECTION_SIZE);
        }
        return defaultSettingURL;
    }

    @Override
    public void setSettingProperty(String name, String value) {
        HashMap<String, URLSetting> settings = getSettings();
        int index = name.lastIndexOf(PoolableHttpSocketConnectionFactory.SEPARATOR);
        if (index < 1) {
            return;
        }
        String alias = name.substring(0, index);
        URLPoolSetting urlPoolSetting = (URLPoolSetting) settings.get(alias);
        if (urlPoolSetting == null) {
            urlPoolSetting = new URLPoolSetting();
            settings.put(alias, urlPoolSetting);
        }
        String configName = name.substring(index + 1);
        if (configName.equals("connectionTimeout")) {
            urlPoolSetting.setConnectTimeout(Integer.parseInt(value));
        } else if (configName.equals("timeout")) {
            urlPoolSetting.setTimeout(Integer.parseInt(value));
        } else if (configName.equals("maxSize")) {
            urlPoolSetting.setMaxSize(Integer.parseInt(value));
        }
    }

    @Override
    public Properties getSettingProperties() {
        Properties properties = new Properties();
        for (String alias : getSettings().keySet()) {
            URLPoolSetting urlPoolSetting = (URLPoolSetting) getSettings().get(alias);
            properties.setProperty(alias + PoolableHttpSocketConnectionFactory.SEPARATOR + "connectionTimeout", String.valueOf(urlPoolSetting.getConnectTimeout()));
            properties.setProperty(alias + PoolableHttpSocketConnectionFactory.SEPARATOR + "timeout", String.valueOf(urlPoolSetting.getTimeout()));
            properties.setProperty(alias + PoolableHttpSocketConnectionFactory.SEPARATOR + "maxSize", String.valueOf(urlPoolSetting.getMaxSize()));
        }
        return properties;
    }
}
