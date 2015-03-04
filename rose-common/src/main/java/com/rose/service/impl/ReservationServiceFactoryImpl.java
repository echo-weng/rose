package com.rose.service.impl;

import org.springframework.stereotype.Service;

import com.rose.domain.Contract;
import com.rose.service.ReservationService;
import com.rose.service.ReservationServiceFactory;

/**
 * 订单服务工厂实现类
 *
 * @author echo
 */
@Service("reservationServiceFactory")
public class ReservationServiceFactoryImpl implements ReservationServiceFactory{

	@Override
	public ReservationService selReservationService(Contract contract) {
		return null;
	}

}
