package com.rose.elong.client;

import com.rose.elong.domain.request.RequestHead;
import com.rose.elong.domain.request.UpdateRoomRateRequest;
import com.rose.elong.domain.request.UpdateRoomRateStatusRequest;
import com.rose.elong.domain.request.UpdateRoomTypeAmountRequest;
import com.rose.elong.domain.request.UpdateRoomTypeStatusRequest;
import com.rose.elong.domain.response.ElongResponse;

/**
 * 艺龙客户端交互接口
 *
 * @author echo
 */
public interface ElongWebClient {

	/**
	 * 获取token
	 */
	void loginFetchToken();
	
	/**
	 * 判断loginToken是否为空
	 * 
	 * @return
	 */
	boolean loginTokenIsEmpty();

	/**
	 * 更新价格
	 * 
	 * @param rateRequest
	 */
	ElongResponse updateRate(UpdateRoomRateRequest rateRequest);

	/**
	 * 更新价格状态
	 * 
	 * @param rateStatusRequest
	 */
	ElongResponse updateRateStatus(UpdateRoomRateStatusRequest rateStatusRequest);

	/**
	 * 更新房量
	 * 
	 * @param request
	 * @return
	 */
	ElongResponse updateInventory(UpdateRoomTypeAmountRequest request);

	/**
	 * 更新房量状态
	 * 
	 * @param request
	 * @return
	 */
	ElongResponse updateInventoryStatus(UpdateRoomTypeStatusRequest request);

	/**
	 * 判断需不需要重新发送
	 * 
	 * @param response
	 * @return
	 */
	boolean needSend(ElongResponse response);

	/**
	 * 创建头信息
	 * 
	 * @return
	 */
	RequestHead createRequestHead();
}
