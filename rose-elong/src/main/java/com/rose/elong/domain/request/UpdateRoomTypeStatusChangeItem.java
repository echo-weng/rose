package com.rose.elong.domain.request;

import java.util.Date;

public class UpdateRoomTypeStatusChangeItem {
	
	private Date beginDate;
	
	private Date endDate;
	
	/**
	 * 库存类型
	 */
	private int inventoryUpdateType = 1;

	/**
	 * 房型code
	 */
	private String roomTypeCode;
	
	/**
	 * 状态
	 */
	private int status;

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
