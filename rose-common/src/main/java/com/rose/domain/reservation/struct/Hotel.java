package com.rose.domain.reservation.struct;

import java.util.ArrayList;
import java.util.List;

import com.rose.domain.base.RoseObject;

/**
 * @author echo
 */
public class Hotel extends RoseObject{

	private String code;

	private String name;

	private String description;

	private List<RoomStay> roomStays;

	public synchronized void addRoomStay(RoomStay roomStay) {
		if (roomStays == null) {
			roomStays = new ArrayList<RoomStay>();
		}
		roomStays.add(roomStay);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<RoomStay> getRoomStays() {
		return roomStays;
	}

	public void setRoomStays(List<RoomStay> roomStays) {
		this.roomStays = roomStays;
	}

}