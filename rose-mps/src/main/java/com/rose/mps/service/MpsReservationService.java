package com.rose.mps.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;

import com.rose.domain.Contract;
import com.rose.domain.reservation.ActionType;
import com.rose.domain.reservation.CancelConfirmation;
import com.rose.domain.reservation.Reservation;
import com.rose.domain.reservation.ReservationConfirmation;
import com.rose.entity.HotelMapping;
import com.rose.entity.HotelSupply;
import com.rose.entity.ReservationMapping;
import com.rose.mps.convert.MpsReservationConvertor;
import com.rose.mps.domain.order.publicservice.InvokeResultBoolean;
import com.rose.mps.domain.order.publicservice.InvokeResultOrderAddResponse;
import com.rose.mps.domain.order.publicservice.model.OrderAddRequest;
import com.rose.mps.domain.order.publicservice.model.OrderAddResponse;
import com.rose.mps.domain.order.publicservice.model.OrderCancelRequest;
import com.rose.service.EntityService;
import com.rose.service.ReservationService;

public class MpsReservationService implements ReservationService{
	
	@Autowired
	private MpsReservationConvertor mpsReservationConvertor;
	
	/**
	 * 服务缓存
	 */
	private Map<Long, IOrderService> hotelServiceMap = new HashMap<Long, IOrderService>();
	
	@Autowired
	private EntityService entityService;
	
	private String username;
	
	private String password;

	@Override
	public ReservationConfirmation bookReservation(Reservation reservation, Contract contract, ActionType action) {
		HotelMapping hotelMapping = entityService.getHotelMappingByCode(contract.getOtaCode(), reservation.getHotel().getCode());
		IOrderService orderService = createOrderService(hotelMapping);
		
		OrderAddRequest orderAddRequest = mpsReservationConvertor.convertToOrderAddRequest(reservation, hotelMapping);
		InvokeResultOrderAddResponse response = orderService.addOrder(orderAddRequest, null, null);
		
		JAXBElement<OrderAddResponse> orderAddResponse = response.getContent();
		ReservationConfirmation confirmation = new ReservationConfirmation();
		confirmation.setSupplierReservationId(orderAddResponse.getValue().getOrderNo().getValue());
		confirmation.setReservationId(reservation.getChannelReservationId());
		
//		ReservationMapping reservationMapping = new ReservationMapping();
//		reservationMapping.setCode(code);
//		reservationMapping.setOrderId(orderId);
//		reservationMapping.setCreateDate(new Date());
//		reservationMapping.setOtaCooperatorCode(otaCooperatorCode);
//		reservationMapping.setStatus(status);
//		reservationMapping.setSuccess(true);
		
		return confirmation;
	}

	@Override
	public ReservationConfirmation modifyReservation(Reservation reservation, Contract contract) {
		return null;
	}

	@Override
	public CancelConfirmation cancelReservation(String reservationId, Contract contract) {
		ReservationMapping reservationMapping = entityService.getReservationMappingByCode(reservationId);
		HotelMapping hotelMapping = entityService.getHotelMappingById(reservationMapping.getHotelMappingId());
		
		OrderCancelRequest orderCancelRequest = mpsReservationConvertor.convertToOrderCancelRequest(reservationId, hotelMapping, reservationMapping);
		IOrderService orderService = createOrderService(hotelMapping);
		InvokeResultBoolean invokeResultBoolean = orderService.cancelOrder(orderCancelRequest, null, null);
		
		if(invokeResultBoolean.isSuccess()){
			return new CancelConfirmation();
		}
		
		return null;
	}

	private IOrderService createOrderService(HotelMapping hotelMapping){
		IOrderService orderService = hotelServiceMap.get(hotelMapping.getHotelSupplyId());
		if(orderService != null){
			return orderService;
		}
		HotelSupply hotelSupply = entityService.getHotelSupplyById(hotelMapping.getHotelSupplyId());
		try {
			Order order = new Order(new URL(hotelSupply.getUrl()), username, password);
			return order.getWs();
		} catch (MalformedURLException e) {
			throw new IllegalAccessError();
		}
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setMpsReservationConvertor(MpsReservationConvertor mpsReservationConvertor) {
		this.mpsReservationConvertor = mpsReservationConvertor;
	}
	
	public void setEntityService(EntityService entityService) {
		this.entityService = entityService;
	}
	
}
