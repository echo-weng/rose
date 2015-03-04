package com.rose.service;

import com.rose.domain.Contract;
import com.rose.domain.reservation.ActionType;
import com.rose.domain.reservation.CancelConfirmation;
import com.rose.domain.reservation.Reservation;
import com.rose.domain.reservation.ReservationConfirmation;

/**
 * 订单服务
 *
 * @author echo
 */
public interface ReservationService {
	
	/**
	 * Book a reservation from the supplier
	 * 
	 * @param reservation
	 *            a reservation request
	 * @param contract
	 *            contract for supplier and channel
	 * @param action
	 *            booking action, preview or commit
	 * @return the reservationConfirmation
	 * @throws ServiceErrorException
	 *             the exception occured in the service procedure
	 */
	ReservationConfirmation bookReservation(Reservation reservation, Contract contract, ActionType action);

	/**
	 * Modify a reservation from the supplier
	 * 
	 * @param reservation
	 *            a modified reservation request
	 * @param contract
	 *            contract for supplier and channel
	 * @return the reservationConfirmation
	 * @throws ServiceErrorException
	 *             the exception occured in the service procedure
	 */
	ReservationConfirmation modifyReservation(Reservation reservation, Contract contract);

	/**
	 * Cancel a reservation using the resevation id.
	 * 
	 * @param reservationId
	 *            the resevation id.
	 * @param contract
	 *            contract for supplier and channel
	 * @return the cancelConfirmation
	 * @throws ServiceErrorException
	 *             the exception occured in the service procedure
	 */
	CancelConfirmation cancelReservation(String reservationId, Contract contract);
	
}
