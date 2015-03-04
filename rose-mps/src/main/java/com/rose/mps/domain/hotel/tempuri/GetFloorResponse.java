
package com.rose.mps.domain.hotel.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.rose.mps.domain.hotel.publicservice.InvokeResultArrayOfFloorResponse;


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
 *         &lt;element name="GetFloorResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_ArrayOfFloorResponse" minOccurs="0"/>
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
    "getFloorResult"
})
@XmlRootElement(name = "GetFloorResponse")
public class GetFloorResponse {

    @XmlElementRef(name = "GetFloorResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultArrayOfFloorResponse> getFloorResult;

    /**
     * Gets the value of the getFloorResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfFloorResponse }{@code >}
     *     
     */
    public JAXBElement<InvokeResultArrayOfFloorResponse> getGetFloorResult() {
        return getFloorResult;
    }

    /**
     * Sets the value of the getFloorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfFloorResponse }{@code >}
     *     
     */
    public void setGetFloorResult(JAXBElement<InvokeResultArrayOfFloorResponse> value) {
        this.getFloorResult = ((JAXBElement<InvokeResultArrayOfFloorResponse> ) value);
    }

}
