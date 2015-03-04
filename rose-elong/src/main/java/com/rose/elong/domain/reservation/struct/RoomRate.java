/**
 * 
 */
package com.rose.elong.domain.reservation.struct;

import java.util.List;

import com.rose.domain.base.RoseObject;

/**
 * @author echo
 * 
 */
public class RoomRate extends RoseObject implements Cloneable {

	private String roomTypeCode;
	private String ratePlanCode;
	
	private List<Rate> rates;

	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}

	public String getRatePlanCode() {
		return ratePlanCode;
	}

	public void setRatePlanCode(String ratePlanCode) {
		this.ratePlanCode = ratePlanCode;
	}

	public List<Rate> getRates() {
		return rates;
	}

	public void setRates(List<Rate> rates) {
		this.rates = rates;
	}
	
}
