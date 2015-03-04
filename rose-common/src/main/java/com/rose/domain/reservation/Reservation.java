package com.rose.domain.reservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.rose.domain.base.RoseObject;
import com.rose.domain.reservation.struct.Guarantee;
import com.rose.domain.reservation.struct.Guest;
import com.rose.domain.reservation.struct.Hotel;

/**
 * The information of a reservation.
 */
public class Reservation extends RoseObject{

	private String languageCode;
	/**
	 * reservation id for modification
	 */
	private String reservationId;

	private String channelReservationId;

	private Hotel hotel;

	private Guest customer;

	private List<Guest> guests;

	private Guarantee guarantee;

	private List<String> additionalRequests;

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

	public synchronized void addAdditionalRequest(String additionalRequest) {
		if (additionalRequests == null) {
			additionalRequests = new ArrayList<String>();
		}
		additionalRequests.add(additionalRequest);
	}

	public synchronized void addComment(String comment) {
		if (comments == null) {
			comments = new ArrayList<String>();
		}
		comments.add(comment);
	}

	public synchronized void addGuest(Guest guest) {
		if (guests == null) {
			guests = new ArrayList<Guest>();
		}
		guests.add(guest);
	}

	public String getChannelReservationId() {
		return channelReservationId;
	}

	public void setChannelReservationId(String channelReservationId) {
		this.channelReservationId = channelReservationId;
	}

	public Guest getCustomer() {
		return customer;
	}

	public void setCustomer(Guest customer) {
		this.customer = customer;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<Guest> getGuests() {
		return guests;
	}

	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}

	public Guarantee getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(Guarantee guarantee) {
		this.guarantee = guarantee;
	}

	public List<String> getAdditionalRequests() {
		return additionalRequests;
	}

	public void setAdditionalRequests(List<String> additionalRequests) {
		this.additionalRequests = additionalRequests;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

}
