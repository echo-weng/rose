package com.rose.service;

import com.rose.domain.Contract;
import com.rose.domain.RateUpdate;

/**
 * 更新价格服务
 *
 * @author echo
 */
public interface UpdateRateService {
	/**
	 * 价格更新
	 * 
	 * @param rateUpdate
	 * @param contract
	 */
	void updateRate(RateUpdate rateUpdate, Contract contract);
}
