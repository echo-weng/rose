package com.rose.service;

import java.util.List;
import java.util.Map;

import com.rose.entity.HotelMapping;
import com.rose.entity.HotelSupply;
import com.rose.entity.ReservationMapping;

/**
 * 实体服务类
 *
 * @author echo
 */
public interface EntityService {
	
	/**
	 * 通过otaCode 获取订单mapping
	 * 
	 * @param otaCode
	 * @return
	 */
	ReservationMapping getReservationMappingByOtaCooperatorCode(String otaCooperatorCode);
	
	/**
	 * 保存或者更新订单
	 * @param reservationMapping
	 */
	void saveOrUpdateReservationMapping(ReservationMapping reservationMapping);
	
	/**
	 * 通过酒店code 获取hotelMapping
	 * 
	 * @param otaCode
	 * @param hotelCode
	 * @return
	 */
	HotelMapping getHotelMappingByCode(String otaCode, String hotelCode);
	
	/**
	 * 通过酒店code 查询hotelMapping
	 * 
	 * @param hotelCode
	 * @return
	 */
	List<HotelMapping> queryHotelMappingsByCode(String hotelCode);
	
	/**
	 * 通过hotelMappingId 获取 hotelMapping
	 * @param hotelMappingId
	 * @return
	 */
	HotelMapping getHotelMappingById(Long hotelMappingId);
	
	/**
	 * 通过hotelSupplyId 获取 HotelSupply
	 * 
	 * @param hotelSupplyId
	 * @return
	 */
	HotelSupply getHotelSupplyById(Long hotelSupplyId);
	
	/**
	 * 获取所有的HotelSupply 并且转化为map
	 * 
	 * @return
	 */
	Map<Long, HotelSupply> getAllHotelSupplyMap();
	
}
