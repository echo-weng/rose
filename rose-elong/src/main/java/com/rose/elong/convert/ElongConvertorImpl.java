package com.rose.elong.convert;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rose.domain.InventoryUpdate;
import com.rose.domain.RateUpdate;
import com.rose.domain.SingleInventoryUpdate;
import com.rose.domain.SingleRateUpdate;
import com.rose.domain.reservation.Reservation;
import com.rose.domain.reservation.struct.Guarantee;
import com.rose.domain.reservation.struct.Guest;
import com.rose.domain.reservation.struct.Hotel;
import com.rose.elong.client.ElongWebClient;
import com.rose.elong.domain.request.DayOfWeek;
import com.rose.elong.domain.request.ElongAbstractRequest;
import com.rose.elong.domain.request.UpdateRoomRateAmountsItem;
import com.rose.elong.domain.request.UpdateRoomRateRequest;
import com.rose.elong.domain.request.UpdateRoomRateStatusChangeItem;
import com.rose.elong.domain.request.UpdateRoomRateStatusRequest;
import com.rose.elong.domain.request.UpdateRoomTypeAmountChangeItem;
import com.rose.elong.domain.request.UpdateRoomTypeAmountRequest;
import com.rose.elong.domain.request.UpdateRoomTypeStatusChangeItem;
import com.rose.elong.domain.request.UpdateRoomTypeStatusRequest;
import com.rose.elong.domain.reservation.struct.HotelReservation;
import com.rose.elong.domain.reservation.struct.PersonName;
import com.rose.elong.domain.reservation.struct.ResGuest;
import com.rose.elong.domain.reservation.struct.RoomRate;
import com.rose.elong.domain.reservation.struct.RoomStay;
import com.rose.entity.HotelMapping;
import com.rose.exception.RequestHandlerException;
import com.rose.service.EntityService;

/**
 * 艺龙转化器
 *
 * @author echo
 */
@Service("elongConvertor")
public class ElongConvertorImpl implements ElongConvertor{
	
	@Autowired
	private ElongWebClient elongWebClient;
	
	@Autowired
	private EntityService entityService;
	
	public UpdateRoomRateRequest convertToRateUpdate(RateUpdate rateUpdate) {
		UpdateRoomRateRequest request = new UpdateRoomRateRequest();
		request.setHotelCode(rateUpdate.getHotelCode());
		request.setRequestHead(elongWebClient.createRequestHead());
		
		List<UpdateRoomRateAmountsItem> roomAmounts = new ArrayList<UpdateRoomRateAmountsItem>();
		for(SingleRateUpdate singleRateUpdate : rateUpdate.getSingleRateUpdates()){
			UpdateRoomRateAmountsItem item = new UpdateRoomRateAmountsItem(); 
			item.setBeginDate(singleRateUpdate.getDateSpan().getStartTime());
			item.setEndDate(singleRateUpdate.getDateSpan().getEndTime());;
			item.setDayOfWeek(new DayOfWeek());
			item.setExtraAdultRateAmount(singleRateUpdate.getOccupancyRate().getCommonRate().getAmountAfterTax());
			item.setRateAmount(singleRateUpdate.getOccupancyRate().getCommonRate().getAmountAfterTax());
			item.setRateCode(singleRateUpdate.getRatePlanCode());
			item.setRoomTypeCode(singleRateUpdate.getRoomTypeCode());
			
			roomAmounts.add(item);
		}
		request.setRoomAmounts(roomAmounts);
		return request;
	}
	
	public UpdateRoomRateStatusRequest convertToRateStatusUpdate(RateUpdate rateUpdate){
		UpdateRoomRateStatusRequest request = new UpdateRoomRateStatusRequest();
		request.setHotelCode(rateUpdate.getHotelCode());
		request.setRequestHead(elongWebClient.createRequestHead());
		
		List<UpdateRoomRateStatusChangeItem> roomRateList = new ArrayList<UpdateRoomRateStatusChangeItem>();
		for(SingleRateUpdate singleRateUpdate : rateUpdate.getSingleRateUpdates()){
			UpdateRoomRateStatusChangeItem item = new UpdateRoomRateStatusChangeItem();
			item.setBeginDate(singleRateUpdate.getDateSpan().getStartTime());
			item.setEndDate(singleRateUpdate.getDateSpan().getEndTime());;
			item.setDayOfWeek(new DayOfWeek());
			item.setRateCode(singleRateUpdate.getRatePlanCode());
			item.setRoomTypeCode(singleRateUpdate.getRoomTypeCode());
			//有效
			item.setStatus(1);
			roomRateList.add(item);
		}
		request.setRoomRateList(roomRateList);
		return request;
	}
	
