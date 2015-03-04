package com.rose.elong.domain.request;

import java.util.List;

import com.rose.domain.soap.Message;

/**
 * 房量更新请求
 *
 * @author echo
 */
public class UpdateRoomTypeAmountRequest extends ElongAbstractRequest implements Message{
	
	private String hotelCode;
	
	private List<UpdateRoomTypeAmountChangeItem> roomTypeList;

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public List<UpdateRoomTypeAmountChangeItem> getRoomTypeList() {
		return roomTypeList;
	}

	public void setRoomTypeList(List<UpdateRoomTypeAmountChangeItem> roomTypeList) {
		this.roomTypeList = roomTypeList;
	}
	
}
