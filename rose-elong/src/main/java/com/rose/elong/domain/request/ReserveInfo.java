package com.rose.elong.domain.request;

import java.util.Date;

/**
 * 订单信息
 *
 * @author echo
 */
public class ReserveInfo {

	/**
	 * 入住日期
	 */
	private Date checkinDate;
	
	/**
	 * 离店日期
	 */
	private Date checkoutDate;
	
	/**
	 * 确认号
	 */
	private String confirmNum;
	
	/**
	 * 客人名称
	 */
	private String guestName;
	
	/**
	 * 房型code
	 */
	private String hotelCode;
	
	/**
	 * 入住状态 Confirm-已确认,Arrival-已入住,Leave-已结帐,NoShow	-NoShow, Cancel-已删除
	 */
	private String reserStatus;
	
	/**
	 * 订单号
	 */
	private String reserverNo; 
	
	/**
	 * 房间数量
	 */
	private int roomNum;

	public Date getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public String getConfirmNum() {
		return confirmNum;
	}

	public void setConfirmNum(String confirmNum) {
		this.confirmNum = confirmNum;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public String getReserStatus() {
		return reserStatus;
	}

	public void setReserStatus(String reserStatus) {
		this.reserStatus = reserStatus;
	}

	public String getReserverNo() {
		return reserverNo;
	}

	public void setReserverNo(String reserverNo) {
		this.reserverNo = reserverNo;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	
}
