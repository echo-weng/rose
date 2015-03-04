package com.rose.elong.domain.reservation.response;

import java.util.List;

import com.rose.elong.domain.reservation.ReservationHeader;
import com.rose.elong.domain.reservation.struct.ElongError;
import com.rose.elong.domain.reservation.struct.UniqueID;
import com.rose.elong.domain.reservation.struct.Warning;
import com.rose.web.response.RoseResponse;

/**
 * 订单应答虚拟父类
 *
 * @author echo
 */
public abstract class ReservationResponse extends ReservationHeader implements RoseResponse {

	// 预定成功标记
	protected String success;

	protected List<ElongError> errors;

	protected List<Warning> warnings;

	protected String status;

	protected List<UniqueID> uniqueIDs;

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<ElongError> getErrors() {
		return errors;
	}

	public void setErrors(List<ElongError> errors) {
		this.errors = errors;
	}

	public List<Warning> getWarnings() {
		return warnings;
	}

	public void setWarnings(List<Warning> warnings) {
		this.warnings = warnings;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<UniqueID> getUniqueIDs() {
		return uniqueIDs;
	}

	public void setUniqueIDs(List<UniqueID> uniqueIDs) {
		this.uniqueIDs = uniqueIDs;
	}

}
