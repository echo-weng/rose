package com.rose.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.rose.service.UpdateInventoryService;
import com.rose.service.UpdateRateService;
import com.rose.service.UpdateServiceFactory;

/**
 * 获取更新数据服务类的工厂
 *
 * @author echo
 */
@Service("updateServiceFactory")
public class UpdateServiceFactoryImpl implements UpdateServiceFactory{
	
	private Map<String, UpdateInventoryService> updateInventoryServiceMap;
	
	private Map<String, UpdateRateService> updateRateServiceMap;
	
	public UpdateInventoryService getUpdateInventoryService(String otaCode){
		return updateInventoryServiceMap.get(otaCode);
	}
	
	public UpdateRateService getUpdateRateService(String otaCode){
		return updateRateServiceMap.get(otaCode);
	}
	
}
