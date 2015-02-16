package com.rose.entity.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * mapping 基类
 *
 * @author echo
 */
@MappedSuperclass
public abstract class Mapping extends DomainObject {

	/**
	 * 本系统code
	 */
	@Column(name = "code", nullable = false)
	protected String code;

	/**
	 * 合作方code
	 */
	@Column(name = "cooperator_code", nullable = false)
	protected String cooperatorCode;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCooperatorCode() {
		return cooperatorCode;
	}

	public void setCooperatorCode(String cooperatorCode) {
		this.cooperatorCode = cooperatorCode;
	}

}
