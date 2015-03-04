package com.rose.mps.update.domain;

import java.util.Date;

import com.rose.utils.DateUtil;
import com.rose.utils.StringUtil;

/**
 * 时间区间
 *
 * @author echo
 */
public class DateSpan extends CloneableValueObject{
	private static final String DATE_FOMATE = "yyyy-MM-dd";

	/**
	 * 开始时间
	 */
	private Date startTime;

	/**
	 * 结束时间
	 */
	private Date endTime;
	
	public Date getStartTime() {
		return startTime;
	}
	
	public String getStartTimeString(){
		if(startTime == null){
			return "";
		}
		return DateUtil.format(DATE_FOMATE, startTime);
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public void setStartTimeString(String startTimeString){
		if(StringUtil.isEmpty(startTimeString)){
			return;
		}
		this.startTime = DateUtil.parse(DATE_FOMATE, startTimeString);
	}

	public Date getEndTime() {
		return endTime;
	}
	
	public String getEndTimeString(){
		if(endTime == null){
			return "";
		}
		return DateUtil.format(DATE_FOMATE, endTime);
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	public void setEndTimeString(String endTimeString){
		if(StringUtil.isEmpty(endTimeString)){
			return;
		}
		this.endTime = DateUtil.parse(DATE_FOMATE, endTimeString);
	}

}
