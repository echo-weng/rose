package com.rose.service;

import com.rose.domain.InventoryUpdateWrap;
import com.rose.domain.RateUpdateWrap;

/**
 * 酒店集团这边调用的更新服务
 *
 * @author echo
 */
public interface SupplierUpdateService {
	
	void updateInventory(InventoryUpdateWrap inventoryUpdateWrap);
	
	void updateRate(RateUpdateWrap rateUpdateWrap);
	
}
