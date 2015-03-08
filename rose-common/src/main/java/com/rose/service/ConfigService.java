package com.rose.service;

import com.rose.entity.Config;

/**
 * 配置表
 *
 * @author echo
 */
public interface ConfigService {
	
	/**
	 * 添加配置
	 * 
	 * @param config
	 */
	void addConfig(Config config);
	
	/**
	 * 获取值
	 * 
	 * @param name
	 * @return
	 */
	String getValue(String name);
	
	/**
	 * 更新配置
	 * 
	 * @param config
	 */
	void updateConfig(Config config);
}
