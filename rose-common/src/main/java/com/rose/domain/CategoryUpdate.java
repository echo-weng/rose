package com.rose.domain;

import java.util.Properties;

/**
 * @author echo
 */
public abstract class CategoryUpdate extends CloneableValueObject{

	/**
	 * 房型code
	 */
	protected String roomTypeCode;
	
	/**
	 * 价格计划code
	 */
	protected String ratePlanCode;
	
	/**
	 * 时间范围
	 */
	protected DateSpan dateSpan;
	
	/**
	 * 其他属性设置
	 */
	protected Properties properties;
	
	@Override
	public CategoryUpdate clone() {
		CategoryUpdate clone = (CategoryUpdate) super.clone();
		clone.setDateSpan(Cloneables.clone(dateSpan));
		clone.setProperties(Cloneables.clone(properties));
		return clone;
	}

	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}

	public String getRatePlanCode() {
		return ratePlanCode;
	}

	public void setRatePlanCode(String ratePlanCode) {
		this.ratePlanCode = ratePlanCode;
	}

	public DateSpan getDateSpan() {
		return dateSpan;
	}

	public void setDateSpan(DateSpan dateSpan) {
		this.dateSpan = dateSpan;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
