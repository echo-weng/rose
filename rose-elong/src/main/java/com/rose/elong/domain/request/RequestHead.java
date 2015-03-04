package com.rose.elong.domain.request;

import com.rose.domain.base.RoseObject;

/**
 * @author echo
 */
public class RequestHead extends RoseObject{

	private String guid;

	private String language;

	private String loginToken;

	private String version;

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLoginToken() {
		return loginToken;
	}

	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
