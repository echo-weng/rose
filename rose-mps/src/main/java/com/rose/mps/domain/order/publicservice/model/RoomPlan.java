
package com.rose.mps.domain.order.publicservice.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomPlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order}ArrayOfRoomPrice" minOccurs="0"/>
 *         &lt;element name="RoomType" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order}RoomType" minOccurs="0"/>
 *         &lt;element name="RoomTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactoinId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomPlan", propOrder = {
    "amount",
    "price",
    "roomType",
    "roomTypeId",
    "transactoinId"
})
public class RoomPlan {

    @XmlElement(name = "Amount")
    protected Integer amount;
    @XmlElementRef(name = "Price", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<ArrayOfRoomPrice> price;
    @XmlElementRef(name = "RoomType", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<RoomType> roomType;
    @XmlElementRef(name = "RoomTypeId", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> roomTypeId;
    @XmlElement(name = "TransactoinId")
    protected Long transactoinId;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAmount(Integer value) {
        this.amount = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoomPrice }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRoomPrice> getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoomPrice }{@code >}
     *     
     */
    public void setPrice(JAXBElement<ArrayOfRoomPrice> value) {
        this.price = ((JAXBElement<ArrayOfRoomPrice> ) value);
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

    /**
     * Gets the value of the transactoinId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransactoinId() {
        return transactoinId;
    }

    /**
     * Sets the value of the transactoinId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransactoinId(Long value) {
        this.transactoinId = value;
    }

}
