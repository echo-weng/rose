package com.rose.mps.update.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.rose.domain.Contract;
import com.rose.domain.DateSpan;
import com.rose.domain.InventoryUpdate;
import com.rose.domain.InventoryUpdateWrap;
import com.rose.domain.SingleInventoryUpdate;
import com.rose.entity.HotelMapping;
import com.rose.entity.HotelSupply;
import com.rose.exception.RequestHandlerException;
import com.rose.mps.update.domain.InventoryUpdateRequest;
import com.rose.mps.update.domain.InventoryUpdateResponse;
import com.rose.service.EntityService;
import com.rose.service.RequestHandlerService;
import com.rose.service.SupplierUpdateService;
import com.rose.web.request.RoseRequest;
import com.rose.web.response.RoseResponse;

/**
 * 更新房量request处理服务
 *
 * @author echo
 */
public class UpdateInventoryService implements RequestHandlerService {
	public static final String BEAN_NAME = "updateInventoryService";

	@Autowired
	private SupplierUpdateService supplierUpdateService;

	@Autowired
	private EntityService entityService;

	private String userName;

	private String password;

	@Override
	public RoseResponse handlerRequest(RoseRequest req) throws RequestHandlerException {
		InventoryUpdateRequest request = (InventoryUpdateRequest) req;
		if (isValidCredentials(request)) {
			throw new RequestHandlerException("001", "用户名密码错误");
		}
		InventoryUpdate inventoryUpdate = convertToInventoryUpdate(request);
		InventoryUpdateWrap inventoryUpdateWrap = new InventoryUpdateWrap(inventoryUpdate,
				queryContracts(request.getHotelCode()));
		supplierUpdateService.updateInventory(inventoryUpdateWrap);
		return new InventoryUpdateResponse();
	}

	protected boolean isValidCredentials(InventoryUpdateRequest request) {
		if (userName.equals(request.getUserName()) == false || password.equals(request.getPassword()) == false) {
			return false;
		}
		return true;
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
		}
		return contracts;
	}

	private InventoryUpdate convertToInventoryUpdate(InventoryUpdateRequest request) {
		String hotelCode = request.getHotelCode();
		List<SingleInventoryUpdate> singleInventoryUpdates = new ArrayList<SingleInventoryUpdate>();
		for (com.rose.mps.update.domain.SingleInventoryUpdate singleInventoryUpdate : request
				.getSingleInventoryUpdates()) {
			SingleInventoryUpdate _singleInventoryUpdate = new SingleInventoryUpdate();
			_singleInventoryUpdate.setCount(singleInventoryUpdate.getCount());
			_singleInventoryUpdate.setDateSpan(new DateSpan(singleInventoryUpdate.getDateSpan().getStartTime(),
					singleInventoryUpdate.getDateSpan().getEndTime()));
			_singleInventoryUpdate.setRoomTypeCode(singleInventoryUpdate.getRoomTypeCode());
		}
		return new InventoryUpdate(hotelCode, singleInventoryUpdates);
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
