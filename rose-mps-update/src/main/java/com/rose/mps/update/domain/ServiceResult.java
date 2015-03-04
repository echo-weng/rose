package com.rose.mps.update.domain;

import java.util.Properties;

import com.rose.domain.base.RoseObject;

/**
 * 
 * @author Norther
 * 
 */
public abstract class ServiceResult extends RoseObject {

	protected String code;
	protected String value;
	protected Properties properties;

	public ServiceResult() {

	}

	public ServiceResult(String code, String value) {
		this.setCode(code);
		this.setValue(value);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
