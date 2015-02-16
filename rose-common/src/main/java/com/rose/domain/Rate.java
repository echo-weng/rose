package com.rose.domain;

import java.math.BigDecimal;

/**
 * 价格定义
 *
 * @author echo
 */
public class Rate extends CloneableValueObject {

	private BigDecimal amountBeforeTax;
	private BigDecimal amountAfterTax;
	private Integer guestCount;

	public Rate() {
	}

	public Rate(BigDecimal amountBeforeTax, BigDecimal amountAfterTax, Integer guestCount) {
		this.setAmountBeforeTax(amountBeforeTax);
		this.setAmountAfterTax(amountAfterTax);
		this.setGuestCount(guestCount);
	}
	
	public static Rate beforeTax(BigDecimal amountBeforeTax) {
		return beforeTax(amountBeforeTax, null);
	}

	public static Rate beforeTax(BigDecimal amountBeforeTax, Integer guestCount) {
		return new Rate(amountBeforeTax, null, guestCount);
	}

	public static Rate afterTax(BigDecimal amountAfterTax) {
		return afterTax(amountAfterTax, null);
	}

	public static Rate afterTax(BigDecimal amountAfterTax, Integer guestCount) {
		return new Rate(null, amountAfterTax, guestCount);
	}

	public BigDecimal getAmountBeforeTax() {
		return amountBeforeTax;
	}

	public void setAmountBeforeTax(BigDecimal amountBeforeTax) {
		this.amountBeforeTax = amountBeforeTax;
	}

	public BigDecimal getAmountAfterTax() {
		return amountAfterTax;
	}

	public void setAmountAfterTax(BigDecimal amountAfterTax) {
		this.amountAfterTax = amountAfterTax;
	}

	public Integer getGuestCount() {
		return guestCount;
	}

	public void setGuestCount(Integer guestCount) {
		this.guestCount = guestCount;
	}

}
