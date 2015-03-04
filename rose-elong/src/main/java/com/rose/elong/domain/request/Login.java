package com.rose.elong.domain.request;

import com.rose.domain.base.RoseObject;
import com.rose.domain.soap.Message;

/**
 * @author echo
 */
public class Login extends RoseObject implements Message{

	private RequestHead requestHead;
	
	private String userName;
	
	private String password;

	public RequestHead getRequestHead() {
		return requestHead;
	}

	public void setRequestHead(RequestHead requestHead) {
		this.requestHead = requestHead;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
