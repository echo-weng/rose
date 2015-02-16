package com.rose.serializer;

import java.io.InputStream;
import java.io.OutputStream;

import com.rose.exception.MarshalException;
import com.rose.exception.UnmarshalException;

/**
 * Stream 反序列化成 request
 *
 * @author echo
 */
public interface StreamSerializer {

	void marshal(Object object, OutputStream outputStream, String encoding) throws MarshalException;

	Object unmarshal(InputStream inputStream, String encoding) throws UnmarshalException;

}
