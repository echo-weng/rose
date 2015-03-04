package org.rose.webservice.serializer;

/**
 * The exception in serializer
 * @author Norther
 * @since 2008-1-25 at 09:27:27
 */
public class SerializerException extends RuntimeException {

	private static final long serialVersionUID = 5626054944940569050L;

	public SerializerException() {
		super();
	}

	public SerializerException(String message, Throwable cause) {
		super(message, cause);
	}

	public SerializerException(String message) {
		super(message);
	}

	public SerializerException(Throwable cause) {
		super(cause);
	}

}
