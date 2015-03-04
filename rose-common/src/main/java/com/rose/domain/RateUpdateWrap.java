package com.rose.domain;

import java.util.List;

/**
 * RateUpdate 包装类
 *
 * @author echo
 */
public class RateUpdateWrap {
	
	private RateUpdate rateUpdate;
	private List<Contract> contracts;

	public RateUpdateWrap(RateUpdate rateUpdate, List<Contract> contracts) {
		this.rateUpdate = rateUpdate;
		this.contracts = contracts;
	}

	public RateUpdate getRateUpdate() {
		return rateUpdate;
	}

	public void setRateUpdate(RateUpdate rateUpdate) {
		this.rateUpdate = rateUpdate;
	}

	public List<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}

}
