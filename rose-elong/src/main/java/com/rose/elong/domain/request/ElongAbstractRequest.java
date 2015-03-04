package com.rose.elong.domain.request;

/**
 * 请求基类
 *
 * @author echo
 */
public abstract class ElongAbstractRequest {
	
	protected RequestHead requestHead;

	public RequestHead getRequestHead() {
		return requestHead;
	}

	public void setRequestHead(RequestHead requestHead) {
		this.requestHead = requestHead;
	}
	
}
