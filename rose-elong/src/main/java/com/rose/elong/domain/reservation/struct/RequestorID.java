/**
 * 
 */
package com.rose.elong.domain.reservation.struct;

import com.rose.domain.base.RoseObject;

/**
 * @author echo
 * 
 */
public class RequestorID extends RoseObject {

	//Customer Reservations Office
	private String type = "2";
	private String id;

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

}
