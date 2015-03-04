package org.rose.webservice.client.http;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

/**
 * 
 * @author Norther
 * 
 */
public interface HttpConnectionFactory {

    HttpConnection getHttpConnection(URLWrapper urlWrapper) throws IOException;

    void setSSLSocketFactory(SSLSocketFactory sslSocketFactory);

    HashMap<String, URLSetting> getSettings();

    void setSettings(HashMap<String, URLSetting> settings);

    URLSetting getDefaultSetting();

    void setDefaultSetting(URLSetting defaultSettingURL);

    Properties getSettingProperties();

    void setSettingProperties(Properties properties);

    void setSettingProperty(String key, String value);

    URLSetting getURLSetting(String alias);

    HashMap<String, URLStatus> getStatus();
}
