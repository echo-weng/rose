package com.rose.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rose.entity.base.Mapping;

/**
 * 订单mapping
 *
 * @author echo
 */
@Entity
@Table(name = "t_reservation_mapping")
public class ReservationMapping extends Mapping{
	public static final String CANCEL_STATUS = "Cancel";
	public static final String CANCELLED_STATUS = "Cancelled";
	public static final String COMMIT_STATUS = "Commit";
	public static final String FAILED_STATUS = "Failed";
	public static final String MODIFY_STATUS = "Modify";
	
	//酒店id
	@Column(name = "hotel_mapping_id")
	private Long hotelMappingId;
	
	/**
	 * pms订单id
	 */
	private Long orderId;
	
	//状态
	@Column
	private String status;
	
	//订单内容
	@Column
	private String content;
	
	@Column
	private boolean success;

	public Long getHotelMappingId() {
		return hotelMappingId;
	}

	public void setHotelMappingId(Long hotelMappingId) {
		this.hotelMappingId = hotelMappingId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
}
