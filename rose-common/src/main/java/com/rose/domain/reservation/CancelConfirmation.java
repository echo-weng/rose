package com.rose.domain.reservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author echo
 */
public class CancelConfirmation {

	private String languageCode;

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

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((languageCode == null) ? 0 : languageCode.hashCode());
		result = prime * result + ((properties == null) ? 0 : properties.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CancelConfirmation other = (CancelConfirmation) obj;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (languageCode == null) {
			if (other.languageCode != null)
				return false;
		} else if (!languageCode.equals(other.languageCode))
			return false;
		if (properties == null) {
			if (other.properties != null)
				return false;
		} else if (!properties.equals(other.properties))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CancelConfirmation{" + "languageCode:" + this.languageCode + "," + "comments:" + this.comments + ","
				+ "properties:" + this.properties + "," + "}";
	}

}
