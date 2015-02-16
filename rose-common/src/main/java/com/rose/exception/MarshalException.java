package com.rose.exception;

/**
 * marshal 异常定义
 *
 * @author echo
 */
public class MarshalException extends RuntimeException {

	private static final long serialVersionUID = -2436434225763539572L;

	public MarshalException() {
		super();
	}

	public MarshalException(String message, Throwable cause) {
		super(message, cause);
	}

	public MarshalException(String message) {
		super(message);
	}

	public MarshalException(Throwable cause) {
		super(cause);
	}

}