package com.rose.domain.reservation.struct;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.rose.domain.base.RoseObject;

/**
 * The room stay represents a booking unit of a room. It is related with the
 * Availability and Reservation
 * 
 * @author YangYang
 * @version 0.1, 2007-9-28 15:41:41
 * @see com.derby.nuke.rac.model.Availability
 * @see com.derby.nuke.rac.model.Reservation
 */
public class RoomStay extends RoseObject{

	private DateSpan dateSpan;

	private String roomTypeCode;

	private String roomTypeName;

	private String ratePlanCode;

	private String ratePlanName;

	private GuestCount guestCount;

	private Integer roomCount;

	private List<RoomRate> roomRates;

	private String description;

	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public synchronized void setProperty(String key, String value) {
		if (properties == null) {
			properties = new Properties();
		}
		properties.setProperty(key, value);
	}

	public synchronized String getProperty(String key) {
		if (properties == null) {
			return null;
		}
		return properties.getProperty(key);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DateSpan getDateSpan() {
		return dateSpan;
	}

	public void setDateSpan(DateSpan dateSpan) {
		this.dateSpan = dateSpan;
	}

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

	public GuestCount getGuestCount() {
		return guestCount;
	}

	public void setGuestCount(GuestCount guestCount) {
		this.guestCount = guestCount;
	}

	public Integer getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(Integer roomCount) {
		this.roomCount = roomCount;
	}

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public String getRatePlanName() {
		return ratePlanName;
	}

	public void setRatePlanName(String ratePlanName) {
		this.ratePlanName = ratePlanName;
	}

	public List<RoomRate> getRoomRates() {
		return roomRates;
	}

	public void setRoomRates(List<RoomRate> roomRates) {
		this.roomRates = roomRates;
	}

	public synchronized void addRoomRate(RoomRate roomRate) {
		if (roomRates == null) {
			roomRates = new ArrayList<RoomRate>();
		}
		roomRates.add(roomRate);
	}

}
