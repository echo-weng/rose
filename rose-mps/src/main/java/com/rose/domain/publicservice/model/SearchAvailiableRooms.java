
package com.rose.domain.publicservice.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rose.domain.serialization.array.ArrayOflong;
import com.rose.domain.serialization.array.ArrayOfstring;


/**
 * <p>Java class for SearchAvailiableRooms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchAvailiableRooms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstimatedArriveTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EstimatedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FloorIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="HallIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RoomAttributeIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="RoomTypeIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchAvailiableRooms", propOrder = {
    "estimatedArriveTime",
    "estimatedDepartureTime",
    "floorIds",
    "hallIds",
    "hotelId",
    "roomAttributeIds",
    "roomTypeIds"
})
public class SearchAvailiableRooms {

    @XmlElement(name = "EstimatedArriveTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedArriveTime;
    @XmlElement(name = "EstimatedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDepartureTime;
    @XmlElementRef(name = "FloorIds", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<ArrayOflong> floorIds;
    @XmlElementRef(name = "HallIds", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<ArrayOflong> hallIds;
    @XmlElement(name = "HotelId")
    protected Long hotelId;
    @XmlElementRef(name = "RoomAttributeIds", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> roomAttributeIds;
    @XmlElementRef(name = "RoomTypeIds", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> roomTypeIds;

    /**
     * Gets the value of the estimatedArriveTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedArriveTime() {
        return estimatedArriveTime;
    }

    /**
     * Sets the value of the estimatedArriveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedArriveTime(XMLGregorianCalendar value) {
        this.estimatedArriveTime = value;
    }

    /**
     * Gets the value of the estimatedDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedDepartureTime() {
        return estimatedDepartureTime;
    }

    /**
     * Sets the value of the estimatedDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedDepartureTime(XMLGregorianCalendar value) {
        this.estimatedDepartureTime = value;
    }

    /**
     * Gets the value of the floorIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getFloorIds() {
        return floorIds;
    }

    /**
     * Sets the value of the floorIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setFloorIds(JAXBElement<ArrayOflong> value) {
        this.floorIds = ((JAXBElement<ArrayOflong> ) value);
    }

    /**
     * Gets the value of the hallIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getHallIds() {
        return hallIds;
    }

    /**
     * Sets the value of the hallIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setHallIds(JAXBElement<ArrayOflong> value) {
        this.hallIds = ((JAXBElement<ArrayOflong> ) value);
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
     * Gets the value of the roomAttributeIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getRoomAttributeIds() {
        return roomAttributeIds;
    }

    /**
     * Sets the value of the roomAttributeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setRoomAttributeIds(JAXBElement<ArrayOfstring> value) {
        this.roomAttributeIds = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the roomTypeIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getRoomTypeIds() {
        return roomTypeIds;
    }

    /**
     * Sets the value of the roomTypeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setRoomTypeIds(JAXBElement<ArrayOfstring> value) {
        this.roomTypeIds = ((JAXBElement<ArrayOfstring> ) value);
    }

}
