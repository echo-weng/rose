/**
 * 
 */
package com.rose.elong.domain.reservation.struct;

import com.rose.domain.base.RoseObject;

/**
 * @author echo
 * 
 */
public class UniqueID extends RoseObject {

	//10-酒店确认号,14-艺龙订单号
	private String type;
	private String id;
	private String companyName;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
