package org.rose.webservice;

/**
 * The exeception for the webservice
 * 
 * @author Norther
 * @since 2008-1-26 at 11:47:34
 */
public class WebServiceException extends RuntimeException {

	private static final long serialVersionUID = 1301539744916282103L;

	public WebServiceException() {
		super();
	}

	public WebServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public WebServiceException(String message) {
		super(message);
	}

	public WebServiceException(Throwable cause) {
		super(cause);
	}

}
