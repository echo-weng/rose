
package com.rose.mps.domain.order.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.mps.domain.order.publicservice.InvokeResultBoolean;


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
 *         &lt;element name="CancelOrderResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_boolean" minOccurs="0"/>
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
    "cancelOrderResult"
})
@XmlRootElement(name = "CancelOrderResponse")
public class CancelOrderResponse {

    @XmlElementRef(name = "CancelOrderResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultBoolean> cancelOrderResult;

    /**
     * Gets the value of the cancelOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultBoolean }{@code >}
     *     
     */
    public JAXBElement<InvokeResultBoolean> getCancelOrderResult() {
        return cancelOrderResult;
    }

    /**
     * Sets the value of the cancelOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultBoolean }{@code >}
     *     
     */
    public void setCancelOrderResult(JAXBElement<InvokeResultBoolean> value) {
        this.cancelOrderResult = ((JAXBElement<InvokeResultBoolean> ) value);
    }

}
