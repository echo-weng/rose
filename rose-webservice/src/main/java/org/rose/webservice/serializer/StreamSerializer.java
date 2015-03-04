package org.rose.webservice.serializer;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * @author Norther
 * 
 */
public interface StreamSerializer {

	void marshal(Object object, OutputStream outputStream, String encoding) throws MarshalException;

	Object unmarshal(InputStream inputStream, String encoding) throws UnmarshalException;

}
