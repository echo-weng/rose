package com.rose.domain.soap;

import com.rose.domain.soap.fault.IFault;

/**
 * 
 * @author echo
 * 
 */
public interface IBody {

	IFault getFault();

	void setFault(IFault fault);

}
