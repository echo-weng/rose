package com.rose.service.impl;

import org.springframework.stereotype.Service;

import com.rose.domain.Contract;
import com.rose.domain.InventoryUpdate;
import com.rose.domain.RateUpdate;
import com.rose.service.UpdateInventoryService;
import com.rose.service.UpdateRateService;

@Service("elongUpdateServiceAdapter")
public class ElongUpdateServiceAdapter implements UpdateInventoryService, UpdateRateService{

	public void updateRate(RateUpdate rateUpdate, Contract contract) {
	}

	public void updateInventory(InventoryUpdate inventoryUpdate, Contract contract) {
	}

}
