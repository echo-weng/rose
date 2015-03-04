package com.rose.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rose.entity.base.Mapping;

/**
 * 酒店mapping
 *
 * @author echo
 */
@Entity
@Table(name = "t_hotel_mapping")
public class HotelMapping extends Mapping{
	
	/**
	 * 渠道code
	 */
	@Column(name = "ota_code")
	private String otaCode;
	
	/**
	 * 酒店集团id
	 */
	@Column(name = "hotel_supply_id")
	private Long hotelSupplyId;

	public String getOtaCode() {
		return otaCode;
	}

	public void setOtaCode(String otaCode) {
		this.otaCode = otaCode;
	}

	public Long getHotelSupplyId() {
		return hotelSupplyId;
	}

	public void setHotelSupplyId(Long hotelSupplyId) {
		this.hotelSupplyId = hotelSupplyId;
	}

}
