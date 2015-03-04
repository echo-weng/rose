package com.rose.mps.update.domain;

import java.util.List;

import com.rose.utils.CollectionUtil;

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
	
	public Rate getCommonRate(){
		if(CollectionUtil.isEmpty(rates)){
			return null;
		}
		
		return rates.get(0);
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
