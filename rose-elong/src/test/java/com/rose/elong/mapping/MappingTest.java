package com.rose.elong.mapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.Test;

import com.rose.domain.soap.Body;
import com.rose.domain.soap.Envelope;
import com.rose.elong.domain.request.DayOfWeek;
import com.rose.elong.domain.request.Login;
import com.rose.elong.domain.request.RequestHead;
import com.rose.elong.domain.request.ReserveInfo;
import com.rose.elong.domain.request.UpdateReserveInfo;
import com.rose.elong.domain.request.UpdateRoomRateAmountsItem;
import com.rose.elong.domain.request.UpdateRoomRateRequest;
import com.rose.elong.domain.request.UpdateRoomRateStatusChangeItem;
import com.rose.elong.domain.request.UpdateRoomRateStatusRequest;
import com.rose.elong.domain.request.UpdateRoomTypeAmountChangeItem;
import com.rose.elong.domain.request.UpdateRoomTypeAmountRequest;
import com.rose.elong.domain.request.UpdateRoomTypeStatusChangeItem;
import com.rose.elong.domain.request.UpdateRoomTypeStatusRequest;
import com.rose.elong.domain.reservation.request.HotelResRequest;
import com.rose.elong.domain.reservation.response.HotelResRS;
import com.rose.elong.domain.reservation.struct.BaseRate;
import com.rose.elong.domain.reservation.struct.ElongError;
import com.rose.elong.domain.reservation.struct.GuestCount;
import com.rose.elong.domain.reservation.struct.HotelReservation;
import com.rose.elong.domain.reservation.struct.PersonName;
import com.rose.elong.domain.reservation.struct.Rate;
import com.rose.elong.domain.reservation.struct.RatePlan;
import com.rose.elong.domain.reservation.struct.RatePlanPolicy;
import com.rose.elong.domain.reservation.struct.RequestorID;
import com.rose.elong.domain.reservation.struct.ResGlobalInfo;
import com.rose.elong.domain.reservation.struct.ResGuest;
import com.rose.elong.domain.reservation.struct.RoomRate;
import com.rose.elong.domain.reservation.struct.RoomStay;
import com.rose.elong.domain.reservation.struct.RoomType;
import com.rose.elong.domain.reservation.struct.TimeSpan;
import com.rose.elong.domain.reservation.struct.TotalRate;
import com.rose.elong.domain.reservation.struct.UniqueID;
import com.rose.elong.domain.reservation.struct.Warning;
import com.rose.elong.domain.response.LoginResponse;
import com.rose.elong.domain.response.ResponseHead;
import com.rose.elong.serializer.ElongCastorSerializer;
import com.rose.utils.ArrayUtil;

public class MappingTest {

	@Test
	public void testLoginMapping() {
		ElongCastorSerializer elongCastorSerializer = new ElongCastorSerializer();
		Envelope envelope = new Envelope();
		Body body = new Body();
		Login login = new Login();
		login.setPassword("elongtest");
		login.setUserName("elongtest");
		login.setRequestHead(createRequestHead());

		body.setMessage(login);
		envelope.setBody(body);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		elongCastorSerializer.marshal(envelope, outputStream, "UTF-8");
		System.out.println(formateXml(new String(outputStream.toByteArray())));
	}

	@Test
	public void testUpdateRoomRate() {
		ElongCastorSerializer elongCastorSerializer = new ElongCastorSerializer();
		Envelope envelope = new Envelope();
		Body body = new Body();

		UpdateRoomRateRequest updateRoomRateRequest = new UpdateRoomRateRequest();
		updateRoomRateRequest.setHotelCode("hotelCode");
		updateRoomRateRequest.setRequestHead(createRequestHead());
		List<UpdateRoomRateAmountsItem> roomAmounts = new ArrayList<UpdateRoomRateAmountsItem>();
		UpdateRoomRateAmountsItem item = new UpdateRoomRateAmountsItem();
		item.setBeginDate(new Date());
		item.setCurrencyCode("CNY");
		item.setDayOfWeek(new DayOfWeek());
		item.setEndDate(new Date());
		item.setExtraAdultRateAmount(new BigDecimal("100"));
		item.setRateAmount(new BigDecimal("100"));
		item.setRateCode("rateCode");
		item.setRetailPrice(new BigDecimal("100"));
		item.setRoomTypeCode("roomTypCode");
		roomAmounts.add(item);
		roomAmounts.add(item);
		updateRoomRateRequest.setRoomAmounts(roomAmounts);

		body.setMessage(updateRoomRateRequest);
		envelope.setBody(body);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		elongCastorSerializer.marshal(envelope, outputStream, "UTF-8");
		System.out.println(formateXml(new String(outputStream.toByteArray())));
	}

