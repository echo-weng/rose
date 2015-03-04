/**
 * 
 */
package com.rose.elong.domain.reservation.struct;

import java.util.Date;

import com.rose.domain.base.RoseObject;
import com.rose.utils.DateUtil;
import com.rose.utils.StringUtil;

/**
 * @author echo
 * 
 */
public class ResGlobalInfo extends RoseObject {
	private static final String DATE_FORMATE = "yyyy-MM-ddHH:mm:ss";

	private TimeSpan timeSpan;
	//最早到店时间
	private Date earliestCheckInTime;
	//最晚到店时间
	private Date latestCheckInTime;
	//备注
	private String remark;
	//担保类型
	private String guaranteeType;
	//房间数量
	private Integer roomNum;
	
	public TimeSpan getTimeSpan() {
		return timeSpan;
	}

	public void setTimeSpan(TimeSpan timeSpan) {
		this.timeSpan = timeSpan;
	}
	
	public String getEarliestCheckInTimeString(){
		if(earliestCheckInTime == null){
			return "";
		}
		return DateUtil.format(DATE_FORMATE, earliestCheckInTime);
	}
	
	public void setEarliestCheckInTimeString(String earliestCheckInTimeStr){
		if(StringUtil.isEmpty(earliestCheckInTimeStr)){
			return;
		}
		earliestCheckInTime = DateUtil.parse(DATE_FORMATE, earliestCheckInTimeStr);
	}
	
	public void setLatestCheckInTimeString(String latestCheckInTimeStr){
		if(StringUtil.isEmpty(latestCheckInTimeStr)){
			return;
		}
		latestCheckInTime = DateUtil.parse(DATE_FORMATE, latestCheckInTimeStr);
	}
	
	public String getLatestCheckInTimeString(){
		if(latestCheckInTime == null){
			return "";
		}
		return DateUtil.format(DATE_FORMATE, latestCheckInTime);
	}

	public Date getEarliestCheckInTime() {
		return earliestCheckInTime;
	}

	public void setEarliestCheckInTime(Date earliestCheckInTime) {
		this.earliestCheckInTime = earliestCheckInTime;
	}

	public Date getLatestCheckInTime() {
		return latestCheckInTime;
	}

	public void setLatestCheckInTime(Date latestCheckInTime) {
		this.latestCheckInTime = latestCheckInTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getGuaranteeType() {
		return guaranteeType;
	}

	public void setGuaranteeType(String guaranteeType) {
		this.guaranteeType = guaranteeType;
	}

	public Integer getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(Integer roomNum) {
		this.roomNum = roomNum;
	}

}
