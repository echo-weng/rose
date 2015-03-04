package com.rose.domain.soap;

import com.rose.domain.base.RoseObject;
import com.rose.domain.soap.fault.IFault;

/**
 * @author echo
 */
public class Body extends RoseObject implements IBody {

	private IFault fault;

	private Message message;

	public Body() {
		super();
	}

	public Body(Message message) {
		super();
		this.setMessage(message);
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	@Override
	public IFault getFault() {
		return fault;
	}

	@Override
	public void setFault(IFault fault) {
		this.fault = fault;
	}

}
