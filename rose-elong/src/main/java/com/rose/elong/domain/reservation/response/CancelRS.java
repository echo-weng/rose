package com.rose.elong.domain.reservation.response;

import org.rose.webservice.CommonWebService;

import com.rose.elong.domain.reservation.struct.UniqueID;

/**
 * 取消订单结果
 *
 * @author echo
 */
public class CancelRS extends ReservationResponse {
	private UniqueID cancelInfoRS;

	public UniqueID getCancelInfoRS() {
		return cancelInfoRS;
	}

	public void setCancelInfoRS(UniqueID cancelInfoRS) {
		this.cancelInfoRS = cancelInfoRS;
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
