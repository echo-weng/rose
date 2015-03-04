package com.rose.elong.domain.request;

import java.util.Date;

public class UpdateRoomTypeAmountChangeItem {

	/**
	 * 房量
	 */
	private int amount;

	/**
	 * 房量开始日期 DateTime
	 */
	private Date arriveDate;

	/**
	 * 房量结束日期
	 */
	private Date leaveDate;

	/**
	 * 房量生效时间 默认为添加时间 = getdate（）
	 */
	private Date beginDate;

	/**
	 * 房量失效时间 默认为房量当天的 23:59:59 =leavedate 23:59:59
	 */
	private Date endDate;

	/**
	 * 当日入住房量生效时间 例：00:00:00可以默认为：00:00:00
	 */
	private Date beginTime;

	/**
	 * 当日入住房量失效时间 例：23:59:59可以默认为：23:59:59
	 */
	private Date endTime;

	/**
	 * 库存类型 默认为1
	 */
	private int inventoryUpdateType = 1;

	/**
	 * 房型code
	 */
	private String roomTypeCode;

	/**
	 * 状态 0:Open;1:Close
	 */
	private int status = 0;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getArriveDate() {
		return arriveDate;
	}

	public void setArriveDate(Date arriveDate) {
		this.arriveDate = arriveDate;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
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

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getInventoryUpdateType() {
		return inventoryUpdateType;
	}

	public void setInventoryUpdateType(int inventoryUpdateType) {
		this.inventoryUpdateType = inventoryUpdateType;
	}

	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
