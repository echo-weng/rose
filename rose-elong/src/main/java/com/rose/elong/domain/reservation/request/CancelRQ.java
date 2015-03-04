package com.rose.elong.domain.reservation.request;

import java.util.List;

import com.rose.elong.domain.reservation.ReservationHeader;
import com.rose.elong.domain.reservation.struct.RequestorID;
import com.rose.elong.domain.reservation.struct.UniqueID;
import com.rose.elong.service.impl.CancelReservationService;
import com.rose.web.request.RoseRequest;

/**
 * 取消订单
 *
 * @author echo
 */
public class CancelRQ extends ReservationHeader implements RoseRequest {
	private RequestorID requestorID;
	private List<UniqueID> uniqueIDs;
	private List<String> reasons;
	private String cancelType;

	public RequestorID getRequestorID() {
		return requestorID;
	}

	public void setRequestorID(RequestorID requestorID) {
		this.requestorID = requestorID;
	}

	public List<UniqueID> getUniqueIDs() {
		return uniqueIDs;
	}

	public void setUniqueIDs(List<UniqueID> uniqueIDs) {
		this.uniqueIDs = uniqueIDs;
	}

	public List<String> getReasons() {
		return reasons;
	}

	public void setReasons(List<String> reasons) {
		this.reasons = reasons;
	}

	public String getCancelType() {
		return cancelType;
	}

	public void setCancelType(String cancelType) {
		this.cancelType = cancelType;
	}

	@Override
	public String getHandlerServiceBeanName() {
		return CancelReservationService.BEAN_NAME;
	}
	
}
