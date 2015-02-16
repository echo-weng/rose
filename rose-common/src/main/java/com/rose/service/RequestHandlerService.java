package com.rose.service;

import com.rose.exception.RequestHandlerException;
import com.rose.web.request.RoseRequest;
import com.rose.web.response.RoseResponse;

/**
 * 请求处理类
 *
 * @author echo
 */
public interface RequestHandlerService {
	
	RoseResponse handlerRequest(RoseRequest request) throws RequestHandlerException;
	
}
