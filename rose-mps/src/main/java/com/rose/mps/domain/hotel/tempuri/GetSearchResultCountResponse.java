
package com.rose.mps.domain.hotel.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.rose.mps.domain.hotel.publicservice.InvokeResultInt;


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
 *         &lt;element name="GetSearchResultCountResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_int" minOccurs="0"/>
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
    "getSearchResultCountResult"
})
@XmlRootElement(name = "GetSearchResultCountResponse")
public class GetSearchResultCountResponse {

    @XmlElementRef(name = "GetSearchResultCountResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultInt> getSearchResultCountResult;

    /**
     * Gets the value of the getSearchResultCountResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultInt }{@code >}
     *     
     */
    public JAXBElement<InvokeResultInt> getGetSearchResultCountResult() {
        return getSearchResultCountResult;
    }

    /**
     * Sets the value of the getSearchResultCountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultInt }{@code >}
     *     
     */
    public void setGetSearchResultCountResult(JAXBElement<InvokeResultInt> value) {
        this.getSearchResultCountResult = ((JAXBElement<InvokeResultInt> ) value);
    }

}
