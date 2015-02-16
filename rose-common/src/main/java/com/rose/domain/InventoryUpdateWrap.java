package com.rose.domain;

/**
 * InventoryUpdate 包装类
 *
 * @author echo
 */
public class InventoryUpdateWrap {
	
	private InventoryUpdate inventoryUpdate;
	private Contract contract;
	
	public InventoryUpdateWrap(InventoryUpdate inventoryUpdate, Contract contract){
		this.inventoryUpdate = inventoryUpdate;
		this.contract = contract;
	}

	public InventoryUpdate getInventoryUpdate() {
		return inventoryUpdate;
	}

	public void setInventoryUpdate(InventoryUpdate inventoryUpdate) {
		this.inventoryUpdate = inventoryUpdate;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

}
