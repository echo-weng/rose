package com.rose.elong.domain.reservation.response;

import org.rose.webservice.CommonWebService;

import com.rose.elong.domain.reservation.struct.RequestorID;

/**
 * @author echo
 */
public class HotelResRS extends ReservationResponse {
	private RequestorID requestorID;

	public RequestorID getRequestorID() {
		return requestorID;
	}

	public void setRequestorID(RequestorID requestorID) {
		this.requestorID = requestorID;
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
