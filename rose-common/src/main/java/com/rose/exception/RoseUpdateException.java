package com.rose.exception;

/**
 * 更新异常定义
 *
 * @author echo
 */
public class RoseUpdateException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public RoseUpdateException(){}
	
	public RoseUpdateException(String message){
		super(message);
	}
	
	public RoseUpdateException(String message, Throwable t){
		super(message, t);
	}

}
