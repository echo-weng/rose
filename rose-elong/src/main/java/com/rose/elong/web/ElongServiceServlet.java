/**
 * 
 */
package com.rose.elong.web;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.rose.webservice.serializer.StreamSerializer;

import com.rose.dao.LogUtil;
import com.rose.elong.Global;
import com.rose.elong.domain.reservation.request.CancelRQ;
import com.rose.elong.domain.reservation.response.CancelRS;
import com.rose.elong.domain.reservation.response.HotelResRS;
import com.rose.elong.domain.reservation.response.ReservationResponse;
import com.rose.elong.domain.reservation.struct.ElongError;
import com.rose.elong.serializer.ElongCastorSerializer;
import com.rose.exception.MarshalException;
import com.rose.exception.RequestHandlerException;
import com.rose.web.RoseServlet;
import com.rose.web.request.RoseRequest;
import com.rose.web.response.RoseResponse;

/**
 * ReservationService
 */
public class ElongServiceServlet extends RoseServlet {
	private static final long serialVersionUID = -4708727738985224658L;

	@Override
	protected RoseResponse doWithException(Exception e, RoseRequest request) {
		ReservationResponse reservationResponse = createEmptyResponse(request);
		List<ElongError> errors = new ArrayList<ElongError>();
		ElongError elongError = new ElongError();
		elongError.setLanguage("en-us");
		elongError.setType(3);
		if (e instanceof RequestHandlerException) {
			RequestHandlerException e1 = (RequestHandlerException) e;
			elongError.setCode(e1.getCode());
			elongError.setText(e1.getMessage());
		} else {
			elongError.setCode(Global.RESERVATION_UNKNOW_ERROR_CODE);
			elongError.setText(Global.RESERVATION_UNKNOW_ERROR_MSG);
		}
		errors.add(elongError);
		reservationResponse.setErrors(errors);

		return reservationResponse;
	}

	private ReservationResponse createEmptyResponse(RoseRequest request) {
		if (request instanceof CancelRQ) {
			return new CancelRS();
		}
		return new HotelResRS();
	}

	@Override
	protected void marshalResponse(RoseResponse roseResponse, HttpServletResponse httpServletResponse)
			throws MarshalException, IOException {
		String responseXml = marshalToString(roseResponse);
		LogUtil.info("elong", responseXml, roseResponse.getClass().getSimpleName());

		if (LOG.isInfoEnabled()) {
			LOG.info("Response back:" + responseXml);
		}
		httpServletResponse.getOutputStream().write(responseXml.getBytes());
		httpServletResponse.getOutputStream().flush();
	}

	@Override
	protected RoseRequest unmarshalRequest(HttpServletRequest httpServletRequest) throws IOException {
		String requestXml = IOUtils.toString(httpServletRequest.getInputStream());
		if (LOG.isInfoEnabled()) {
			LOG.info("Request receive:" + requestXml);
		}
		RoseRequest request = (RoseRequest) streamSerializer.unmarshal(new ByteArrayInputStream(requestXml.getBytes()),
				CHAR_SET);
		LogUtil.info(Global.ELONG_SYSTEM_SOURCE, requestXml, request.getClass().getSimpleName());
		return request;
	}

	@Override
	protected StreamSerializer createStreamSerializer() {
		return new ElongCastorSerializer();
	}
}
