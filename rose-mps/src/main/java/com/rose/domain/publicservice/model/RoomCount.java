
package com.rose.domain.publicservice.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rose.domain.serialization.array.ArrayOfint;


/**
 * <p>Java class for RoomCount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DetailCounts" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="RoomType" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order}RoomType" minOccurs="0"/>
 *         &lt;element name="RoomTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomCount", propOrder = {
    "count",
    "detailCounts",
    "roomType",
    "roomTypeId"
})
public class RoomCount {

    @XmlElement(name = "Count")
    protected Integer count;
    @XmlElementRef(name = "DetailCounts", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<ArrayOfint> detailCounts;
    @XmlElementRef(name = "RoomType", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<RoomType> roomType;
    @XmlElementRef(name = "RoomTypeId", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> roomTypeId;

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the detailCounts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getDetailCounts() {
        return detailCounts;
    }

    /**
     * Sets the value of the detailCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setDetailCounts(JAXBElement<ArrayOfint> value) {
        this.detailCounts = ((JAXBElement<ArrayOfint> ) value);
    }

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoomType }{@code >}
     *     
     */
    public JAXBElement<RoomType> getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoomType }{@code >}
     *     
     */
    public void setRoomType(JAXBElement<RoomType> value) {
        this.roomType = ((JAXBElement<RoomType> ) value);
    }

    /**
     * Gets the value of the roomTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * Sets the value of the roomTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoomTypeId(JAXBElement<String> value) {
        this.roomTypeId = ((JAXBElement<String> ) value);
    }

}
