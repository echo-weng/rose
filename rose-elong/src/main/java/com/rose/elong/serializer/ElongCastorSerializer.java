package com.rose.elong.serializer;

import org.rose.webservice.serializer.castor.CastorSerializer;

/**
 * @author echo
 */
public class ElongCastorSerializer extends CastorSerializer{
	
	public ElongCastorSerializer(){
		addMappingLocation("com/rose/elong/mapping/common.xml");
		addMappingLocation("com/rose/elong/mapping/mapping-request.xml");
		addMappingLocation("com/rose/elong/mapping/mapping-response.xml");
		addMappingLocation("com/rose/elong/mapping/mapping-reservation.xml");
		addNamespace("soap", "http://schemas.xmlsoap.org/soap/envelope/");
		addNamespace("", "http://tempuri.org/");
		addNamespace("com", "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.SouthBoundService.Model");
	}
	
}
