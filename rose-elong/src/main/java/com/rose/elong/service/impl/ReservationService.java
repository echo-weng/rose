package com.rose.elong.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.rose.domain.Contract;
import com.rose.elong.convert.ElongConvertor;
import com.rose.elong.domain.reservation.ReservationHeader;
import com.rose.entity.HotelMapping;
import com.rose.entity.HotelSupply;
import com.rose.exception.RequestHandlerException;
import com.rose.service.EntityService;
import com.rose.service.RequestHandlerService;
import com.rose.service.ReservationServiceFactory;
import com.rose.web.request.RoseRequest;
import com.rose.web.response.RoseResponse;

/**
 * elong订单服务
 *
 * @author echo
 */
public abstract class ReservationService implements RequestHandlerService {
	protected final Log LOG = LogFactory.getLog(this.getClass());

	protected String userName;

	protected String password;

	@Autowired
	protected EntityService entityService;

	@Autowired
	protected ReservationServiceFactory reservationServiceFactory;

	@Autowired
	protected ElongConvertor elongConvertor;

	@Override
	public RoseResponse handlerRequest(RoseRequest request) throws RequestHandlerException {
		ReservationHeader reservationHeader = (ReservationHeader) request;
		if (isValidCredentials(reservationHeader) == false) {
			throw new RequestHandlerException("7000", "用户名密码错误");
		}
		return null;
	}

	protected boolean isValidCredentials(ReservationHeader reservationHeader) {
		if (userName.equals(reservationHeader.getUserName()) == false
				|| password.equals(reservationHeader.getPassword()) == false) {
			return false;
		}
		return true;
	}

	protected Contract createContract(HotelMapping hotelMapping) {
		Contract contract = new Contract();
		HotelSupply hotelSupply = entityService.getHotelSupplyById(hotelMapping.getHotelSupplyId());
		contract.setOtaCode(hotelMapping.getOtaCode());
		contract.setSupplyCode(hotelSupply.getSupplyCode());
		return contract;
	}

	public void setEntityService(EntityService entityService) {
		this.entityService = entityService;
	}

	public void setReservationServiceFactory(ReservationServiceFactory reservationServiceFactory) {
		this.reservationServiceFactory = reservationServiceFactory;
	}

	public void setElongConvertor(ElongConvertor elongConvertor) {
		this.elongConvertor = elongConvertor;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