	public UpdateRoomTypeAmountRequest convertToUpdateRoomTypeAmountUpdate(InventoryUpdate inventoryUpdate){
		UpdateRoomTypeAmountRequest request = new UpdateRoomTypeAmountRequest();
		request.setHotelCode(inventoryUpdate.getHotelCode());
		request.setRequestHead(elongWebClient.createRequestHead());
		
		List<UpdateRoomTypeAmountChangeItem> roomTypeList = new ArrayList<UpdateRoomTypeAmountChangeItem>();
		for(SingleInventoryUpdate singleInventoryUpdate : inventoryUpdate.getSingleInventoryUpdates()){
			UpdateRoomTypeAmountChangeItem item = new UpdateRoomTypeAmountChangeItem();
			
			item.setAmount(singleInventoryUpdate.getCount());
			item.setRoomTypeCode(singleInventoryUpdate.getRoomTypeCode());
			if(singleInventoryUpdate.getCount() > 0){
				item.setStatus(1);
			}
			item.setArriveDate(singleInventoryUpdate.getDateSpan().getStartTime());
			item.setBeginDate(singleInventoryUpdate.getDateSpan().getStartTime());
			item.setBeginTime(singleInventoryUpdate.getDateSpan().getStartTime());
			item.setEndDate(singleInventoryUpdate.getDateSpan().getEndTime());
			item.setEndTime(singleInventoryUpdate.getDateSpan().getEndTime());
			item.setLeaveDate(singleInventoryUpdate.getDateSpan().getEndTime());
			
			roomTypeList.add(item);
		}
		
		request.setRoomTypeList(roomTypeList);
		return request;
	}
	
	public UpdateRoomTypeStatusRequest convertToUpdateRoomTypeStatusUpdate(InventoryUpdate inventoryUpdate){
		UpdateRoomTypeStatusRequest request = new UpdateRoomTypeStatusRequest();
		request.setHotelCode(inventoryUpdate.getHotelCode());
		request.setRequestHead(elongWebClient.createRequestHead());
		
		List<UpdateRoomTypeStatusChangeItem> roomTypeList = new ArrayList<UpdateRoomTypeStatusChangeItem>();
		for(SingleInventoryUpdate singleInventoryUpdate : inventoryUpdate.getSingleInventoryUpdates()){
			UpdateRoomTypeStatusChangeItem item = new UpdateRoomTypeStatusChangeItem();
			
			item.setRoomTypeCode(singleInventoryUpdate.getRoomTypeCode());
			if(singleInventoryUpdate.getCount() > 0){
				item.setStatus(1);
			}
			item.setBeginDate(singleInventoryUpdate.getDateSpan().getStartTime());
			item.setEndDate(singleInventoryUpdate.getDateSpan().getEndTime());
			
			roomTypeList.add(item);
		}
		
		request.setRoomTypeList(roomTypeList);
		return request;
	}
	
	public <T extends ElongAbstractRequest> void replaceLoginToken(T request){
		request.setRequestHead(elongWebClient.createRequestHead());
	}
	
	@Override
	public Reservation convertToReservation(HotelReservation hotelReservation, HotelMapping hotelMapping) throws RequestHandlerException{
		Reservation reservation = new Reservation();
		reservation.setChannelReservationId(hotelReservation.getUniqueIDs().get(0).getId());
		
		List<ResGuest> resGuests = hotelReservation.getResGuests();
		for (ResGuest resGuest : resGuests) {
			for(PersonName personName : resGuest.getPersonNames()){
				reservation.addGuest(personName.toRoseGuest());
			}
		}
		reservation.setCustomer(resGuests.get(0).getPersonNames().get(0).toRoseGuest());
		reservation.setGuarantee(new Guarantee(null, MessageFormat.format("GuaranteeCode: \"{0}\"", hotelReservation.getResGlobalInfo().getGuaranteeType())));
		Hotel hotel = new Hotel();
		hotel.setCode(hotelMapping.getCode());

		List<com.rose.domain.reservation.struct.RoomStay> roomStays = new ArrayList<com.rose.domain.reservation.struct.RoomStay>();
		for (RoomStay roomStay : hotelReservation.getRoomStays()) {
			for (RoomRate roomRate : roomStay.getRoomRates()) {
				com.rose.domain.reservation.struct.RoomStay roseRoomStay = new com.rose.domain.reservation.struct.RoomStay();
				roseRoomStay.setRatePlanCode(roomRate.getRatePlanCode());
				roseRoomStay.setRoomTypeCode(roomRate.getRoomTypeCode());
				fillRoomStay(roseRoomStay, roomStay, hotelReservation);
				roomStays.add(roseRoomStay);
			}
		}
		hotel.setRoomStays(roomStays);
		reservation.setHotel(hotel);
		
		return reservation;
	}
	
	private void fillRoomStay(com.rose.domain.reservation.struct.RoomStay roseRoomStay, RoomStay roomStay, HotelReservation hotelReservation){
		roseRoomStay.setGuestCount(roomStay.mergeToRoseGuestCount());
		roseRoomStay.setDateSpan(hotelReservation.getResGlobalInfo().getTimeSpan().toRoseDateSpan());
		roseRoomStay.setRoomCount(hotelReservation.getResGlobalInfo().getRoomNum());
		List<ResGuest> roomStayGuests = hotelReservation.getResGuests();
		for (int i = 0; i < roomStayGuests.size(); i++) {
			Guest racGuest = roomStayGuests.get(i).getPersonNames().get(0).toRoseGuest();
			roseRoomStay.setProperty(i + ".guest.surname", racGuest.getSurname());
			roseRoomStay.setProperty(i + ".guest.givename", racGuest.getGivenName());
		}
	}
	
	public void setElongWebClient(ElongWebClient elongWebClient) {
		this.elongWebClient = elongWebClient;
	}

	public void setEntityService(EntityService entityService) {
		this.entityService = entityService;
	}
	
}
