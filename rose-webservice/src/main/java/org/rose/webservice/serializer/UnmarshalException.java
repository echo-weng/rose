package org.rose.webservice.serializer;

/**
 * 
 * @author Norther
 * 
 */
public class UnmarshalException extends SerializerException {

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
