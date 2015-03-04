package com.rose.elong.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.rose.domain.Contract;
import com.rose.domain.reservation.ActionType;
import com.rose.domain.reservation.Reservation;
import com.rose.domain.reservation.ReservationConfirmation;
import com.rose.elong.Global;
import com.rose.elong.domain.reservation.request.HotelResRequest;
import com.rose.elong.domain.reservation.response.HotelResRS;
import com.rose.elong.domain.reservation.struct.HotelReservation;
import com.rose.elong.domain.reservation.struct.RoomStay;
import com.rose.elong.domain.reservation.struct.TimeSpan;
import com.rose.elong.domain.reservation.struct.UniqueID;
import com.rose.entity.HotelMapping;
import com.rose.entity.ReservationMapping;
import com.rose.exception.RequestHandlerException;
import com.rose.service.ReservationService;
import com.rose.web.request.RoseRequest;
import com.rose.web.response.RoseResponse;

/**
 * 提交订单
 *
 * @author echo
 */
public class CommitReservationService extends com.rose.elong.service.impl.ReservationService{
	public static final String BEAN_NAME = "commitReservationService";

	@Override
	public RoseResponse handlerRequest(RoseRequest req) throws RequestHandlerException {
		super.handlerRequest(req);
		
		HotelResRequest request = (HotelResRequest) req;
		HotelReservation hotelReservation = request.picHotelReservation();
		
		checkTimeSpan(hotelReservation.getResGlobalInfo().getTimeSpan());
		
		HotelMapping hotelMapping = entityService.getHotelMappingByCode(Global.ELONG_SYSTEM_SOURCE, pickHotelCode(hotelReservation));
		Reservation reservation = elongConvertor.convertToReservation(hotelReservation, hotelMapping);
		
		Contract contract = createContract(hotelMapping);
		ReservationService reservationService = reservationServiceFactory.selReservationService(contract);
		
		ReservationMapping reservationMapping = new ReservationMapping();
		try {
			ReservationConfirmation reservationConfirmation = reservationService.bookReservation(reservation, contract, ActionType.COMMIT);
			reservationMapping.setCode(reservationConfirmation.getReservationId());
			reservationMapping.setStatus(ReservationMapping.COMMIT_STATUS);
			reservationMapping.setSuccess(true);
		} catch (Exception e) {
			LOG.error("Commit Fail", e);
			reservationMapping.setStatus(ReservationMapping.FAILED_STATUS);
			reservationMapping.setSuccess(false);
			//TODO
		} finally {
			entityService.saveOrUpdateReservationMapping(reservationMapping);
		}
		HotelResRS response = createEmptyResponse(request);
		List<UniqueID> uniqueIds = new ArrayList<UniqueID>();
		uniqueIds.add(hotelReservation.getUniqueIDs().get(0));
		UniqueID uniqueID = new UniqueID();
		uniqueID.setId(reservationMapping.getCode());
		uniqueID.setType(Global.PROVIDER_RES_ID_TYPE);
		uniqueIds.add(uniqueID);
		response.setUniqueIDs(uniqueIds);
		response.setSuccess("success");
		return response;
	}
	
	private HotelResRS createEmptyResponse(HotelResRequest request){
		HotelResRS hotelResRS = new HotelResRS();
		hotelResRS.setEchoToken(request.getEchoToken());
		hotelResRS.setTimeStamp(new Date());
		hotelResRS.setVersion(request.getVersion());
		hotelResRS.setPrimaryLangID(request.getPrimaryLangID());
		return hotelResRS;
	}
	
	private void checkTimeSpan(TimeSpan timeSpan) throws RequestHandlerException {
		if (timeSpan.getStart().compareTo(new Date()) >= 0) {
			throw new RequestHandlerException("2000", "无法解析参数");
		}
		if (timeSpan.getEnd() != null && timeSpan.getStart().compareTo(timeSpan.getEnd()) >= 0) {
			throw new RequestHandlerException("2000", "无法解析参数");
		}
	}
	
	public String pickHotelCode(HotelReservation hotelReservation) {
		if (CollectionUtils.isEmpty(hotelReservation.getRoomStays())) {
			return null;
		}
		RoomStay roomStay = hotelReservation.getRoomStays().get(0);
		return roomStay.getHotelCode();
	}
	
}
