package com.rose.elong.convert;

import com.rose.domain.InventoryUpdate;
import com.rose.domain.RateUpdate;
import com.rose.domain.reservation.Reservation;
import com.rose.elong.domain.request.ElongAbstractRequest;
import com.rose.elong.domain.request.UpdateRoomRateRequest;
import com.rose.elong.domain.request.UpdateRoomRateStatusRequest;
import com.rose.elong.domain.request.UpdateRoomTypeAmountRequest;
import com.rose.elong.domain.request.UpdateRoomTypeStatusRequest;
import com.rose.elong.domain.reservation.struct.HotelReservation;
import com.rose.entity.HotelMapping;
import com.rose.exception.RequestHandlerException;

/**
 * @author echo
 */
public interface ElongConvertor {
	
	/**
	 * 更新价格 request
	 * 
	 * @param rateUpdate
	 * @return
	 */
	UpdateRoomRateRequest convertToRateUpdate(RateUpdate rateUpdate);
	
	/**
	 * 更新价格状态request
	 * 
	 * @param rateUpdate
	 * @return
	 */
	UpdateRoomRateStatusRequest convertToRateStatusUpdate(RateUpdate rateUpdate);
	
	/**
	 * 更新房量 request
	 * 
	 * @param inventoryUpdate
	 * @return
	 */
	UpdateRoomTypeAmountRequest convertToUpdateRoomTypeAmountUpdate(InventoryUpdate inventoryUpdate);
	
	/**
	 * 更新房量状态 request
	 * 
	 * @param inventoryUpdate
	 * @return
	 */
	UpdateRoomTypeStatusRequest convertToUpdateRoomTypeStatusUpdate(InventoryUpdate inventoryUpdate);
	
	/**
	 * 替换loginToken
	 * 
	 * @param request
	 */
	<T extends ElongAbstractRequest> void replaceLoginToken(T request);
	
	/**
	 * 转化成自己这边的订单
	 * 
	 * @param hotelReservation
	 * @return
	 */
	Reservation convertToReservation(HotelReservation hotelReservation, HotelMapping hotelMapping) throws RequestHandlerException;
	
}
