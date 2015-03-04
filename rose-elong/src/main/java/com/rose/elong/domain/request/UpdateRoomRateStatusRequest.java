package com.rose.elong.domain.request;

import java.util.List;

import com.rose.domain.soap.Message;

/**
 * 房价状态更新
 *
 * @author echo
 */
public class UpdateRoomRateStatusRequest extends ElongAbstractRequest implements Message {

	private String hotelCode;

	private List<UpdateRoomRateStatusChangeItem> roomRateList;

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public List<UpdateRoomRateStatusChangeItem> getRoomRateList() {
		return roomRateList;
	}

	public void setRoomRateList(List<UpdateRoomRateStatusChangeItem> roomRateList) {
		this.roomRateList = roomRateList;
	}

}
