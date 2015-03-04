package com.rose.elong.domain.request;

import java.util.List;

import com.rose.domain.soap.Message;

/**
 * 房价更新
 *
 * @author echo
 */
public class UpdateRoomRateRequest extends ElongAbstractRequest implements Message{

	private String hotelCode;

	private List<UpdateRoomRateAmountsItem> roomAmounts;

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public List<UpdateRoomRateAmountsItem> getRoomAmounts() {
		return roomAmounts;
	}

	public void setRoomAmounts(List<UpdateRoomRateAmountsItem> roomAmounts) {
		this.roomAmounts = roomAmounts;
	}

}
