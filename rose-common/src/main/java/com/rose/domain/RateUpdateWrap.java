package com.rose.domain;

/**
 * RateUpdate 包装类
 *
 * @author echo
 */
public class RateUpdateWrap {
	private RateUpdate rateUpdate;

	private Contract contract;
	
	public RateUpdateWrap(RateUpdate rateUpdate, Contract contract){
		this.rateUpdate = rateUpdate;
		this.contract = contract;
	}

	public RateUpdate getRateUpdate() {
		return rateUpdate;
	}

	public void setRateUpdate(RateUpdate rateUpdate) {
		this.rateUpdate = rateUpdate;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
}
