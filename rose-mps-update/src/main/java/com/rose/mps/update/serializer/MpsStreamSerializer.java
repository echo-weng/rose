package com.rose.mps.update.serializer;

import org.rose.webservice.serializer.castor.CastorSerializer;

/**
 * mps序列化/反序列化实现
 *
 * @author echo
 */
public class MpsStreamSerializer extends CastorSerializer{
	
	public MpsStreamSerializer(){
		this.addMappingLocation("com/rose/mps/update/mapping/mapping-update.xml");
	}
	
}
