package com.rose.web;

import com.rose.service.MpsRequestHandlerService;
import com.rose.web.request.RoseRequest;

/**
 * mps公共请求类
 *
 * @author echo
 */
public class MpsRequest implements RoseRequest{
	
	/**
	 * 签名 xml经过两次md5加密得到,用于验证content有没有被修改过
	 */
	private String signature;
	
	/**
	 * 内容
	 */
	private String content;//xml内容
	
	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	@Override
	public String getHandlerServiceBeanName() {
		return MpsRequestHandlerService.BEAN_NAME;
	}

}
