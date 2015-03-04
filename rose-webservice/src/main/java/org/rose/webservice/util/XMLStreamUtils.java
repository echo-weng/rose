package org.rose.webservice.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

/**
 * @author YangYang
 * @version 0.1, 2008-12-22 11:31:06
 */
public class XMLStreamUtils {

    public static HashMap<String, String> transformMap = new HashMap<String, String>();
    public static HashMap<String, String> parseMap = new HashMap<String, String>();

    static {
        Properties properties = new Properties();
        try {
            properties.load(XMLStreamUtils.class.getResourceAsStream("char.properties"));
        } catch (IOException e) {
            throw new IllegalStateException("package [" + XMLStreamUtils.class.getPackage().getName() + "] /char.properties" );
        }
        for(Object key : properties.keySet()) {
            String keyString = (String) key;
            String value = properties.getProperty(keyString);
            value = "".equals(value) ? " " : value;
            parseMap.put(keyString, value);
            transformMap.put(value, keyString);
        }
    }

    public static String parse(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        int lastPos = 0, pos = 0;
        while (lastPos < string.length()) {
            pos = string.indexOf("&", lastPos);
            if (pos == lastPos) {
                int endPos = string.indexOf(';', pos);
                if(endPos == -1) {
                    stringBuffer.append("&");
                    endPos = pos;
                } else {
                    if (string.charAt(pos + 1) == '#') {
                        int code = Integer.parseInt(string.substring(pos + 2, endPos));
                        stringBuffer.append((char) code);
                    } else {
                        String part = string.substring(pos, endPos + 1);
                        String parsedPart = parseMap.get(part);
                        stringBuffer.append(parsedPart == null ? part : parsedPart);
                    }
                }

                lastPos = endPos + 1;
            } else {
                if (pos == -1) {
                    stringBuffer.append(string.substring(lastPos));
                    lastPos = string.length();
                } else {
                    stringBuffer.append(string.substring(lastPos, pos));
                    lastPos = pos;
                }
            }
        }
        return stringBuffer.toString();
    }
}
