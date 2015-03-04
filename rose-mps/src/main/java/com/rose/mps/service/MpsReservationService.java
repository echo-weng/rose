package com.rose.mps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rose.domain.Contract;
import com.rose.domain.reservation.ActionType;
import com.rose.domain.reservation.CancelConfirmation;
import com.rose.domain.reservation.Reservation;
import com.rose.domain.reservation.ReservationConfirmation;
import com.rose.mps.convert.MpsReservationConvertor;
import com.rose.service.ReservationService;

@Service("mpsReservationService")
public class MpsReservationService implements ReservationService{
	
	@Autowired
	private MpsReservationConvertor mpsReservationConvertor;
	
	@Autowired
	private IHotelService hotelService;

	@Override
	public ReservationConfirmation bookReservation(Reservation reservation, Contract contract, ActionType action) {
		return null;
	}

	@Override
	public ReservationConfirmation modifyReservation(Reservation reservation, Contract contract) {
		return null;
	}

	@Override
	public CancelConfirmation cancelReservation(String reservationId, Contract contract) {
		return null;
	}

	public void setMpsReservationConvertor(MpsReservationConvertor mpsReservationConvertor) {
		this.mpsReservationConvertor = mpsReservationConvertor;
	}
	
	public void setHotelService(IHotelService hotelService) {
		this.hotelService = hotelService;
	}
	
}
