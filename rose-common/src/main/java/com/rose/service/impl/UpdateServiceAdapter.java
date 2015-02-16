package com.rose.service.impl;

import org.springframework.stereotype.Service;

import com.rose.domain.Contract;
import com.rose.domain.InventoryUpdate;
import com.rose.domain.RateUpdate;
import com.rose.exception.RoseUpdateException;
import com.rose.service.UpdateInventoryService;
import com.rose.service.UpdateRateService;
import com.rose.service.UpdateServiceFactory;

/**
 * @author echo
 */
@Service("updateServiceAdapter")
public class UpdateServiceAdapter implements UpdateInventoryService, UpdateRateService{
	private UpdateServiceFactory updateServiceFactory;
	
	public void updateRate(RateUpdate rateUpdate, Contract contract) {
		UpdateRateService updateRateService = updateServiceFactory.getUpdateRateService(contract.getOtaCode());
		if(updateRateService == null){
			throw new RoseUpdateException("UpdateRateService no fund for otaCode=[" + contract.getOtaCode() + "]");
		}
		updateRateService.updateRate(rateUpdate, contract);
	}

	public void updateInventory(InventoryUpdate inventoryUpdate, Contract contract) {
		UpdateInventoryService updateInventoryService = updateServiceFactory.getUpdateInventoryService(contract.getOtaCode());
		if(updateInventoryService == null){
			throw new RoseUpdateException("UpdateInventoryService no fund for otaCode=[" + contract.getOtaCode() + "]");
		}
		updateInventoryService.updateInventory(inventoryUpdate, contract);
	}

}
