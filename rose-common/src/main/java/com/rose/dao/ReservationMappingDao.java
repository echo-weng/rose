package com.rose.dao;

import org.springframework.stereotype.Repository;

import com.rose.entity.ReservationMapping;

/**
 * ReservationMapping 操作类
 *
 * @author echo
 */
@Repository("reservationMappingDao")
public class ReservationMappingDao extends BaseDaoSupport<ReservationMapping>{
	
	public ReservationMapping getByOtaCooperationCode(String otaCooperatorCode){
		DetachedQuery detachedQuery = DetachedQueryFactory.create(" from ReservationMapping where otaCooperatorCode = :otaCooperatorCode ");
		detachedQuery.setString("otaCooperatorCode", otaCooperatorCode);
		
		return (ReservationMapping) this.findUniqueResultByQuery(detachedQuery);
	}
	
	public ReservationMapping getByCode(String code){
		DetachedQuery detachedQuery = DetachedQueryFactory.create(" from ReservationMapping where code = :code ");
		detachedQuery.setString("code", code);
		
		return (ReservationMapping) this.findUniqueResultByQuery(detachedQuery);
	}
	
	
}
