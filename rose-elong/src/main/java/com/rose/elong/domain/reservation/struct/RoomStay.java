/**
 * 
 */
package com.rose.elong.domain.reservation.struct;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.rose.domain.base.RoseObject;

/**
 * @author echo
 * 
 */
public class RoomStay extends RoseObject {
	private List<RoomType> roomTypes;
	private List<RatePlan> ratePlans;
	private List<RoomRate> roomRates;
	private List<GuestCount> guestCounts;
	private String hotelCode;

	public List<RoomType> getRoomTypes() {
		return roomTypes;
	}

	public void setRoomTypes(List<RoomType> roomTypes) {
		this.roomTypes = roomTypes;
	}

	public List<RatePlan> getRatePlans() {
		return ratePlans;
	}

	public void setRatePlans(List<RatePlan> ratePlans) {
		this.ratePlans = ratePlans;
	}

	public List<RoomRate> getRoomRates() {
		return roomRates;
	}

	public void setRoomRates(List<RoomRate> roomRates) {
		this.roomRates = roomRates;
	}

	public List<GuestCount> getGuestCounts() {
		return guestCounts;
	}

	public void setGuestCounts(List<GuestCount> guestCounts) {
		this.guestCounts = guestCounts;
	}

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	
	public com.rose.domain.reservation.struct.GuestCount mergeToRoseGuestCount() {
		if (CollectionUtils.isEmpty(guestCounts)) {
			return null;
		}
		com.rose.domain.reservation.struct.GuestCount guestCount = new com.rose.domain.reservation.struct.GuestCount(0, 0);
		for (GuestCount gc : guestCounts) {
			setCount(guestCount, gc);
		}
		guestCount.setAdultCount(guestCount.getAdultCount() == 0 ? null : guestCount.getAdultCount());
		guestCount.setChildCount(guestCount.getChildCount() == 0 ? null : guestCount.getChildCount());
		return guestCount;
	}
	
	private void setCount(com.rose.domain.reservation.struct.GuestCount guestCount, GuestCount gc) {
		if (gc.isAdaultCount()) {
			guestCount.setAdultCount(guestCount.getAdultCount() + gc.getCount());
		} else {
			guestCount.setChildCount(guestCount.getChildCount() + gc.getCount());
		}
	}

}
