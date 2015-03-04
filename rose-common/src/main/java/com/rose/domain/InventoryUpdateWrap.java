package com.rose.domain;

import java.util.List;

/**
 * InventoryUpdate 包装类
 *
 * @author echo
 */
public class InventoryUpdateWrap {
	
	private InventoryUpdate inventoryUpdate;
	private List<Contract> contracts;
	
	public InventoryUpdateWrap(InventoryUpdate inventoryUpdate, List<Contract> contracts){
		this.inventoryUpdate = inventoryUpdate;
		this.contracts = contracts;
	}

	public InventoryUpdate getInventoryUpdate() {
		return inventoryUpdate;
	}

	public void setInventoryUpdate(InventoryUpdate inventoryUpdate) {
		this.inventoryUpdate = inventoryUpdate;
	}

	public List<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}

}
