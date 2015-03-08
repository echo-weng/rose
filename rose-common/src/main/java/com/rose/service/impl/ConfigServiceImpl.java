package com.rose.service.impl;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rose.dao.ConfigDao;
import com.rose.entity.Config;
import com.rose.service.ConfigService;

/**
 * 配置表实现
 *
 * @author echo
 */
@Transactional
@Service("configService")
public class ConfigServiceImpl implements ConfigService, InitializingBean{
	
	/**
	 * 配置存储
	 */
	private Properties properties;
	
	@Autowired
	private ConfigDao configDao;
	
	public void addConfig(Config config){
		configDao.save(config);
		properties.put(config.getName(), config.getValue());
	}
	
	public String getValue(String name){
		return properties.getProperty(name);
	}

	public void updateConfig(Config config){
		configDao.update(config);
		properties.put(config.getName(), config.getValue());
	}
	
	public void setConfigDao(ConfigDao configDao) {
		this.configDao = configDao;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		properties = new Properties();
		
		List<Config> configs = configDao.queryAll();
		for (Config config : configs) {
			properties.put(config.getName(), config.getValue());
		}
	}
}
