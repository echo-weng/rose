
package com.rose.mps.domain.order.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.mps.domain.order.publicservice.InvokeResultArrayOfPromotionPolicyResponse;


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
 *         &lt;element name="GetPromotionRemainsResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_ArrayOfPromotionPolicyResponse" minOccurs="0"/>
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
    "getPromotionRemainsResult"
})
@XmlRootElement(name = "GetPromotionRemainsResponse")
public class GetPromotionRemainsResponse {

    @XmlElementRef(name = "GetPromotionRemainsResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultArrayOfPromotionPolicyResponse> getPromotionRemainsResult;

    /**
     * Gets the value of the getPromotionRemainsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfPromotionPolicyResponse }{@code >}
     *     
     */
    public JAXBElement<InvokeResultArrayOfPromotionPolicyResponse> getGetPromotionRemainsResult() {
        return getPromotionRemainsResult;
    }

    /**
     * Sets the value of the getPromotionRemainsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfPromotionPolicyResponse }{@code >}
     *     
     */
    public void setGetPromotionRemainsResult(JAXBElement<InvokeResultArrayOfPromotionPolicyResponse> value) {
        this.getPromotionRemainsResult = ((JAXBElement<InvokeResultArrayOfPromotionPolicyResponse> ) value);
    }

}
