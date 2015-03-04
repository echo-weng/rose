package com.rose.elong.domain.request;

import java.util.List;

import com.rose.domain.soap.Message;

public class UpdateReserveInfo extends ElongAbstractRequest implements Message {

	private List<ReserveInfo> reserveList;

	public List<ReserveInfo> getReserveList() {
		return reserveList;
	}

	public void setReserveList(List<ReserveInfo> reserveList) {
		this.reserveList = reserveList;
	}

}
