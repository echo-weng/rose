package com.rose.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.util.PropertyPlaceholderHelper;

/**
 * 属性文件加载
 *
 * @author echo
 */
public class PropertiesFileLoader {
	
	private static void loadProperties(Properties props, File config) throws FileNotFoundException, IOException {
		FileUtil.loadProperties(props, config);
	}

	public static void load(File configDir, Properties props, Properties envProps) {
		try {
			loadProperties(props, configDir);
			
			for (Entry<Object, Object> entry : props.entrySet()) {
				String name = (String) entry.getKey();
				String value = (String) entry.getValue();
				if (value.trim().endsWith("#fix")) {
					int idx = value.lastIndexOf("#fix");
					if (idx >= 0) {
						value = value.substring(0, idx).trim();
					}
				}
				if (value.trim().endsWith("#sec")) {
					int idx = value.lastIndexOf("#sec");
					if (idx >= 0) {
						value = value.substring(0, idx).trim();
						value = PropertyCryptoUtil.decrypt(value);
					}
				}

				if (envProps != null) {
					PropertyPlaceholderHelper helper = new PropertyPlaceholderHelper("${", "}");
					value = helper.replacePlaceholders(value, envProps);
				}

				props.setProperty(name, value);
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}