
package com.rose.mps.domain.order.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.mps.domain.order.publicservice.model.CheckGuestIdCardRequest;


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
 *         &lt;element name="checkGuestIdCardRequest" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order}CheckGuestIdCardRequest" minOccurs="0"/>
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
    "checkGuestIdCardRequest",
    "unixExpireTimestamp",
    "signature"
})
@XmlRootElement(name = "CheckGuestIdCard")
public class CheckGuestIdCard {

    @XmlElementRef(name = "checkGuestIdCardRequest", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<CheckGuestIdCardRequest> checkGuestIdCardRequest;
    protected Long unixExpireTimestamp;
    @XmlElementRef(name = "signature", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> signature;

    /**
     * Gets the value of the checkGuestIdCardRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CheckGuestIdCardRequest }{@code >}
     *     
     */
    public JAXBElement<CheckGuestIdCardRequest> getCheckGuestIdCardRequest() {
        return checkGuestIdCardRequest;
    }

    /**
     * Sets the value of the checkGuestIdCardRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CheckGuestIdCardRequest }{@code >}
     *     
     */
    public void setCheckGuestIdCardRequest(JAXBElement<CheckGuestIdCardRequest> value) {
        this.checkGuestIdCardRequest = ((JAXBElement<CheckGuestIdCardRequest> ) value);
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
