
package com.rose.domain.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.domain.publicservice.InvokeResultArrayOfHotelServiceTag;


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
 *         &lt;element name="GetServiceTagsResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_ArrayOfHotelServiceTag" minOccurs="0"/>
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
    "getServiceTagsResult"
})
@XmlRootElement(name = "GetServiceTagsResponse")
public class GetServiceTagsResponse {

    @XmlElementRef(name = "GetServiceTagsResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultArrayOfHotelServiceTag> getServiceTagsResult;

    /**
     * Gets the value of the getServiceTagsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfHotelServiceTag }{@code >}
     *     
     */
    public JAXBElement<InvokeResultArrayOfHotelServiceTag> getGetServiceTagsResult() {
        return getServiceTagsResult;
    }

    /**
     * Sets the value of the getServiceTagsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfHotelServiceTag }{@code >}
     *     
     */
    public void setGetServiceTagsResult(JAXBElement<InvokeResultArrayOfHotelServiceTag> value) {
        this.getServiceTagsResult = ((JAXBElement<InvokeResultArrayOfHotelServiceTag> ) value);
    }

}
