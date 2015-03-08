package com.rose.mps.update;

/**
 * 错误码
 *
 * @author echo
 */
public enum ErrorCodes {
	
	FAILED_INVALID("001", "用户名密码错误"),NO_FUND_HOTEL("002", "酒店不存在"),SYSTEM_ERROR("099", "系统异常");
	
	ErrorCodes(String code, String msg){
		this.Code = code;
		this.MSG = msg;
	}
	
	public String Code;
	public String MSG;
}
