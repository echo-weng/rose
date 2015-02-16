package com.rose.web.request;

/**
 * 请求
 *
 * @author echo
 */
public interface RoseRequest {
	
	/**
	 * 通过获取Handler服务类 进行处理
	 * @return
	 */
	String getHandlerServiceBeanName();
	
}
