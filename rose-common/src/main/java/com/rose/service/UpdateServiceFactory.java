package com.rose.service;

/**
 * 更新服务工厂
 *
 * @author echo
 */
public interface UpdateServiceFactory {

	/**
	 * 获取更新房量的服务类
	 * 
	 * @param otaCode
	 * @return
	 */
	UpdateInventoryService getUpdateInventoryService(String otaCode);

	/**
	 * 获取更新价格的服务类
	 * 
	 * @param otaCode
	 * @return
	 */
	UpdateRateService getUpdateRateService(String otaCode);
}
