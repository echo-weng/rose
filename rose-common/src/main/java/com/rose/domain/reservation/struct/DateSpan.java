package com.rose.domain.reservation.struct;

import java.util.Date;

import com.rose.domain.base.RoseObject;

/**
 * A span of day between start and end date.
 * 
 * @author echo
 */
public class DateSpan extends RoseObject{
	private Date startDate;
	private Date endDate;

	public DateSpan() {
	}

	public DateSpan(Date startDate, Date endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
