package com.rose.domain.reservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.rose.domain.base.RoseObject;
import com.rose.domain.reservation.struct.Rate;

/**
 * @author echo
 */
public class ReservationConfirmation extends RoseObject{

	private String languageCode;

	private String reservationId;

	private String supplierReservationId;

	private Rate total;

	private String guaranteeDescription;

	private List<String> comments;

	private Properties properties;

	public synchronized void setProperty(String key, String value) {
		if (properties == null) {
			properties = new Properties();
		}
		properties.setProperty(key, value);
	}

	public synchronized String getProperty(String key) {
		if (properties == null) {
			return null;
		}
		return properties.getProperty(key);
	}

	public synchronized void addComment(String comment) {
		if (comments == null) {
			comments = new ArrayList<String>();
		}
		comments.add(comment);
	}

	public String getSupplierReservationId() {
		return supplierReservationId;
	}

	public void setSupplierReservationId(String supplierReservationId) {
		this.supplierReservationId = supplierReservationId;
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public Rate getTotal() {
		return total;
	}

	public void setTotal(Rate total) {
		this.total = total;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public String getGuaranteeDescription() {
		return guaranteeDescription;
	}

	public void setGuaranteeDescription(String guaranteeDescription) {
		this.guaranteeDescription = guaranteeDescription;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

}
