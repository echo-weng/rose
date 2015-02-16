package com.rose.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rose.domain.publicservice.InvokeResultArrayOfRoomType;
import com.rose.domain.publicservice.model.RoomType;

/**
 * @author echo
 */
public class HotelServiceTest {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"classpath:rose-mps-config.xml"});
		IHotelService hotelService = ctx.getBean("hotelService", IHotelService.class);
		InvokeResultArrayOfRoomType type = hotelService.getRoomTypes(100000l, "1111");
		
		for (RoomType roomType : type.getContent().getValue().getRoomType()) {
			System.out.println(roomType);
		}
	}
	
}
