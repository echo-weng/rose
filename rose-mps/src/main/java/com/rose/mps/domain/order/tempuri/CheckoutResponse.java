
package com.rose.mps.domain.order.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.mps.domain.order.publicservice.InvokeResultArrayOfCheckoutResponse;


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
 *         &lt;element name="CheckoutResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_ArrayOfCheckoutResponse" minOccurs="0"/>
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
    "checkoutResult"
})
@XmlRootElement(name = "CheckoutResponse")
public class CheckoutResponse {

    @XmlElementRef(name = "CheckoutResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultArrayOfCheckoutResponse> checkoutResult;

    /**
     * Gets the value of the checkoutResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfCheckoutResponse }{@code >}
     *     
     */
    public JAXBElement<InvokeResultArrayOfCheckoutResponse> getCheckoutResult() {
        return checkoutResult;
    }

    /**
     * Sets the value of the checkoutResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfCheckoutResponse }{@code >}
     *     
     */
    public void setCheckoutResult(JAXBElement<InvokeResultArrayOfCheckoutResponse> value) {
        this.checkoutResult = ((JAXBElement<InvokeResultArrayOfCheckoutResponse> ) value);
    }

}
