package com.rose.mps.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import me.andpay.ti.util.JSON;

import org.junit.Test;
import org.rose.webservice.client.SimpleClient;
import org.rose.webservice.client.SimpleClientImpl;
import org.rose.webservice.client.http.HttpConnectionContext;
import org.rose.webservice.client.http.URLWrapper;

import com.rose.mps.domain.order.dal.entity.CheckinType;
import com.rose.mps.domain.order.publicservice.InvokeResultOrderAddResponse;
import com.rose.mps.domain.order.publicservice.model.ArrayOfGuest;
import com.rose.mps.domain.order.publicservice.model.ArrayOfRoomPlan;
import com.rose.mps.domain.order.publicservice.model.ArrayOfRoomPrice;
import com.rose.mps.domain.order.publicservice.model.Guest;
import com.rose.mps.domain.order.publicservice.model.ObjectFactory;
import com.rose.mps.domain.order.publicservice.model.OrderAddRequest;
import com.rose.mps.domain.order.publicservice.model.OrderAddResponse;
import com.rose.mps.domain.order.publicservice.model.OrderCancelRequest;
import com.rose.mps.domain.order.publicservice.model.RoomPlan;
import com.rose.mps.domain.order.publicservice.model.RoomPrice;
import com.rose.mps.domain.order.publicservice.model.RoomType;

/**
 * @author echo
 */
public class OrderServiceTest {

	public static void main(String[] args) throws Exception {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "classpath:rose-mps-config.xml" });
//		IOrderService orderService = ctx.getBean("orderService", IOrderService.class);
//
		Order order = new Order(new URL("https://pms.beyondh.com:7997/Service/Order/OrderService.svc"), "web", "pass");
		IOrderService orderService = order.getWs();
//		OrderCancelRequest orderCancelRequest = new OrderCancelRequest();
//		orderCancelRequest.setHotelId(1l);
//		orderCancelRequest.setOrderId(1l);
//		System.out.println(orderService.cancelOrder(orderCancelRequest, null, null).getCode().getValue());
		
		InvokeResultOrderAddResponse response = orderService.addOrder(createOrderAddRequest(), null, null);
		JAXBElement<OrderAddResponse> orderElement = response.getContent();
		System.out.println(JSON.getDefault().toJSONString(orderElement));
		
//		System.out.println(orderElement.getValue().getHotelId());
//		System.out.println(orderElement.getValue().getOrderId());
//		System.out.println(orderElement.getValue().getOrderNo().getValue());
//		System.out.println(orderService.getOrder(1l, 1l, null, null).getContent().getValue().getBillId());
	}
	
	private static OrderAddRequest createOrderAddRequest() throws DatatypeConfigurationException{
		OrderAddRequest orderAddRequest = new OrderAddRequest();
		orderAddRequest.setHotelId(100l);
		orderAddRequest.setCheckinType(CheckinType.NORMAL);
		GregorianCalendar value1 = new GregorianCalendar();
		value1.setTimeInMillis(new Date().getTime());
		orderAddRequest.setEstimatedArriveTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(value1));
		
		GregorianCalendar value2 = new GregorianCalendar();
		value2.setTimeInMillis(new Date().getTime());
		orderAddRequest.setEstimatedDepartureTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(value2));
		ObjectFactory objectFactory = new ObjectFactory();
		ArrayOfGuest arrayOfGuest = new ArrayOfGuest();
		Guest guest = new Guest();
		guest.setEmail(objectFactory.createGuestEmail("wxq13687@126.com"));
		guest.setGender(objectFactory.createGuestGender((short)10));
		guest.setName(objectFactory.createGuestName("echo"));
		arrayOfGuest.getGuest().add(guest);
		JAXBElement<ArrayOfGuest> value = objectFactory.createArrayOfGuest(arrayOfGuest);
		orderAddRequest.setGuests(value);
		
		ArrayOfRoomPlan arrayOfRoomPlan = new ArrayOfRoomPlan();
		RoomPlan roomPlan = new RoomPlan();
		RoomType _roomType = new RoomType();
		JAXBElement<RoomType> roomType = objectFactory.createRoomPlanRoomType(_roomType);
		roomPlan.setRoomType(roomType);
		
		roomPlan.setAmount(1);
		ArrayOfRoomPrice arrayOfRoomPrice = objectFactory.createArrayOfRoomPrice();
		RoomPrice roomPrice = new RoomPrice();
		roomPrice.setActualPrice(new BigDecimal("100"));
		
		arrayOfRoomPrice.getRoomPrice().add(roomPrice);
		roomPlan.setPrice(objectFactory.createRoomPlanPrice(arrayOfRoomPrice));
		arrayOfRoomPlan.getRoomPlan().add(roomPlan);
		JAXBElement<ArrayOfRoomPlan> roomPlans = objectFactory.createArrayOfRoomPlan(arrayOfRoomPlan) ;
		orderAddRequest.setRoomPlans(roomPlans);
		
		return orderAddRequest;
	}

	@Test
	public void testCancelOrder() throws IOException {
		SimpleClient simpleClient = new SimpleClientImpl();
		HttpConnectionContext context = new HttpConnectionContext();
		context.setSoapAction("http://tempuri.org/IOrderService/CancelOrder");
		System.out.println(simpleClient.post(new URLWrapper("http://pms.beyondh.com:7998/Service/Order/OrderService.svc/Basic", "pms"),
				this.getClass().getResourceAsStream("CancelOrder.xml"), context));

	}
	
}