	@Test
	public void testUpdateRoomRateStatusRequest() throws Exception {
		ElongCastorSerializer elongCastorSerializer = new ElongCastorSerializer();
		Envelope envelope = new Envelope();
		Body body = new Body();

		UpdateRoomRateStatusRequest request = new UpdateRoomRateStatusRequest();
		request.setHotelCode("hotelCode");
		request.setRequestHead(createRequestHead());
		List<UpdateRoomRateStatusChangeItem> roomRateList = new ArrayList<UpdateRoomRateStatusChangeItem>();
		UpdateRoomRateStatusChangeItem item = new UpdateRoomRateStatusChangeItem();
		item.setBeginDate(new Date());
		item.setEndDate(new Date());
		item.setRateCode("rateCode");
		item.setRoomTypeCode("roomTypeCode");
		item.setStatus(1);
		item.setDayOfWeek(new DayOfWeek());
		roomRateList.add(item);
		request.setRoomRateList(roomRateList);

		body.setMessage(request);
		envelope.setBody(body);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		elongCastorSerializer.marshal(envelope, outputStream, "UTF-8");
		System.out.println(formateXml(new String(outputStream.toByteArray())));
	}
	
	@Test
	public void testUpdateRoomTypeAmountRequest(){
		ElongCastorSerializer elongCastorSerializer = new ElongCastorSerializer();
		Envelope envelope = new Envelope();
		Body body = new Body();

		UpdateRoomTypeAmountRequest request = new UpdateRoomTypeAmountRequest();
		request.setHotelCode("hotelCode");
		request.setRequestHead(createRequestHead());
		List<UpdateRoomTypeAmountChangeItem> roomTypeList = new ArrayList<UpdateRoomTypeAmountChangeItem>();
		UpdateRoomTypeAmountChangeItem item = new UpdateRoomTypeAmountChangeItem();
		item.setAmount(1);
		item.setArriveDate(new Date());
		item.setBeginDate(new Date());
		item.setBeginTime(new Date());
		item.setEndDate(new Date());
		item.setEndTime(new Date());
		item.setInventoryUpdateType(1);
		item.setLeaveDate(new Date());
		item.setRoomTypeCode("roomTypeCode");
		item.setStatus(1);
		roomTypeList.add(item);
		request.setRoomTypeList(roomTypeList);

		body.setMessage(request);
		envelope.setBody(body);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		elongCastorSerializer.marshal(envelope, outputStream, "UTF-8");
		System.out.println(formateXml(new String(outputStream.toByteArray())));
		
	}
	
	@Test
	public void testUpdateRoomTypeStatusRequest(){
		ElongCastorSerializer elongCastorSerializer = new ElongCastorSerializer();
		Envelope envelope = new Envelope();
		Body body = new Body();

		UpdateRoomTypeStatusRequest request = new UpdateRoomTypeStatusRequest();
		request.setHotelCode("hotelCode");
		request.setRequestHead(createRequestHead());
		List<UpdateRoomTypeStatusChangeItem> roomTypeList = new ArrayList<UpdateRoomTypeStatusChangeItem>();
		UpdateRoomTypeStatusChangeItem item = new UpdateRoomTypeStatusChangeItem();
		item.setBeginDate(new Date());
		item.setEndDate(new Date());
		item.setInventoryUpdateType(1);
		item.setStatus(1);
		item.setRoomTypeCode("roomTypeCode");
		roomTypeList.add(item);
		request.setRoomTypeList(roomTypeList);

		body.setMessage(request);
		envelope.setBody(body);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		elongCastorSerializer.marshal(envelope, outputStream, "UTF-8");
		System.out.println(formateXml(new String(outputStream.toByteArray())));
	}
	
