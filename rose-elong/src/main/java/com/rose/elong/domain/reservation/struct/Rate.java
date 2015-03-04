/**
 * 
 */
package com.rose.elong.domain.reservation.struct;

import java.util.List;

import com.rose.domain.base.RoseObject;

/**
 * @author echo
 * 
 */
public class Rate extends RoseObject {

	private List<BaseRate> baseRates;

	private TotalRate totalRate;

	public List<BaseRate> getBaseRates() {
		return baseRates;
	}

	public void setBaseRates(List<BaseRate> baseRates) {
		this.baseRates = baseRates;
	}

	public TotalRate getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(TotalRate totalRate) {
		this.totalRate = totalRate;
	}

}
