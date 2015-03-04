package com.rose.elong.domain.request;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author echo
 */
public class UpdateRoomRateAmountsItem {
	/**
	 * 价格计划
	 */
	private String rateCode;

	/**
	 * 房型code
	 */
	private String roomTypeCode;

	/**
	 * 卖价
	 */
	private BigDecimal rateAmount;

	/**
	 * 开始日期
	 */
	private Date beginDate;

	/**
	 * 结束日期
	 */
	private Date endDate;

	/**
	 * 币种 RMB，USD，HKD，MOP，SGD
	 */
	private String currencyCode = "RMB";

	private DayOfWeek dayOfWeek;

	private BigDecimal extraAdultRateAmount;

	/**
	 * 零售价
	 */
	private BigDecimal retailPrice;

	public String getRateCode() {
		return rateCode;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}

	public BigDecimal getRateAmount() {
		return rateAmount;
	}

	public void setRateAmount(BigDecimal rateAmount) {
		this.rateAmount = rateAmount;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public BigDecimal getExtraAdultRateAmount() {
		return extraAdultRateAmount;
	}

	public void setExtraAdultRateAmount(BigDecimal extraAdultRateAmount) {
		this.extraAdultRateAmount = extraAdultRateAmount;
	}

	public BigDecimal getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}

}