	@Test
	public void testUpdateReserveInfo(){
		ElongCastorSerializer elongCastorSerializer = new ElongCastorSerializer();
		Envelope envelope = new Envelope();
		Body body = new Body();

		UpdateReserveInfo request = new UpdateReserveInfo();
		request.setRequestHead(createRequestHead());
		
		List<ReserveInfo> reserveList = new ArrayList<ReserveInfo>();
		ReserveInfo item = new ReserveInfo();
		item.setCheckinDate(new Date());
		item.setCheckoutDate(new Date());
		item.setConfirmNum("001");
		item.setGuestName("guestName");
		item.setHotelCode("hotelCode");
		item.setReserStatus("confirm");
		item.setReserverNo("001");
		item.setRoomNum(1);
		reserveList.add(item);
		request.setReserveList(reserveList);

		body.setMessage(request);
		envelope.setBody(body);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		elongCastorSerializer.marshal(envelope, outputStream, "UTF-8");
		System.out.println(formateXml(new String(outputStream.toByteArray())));
	}
	
	@Test
	public void testLoginResponse(){
		ElongCastorSerializer elongCastorSerializer = new ElongCastorSerializer();
		Envelope envelope = new Envelope();
		Body body = new Body();
		envelope.setBody(body);
		
		LoginResponse loginResponse = new LoginResponse();
		loginResponse.setLoginToken("187ac6bf-3711-4a12-a91f-3aa371df1f5b");
		loginResponse.setLoginTokenExpiredTime(new Date());
		ResponseHead responseHead = new ResponseHead();
		responseHead.setResultMessage("SUCCESS");
		responseHead.setResultStatus(0);
		responseHead.setTimeStamp(new Date());
		responseHead.setVersion("1");
		loginResponse.setResponseHead(responseHead);
		body.setMessage(loginResponse);
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		elongCastorSerializer.marshal(envelope, outputStream, "UTF-8");
		System.out.println(formateXml(new String(outputStream.toByteArray())));
	}
	
	@Test
	public void testUnMarshalLoginResponse() throws Exception{
		ElongCastorSerializer elongCastorSerializer = new ElongCastorSerializer();
		Object o = elongCastorSerializer.unmarshal(MappingTest.class.getResourceAsStream("login-response.xml"), "UTF-8");
		System.out.println(((Envelope)o).getBody().getMessage());
	}
	
