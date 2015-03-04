package com.rose.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.rose.entity.base.DomainObject;

@Entity
@Table(name = "t_config")
public class Config extends DomainObject{
	
	@Id
	private String name;
	
	@Column(name = "value")
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
