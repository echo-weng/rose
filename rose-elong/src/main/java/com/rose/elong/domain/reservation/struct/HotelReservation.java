/**
 * 
 */
package com.rose.elong.domain.reservation.struct;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.rose.domain.base.RoseObject;
import com.rose.elong.Global;

/**
 * @author echo
 * 
 */
public class HotelReservation extends RoseObject {

	private List<UniqueID> uniqueIDs;
	private List<RoomStay> roomStays;
	private List<ResGuest> resGuests;
	private ResGlobalInfo resGlobalInfo;

	public List<UniqueID> getUniqueIDs() {
		return uniqueIDs;
	}

	public void setUniqueIDs(List<UniqueID> uniqueIDs) {
		this.uniqueIDs = uniqueIDs;
	}

	public List<RoomStay> getRoomStays() {
		return roomStays;
	}

	public void setRoomStays(List<RoomStay> roomStays) {
		this.roomStays = roomStays;
	}

	public List<ResGuest> getResGuests() {
		return resGuests;
	}

	public void setResGuests(List<ResGuest> resGuests) {
		this.resGuests = resGuests;
	}

	public ResGlobalInfo getResGlobalInfo() {
		return resGlobalInfo;
	}

	public void setResGlobalInfo(ResGlobalInfo resGlobalInfo) {
		this.resGlobalInfo = resGlobalInfo;
	}
	
	public String pickElongResId() {
		return peekResID(Global.ELONG_RES_ID_TYPE);
	}
	
	protected String peekResID(String resIDType) {
		if (CollectionUtils.isEmpty(uniqueIDs)) {
			return null;
		}
		UniqueID uniqueID = findResIdByType(resIDType, uniqueIDs);
		return uniqueID == null ? null : uniqueID.getId();
	}
	
	private UniqueID findResIdByType(String resIDType, List<UniqueID> uniqueIDs) {
		UniqueID uniqueID = null;
		for (UniqueID reservationID : uniqueIDs) {
			if (reservationID.getType().equals(resIDType)) {
				uniqueID = reservationID;
				break;
			}
		}
		return uniqueID;
	}

}