	@Test
	public void testMarshalHotelResRequest(){
		ElongCastorSerializer elongCastorSerializer = new ElongCastorSerializer();
		
		HotelResRequest request = new HotelResRequest();
		request.setEchoToken("2E76E9775DCD3FF3372F");
		request.setPassword("Elong");
		request.setUserName("Elong");
		request.setPrimaryLangID("en-us");
		request.setVersion("1.0");
		request.setTimeStamp(new Date());
		
		RequestorID requestorID = new RequestorID();
		requestorID.setId("6792789769");
		requestorID.setType("2");
		request.setRequestorID(requestorID);
		
		List<HotelReservation> hotelReservations = new ArrayList<HotelReservation>();
		HotelReservation hotelReservation = new HotelReservation();
		
		ResGlobalInfo resGlobalInfo = new ResGlobalInfo();
		resGlobalInfo.setEarliestCheckInTime(new Date());
		resGlobalInfo.setGuaranteeType("NO");
		resGlobalInfo.setLatestCheckInTime(new Date());
		resGlobalInfo.setRemark("");
		TimeSpan timeSpan = new TimeSpan();
		timeSpan.setEnd(new Date());
		timeSpan.setStart(new Date());
		resGlobalInfo.setTimeSpan(timeSpan);
		hotelReservation.setResGlobalInfo(resGlobalInfo);
		
		ResGuest resGuest = new ResGuest();
		PersonName personName = new PersonName();
		personName.setGivenName("Fred");
		personName.setSurname("Smith");
		resGuest.setPersonNames(ArrayUtil.asList(personName));
		hotelReservation.setResGuests(ArrayUtil.asList(resGuest));
		
		List<RoomStay> roomStays = new ArrayList<RoomStay>();
		RoomStay roomStay = new RoomStay();
		GuestCount guestCount = new GuestCount();
		guestCount.setAgeQualifyingCode(10);
		guestCount.setCount(2);
		roomStay.setGuestCounts(ArrayUtil.asList(guestCount));
		
		roomStay.setHotelCode("DENMS");
		RatePlan ratePlan = new RatePlan();
		ratePlan.setRatePlanCode("200790182");
		roomStay.setRatePlans(ArrayUtil.asList(ratePlan));
		
		RoomRate roomRate = new RoomRate();
		roomRate.setRatePlanCode("CORB");
		roomRate.setRoomTypeCode("KGMV");
		Rate rate = new Rate();
		
		TotalRate totalRate = new TotalRate();
		totalRate.setAmountAfterTax(new BigDecimal("289.00"));
		totalRate.setAmountBeforeTax(new BigDecimal("289.00"));
		totalRate.setCurrencyCode("USD");
		rate.setTotalRate(totalRate);
		
		List<BaseRate> baseRates = new ArrayList<BaseRate>();
		BaseRate baseRate1 = new BaseRate();
		baseRate1.setAmountAfterTax(new BigDecimal("189.00"));
		baseRate1.setAmountBeforeTax(new BigDecimal("189.00"));
		baseRate1.setCurrencyCode("USD");
		baseRate1.setEffectDate(new Date());
		baseRates.add(baseRate1);
		
		BaseRate baseRate2 = new BaseRate();
		baseRate2.setAmountAfterTax(new BigDecimal("100.00"));
		baseRate2.setAmountBeforeTax(new BigDecimal("100.00"));
		baseRate2.setCurrencyCode("USD");
		baseRate2.setEffectDate(new Date());
		baseRates.add(baseRate2);
		rate.setBaseRates(baseRates);
		
		roomRate.setRates(ArrayUtil.asList(rate));
		roomStay.setRoomRates(ArrayUtil.asList(roomRate));
		
		RoomType roomType = new RoomType();
		roomType.setRoomTypeCode("200049965");
		roomStay.setRoomTypes(ArrayUtil.asList(roomType));
		
		roomStays.add(roomStay);
		hotelReservation.setRoomStays(roomStays);
		
		List<UniqueID> uniqueIDs = new ArrayList<UniqueID>();
		UniqueID uniqueID = new UniqueID();
		uniqueID.setId("478895006");
		uniqueID.setType("14");
		uniqueIDs.add(uniqueID);
		
		UniqueID uniqueID1 = new UniqueID();
		uniqueID1.setId("478895006");
		uniqueID1.setType("10");
		uniqueIDs.add(uniqueID1);
		hotelReservation.setUniqueIDs(uniqueIDs);
		
		hotelReservations.add(hotelReservation);
		request.setHotelReservations(hotelReservations);
		
		
		RatePlanPolicy ratePlanPolicy = new RatePlanPolicy();
		ratePlanPolicy.setCanBeCanceled(true);
		ratePlanPolicy.setCancelBeforeDays(3);
		ratePlanPolicy.setCancelBeforeTime(18);
		ratePlanPolicy.setCashScaleType(2);
		request.setRatePlanPolicy(ratePlanPolicy);
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		elongCastorSerializer.marshal(request, outputStream, "UTF-8");
		System.out.println(formateXml(new String(outputStream.toByteArray())));
	}
	
	@Test
	public void testUnMarshalHotelResRequest(){
		ElongCastorSerializer elongCastorSerializer = new ElongCastorSerializer();
		System.out.println(elongCastorSerializer.unmarshal(this.getClass().getResourceAsStream("reservation-request.xml"), "UTF-8"));
	}
	
