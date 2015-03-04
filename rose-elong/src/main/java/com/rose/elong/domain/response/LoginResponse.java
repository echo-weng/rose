package com.rose.elong.domain.response;

import java.util.Date;

import com.rose.domain.soap.Message;

/**
 * 登陆返回结果
 *
 * @author echo
 */
public class LoginResponse extends ElongResponse implements Message{
	
	//访问凭证
	private String loginToken;
	
	private Date loginTokenExpiredTime;
	
	public String getLoginToken() {
		return loginToken;
	}

	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}

	public Date getLoginTokenExpiredTime() {
		return loginTokenExpiredTime;
	}

	public void setLoginTokenExpiredTime(Date loginTokenExpiredTime) {
		this.loginTokenExpiredTime = loginTokenExpiredTime;
	}
	
}
