package com.rose.domain.soap;

import com.rose.domain.base.RoseObject;

/**
 * soap Envelope
 * 
 * @author echo
 */
public class Envelope extends RoseObject implements IEnvelope {

	private Header header;

	private Body body;

	public Envelope() {
		super();
	}

	public Envelope(Body body) {
		super();
		this.setBody(body);
	}

	public Body getBody() {
		return body;
	}

	@Override
	public void setBody(IBody body) {
		if (body != null) {
			if (!(body instanceof Body)) {
				throw new IllegalArgumentException("The argument 'body' must be instance of " + Body.class);
			}
		}
		setBody((Body) body);
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

}
