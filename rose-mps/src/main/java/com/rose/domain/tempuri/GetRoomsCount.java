
package com.rose.domain.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="utcTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="roomStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hallId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="floorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unixExpireTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "utcTimestamp",
    "hotelId",
    "roomStatus",
    "hallId",
    "floorId",
    "unixExpireTimestamp",
    "signature"
})
@XmlRootElement(name = "GetRoomsCount")
public class GetRoomsCount {

    protected Long utcTimestamp;
    protected Long hotelId;
    @XmlElementRef(name = "roomStatus", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> roomStatus;
    protected Long hallId;
    protected Long floorId;
    protected Long unixExpireTimestamp;
    @XmlElementRef(name = "signature", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> signature;

    /**
     * Gets the value of the utcTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUtcTimestamp() {
        return utcTimestamp;
    }

    /**
     * Sets the value of the utcTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUtcTimestamp(Long value) {
        this.utcTimestamp = value;
    }

    /**
     * Gets the value of the hotelId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHotelId(Long value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the roomStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoomStatus() {
        return roomStatus;
    }

    /**
     * Sets the value of the roomStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoomStatus(JAXBElement<String> value) {
        this.roomStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hallId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHallId() {
        return hallId;
    }

    /**
     * Sets the value of the hallId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHallId(Long value) {
        this.hallId = value;
    }

    /**
     * Gets the value of the floorId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFloorId() {
        return floorId;
    }

    /**
     * Sets the value of the floorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFloorId(Long value) {
        this.floorId = value;
    }

    /**
     * Gets the value of the unixExpireTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnixExpireTimestamp() {
        return unixExpireTimestamp;
    }

    /**
     * Sets the value of the unixExpireTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnixExpireTimestamp(Long value) {
        this.unixExpireTimestamp = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignature(JAXBElement<String> value) {
        this.signature = ((JAXBElement<String> ) value);
    }

}
