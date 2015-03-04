package com.rose.domain.reservation.struct;

import com.rose.domain.base.RoseObject;

/**
 * The guest count with a specified room
 * 
 * @author echo
 */
public class GuestCount extends RoseObject{

	private Integer adultCount;

	private Integer childCount;

	public GuestCount() {
		super();
	}

	public GuestCount(Integer adultCount, Integer childCount) {
		super();
		this.adultCount = adultCount;
		this.childCount = childCount;
	}

	public Integer getAdultCount() {
		return adultCount;
	}

	public void setAdultCount(Integer adultCount) {
		this.adultCount = adultCount;
	}

	public Integer getChildCount() {
		return childCount;
	}

	public void setChildCount(Integer childCount) {
		this.childCount = childCount;
	}

}
