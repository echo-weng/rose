package com.rose.mps.update.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.rose.domain.Contract;
import com.rose.domain.DateSpan;
import com.rose.domain.OccupancyRate;
import com.rose.domain.Rate;
import com.rose.domain.RateUpdate;
import com.rose.domain.RateUpdateWrap;
import com.rose.domain.SingleRateUpdate;
import com.rose.entity.HotelMapping;
import com.rose.entity.HotelSupply;
import com.rose.exception.RequestHandlerException;
import com.rose.mps.update.domain.RateUpdateRequest;
import com.rose.mps.update.domain.RateUpdateResponse;
import com.rose.service.EntityService;
import com.rose.service.RequestHandlerService;
import com.rose.service.SupplierUpdateService;
import com.rose.web.request.RoseRequest;
import com.rose.web.response.RoseResponse;

/**
 * 更新房价request处理服务
 *
 * @author echo
 */
public class UpdateRateService implements RequestHandlerService {
	public static final String BEAN_NAME = "updateRateService";

	@Autowired
	private SupplierUpdateService supplierUpdateService;

	@Autowired
	private EntityService entityService;
	
	private String userName;
	
	private String password;
	
	@Override
	public RoseResponse handlerRequest(RoseRequest req) throws RequestHandlerException {
		RateUpdateRequest request = (RateUpdateRequest) req;
		if(isValidCredentials(request)){
			throw new RequestHandlerException("001", "用户名密码错误");
		}
		RateUpdate rateUpdate = convertToRateUpdate(request);
		RateUpdateWrap RateUpdateWrap = new RateUpdateWrap(rateUpdate,
				queryContracts(request.getHotelCode()));
		supplierUpdateService.updateRate(RateUpdateWrap);
		return new RateUpdateResponse();
	}

	private List<Contract> queryContracts(String hotelCode) {
		List<HotelMapping> hotelMappings = entityService.queryHotelMappingsByCode(hotelCode);
		Map<Long, HotelSupply> hotelSupplyMap = entityService.getAllHotelSupplyMap();
		
		List<Contract> contracts = new ArrayList<Contract>();
		for (HotelMapping hotelMapping : hotelMappings) {
			HotelSupply hotelSupply = hotelSupplyMap.get(hotelMapping.getHotelSupplyId());
			Contract contract = new Contract();
			contract.setOtaCode(hotelMapping.getOtaCode());
			contract.setSupplyCode(hotelSupply.getSupplyCode());
			
			contracts.add(contract);
		}
		return contracts;
	}
	
	protected boolean isValidCredentials(RateUpdateRequest request) {
		if (userName.equals(request.getUserName()) == false
				|| password.equals(request.getPassword()) == false) {
			return false;
		}
		return true;
	}
	
	private RateUpdate convertToRateUpdate(RateUpdateRequest request) {
		String hotelCode = request.getHotelCode();
		List<SingleRateUpdate> singleRateUpdates = new ArrayList<SingleRateUpdate>();
		for (com.rose.mps.update.domain.SingleRateUpdate singleRateUpdate : request
				.getSingleRateUpdates()) {
			SingleRateUpdate _singleRateUpdate = new SingleRateUpdate();
			_singleRateUpdate.setOccupancyRate(convertToOccupancyRate(singleRateUpdate.getOccupancyRate()));
			_singleRateUpdate.setDateSpan(new DateSpan(singleRateUpdate.getDateSpan().getStartTime(),
					singleRateUpdate.getDateSpan().getEndTime()));
			_singleRateUpdate.setRoomTypeCode(singleRateUpdate.getRoomTypeCode());
			
			singleRateUpdates.add(_singleRateUpdate);
		}
		return new RateUpdate(hotelCode, singleRateUpdates);
	}
	
	private OccupancyRate convertToOccupancyRate(com.rose.mps.update.domain.OccupancyRate occupancyRate){
		OccupancyRate _occupancyRate = new OccupancyRate();
		_occupancyRate.setCurrencyCode(occupancyRate.getCurrencyCode());
		
		List<Rate> rates = new ArrayList<Rate>();
		for (com.rose.mps.update.domain.Rate rate : occupancyRate.getRates()) {
			Rate _rate = new Rate();
			_rate.setAmountAfterTax(rate.getAmountAfterTax());
			_rate.setAmountBeforeTax(rate.getAmountBeforeTax());
			_rate.setGuestCount(rate.getGuestCount());
			
			rates.add(_rate);
		}
		_occupancyRate.setRates(rates);
		
		return _occupancyRate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSupplierUpdateService(SupplierUpdateService supplierUpdateService) {
		this.supplierUpdateService = supplierUpdateService;
	}

	public void setEntityService(EntityService entityService) {
		this.entityService = entityService;
	}

}
