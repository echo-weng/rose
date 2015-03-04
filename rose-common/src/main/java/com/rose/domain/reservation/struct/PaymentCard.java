package com.rose.domain.reservation.struct;

import java.util.Date;

import com.rose.domain.base.RoseObject;

/**
 * The information related with the payment card
 * 
 * @author echo
 */
public class PaymentCard extends RoseObject {

	private String cardCode;

	private String cardNumber;

	private Date expireDate;

	private String seriesCode;

	private String holderName;

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getCardCode() {
		return cardCode;
	}

	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getSeriesCode() {
		return seriesCode;
	}

	public void setSeriesCode(String seriesCode) {
		this.seriesCode = seriesCode;
	}

}
