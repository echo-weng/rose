package com.rose.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rose.entity.base.DomainObject;

@Entity
@Table(name = "t_hotel_supply")
public class HotelSupply extends DomainObject {

	/**
	 * 集团名称
	 */
	@Column(name = "name")
	private String name;

	/**
	 * 集团描述
	 */
	@Column(name = "descrition")
	private String descrition;

	/**
	 * 每个集团在pms中对应url地址是不一样的
	 */
	@Column(name = "url")
	private String url;

	/**
	 * 集团在pms中的id
	 */
	@Column(name = "owner_id")
	private Long ownerId;
	
	/**
	 * 集团code
	 */
	@Column(name = "supply_code")
	private String supplyCode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrition() {
		return descrition;
	}

	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public String getSupplyCode() {
		return supplyCode;
	}

	public void setSupplyCode(String supplyCode) {
		this.supplyCode = supplyCode;
	}

}
