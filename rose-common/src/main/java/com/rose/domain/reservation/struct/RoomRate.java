package com.rose.domain.reservation.struct;

import com.rose.domain.base.RoseObject;


public class RoomRate extends RoseObject {

	private DateSpan dateSpan;

	private Rate rate;

	public RoomRate() {
		super();
	}

	public RoomRate(DateSpan dateSpan, Rate rate) {
		super();
		this.dateSpan = dateSpan;
		this.rate = rate;
	}

	public DateSpan getDateSpan() {
		return dateSpan;
	}

	public void setDateSpan(DateSpan dateSpan) {
		this.dateSpan = dateSpan;
	}

	public Rate getRate() {
		return rate;
	}

	public void setRate(Rate rate) {
		this.rate = rate;
	}

}
