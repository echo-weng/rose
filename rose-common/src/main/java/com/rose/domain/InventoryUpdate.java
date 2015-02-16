package com.rose.domain;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * 房量domain
 *
 * @author echo
 */
public class InventoryUpdate extends CloneableValueObject {

	private List<SingleInventoryUpdate> singleInventoryUpdates = Lists.newArrayList();

	private String hotelCode;

	public InventoryUpdate(String hotelCode, List<SingleInventoryUpdate> singleInventoryUpdates) {
		this.setHotelCode(hotelCode);
		this.setSingleInventoryUpdates(singleInventoryUpdates);
	}

	public InventoryUpdate(String hotelCode, SingleInventoryUpdate... singleInventoryUpdates) {
		this(hotelCode, Lists.newArrayList(singleInventoryUpdates));
	}

	@Override
	public InventoryUpdate clone() {
		InventoryUpdate clone = (InventoryUpdate) super.clone();
		clone.setSingleInventoryUpdates(Cloneables.clone(singleInventoryUpdates));
		return clone;
	}
	
	public List<SingleInventoryUpdate> getSingleInventoryUpdates() {
		return singleInventoryUpdates;
	}

	public void setSingleInventoryUpdates(List<SingleInventoryUpdate> singleInventoryUpdates) {
		this.singleInventoryUpdates = singleInventoryUpdates;
	}

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

}
