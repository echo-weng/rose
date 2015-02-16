package com.rose.service;

import org.springframework.stereotype.Service;

import com.rose.exception.RequestHandlerException;
import com.rose.utils.Charsets;
import com.rose.utils.MD5;
import com.rose.web.MpsRequest;
import com.rose.web.domain.response.ResponseCodes;
import com.rose.web.request.RoseRequest;
import com.rose.web.response.RoseResponse;

@Service("mpsRequestHandlerService")
public class MpsRequestHandlerService implements RequestHandlerService {
	public static final String BEAN_NAME = "mpsRequestHandlerService";

	@Override
	public RoseResponse handlerRequest(RoseRequest request) throws RequestHandlerException {
		MpsRequest mpsRequest = (MpsRequest) request;

		checkSignature(mpsRequest);
		
		return null;
	}

	/**
	 * 检查
	 * 
	 * @param mpsRequest
	 * @throws RequestHandlerException
	 */
	private void checkSignature(MpsRequest mpsRequest) throws RequestHandlerException {
		String content = mpsRequest.getContent();
		String signature = mpsRequest.getSignature();
		String expectSignature = MD5.md5Hex16(MD5.md5Hex16(content, Charsets.UTF_8), Charsets.UTF_8);

		if (expectSignature.equals(signature) == false) {
			throw new RequestHandlerException(ResponseCodes.ILLEGAL_SIGNATURE, "错误的签名");
		}
	}

}
