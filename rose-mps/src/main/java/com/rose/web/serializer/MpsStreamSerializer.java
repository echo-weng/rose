package com.rose.web.serializer;

import java.io.InputStream;
import java.io.OutputStream;

import com.rose.exception.MarshalException;
import com.rose.exception.UnmarshalException;
import com.rose.serializer.StreamSerializer;

/**
 * mps序列化/反序列化实现
 *
 * @author echo
 */
public class MpsStreamSerializer implements StreamSerializer{

	@Override
	public void marshal(Object object, OutputStream outputStream, String encoding) throws MarshalException {
		
	}

	@Override
	public Object unmarshal(InputStream inputStream, String encoding) throws UnmarshalException {
		return null;
	}

}
