
package com.rose.mps.domain.order.publicservice.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rose.mps.domain.order.dal.entity.CheckinStatus;


/**
 * <p>Java class for CheckinResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckinResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActualArriveTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualDepatureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BillId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckinCustomer" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order}Guest" minOccurs="0"/>
 *         &lt;element name="CheckinId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CheckinNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckinStatus" type="{http://schemas.datacontract.org/2004/07/NextPms.Dal.Entity.BusinessEnum}CheckinStatus" minOccurs="0"/>
 *         &lt;element name="EstimatedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OccupationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RoomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckinResponse", propOrder = {
    "actualArriveTime",
    "actualDepatureTime",
    "billId",
    "billNo",
    "channel",
    "checkinCustomer",
    "checkinId",
    "checkinNo",
    "checkinStatus",
    "estimatedDepartureTime",
    "memo",
    "occupationId",
    "orderId",
    "roomNumber"
})
public class CheckinResponse {

    @XmlElement(name = "ActualArriveTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualArriveTime;
    @XmlElementRef(name = "ActualDepatureTime", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> actualDepatureTime;
    @XmlElement(name = "BillId")
    protected Long billId;
    @XmlElementRef(name = "BillNo", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> billNo;
    @XmlElementRef(name = "Channel", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> channel;
    @XmlElementRef(name = "CheckinCustomer", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<Guest> checkinCustomer;
    @XmlElement(name = "CheckinId")
    protected Long checkinId;
    @XmlElementRef(name = "CheckinNo", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> checkinNo;
    @XmlElement(name = "CheckinStatus")
    protected CheckinStatus checkinStatus;
    @XmlElement(name = "EstimatedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDepartureTime;
    @XmlElementRef(name = "Memo", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> memo;
    @XmlElement(name = "OccupationId")
    protected Long occupationId;
    @XmlElement(name = "OrderId")
    protected Long orderId;
    @XmlElementRef(name = "RoomNumber", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> roomNumber;

    /**
     * Gets the value of the actualArriveTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualArriveTime() {
        return actualArriveTime;
    }

    /**
     * Sets the value of the actualArriveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualArriveTime(XMLGregorianCalendar value) {
        this.actualArriveTime = value;
    }

    /**
     * Gets the value of the actualDepatureTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualDepatureTime() {
        return actualDepatureTime;
    }

    /**
     * Sets the value of the actualDepatureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualDepatureTime(JAXBElement<XMLGregorianCalendar> value) {
        this.actualDepatureTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the billId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillId() {
        return billId;
    }

    /**
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillId(Long value) {
        this.billId = value;
    }

    /**
     * Gets the value of the billNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillNo() {
        return billNo;
    }

    /**
     * Sets the value of the billNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillNo(JAXBElement<String> value) {
        this.billNo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChannel(JAXBElement<String> value) {
        this.channel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the checkinCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Guest }{@code >}
     *     
     */
    public JAXBElement<Guest> getCheckinCustomer() {
        return checkinCustomer;
    }

    /**
     * Sets the value of the checkinCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Guest }{@code >}
     *     
     */
    public void setCheckinCustomer(JAXBElement<Guest> value) {
        this.checkinCustomer = ((JAXBElement<Guest> ) value);
    }

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
     * Gets the value of the checkinNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckinNo() {
        return checkinNo;
    }

    /**
     * Sets the value of the checkinNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckinNo(JAXBElement<String> value) {
        this.checkinNo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the checkinStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CheckinStatus }
     *     
     */
    public CheckinStatus getCheckinStatus() {
        return checkinStatus;
    }

    /**
     * Sets the value of the checkinStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckinStatus }
     *     
     */
    public void setCheckinStatus(CheckinStatus value) {
        this.checkinStatus = value;
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
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemo(JAXBElement<String> value) {
        this.memo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the occupationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOccupationId() {
        return occupationId;
    }

    /**
     * Sets the value of the occupationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOccupationId(Long value) {
        this.occupationId = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderId(Long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the roomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the value of the roomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoomNumber(JAXBElement<String> value) {
        this.roomNumber = ((JAXBElement<String> ) value);
    }

}
