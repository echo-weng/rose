package com.rose.domain;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * 价格更新
 *
 * @author echo
 */
public class RateUpdate {

	private List<SingleRateUpdate> singleRateUpdates = Lists.newArrayList();

	/**
	 * 酒店code
	 */
	private String hotelCode;
	
	public RateUpdate(){}
	
	public RateUpdate(String hotelCode, List<SingleRateUpdate> singleRateUpdates) {
		this.setHotelCode(hotelCode);
		this.setSingleRateUpdates(singleRateUpdates);
	}

	public RateUpdate(String hotelCode, SingleRateUpdate... singleRateUpdates) {
		this(hotelCode, Lists.newArrayList(singleRateUpdates));
	}

	public List<SingleRateUpdate> getSingleRateUpdates() {
		return singleRateUpdates;
	}

	public void setSingleRateUpdates(List<SingleRateUpdate> singleRateUpdates) {
		this.singleRateUpdates = singleRateUpdates;
	}

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

}
