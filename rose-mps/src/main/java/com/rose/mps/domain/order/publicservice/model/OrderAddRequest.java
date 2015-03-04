
package com.rose.mps.domain.order.publicservice.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rose.mps.domain.order.dal.entity.CheckinType;


/**
 * <p>Java class for OrderAddRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderAddRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckinType" type="{http://schemas.datacontract.org/2004/07/NextPms.Dal.Entity.BusinessEnum}CheckinType" minOccurs="0"/>
 *         &lt;element name="ContractId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EstimatedArriveTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EstimatedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExpireKeepTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExternalPriceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Guests" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order}ArrayOfGuest" minOccurs="0"/>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IsExtenalPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Liaisons" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order}ArrayOfLiaison" minOccurs="0"/>
 *         &lt;element name="Locked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MemberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderItemRequests" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order}ArrayOfOrderItemRequest" minOccurs="0"/>
 *         &lt;element name="PrePaymentTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PublicMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomPlans" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order}ArrayOfRoomPlan" minOccurs="0"/>
 *         &lt;element name="SalerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderAddRequest", propOrder = {
    "checkinType",
    "contractId",
    "estimatedArriveTime",
    "estimatedDepartureTime",
    "expireKeepTime",
    "externalPriceName",
    "guests",
    "hotelId",
    "isExtenalPrice",
    "liaisons",
    "locked",
    "memberId",
    "orderItemRequests",
    "prePaymentTypeId",
    "promotionId",
    "publicMemo",
    "roomPlans",
    "salerId"
})
public class OrderAddRequest {

    @XmlElement(name = "CheckinType")
    protected CheckinType checkinType;
    @XmlElement(name = "ContractId")
    protected Long contractId;
    @XmlElement(name = "EstimatedArriveTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedArriveTime;
    @XmlElement(name = "EstimatedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDepartureTime;
    @XmlElementRef(name = "ExpireKeepTime", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> expireKeepTime;
    @XmlElementRef(name = "ExternalPriceName", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> externalPriceName;
    @XmlElementRef(name = "Guests", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<ArrayOfGuest> guests;
    @XmlElement(name = "HotelId")
    protected Long hotelId;
    @XmlElementRef(name = "IsExtenalPrice", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<Boolean> isExtenalPrice;
    @XmlElementRef(name = "Liaisons", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<ArrayOfLiaison> liaisons;
    @XmlElement(name = "Locked")
    protected Boolean locked;
    @XmlElementRef(name = "MemberId", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> memberId;
    @XmlElementRef(name = "OrderItemRequests", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<ArrayOfOrderItemRequest> orderItemRequests;
    @XmlElementRef(name = "PrePaymentTypeId", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> prePaymentTypeId;
    @XmlElement(name = "PromotionId")
    protected Long promotionId;
    @XmlElementRef(name = "PublicMemo", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> publicMemo;
    @XmlElementRef(name = "RoomPlans", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<ArrayOfRoomPlan> roomPlans;
    @XmlElementRef(name = "SalerId", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> salerId;

    /**
     * Gets the value of the checkinType property.
     * 
     * @return
     *     possible object is
     *     {@link CheckinType }
     *     
     */
    public CheckinType getCheckinType() {
        return checkinType;
    }

    /**
     * Sets the value of the checkinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckinType }
     *     
     */
    public void setCheckinType(CheckinType value) {
        this.checkinType = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractId(Long value) {
        this.contractId = value;
    }

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
     * Gets the value of the expireKeepTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpireKeepTime() {
        return expireKeepTime;
    }

    /**
     * Sets the value of the expireKeepTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpireKeepTime(JAXBElement<XMLGregorianCalendar> value) {
        this.expireKeepTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the externalPriceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalPriceName() {
        return externalPriceName;
    }

    /**
     * Sets the value of the externalPriceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalPriceName(JAXBElement<String> value) {
        this.externalPriceName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the guests property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGuest }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGuest> getGuests() {
        return guests;
    }

    /**
     * Sets the value of the guests property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGuest }{@code >}
     *     
     */
    public void setGuests(JAXBElement<ArrayOfGuest> value) {
        this.guests = ((JAXBElement<ArrayOfGuest> ) value);
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
     * Gets the value of the isExtenalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsExtenalPrice() {
        return isExtenalPrice;
    }

    /**
     * Sets the value of the isExtenalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsExtenalPrice(JAXBElement<Boolean> value) {
        this.isExtenalPrice = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the liaisons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLiaison }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLiaison> getLiaisons() {
        return liaisons;
    }

    /**
     * Sets the value of the liaisons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLiaison }{@code >}
     *     
     */
    public void setLiaisons(JAXBElement<ArrayOfLiaison> value) {
        this.liaisons = ((JAXBElement<ArrayOfLiaison> ) value);
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }

    /**
     * Gets the value of the memberId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemberId() {
        return memberId;
    }

    /**
     * Sets the value of the memberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemberId(JAXBElement<String> value) {
        this.memberId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orderItemRequests property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderItemRequest }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderItemRequest> getOrderItemRequests() {
        return orderItemRequests;
    }

    /**
     * Sets the value of the orderItemRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderItemRequest }{@code >}
     *     
     */
    public void setOrderItemRequests(JAXBElement<ArrayOfOrderItemRequest> value) {
        this.orderItemRequests = ((JAXBElement<ArrayOfOrderItemRequest> ) value);
    }

    /**
     * Gets the value of the prePaymentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrePaymentTypeId() {
        return prePaymentTypeId;
    }

    /**
     * Sets the value of the prePaymentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrePaymentTypeId(JAXBElement<String> value) {
        this.prePaymentTypeId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the promotionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPromotionId() {
        return promotionId;
    }

    /**
     * Sets the value of the promotionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPromotionId(Long value) {
        this.promotionId = value;
    }

    /**
     * Gets the value of the publicMemo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPublicMemo() {
        return publicMemo;
    }

    /**
     * Sets the value of the publicMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPublicMemo(JAXBElement<String> value) {
        this.publicMemo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the roomPlans property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoomPlan }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRoomPlan> getRoomPlans() {
        return roomPlans;
    }

    /**
     * Sets the value of the roomPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoomPlan }{@code >}
     *     
     */
    public void setRoomPlans(JAXBElement<ArrayOfRoomPlan> value) {
        this.roomPlans = ((JAXBElement<ArrayOfRoomPlan> ) value);
    }

    /**
     * Gets the value of the salerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalerId() {
        return salerId;
    }

    /**
     * Sets the value of the salerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalerId(JAXBElement<String> value) {
        this.salerId = ((JAXBElement<String> ) value);
    }

}
