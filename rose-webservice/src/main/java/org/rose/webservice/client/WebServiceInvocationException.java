package org.rose.webservice.client;

/**
 * The invocation exception for client
 * 
 * @author Norther
 * @since 2008-1-26 at 10:28:13
 */
public class WebServiceInvocationException extends RuntimeException {

	private static final long serialVersionUID = 9214737863899685464L;

	public WebServiceInvocationException() {
		super();
	}

	public WebServiceInvocationException(String message) {
		super(message);
	}

	public WebServiceInvocationException(Throwable cause) {
		super(cause.getMessage() == null ? "UNKNOWN" : cause.getMessage(), cause);
	}

}
