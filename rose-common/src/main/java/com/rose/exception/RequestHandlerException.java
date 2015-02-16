package com.rose.exception;

/**
 * 请求处理异常定义
 *
 * @author echo
 */
public class RequestHandlerException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;
	
	private String message;
	
	public RequestHandlerException(){}
	
	public RequestHandlerException(String code, String message){
		super(message);
		
		this.code = code;
		this.message = message;
	}
	
	public RequestHandlerException(String code, String message, Throwable t){
		super(message, t);
		
		this.code = code;
		this.message = message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
}
