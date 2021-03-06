
package com.rose.mps.domain.order.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.mps.domain.order.publicservice.model.GetOrdersByMemberIdRequest;


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
 *         &lt;element name="ordersByMemberIdRequest" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order}GetOrdersByMemberIdRequest" minOccurs="0"/>
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
    "ordersByMemberIdRequest",
    "unixExpireTimestamp",
    "signature"
})
@XmlRootElement(name = "GetOrdersByMemberId")
public class GetOrdersByMemberId {

    @XmlElementRef(name = "ordersByMemberIdRequest", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<GetOrdersByMemberIdRequest> ordersByMemberIdRequest;
    protected Long unixExpireTimestamp;
    @XmlElementRef(name = "signature", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> signature;

    /**
     * Gets the value of the ordersByMemberIdRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetOrdersByMemberIdRequest }{@code >}
     *     
     */
    public JAXBElement<GetOrdersByMemberIdRequest> getOrdersByMemberIdRequest() {
        return ordersByMemberIdRequest;
    }

    /**
     * Sets the value of the ordersByMemberIdRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetOrdersByMemberIdRequest }{@code >}
     *     
     */
    public void setOrdersByMemberIdRequest(JAXBElement<GetOrdersByMemberIdRequest> value) {
        this.ordersByMemberIdRequest = ((JAXBElement<GetOrdersByMemberIdRequest> ) value);
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
