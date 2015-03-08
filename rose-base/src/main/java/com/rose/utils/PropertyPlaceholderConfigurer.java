package com.rose.utils;

import java.io.File;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;
import org.springframework.core.Ordered;

/**
 * 配置文件
 *
 * @author echo
 */
public class PropertyPlaceholderConfigurer extends
		org.springframework.beans.factory.config.PropertyPlaceholderConfigurer {

	private static final String DEFAULT_ENV = "dev";

	private String env;

	private String configHome;

	private Properties properties;

	public boolean isProduction() {
		return env.equals("production") || env.equals("prod");
	}

	public String getConfigHome() {
		return configHome;
	}
	
	protected Properties loadProperties(String fileName, boolean isDir) {
		String configHome = (this.configHome == null) ? ConfigHome.getDir() : this.configHome;

		env = getEnv(configHome);

		configHome = configHome + "/" + env;

		File configDir = new File(configHome);
		if (configDir.exists() == false) {
			throw new RuntimeException("Not found the configDir=[" + configHome + "].");
		}

		Properties envProps = new Properties();
		for (Entry<Object, Object> entry : System.getProperties().entrySet()) {
			envProps.put(entry.getKey(), entry.getValue());
		}

		String configFile = configHome + "/" + fileName;
		File config = new File(configFile);

		this.configHome = configHome;
		envProps.setProperty("config-home", configHome);
		Properties props = new Properties();

		if(isDir){
			for(File file : config.listFiles()){
				PropertiesFileLoader.load(file, props, envProps);
			}
		}else{
			PropertiesFileLoader.load(config, props, envProps);
		}

		logger.info("Load env properties, fileName=[" + fileName + "], configDir=[" + configHome + "]");

		return props;
	}

	/**
	 * 获取环境
	 * 
	 * @return
	 */
	private String getEnv(String configHome) {
		File envFile = new File(configHome + "/" + "env");
		if (envFile.exists() == false) {
			return DEFAULT_ENV;
		}
		String env = FileUtil.readLine(envFile).trim();
		if (StringUtils.isEmpty(env)) {
			return DEFAULT_ENV;
		}
		return env;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setFileName(String fileName) {
		properties = loadProperties(fileName, false);
		super.setProperties(properties);
	}
	
	public void setFileDir(String dir){
		properties = loadProperties(dir, true);
		super.setProperties(properties);
	}

	@Override
	public int getOrder() {
		return Ordered.HIGHEST_PRECEDENCE;
	}
}