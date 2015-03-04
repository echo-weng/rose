package com.rose.mps.update.web;

import org.rose.webservice.serializer.StreamSerializer;

import com.rose.exception.RequestHandlerException;
import com.rose.mps.update.domain.InventoryUpdateRequest;
import com.rose.mps.update.domain.InventoryUpdateResponse;
import com.rose.mps.update.domain.RateUpdateRequest;
import com.rose.mps.update.domain.RateUpdateResponse;
import com.rose.mps.update.domain.Response;
import com.rose.mps.update.domain.ServiceError;
import com.rose.mps.update.serializer.MpsStreamSerializer;
import com.rose.web.RoseServlet;
import com.rose.web.request.RoseRequest;
import com.rose.web.response.RoseResponse;

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
	protected RoseResponse doWithException(Exception e, RoseRequest request) {
		Response response = createEmptyResponse(request);
		if(response == null){
			throw new IllegalAccessError();
		}
		if(e instanceof RequestHandlerException){
			RequestHandlerException requestHandlerException = (RequestHandlerException) e;
			response.addServiceError(new ServiceError(requestHandlerException.getCode(), requestHandlerException.getMessage()));
		}
		response.addServiceError(new ServiceError("99", "SYSTEM ERROR"));
		return response;
	}
	
	private Response createEmptyResponse(RoseRequest request){
		if(request instanceof InventoryUpdateRequest){
			return new InventoryUpdateResponse();
		}
		if(request instanceof RateUpdateRequest){
			return new RateUpdateResponse();
		}
		return null;
	}
	
	@Override
	protected StreamSerializer createStreamSerializer() {
		return new MpsStreamSerializer();
	}

}
