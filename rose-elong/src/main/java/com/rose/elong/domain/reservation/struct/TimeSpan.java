/**
 * 
 */
package com.rose.elong.domain.reservation.struct;

import java.util.Date;

import com.rose.domain.base.RoseObject;
import com.rose.domain.reservation.struct.DateSpan;
import com.rose.utils.DateUtil;
import com.rose.utils.StringUtil;

/**
 * @author echo
 * 
 */
public class TimeSpan extends RoseObject {
	private static final String DATE_FORMATE = "yyyy-MM-dd";

	private Date start;
	private Date end;
	
	public String getEndString(){
		if(end == null){
			return "";
		}
		return DateUtil.format(DATE_FORMATE, end);
	}
	
	public void setEndString(String endStr){
		if(StringUtil.isEmpty(endStr)){
			return;
		}
		end = DateUtil.parse(DATE_FORMATE, endStr);
	}
	
	public String getStartString(){
		if(start == null){
			return "";
		}
		return DateUtil.format(DATE_FORMATE, start);
	}
	
	public void setStartString(String startStr){
		if(StringUtil.isEmpty(startStr)){
			return;
		}
		start = DateUtil.parse(DATE_FORMATE, startStr);
	}
	
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	
	public DateSpan toRoseDateSpan() {
		if (start == null) {
			throw new NullPointerException("TimeSpan/start");
		}
		return new DateSpan(start, end);
	}

}