package com.rose.elong.domain.reservation.struct;

import java.math.BigDecimal;
import java.util.Date;

import com.rose.utils.DateUtil;
import com.rose.utils.StringUtil;

/**
 * @author echo
 */
public class BaseRate {
	private static final String DATE_FORMATE = "yyyy-MM-dd";
	private BigDecimal amountAfterTax;
	private BigDecimal amountBeforeTax;
	private String currencyCode;
	private Date effectDate;

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

	public Date getEffectDate() {
		return effectDate;
	}

	public void setEffectDate(Date effectDate) {
		this.effectDate = effectDate;
	}

	public String getEffectDateString() {
		if(effectDate == null){
			return "";
		}
		return DateUtil.format(DATE_FORMATE, effectDate);
	}

	public void setEffectDateString(String effectDateString) {
		if(StringUtil.isEmpty(effectDateString)){
			return;
		}
		this.effectDate = DateUtil.parse(DATE_FORMATE, effectDateString);
	}
	
}
