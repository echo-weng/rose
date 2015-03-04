
package com.rose.mps.domain.hotel.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.rose.mps.domain.hotel.publicservice.InvokeResultArrayOfHotelSearchResponse;


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
 *         &lt;element name="GetHotelsByHotelIdsResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_ArrayOfHotelSearchResponse" minOccurs="0"/>
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
    "getHotelsByHotelIdsResult"
})
@XmlRootElement(name = "GetHotelsByHotelIdsResponse")
public class GetHotelsByHotelIdsResponse {

    @XmlElementRef(name = "GetHotelsByHotelIdsResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultArrayOfHotelSearchResponse> getHotelsByHotelIdsResult;

    /**
     * Gets the value of the getHotelsByHotelIdsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfHotelSearchResponse }{@code >}
     *     
     */
    public JAXBElement<InvokeResultArrayOfHotelSearchResponse> getGetHotelsByHotelIdsResult() {
        return getHotelsByHotelIdsResult;
    }

    /**
     * Sets the value of the getHotelsByHotelIdsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfHotelSearchResponse }{@code >}
     *     
     */
    public void setGetHotelsByHotelIdsResult(JAXBElement<InvokeResultArrayOfHotelSearchResponse> value) {
        this.getHotelsByHotelIdsResult = ((JAXBElement<InvokeResultArrayOfHotelSearchResponse> ) value);
    }

}
