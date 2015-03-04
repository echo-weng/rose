/**
 * 
 */
package com.rose.elong.domain.reservation.request;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.rose.elong.domain.reservation.ReservationHeader;
import com.rose.elong.domain.reservation.struct.HotelReservation;
import com.rose.elong.domain.reservation.struct.RatePlanPolicy;
import com.rose.elong.domain.reservation.struct.RequestorID;
import com.rose.elong.domain.reservation.struct.RoomStay;
import com.rose.elong.service.impl.CommitReservationService;
import com.rose.web.request.RoseRequest;

/**
 * @author echo
 */
public class HotelResRequest extends ReservationHeader implements RoseRequest {
	private List<HotelReservation> hotelReservations;
	private RatePlanPolicy ratePlanPolicy;
	private RequestorID requestorID;

	public List<HotelReservation> getHotelReservations() {
		return hotelReservations;
	}

	public void setHotelReservations(List<HotelReservation> hotelReservation) {
		this.hotelReservations = hotelReservation;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public RatePlanPolicy getRatePlanPolicy() {
		return ratePlanPolicy;
	}

	public void setRatePlanPolicy(RatePlanPolicy ratePlanPolicy) {
		this.ratePlanPolicy = ratePlanPolicy;
	}

	public RequestorID getRequestorID() {
		return requestorID;
	}

	public void setRequestorID(RequestorID requestorID) {
		this.requestorID = requestorID;
	}
	
	public HotelReservation picHotelReservation() {
		if (CollectionUtils.isEmpty(hotelReservations)) {
			return emptyReservation();
		} else {
			return hotelReservations.get(0);
		}
	}

	private HotelReservation emptyReservation() {
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.setRoomStays(new ArrayList<RoomStay>());
		return hotelReservation;
	}
	
	@Override
	public String getHandlerServiceBeanName() {
		return CommitReservationService.BEAN_NAME;
	}
}
