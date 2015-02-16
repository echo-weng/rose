package com.rose.utils;

/**
 * 获取配置home路径
 *
 * @author echo
 */
public class ConfigHome {

	public static final String PROPERTY_TI_CONFIG_HOME = "ti.config.home";

	public static String getDir() {
		String configHome = System.getProperty(PROPERTY_TI_CONFIG_HOME);

		if (configHome == null) {
			configHome = System.getProperty("user.home") + "/.rose_config";
		}

		return configHome;
	}

}