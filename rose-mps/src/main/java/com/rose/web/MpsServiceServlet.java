package com.rose.web;

import com.rose.serializer.StreamSerializer;
import com.rose.web.serializer.MpsStreamSerializer;

/**
 * mps 服务接收
 *
 * @author echo
 */
public class MpsServiceServlet extends RoseServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected StreamSerializer createStreamSerializer() {
		return new MpsStreamSerializer();
	}

}
