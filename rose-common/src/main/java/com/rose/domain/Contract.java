package com.rose.domain;

/**
 * 酒店关系
 *
 * @author echo
 */
public class Contract {

	/**
	 * 渠道code
	 */
	private String otaCode;

	/**
	 * 酒店集团code
	 */
	private String supplyCode;

	public String getOtaCode() {
		return otaCode;
	}

	public void setOtaCode(String otaCode) {
		this.otaCode = otaCode;
	}

	public String getSupplyCode() {
		return supplyCode;
	}

	public void setSupplyCode(String supplyCode) {
		this.supplyCode = supplyCode;
	}

}
