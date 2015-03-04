package com.rose.mps.service;

import java.net.URL;

import org.junit.Test;

import com.rose.mps.domain.hotel.publicservice.InvokeResultArrayOfRoomType;
import com.rose.mps.domain.hotel.publicservice.model.RoomType;

/**
 * @author echo
 */
public class HotelServiceTest {
	
	public static void main(String[] args) throws Exception {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"classpath:rose-mps-config.xml"});
		
		Hotel hotel = new Hotel(new URL("https://pms.beyondh.com:7997/Service/Order/HotelService.svc"), "web", "pass");
		IHotelService hotelService = hotel.getWs();
		InvokeResultArrayOfRoomType type = hotelService.getRoomTypes(100000l, "1111");
		
		for (RoomType roomType : type.getContent().getValue().getRoomType()) {
			System.out.println(roomType);
		}
	}
	
	@Test
	public void test(){
		
	}
}
