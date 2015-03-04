package com.rose.mps.update.domain;

import java.util.ArrayList;
import java.util.List;

import org.rose.webservice.CommonWebService;

import com.rose.domain.base.RoseObject;
import com.rose.web.response.RoseResponse;

/**
 * @author echo
 */
public abstract class Response extends RoseObject implements RoseResponse {
	private String token;
	private List<ServiceWarning> serviceWarnings;
	private List<ServiceError> serviceErrors;

	public Response() {

	}
	
	public Response(String token) {
		this.setToken(token);
	}

	public void addServiceErrors(List<ServiceError> serviceErrors) {
		for (ServiceError each : serviceErrors) {
			addServiceError(each);
		}
	}

	public void addServiceError(ServiceError serviceError) {
		if (serviceErrors == null) {
			serviceErrors = new ArrayList<ServiceError>();
		}
		serviceErrors.add(serviceError);
	}

	public void addServiceWarnings(List<ServiceWarning> serviceWarnings) {
		for (ServiceWarning each : serviceWarnings) {
			addServiceWarning(each);
		}
	}

	public void addServiceWarning(ServiceWarning serviceWarning) {
		if (serviceWarnings == null) {
			serviceWarnings = new ArrayList<ServiceWarning>();
		}
		serviceWarnings.add(serviceWarning);
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<ServiceError> getServiceErrors() {
		return serviceErrors;
	}

	public void setServiceErrors(List<ServiceError> serviceErrors) {
		this.serviceErrors = serviceErrors;
	}

	public List<ServiceWarning> getServiceWarnings() {
		return serviceWarnings;
	}

	public void setServiceWarnings(List<ServiceWarning> serviceWarnings) {
		this.serviceWarnings = serviceWarnings;
	}
	
	@Override
	public String getContentType() {
		return CommonWebService.CONTENT_TYPE_TEXT_XML;
	}

	@Override
	public String getCharacterEncoding() {
		return CommonWebService.DEFAULT_ENCODING;
	}

}
