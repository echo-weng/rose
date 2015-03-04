package com.rose.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rose.entity.HotelMapping;

/**
 * @author echo
 */
@Repository("hotelMappingDao")
public class HotelMappingDao extends BaseDaoSupport<HotelMapping>{
	
	public HotelMapping getHotelMapping(String otaCode, String hotelCode){
		DetachedQuery detachedQuery = DetachedQueryFactory.create(" from HotelMapping where otaCode = :otaCode and code = :code ");
		detachedQuery.setString("otaCode", otaCode);
		detachedQuery.setString("code", hotelCode);
		return (HotelMapping) this.findUniqueResultByQuery(detachedQuery);
	}
	
	@SuppressWarnings("unchecked")
	public List<HotelMapping> queryHotelMapping(String hotelCode){
		DetachedQuery detachedQuery = DetachedQueryFactory.create(" from HotelMapping where code = :code ");
		detachedQuery.setString("code", hotelCode);
		return this.findByQuery(detachedQuery);
	}
	
}
