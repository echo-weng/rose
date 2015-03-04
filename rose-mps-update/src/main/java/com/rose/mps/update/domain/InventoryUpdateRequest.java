package com.rose.mps.update.domain;

import java.util.List;

import com.google.common.collect.Lists;
import com.rose.domain.base.RoseObject;
import com.rose.mps.update.service.UpdateInventoryService;
import com.rose.web.request.RoseRequest;

/**
 * 房量domain
 *
 * @author echo
 */
public class InventoryUpdateRequest extends RoseObject implements RoseRequest{

	private List<SingleInventoryUpdate> singleInventoryUpdates = Lists.newArrayList();

	private String hotelCode;
	
	//酒店所属
	private Integer OwerId;
	
	private String token;
	
	private String userName;
	
	private String password;

	public List<SingleInventoryUpdate> getSingleInventoryUpdates() {
		return singleInventoryUpdates;
	}

	public void setSingleInventoryUpdates(List<SingleInventoryUpdate> singleInventoryUpdates) {
		this.singleInventoryUpdates = singleInventoryUpdates;
	}

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public Integer getOwerId() {
		return OwerId;
	}

	public void setOwerId(Integer owerId) {
		OwerId = owerId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
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

	@Override
	public String getHandlerServiceBeanName() {
		return UpdateInventoryService.BEAN_NAME;
	}
	
}
