package com.rose.mps.service;

import java.io.IOException;
import java.net.URL;

import org.junit.Test;
import org.rose.webservice.client.SimpleClient;
import org.rose.webservice.client.SimpleClientImpl;
import org.rose.webservice.client.http.HttpConnectionContext;
import org.rose.webservice.client.http.URLWrapper;

import com.rose.mps.domain.order.publicservice.model.OrderCancelRequest;

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
		OrderCancelRequest orderCancelRequest = new OrderCancelRequest();
		orderCancelRequest.setHotelId(1l);
		orderCancelRequest.setOrderId(1l);
		System.out.println(orderService.cancelOrder(orderCancelRequest, null, null).getCode().getValue());
		
//		System.out.println(orderService.getOrder(1l, 1l, null, null).getContent().getValue().getBillId());
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
