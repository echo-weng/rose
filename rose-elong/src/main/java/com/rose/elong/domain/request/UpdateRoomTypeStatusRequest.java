package com.rose.elong.domain.request;

import java.util.List;

import com.rose.domain.soap.Message;

public class UpdateRoomTypeStatusRequest extends ElongAbstractRequest implements Message{

	private String hotelCode;
	
	private List<UpdateRoomTypeStatusChangeItem> roomTypeList;

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public List<UpdateRoomTypeStatusChangeItem> getRoomTypeList() {
		return roomTypeList;
	}

	public void setRoomTypeList(List<UpdateRoomTypeStatusChangeItem> roomTypeList) {
		this.roomTypeList = roomTypeList;
	}
	
}
