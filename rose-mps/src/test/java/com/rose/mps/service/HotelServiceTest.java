package com.rose.mps.service;

import java.net.MalformedURLException;
import java.net.URL;

import me.andpay.ti.util.JSON;

import org.junit.Test;

import com.rose.mps.domain.hotel.publicservice.InvokeResultArrayOfHotelSearchResponse;
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
		
		System.out.println(JSON.getDefault().toJSONString(type));
		
		for (RoomType roomType : type.getContent().getValue().getRoomType()) {
			System.out.println(roomType.getId().getValue() + ":" + roomType.getOwnerId() + ":" + roomType.getRoomTypeName().getValue() + ":");
			System.out.println(roomType.getOwnerId());
		}
		
//		InvokeResult<HotelSearchResponse[]> GetAllHotels(int pageIndex, int pageSize, long unixExpireTimestamp, string signature);
	}
	
	@Test
	public void test() throws MalformedURLException{
		Hotel hotel = new Hotel(new URL("https://pms.beyondh.com:7997/Service/Order/HotelService.svc"), "web", "pass");
		IHotelService hotelService = hotel.getWs();
		InvokeResultArrayOfHotelSearchResponse type = hotelService.getAllHotels(0, 10, null, null);
		System.out.println(JSON.getDefault().toJSONString(type));
	}
}
