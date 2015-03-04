package org.rose.webservice.client.http.impl;

import java.util.HashMap;
import java.util.Properties;

import org.rose.webservice.client.http.Constant;
import org.rose.webservice.client.http.HttpConnectionFactory;
import org.rose.webservice.client.http.URLSetting;
import org.rose.webservice.client.http.URLStatus;

/**
 * @author yangyang
 * @since 2009-2-28
 */
public abstract class BaseConnectionFactory implements HttpConnectionFactory {
    protected HashMap<String, URLSetting> settings;
    protected URLSetting defaultSetting;
    private HashMap<String, URLStatus> status;

    public HashMap<String, URLSetting> getSettings() {
        return settings;
    }

    public void setSettings(HashMap<String, URLSetting> settings) {
        this.settings = settings;
    }

    public synchronized URLSetting getDefaultSetting() {
        if(defaultSetting == null) {
            defaultSetting = new URLSetting();
            defaultSetting.setTimeout(Constant.DEFAULT_TIMEOUT);
            defaultSetting.setConnectTimeout(Constant.DEFAULT_CONNECT_TIMEOUT);
        }
        return defaultSetting;
    }

    public URLSetting getURLSetting(String alias) {
        URLSetting URLSetting;
        if(settings == null) {
            return getDefaultSetting();
        }
        URLSetting = this.getSettings().get(alias);
        if(URLSetting == null) {
            URLSetting = getDefaultSetting();
        }
        return URLSetting;
    }

    public void setDefaultSetting(URLSetting defaultSettingURL) {
        this.defaultSetting = defaultSettingURL;
    }

    @Override
    public Properties getSettingProperties() {
        Properties properties = new Properties();
        for(String alias : getSettings().keySet()) {
            URLSetting URLSetting = getSettings().get(alias);
            properties.setProperty(alias + PoolableHttpSocketConnectionFactory.SEPARATOR + "connectionTimeout", String.valueOf(URLSetting.getConnectTimeout()));
            properties.setProperty(alias + PoolableHttpSocketConnectionFactory.SEPARATOR + "timeout", String.valueOf(URLSetting.getTimeout()));
        }
        return properties;
    }

    @Override
    public void setSettingProperties(Properties properties) {
        HashMap<String, URLSetting> settings = new HashMap<String, URLSetting>();
        this.setSettings(settings);
        for(Object key : properties.keySet()) {
            String name = (String) key;
            String value = properties.getProperty(name);
            setSettingProperty(name, value);
        }
    }

    @Override
    public void setSettingProperty(String name, String value) {
        HashMap<String, URLSetting> settings = getSettings();
        int index = name.lastIndexOf(PoolableHttpSocketConnectionFactory.SEPARATOR);
        if(index < 1) {
            return;
        }
        String alias = name.substring(0, index);
        URLSetting URLSetting = settings.get(alias);
        if (URLSetting == null) {
            URLSetting = new URLSetting();
            settings.put(alias, URLSetting);
        }
        String configName = name.substring(index + 1);
        if (configName.equals("connectionTimeout")) {
            URLSetting.setConnectTimeout(Integer.parseInt(value));
        } else if (configName.equals("timeout")) {
            URLSetting.setTimeout(Integer.parseInt(value));
        }
    }

    protected void initStatus() {
        status = new HashMap<String, URLStatus>();
    }

    protected URLStatus getURLStatus(String url) {
        URLStatus urlStatus = status.get(url);
        if(urlStatus == null) {
            urlStatus = new URLStatus();
            status.put(url, urlStatus);
        }
        return urlStatus;
    }

    @Override
    public HashMap<String, URLStatus> getStatus() {
        return status;
    }
}
