package com.rose.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rose.dao.HotelMappingDao;
import com.rose.dao.HotelSupplyDao;
import com.rose.dao.ReservationMappingDao;
import com.rose.entity.HotelMapping;
import com.rose.entity.HotelSupply;
import com.rose.entity.ReservationMapping;
import com.rose.service.EntityService;

/**
 * 实体服务类
 *
 * @author echo
 */
@Service("entityService")
public class EntityServiceImpl implements EntityService{
	
	@Autowired
	private ReservationMappingDao reservationMappingDao;
	
	@Autowired
	private HotelMappingDao hotelMappingDao;
	
	@Autowired
	private HotelSupplyDao hotelSupplyDao;

	@Override
	public ReservationMapping getReservationMappingByOtaCooperatorCode(String otaCooperatorCode) {
		return reservationMappingDao.getByOtaCooperationCode(otaCooperatorCode);
	}
	
	@Override
	public HotelMapping getHotelMappingByCode(String otaCode, String hotelCode){
		return hotelMappingDao.getHotelMapping(otaCode, hotelCode);
	}
	
	@Override
	public List<HotelMapping> queryHotelMappingsByCode(String hotelCode){
		return hotelMappingDao.queryHotelMapping(hotelCode);
	}
	
	@Override
	public HotelMapping getHotelMappingById(Long hotelMappingId){
		return hotelMappingDao.getById(hotelMappingId);
	}
	
	@Override
	public HotelSupply getHotelSupplyById(Long hotelSupplyId){
		return hotelSupplyDao.getById(hotelSupplyId);
	}
	
	@Override
	public Map<Long, HotelSupply> getAllHotelSupplyMap(){
		List<HotelSupply> hotelSupplies = hotelSupplyDao.queryAll();
		Map<Long, HotelSupply> map = new HashMap<Long, HotelSupply>();
		for (HotelSupply hotelSupply : hotelSupplies) {
			map.put(hotelSupply.getId(), hotelSupply);
		}
		return map;
	}
	
	@Override
	public void saveOrUpdateReservationMapping(ReservationMapping reservationMapping) {
		reservationMappingDao.saveOrUpdate(reservationMapping);
	}

	public void setReservationMappingDao(ReservationMappingDao reservationMappingDao) {
		this.reservationMappingDao = reservationMappingDao;
	}
	
	public void setHotelMappingDao(HotelMappingDao hotelMappingDao) {
		this.hotelMappingDao = hotelMappingDao;
	}
	
	public void setHotelSupplyDao(HotelSupplyDao hotelSupplyDao) {
		this.hotelSupplyDao = hotelSupplyDao;
	}
	
}
