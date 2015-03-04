package com.rose.domain.reservation.struct;

import com.rose.domain.base.RoseObject;

/**
 * @author YangYang
 * @version 0.1, 2007-11-14 15:20:32
 */
public class Guarantee extends RoseObject {

	private PaymentCard paymentCard;

	private String description;

	public Guarantee() {
		super();
	}

	public Guarantee(PaymentCard paymentCard, String description) {
		super();
		this.paymentCard = paymentCard;
		this.description = description;
	}

	public PaymentCard getPaymentCard() {
		return paymentCard;
	}

	public void setPaymentCard(PaymentCard paymentCard) {
		this.paymentCard = paymentCard;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
