package com.rose.elong.domain.reservation;

import java.util.Date;

import com.rose.domain.base.RoseObject;
import com.rose.utils.DateUtil;
import com.rose.utils.StringUtil;

/**
 * 订单头部
 *
 * @author echo
 */
public class ReservationHeader extends RoseObject {
	protected static final String DATE_FORMATE = "yyyy-MM-ddHH:mm:ss";
	
	protected Date timeStamp;
	protected String version;
	protected String userName;
	protected String password;
	protected String echoToken;
	protected String primaryLangID;

	public String getTimeStampString() {
		if (timeStamp == null) {
			return "";
		}
		return DateUtil.format(DATE_FORMATE, timeStamp);
	}

	public void setTimeStampString(String timeStampStr) {
		if (StringUtil.isEmpty(timeStampStr)) {
			return;
		}
		this.timeStamp = DateUtil.parse(DATE_FORMATE, timeStampStr);
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEchoToken() {
		return echoToken;
	}

	public void setEchoToken(String echoToken) {
		this.echoToken = echoToken;
	}

	public String getPrimaryLangID() {
		return primaryLangID;
	}

	public void setPrimaryLangID(String primaryLangID) {
		this.primaryLangID = primaryLangID;
	}

	public static String getDateFormate() {
		return DATE_FORMATE;
	}

}
