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
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 本系统code
	 */
	@Column(name = "code", nullable = false)
	protected String code;

	/**
	 * 合作方code
	 */
	@Column(name = "ota_cooperator_code", nullable = false)
	protected String otaCooperatorCode;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOtaCooperatorCode() {
		return otaCooperatorCode;
	}

	public void setOtaCooperatorCode(String otaCooperatorCode) {
		this.otaCooperatorCode = otaCooperatorCode;
	}

}
