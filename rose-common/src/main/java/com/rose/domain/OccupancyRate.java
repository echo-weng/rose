package com.rose.domain;

import java.util.List;

/**
 * 价格
 *
 * @author echo
 */
public class OccupancyRate extends CloneableValueObject {
	/**
	 * 货币类型
	 */
	private String currencyCode;
	
	private List<Rate> rates;

	@Override
	public OccupancyRate clone() {
		OccupancyRate clone = (OccupancyRate) super.clone();
		clone.setRates(Cloneables.clone(rates));
		return clone;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public List<Rate> getRates() {
		return rates;
	}

	public void setRates(List<Rate> rates) {
		if(rates != null){
			this.rates = rates;
		}
	}

}
