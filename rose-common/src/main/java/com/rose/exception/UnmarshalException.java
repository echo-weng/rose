package com.rose.exception;

/**
 * Unmarshal 异常定义
 *
 * @author echo
 */
public class UnmarshalException extends RuntimeException {

	private static final long serialVersionUID = 4787818720239802856L;

	public UnmarshalException() {
		super();
	}

	public UnmarshalException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnmarshalException(String message) {
		super(message);
	}

	public UnmarshalException(Throwable cause) {
		super(cause);
	}

}
