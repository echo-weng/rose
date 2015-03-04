package com.rose.domain.soap.fault;

public class Fault implements IFault{
	
	private Code code;
	
	private String reason;

	public Code getCode() {
		return code;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
