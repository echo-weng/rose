package com.rose.elong.domain.reservation.struct;

/**
 * @author echo
 */
public class ElongError {
	
	private String language = "en-us";
	
	//450
	private String code = "450";
	
	//3-Business error
	private int type = 3;
	
	//内容
	private String text;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
