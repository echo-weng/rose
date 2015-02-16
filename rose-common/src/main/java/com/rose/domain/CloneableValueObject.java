package com.rose.domain;

/**
 * @author echo
 */
abstract class CloneableValueObject implements Cloneable{
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// this shouldn't happen, since we are Cloneable
			throw new InternalError();
		}
	}
	
}
