package com.rose.elong.domain.reservation.struct;

import com.rose.domain.base.RoseObject;
import com.rose.domain.reservation.struct.Guest;

/**
 * @author echo
 */
public class PersonName extends RoseObject{

	private String givenName;

	private String surname;

	private String middleName;

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public Guest toRoseGuest() {
		return new Guest(getGivenName(), getMiddleName(), getSurname(), null, null);
	}

}
