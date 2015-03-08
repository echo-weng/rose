package com.rose.mps.convert;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rose.domain.reservation.Reservation;
import com.rose.domain.reservation.struct.Guest;
import com.rose.entity.HotelMapping;
import com.rose.entity.ReservationMapping;
import com.rose.mps.domain.order.dal.entity.CheckinType;
import com.rose.mps.domain.order.publicservice.model.ArrayOfGuest;
import com.rose.mps.domain.order.publicservice.model.ObjectFactory;
import com.rose.mps.domain.order.publicservice.model.OrderAddRequest;
import com.rose.mps.domain.order.publicservice.model.OrderCancelRequest;
import com.rose.service.EntityService;

/**
 * @author echo
 */
@Service("mpsReservationConvertor")
public class MpsReservationConvertorImpl implements MpsReservationConvertor {
	
	@Autowired
	private EntityService entityService;

	@Override
	public OrderAddRequest convertToOrderAddRequest(Reservation reservation, HotelMapping hotelMapping) {
		ObjectFactory objectFactory = new ObjectFactory();
		OrderAddRequest orderAddRequest = new OrderAddRequest();
		orderAddRequest.setCheckinType(CheckinType.NORMAL);
//		orderAddRequest.setEstimatedDepartureTime(value);
		//		orderAddRequest.setEstimatedArriveTime(value);
		
		ArrayOfGuest arrayOfGuest = new ArrayOfGuest();
		for(Guest guest : reservation.getGuests()){
			com.rose.mps.domain.order.publicservice.model.Guest mpsGuest = new com.rose.mps.domain.order.publicservice.model.Guest();
			mpsGuest.setEmail(objectFactory.createGuestEmail(guest.getEmail()));
			mpsGuest.setName(objectFactory.createGuestName(guest.getSurname() + " " + guest.getMiddleName() + " " + guest.getGivenName()));
			mpsGuest.setMobile(objectFactory.createGuestMobile(guest.getTelephone()));
			arrayOfGuest.getGuest().add(mpsGuest);
		}
		JAXBElement<ArrayOfGuest> arrayOfGuestElement = objectFactory.createArrayOfGuest(arrayOfGuest);
		orderAddRequest.setGuests(arrayOfGuestElement);
		orderAddRequest.setHotelId(hotelMapping.getHotelId());
//		orderAddRequest.setOrderItemRequests(value);
		
		return orderAddRequest;
	}
	
	@Override
	public OrderCancelRequest convertToOrderCancelRequest(String reservationId, HotelMapping hotelMapping, ReservationMapping reservationMapping) {
		OrderCancelRequest request = new OrderCancelRequest();
		request.setHotelId(hotelMapping.getHotelId());
		request.setOrderId(reservationMapping.getOrderId());
		
		return request;
	}

	public void setEntityService(EntityService entityService) {
		this.entityService = entityService;
	}
	
}
