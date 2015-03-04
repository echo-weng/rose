package com.rose.elong.domain.request;

public class DayOfWeek {

	/**
	 * 默认全部可以预定
	 */
	private boolean mon = true;
	private boolean thu = true;
	private boolean wed = true;
	private boolean tue = true;
	private boolean fri = true;
	private boolean sat = true;
	private boolean sun = true;

	public boolean getMon() {
		return mon;
	}

	public void setMon(boolean mon) {
		this.mon = mon;
	}

	public boolean getThu() {
		return thu;
	}

	public void setThu(boolean thu) {
		this.thu = thu;
	}

	public boolean getWed() {
		return wed;
	}

	public void setWed(boolean wed) {
		this.wed = wed;
	}

	public boolean getTue() {
		return tue;
	}

	public void setTue(boolean tue) {
		this.tue = tue;
	}

	public boolean getFri() {
		return fri;
	}

	public void setFri(boolean fri) {
		this.fri = fri;
	}

	public boolean getSat() {
		return sat;
	}

	public void setSat(boolean sat) {
		this.sat = sat;
	}

	public boolean getSun() {
		return sun;
	}

	public void setSun(boolean sun) {
		this.sun = sun;
	}

}
