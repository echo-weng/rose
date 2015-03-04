
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
 *         &lt;element name="GetPromotionPolicyResponseResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_ArrayOfPromotionPolicyResponse" minOccurs="0"/>
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
    "getPromotionPolicyResponseResult"
})
@XmlRootElement(name = "GetPromotionPolicyResponseResponse")
public class GetPromotionPolicyResponseResponse {

    @XmlElementRef(name = "GetPromotionPolicyResponseResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultArrayOfPromotionPolicyResponse> getPromotionPolicyResponseResult;

    /**
     * Gets the value of the getPromotionPolicyResponseResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfPromotionPolicyResponse }{@code >}
     *     
     */
    public JAXBElement<InvokeResultArrayOfPromotionPolicyResponse> getGetPromotionPolicyResponseResult() {
        return getPromotionPolicyResponseResult;
    }

    /**
     * Sets the value of the getPromotionPolicyResponseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfPromotionPolicyResponse }{@code >}
     *     
     */
    public void setGetPromotionPolicyResponseResult(JAXBElement<InvokeResultArrayOfPromotionPolicyResponse> value) {
        this.getPromotionPolicyResponseResult = ((JAXBElement<InvokeResultArrayOfPromotionPolicyResponse> ) value);
    }

}
