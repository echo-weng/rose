package com.rose.service;

import com.rose.domain.Contract;

/**
 * 订单服务工厂类
 *
 * @author echo
 */
public interface ReservationServiceFactory {
	
	ReservationService selReservationService(Contract contract);
	
}
