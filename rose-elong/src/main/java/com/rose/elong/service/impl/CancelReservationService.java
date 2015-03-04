package com.rose.elong.service.impl;

import java.util.Date;

import com.rose.domain.Contract;
import com.rose.elong.Global;
import com.rose.elong.domain.reservation.request.CancelRQ;
import com.rose.elong.domain.reservation.response.CancelRS;
import com.rose.elong.domain.reservation.struct.UniqueID;
import com.rose.entity.HotelMapping;
import com.rose.entity.ReservationMapping;
import com.rose.exception.RequestHandlerException;
import com.rose.service.ReservationService;
import com.rose.web.request.RoseRequest;
import com.rose.web.response.RoseResponse;

/**
 * 取消订单操作服务
 *
 * @author echo
 */
public class CancelReservationService extends com.rose.elong.service.impl.ReservationService{
	public static final String BEAN_NAME = "cancelReservationService";
	
	@Override
	public RoseResponse handlerRequest(RoseRequest req) throws RequestHandlerException {
		super.handlerRequest(req);
		
		CancelRQ request = (CancelRQ) req;
		
		String elongCode = null;
		for (UniqueID uniqueID : request.getUniqueIDs()) {
			if (uniqueID.getType().equalsIgnoreCase(Global.ELONG_RES_ID_TYPE)) {
				elongCode = uniqueID.getId();
				break;
			}
		}
		ReservationMapping reservationMapping = entityService.getReservationMappingByOtaCooperatorCode(elongCode);
		if(reservationMapping == null){
			throw new RequestHandlerException("3201", "确认号不存在或者无效");
		}
		if(ReservationMapping.CANCEL_STATUS.equals(reservationMapping.getStatus())){
			throw new RequestHandlerException("3200", "订单已经取消");
		}
		HotelMapping hotelMapping = entityService.getHotelMappingById(reservationMapping.getHotelMappingId());
		
		Contract contract = createContract(hotelMapping);
		ReservationService reservationService = reservationServiceFactory.selReservationService(contract);
		reservationService.cancelReservation(reservationMapping.getCode(), contract);
		
		reservationMapping.setStatus(ReservationMapping.CANCELLED_STATUS);
		entityService.saveOrUpdateReservationMapping(reservationMapping);
		
		return createCancelRS(request);
	}
	
	private CancelRS createCancelRS(CancelRQ request){
		CancelRS cancelRS = new CancelRS();
		cancelRS.setEchoToken(request.getEchoToken());
		cancelRS.setTimeStamp(new Date());
		cancelRS.setVersion(request.getVersion());
		cancelRS.setPrimaryLangID(request.getPrimaryLangID());
		cancelRS.setStatus(ReservationMapping.CANCELLED_STATUS);
		cancelRS.setSuccess("success");
		cancelRS.setUniqueIDs(request.getUniqueIDs());
		return cancelRS;
	}
	
}
