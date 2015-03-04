package com.rose.domain.reservation.struct;

import java.util.Properties;

import com.rose.domain.base.RoseObject;

/**
 * The guest information
 * 
 * @author YangYang
 * @version 0.1, 2007-11-05 10:16:54
 */
public class Guest extends RoseObject{

	private String givenName;

	private String surname;
	
	private String middleName;

	private String telephone;

	private String email;

	private Properties properties;

	public Guest() {
		super();
	}

	public Guest(String givenName, String surname, String telephone, String email) {
		super();
		this.givenName = givenName;
		this.surname = surname;
		this.telephone = telephone;
		this.email = email;
	}
	
	public Guest(String givenName, String middleName, String surname, String telephone, String email) {
		super();
		this.givenName = givenName;
		this.middleName = middleName;
		this.surname = surname;
		this.telephone = telephone;
		this.email = email;
	}
	
	public synchronized void setProperty(String key, String value) {
		if (properties == null) {
			properties = new Properties();
		}
		properties.setProperty(key, value);
	}

	public synchronized String getProperty(String key) {
		if (properties == null) {
			return null;
		}
		return properties.getProperty(key);
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
}
