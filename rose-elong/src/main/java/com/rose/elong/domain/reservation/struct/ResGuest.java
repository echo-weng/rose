/**
 * 
 */
package com.rose.elong.domain.reservation.struct;

import java.util.List;

import com.rose.domain.base.RoseObject;

/**
 * @author echo
 * 
 */
public class ResGuest extends RoseObject {

	private List<PersonName> personNames;

	public List<PersonName> getPersonNames() {
		return personNames;
	}

	public void setPersonNames(List<PersonName> personNames) {
		this.personNames = personNames;
	}
	
}
