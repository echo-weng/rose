package com.rose.mps.convert;

import com.rose.domain.reservation.Reservation;
import com.rose.entity.HotelMapping;
import com.rose.entity.ReservationMapping;
import com.rose.mps.domain.order.publicservice.model.OrderAddRequest;
import com.rose.mps.domain.order.publicservice.model.OrderCancelRequest;

/**
 * 订单转化
 *
 * @author echo
 */
public interface MpsReservationConvertor {
	
	/**
	 * 订单转化
	 * 
	 * @param reservation
	 * @param hotelMapping
	 * @return
	 */
	OrderAddRequest convertToOrderAddRequest(Reservation reservation, HotelMapping hotelMapping);
	
	/**
	 * 转化成订单取消请求
	 * 
	 * @param reservationId
	 * @param hotelMapping
	 * @param reservationMapping
	 * @return
	 */
	OrderCancelRequest convertToOrderCancelRequest(String reservationId, HotelMapping hotelMapping, ReservationMapping reservationMapping);
}
