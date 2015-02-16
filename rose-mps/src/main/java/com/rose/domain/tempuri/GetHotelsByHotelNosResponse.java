
package com.rose.domain.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.domain.publicservice.InvokeResultArrayOfHotelSearchResponse;


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
 *         &lt;element name="GetHotelsByHotelNosResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_ArrayOfHotelSearchResponse" minOccurs="0"/>
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
    "getHotelsByHotelNosResult"
})
@XmlRootElement(name = "GetHotelsByHotelNosResponse")
public class GetHotelsByHotelNosResponse {

    @XmlElementRef(name = "GetHotelsByHotelNosResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultArrayOfHotelSearchResponse> getHotelsByHotelNosResult;

    /**
     * Gets the value of the getHotelsByHotelNosResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfHotelSearchResponse }{@code >}
     *     
     */
    public JAXBElement<InvokeResultArrayOfHotelSearchResponse> getGetHotelsByHotelNosResult() {
        return getHotelsByHotelNosResult;
    }

    /**
     * Sets the value of the getHotelsByHotelNosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfHotelSearchResponse }{@code >}
     *     
     */
    public void setGetHotelsByHotelNosResult(JAXBElement<InvokeResultArrayOfHotelSearchResponse> value) {
        this.getHotelsByHotelNosResult = ((JAXBElement<InvokeResultArrayOfHotelSearchResponse> ) value);
    }

}
