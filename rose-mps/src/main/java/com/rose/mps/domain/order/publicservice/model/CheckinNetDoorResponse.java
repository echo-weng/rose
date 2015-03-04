
package com.rose.mps.domain.order.publicservice.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckinNetDoorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckinNetDoorResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckinId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IsCanOpen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckinNetDoorResponse", propOrder = {
    "checkinId",
    "isCanOpen"
})
public class CheckinNetDoorResponse {

    @XmlElement(name = "CheckinId")
    protected Long checkinId;
    @XmlElement(name = "IsCanOpen")
    protected Boolean isCanOpen;

    /**
     * Gets the value of the checkinId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCheckinId() {
        return checkinId;
    }

    /**
     * Sets the value of the checkinId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCheckinId(Long value) {
        this.checkinId = value;
    }

    /**
     * Gets the value of the isCanOpen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCanOpen() {
        return isCanOpen;
    }

    /**
     * Sets the value of the isCanOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCanOpen(Boolean value) {
        this.isCanOpen = value;
    }

}
