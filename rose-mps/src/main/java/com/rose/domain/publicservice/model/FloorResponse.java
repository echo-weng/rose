
package com.rose.domain.publicservice.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FloorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloorResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FloorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FloorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HallId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HallName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloorResponse", propOrder = {
    "floorId",
    "floorName",
    "hallId",
    "hallName",
    "hotelId"
})
public class FloorResponse {

    @XmlElement(name = "FloorId")
    protected Long floorId;
    @XmlElementRef(name = "FloorName", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> floorName;
    @XmlElement(name = "HallId")
    protected Long hallId;
    @XmlElementRef(name = "HallName", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> hallName;
    @XmlElement(name = "HotelId")
    protected Long hotelId;

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
     * Gets the value of the floorName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFloorName() {
        return floorName;
    }

    /**
     * Sets the value of the floorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFloorName(JAXBElement<String> value) {
        this.floorName = ((JAXBElement<String> ) value);
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
     * Gets the value of the hallName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHallName() {
        return hallName;
    }

    /**
     * Sets the value of the hallName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHallName(JAXBElement<String> value) {
        this.hallName = ((JAXBElement<String> ) value);
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

}
