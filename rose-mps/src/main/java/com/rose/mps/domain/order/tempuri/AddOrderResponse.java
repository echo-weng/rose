
package com.rose.mps.domain.order.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.mps.domain.order.publicservice.InvokeResultOrderAddResponse;


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
 *         &lt;element name="AddOrderResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_OrderAddResponse" minOccurs="0"/>
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
    "addOrderResult"
})
@XmlRootElement(name = "AddOrderResponse")
public class AddOrderResponse {

    @XmlElementRef(name = "AddOrderResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultOrderAddResponse> addOrderResult;

    /**
     * Gets the value of the addOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultOrderAddResponse }{@code >}
     *     
     */
    public JAXBElement<InvokeResultOrderAddResponse> getAddOrderResult() {
        return addOrderResult;
    }

    /**
     * Sets the value of the addOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultOrderAddResponse }{@code >}
     *     
     */
    public void setAddOrderResult(JAXBElement<InvokeResultOrderAddResponse> value) {
        this.addOrderResult = ((JAXBElement<InvokeResultOrderAddResponse> ) value);
    }

}
