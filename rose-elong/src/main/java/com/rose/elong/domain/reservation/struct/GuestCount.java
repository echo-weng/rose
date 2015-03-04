/**
 * 
 */
package com.rose.elong.domain.reservation.struct;

import com.rose.domain.base.RoseObject;

/**
 * @author echo
 * 
 */
public class GuestCount extends RoseObject {

	private Integer ageQualifyingCode;
	private int count;

	public GuestCount() {
		super();
	}

	public GuestCount(Integer ageQualifyingCode, int count) {
		super();
		this.ageQualifyingCode = ageQualifyingCode;
		this.count = count;
	}

	public int getAgeQualifyingCode() {
		return ageQualifyingCode;
	}

	public void setAgeQualifyingCode(int ageQualifyingCode) {
		this.ageQualifyingCode = ageQualifyingCode;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isAdaultCount() {
		return ageQualifyingCode >= 10;
	}
	
}
