package com.rose.elong.domain.reservation.struct;

/**
 * @author echo
 */
public class RatePlanPolicy {
	//订单是否可以取消
	private boolean canBeCanceled;
	//提前几天可以取消
	private int cancelBeforeDays;
	//提前几点可以取消
	private int cancelBeforeTime;
	//罚金类别： 2:全额  3:首晚
	private int cashScaleType;

	public boolean getCanBeCanceled() {
		return canBeCanceled;
	}

	public void setCanBeCanceled(boolean canBeCanceled) {
		this.canBeCanceled = canBeCanceled;
	}

	public int getCancelBeforeDays() {
		return cancelBeforeDays;
	}

	public void setCancelBeforeDays(int cancelBeforeDays) {
		this.cancelBeforeDays = cancelBeforeDays;
	}

	public int getCancelBeforeTime() {
		return cancelBeforeTime;
	}

	public void setCancelBeforeTime(int cancelBeforeTime) {
		this.cancelBeforeTime = cancelBeforeTime;
	}

	public int getCashScaleType() {
		return cashScaleType;
	}

	public void setCashScaleType(int cashScaleType) {
		this.cashScaleType = cashScaleType;
	}

}
