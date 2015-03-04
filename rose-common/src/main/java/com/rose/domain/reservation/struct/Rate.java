package com.rose.domain.reservation.struct;

import java.math.BigDecimal;

import com.rose.domain.base.RoseObject;

/**
 * Rate includes the currency and amount
 * 
 * @author echo
 */
public class Rate extends RoseObject {

	private String currencyCode;

	private BigDecimal amountAfterTax;

	private BigDecimal amountBeforeTax;

	public Rate() {
		super();
	}

	public Rate(String currencyCode, BigDecimal amountAfterTax, BigDecimal amountBeforeTax) {
		super();
		this.currencyCode = currencyCode;
		this.amountAfterTax = amountAfterTax;
		this.amountBeforeTax = amountBeforeTax;
	}

	@Override
	public Rate clone() {
		return new Rate(currencyCode, amountAfterTax, amountBeforeTax);
	}

	public BigDecimal getAmountAfterTax() {
		return amountAfterTax;
	}

	public void setAmountAfterTax(BigDecimal amountAfterTax) {
		this.amountAfterTax = amountAfterTax;
	}

	public BigDecimal getAmountBeforeTax() {
		return amountBeforeTax;
	}

	public void setAmountBeforeTax(BigDecimal amountBeforeTax) {
		this.amountBeforeTax = amountBeforeTax;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}
