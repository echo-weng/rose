
package com.rose.mps.domain.hotel.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.rose.mps.domain.hotel.publicservice.InvokeResultArrayOfOwnerConfig;


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
 *         &lt;element name="GetHotelBrandsResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_ArrayOfOwnerConfig" minOccurs="0"/>
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
    "getHotelBrandsResult"
})
@XmlRootElement(name = "GetHotelBrandsResponse")
public class GetHotelBrandsResponse {

    @XmlElementRef(name = "GetHotelBrandsResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultArrayOfOwnerConfig> getHotelBrandsResult;

    /**
     * Gets the value of the getHotelBrandsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfOwnerConfig }{@code >}
     *     
     */
    public JAXBElement<InvokeResultArrayOfOwnerConfig> getGetHotelBrandsResult() {
        return getHotelBrandsResult;
    }

    /**
     * Sets the value of the getHotelBrandsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfOwnerConfig }{@code >}
     *     
     */
    public void setGetHotelBrandsResult(JAXBElement<InvokeResultArrayOfOwnerConfig> value) {
        this.getHotelBrandsResult = ((JAXBElement<InvokeResultArrayOfOwnerConfig> ) value);
    }

}