	@Test
	public void testMarshalHotelResRS(){
		ElongCastorSerializer elongCastorSerializer = new ElongCastorSerializer();
		
		HotelResRS hotelResRS = new HotelResRS();
		hotelResRS.setEchoToken("43e1d0b7-ab4f-4113-afbf-e35861406880");
		hotelResRS.setPrimaryLangID("en-us");
		hotelResRS.setSuccess("success");
		hotelResRS.setTimeStamp(new Date());
		hotelResRS.setVersion("1.0");
		
		RequestorID requestorID = new RequestorID();
		requestorID.setId("elong");
		requestorID.setType("2");
		hotelResRS.setRequestorID(requestorID);
		
		List<Warning> warnings = new ArrayList<Warning>();
		Warning warning = new Warning();
		warning.setCode("3210");
		warning.setLanguage("en-us");
		warning.setText("价格不一致");
		warning.setType(3);
		warnings.add(warning);
		hotelResRS.setWarnings(warnings);
		
		List<ElongError> errors = new ArrayList<ElongError>();
		ElongError error = new ElongError();
		error.setCode("3210");
		error.setLanguage("en-us");
		error.setText("价格不一致");
		error.setType(3);
		errors.add(error);
		hotelResRS.setErrors(errors);
		
		List<UniqueID> uniqueIDs = new ArrayList<UniqueID>();
		UniqueID uniqueID = new UniqueID();
		uniqueID.setId("478895006");
		uniqueID.setType("14");
		uniqueIDs.add(uniqueID);
		
		UniqueID uniqueID1 = new UniqueID();
		uniqueID1.setId("478895006");
		uniqueID1.setType("10");
		uniqueIDs.add(uniqueID1);
		hotelResRS.setUniqueIDs(uniqueIDs);
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		elongCastorSerializer.marshal(hotelResRS, outputStream, "UTF-8");
		System.out.println(formateXml(new String(outputStream.toByteArray())));
	}

	private RequestHead createRequestHead() {
		RequestHead requestHead = new RequestHead();
		requestHead.setGuid("");
		requestHead.setLanguage("CN");
		requestHead.setLoginToken("001");
		requestHead.setVersion("1");
		return requestHead;
	}

	private String formateXml(String xml) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		char[] chars = xml.toCharArray();
		StringBuffer sb = new StringBuffer();
		StringBuffer preNode = new StringBuffer();
		StringBuffer node = new StringBuffer();
		StringBuffer temp = new StringBuffer();

		boolean nodeStartAppend = true;
		for (char c : chars) {
			if ('<' == c) {
				if (temp.length() > 0 && temp.toString().startsWith("<") == false) {
					temp.append(c);
					sb.append(temp.toString());
					continue;
				}

				nodeStartAppend = true;

				appendTemp(map, node, preNode, sb, temp);

				empty(temp);
				temp.append(c);
				empty(preNode);
				preNode.append(node);
				empty(node);
				continue;
			}
			if ('>' == c) {
				nodeStartAppend = false;
				temp.append(c);
				continue;
			}
			if (' ' == c) {
				nodeStartAppend = false;
			}
			if (nodeStartAppend && '/' != c) {
				node.append(c);
			}
			temp.append(c);
		}
		appendTemp(map, node, preNode, sb, temp);
		
		return sb.toString();
	}

	private void empty(StringBuffer sb){
		sb.delete(0, sb.length());
	}
	
	private void appendTemp(Map<String, Integer> map, StringBuffer node, StringBuffer preNode, StringBuffer sb,
			StringBuffer temp) {
		Integer max = getMax(map);
		if (exits(node.toString(), map)) {
			map.remove(node.toString());
			max = max - 1;
		} else {
			if (node.length() > 0 && node.toString().startsWith("?xml") == false) {
				map.put(node.toString(), max + 1);
			}
		}
		if (preNode.toString().equals(node.toString()) == false && temp.toString().startsWith("<?") == false) {
			if (sb.toString().endsWith("\n") == false) {
				sb.append("\n");
			}
			for (int i = 0; i < max; i++) {
				sb.append("\t");
			}
		}
		sb.append(temp.toString());
	}

	private Integer getMax(Map<String, Integer> map) {
		if (map.isEmpty())
			return 0;
		Integer max = 0;
		for (Integer num : map.values()) {
			if (max < num) {
				max = num;
			}
		}
		return max;
	}

	private boolean exits(String node, Map<String, Integer> map) {
		return map.get(node) != null;
	}

}
