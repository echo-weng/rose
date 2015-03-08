package com.rose.elong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rose.domain.Contract;
import com.rose.domain.InventoryUpdate;
import com.rose.domain.RateUpdate;
import com.rose.elong.client.ElongWebClient;
import com.rose.elong.convert.ElongConvertor;
import com.rose.elong.domain.request.UpdateRoomRateRequest;
import com.rose.elong.domain.request.UpdateRoomRateStatusRequest;
import com.rose.elong.domain.request.UpdateRoomTypeAmountRequest;
import com.rose.elong.domain.request.UpdateRoomTypeStatusRequest;
import com.rose.elong.domain.response.ElongResponse;
import com.rose.service.UpdateInventoryService;
import com.rose.service.UpdateRateService;

/**
 * 艺龙状态更新
 *
 * @author echo
 */
@Service("elongUpdateServiceAdapter")
public class ElongUpdateServiceAdapter implements UpdateInventoryService, UpdateRateService {

	@Autowired
	private ElongConvertor elongConvertor;

	@Autowired
	private ElongWebClient elongWebClient;

	public void updateRate(RateUpdate rateUpdate, Contract contract) {
		//更新之前检查loginToken
		beforeUpdate();
		
		UpdateRoomRateRequest rateRequest = elongConvertor.convertToRateUpdate(rateUpdate);
		
		ElongResponse response = elongWebClient.updateRate(rateRequest);
		// 如果登陆验证失效 则重新登陆
		if (elongWebClient.needSend(response)) {
			// 重新登陆
			elongWebClient.loginFetchToken();
			// 替换loginToken
			elongConvertor.replaceLoginToken(rateRequest);
			// 重新发送请求
			elongWebClient.updateRate(rateRequest);
		}

		UpdateRoomRateStatusRequest rateStatusRequest = elongConvertor.convertToRateStatusUpdate(rateUpdate);
		// 这里没有必要验证
		elongWebClient.updateRateStatus(rateStatusRequest);
	}

	public void updateInventory(InventoryUpdate inventoryUpdate, Contract contract) {
		//更新之前检查loginToken
		beforeUpdate();
				
		UpdateRoomTypeAmountRequest inventoryRequest = elongConvertor
				.convertToUpdateRoomTypeAmountUpdate(inventoryUpdate);
		ElongResponse response = elongWebClient.updateInventory(inventoryRequest);
		// 如果登陆验证失效 则重新登陆
		if (elongWebClient.needSend(response)) {
			// 重新登陆
			elongWebClient.loginFetchToken();
			// 替换loginToken
			elongConvertor.replaceLoginToken(inventoryRequest);
			// 重新发送请求
			elongWebClient.updateInventory(inventoryRequest);
		}

		UpdateRoomTypeStatusRequest inventoryStatusRequest = elongConvertor
				.convertToUpdateRoomTypeStatusUpdate(inventoryUpdate);

		elongWebClient.updateInventoryStatus(inventoryStatusRequest);
	}
	
	private void beforeUpdate(){
		if(elongWebClient.loginTokenIsEmpty()){
			// 重新登陆
			elongWebClient.loginFetchToken();
		}
	}
	
	public void setElongConvertor(ElongConvertor elongConvertor) {
		this.elongConvertor = elongConvertor;
	}

	public void setElongWebClient(ElongWebClient elongWebClient) {
		this.elongWebClient = elongWebClient;
	}

}
