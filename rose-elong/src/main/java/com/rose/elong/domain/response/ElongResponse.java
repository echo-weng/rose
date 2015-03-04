package com.rose.elong.domain.response;

import com.rose.domain.base.RoseObject;

/**
 * @author echo
 */
public class ElongResponse extends RoseObject{

	protected ResponseHead responseHead;

	public ResponseHead getResponseHead() {
		return responseHead;
	}

	public void setResponseHead(ResponseHead responseHead) {
		this.responseHead = responseHead;
	}

}
