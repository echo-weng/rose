package com.rose.service;

import com.rose.domain.Contract;
import com.rose.domain.InventoryUpdate;

/**
 * 更新房量服务
 *
 * @author echo
 */
public interface UpdateInventoryService {
	
	/**
	 * 房量更新
	 * 
	 * @param inventoryUpdate
	 * @param contract
	 */
	void updateInventory(InventoryUpdate inventoryUpdate, Contract contract);
	
}
