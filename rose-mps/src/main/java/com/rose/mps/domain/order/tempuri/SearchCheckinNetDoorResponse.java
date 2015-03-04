
package com.rose.mps.domain.order.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.mps.domain.order.publicservice.InvokeResultArrayOfCheckinNetDoorResponse;


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
 *         &lt;element name="SearchCheckinNetDoorResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_ArrayOfCheckinNetDoorResponse" minOccurs="0"/>
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
    "searchCheckinNetDoorResult"
})
@XmlRootElement(name = "SearchCheckinNetDoorResponse")
public class SearchCheckinNetDoorResponse {

    @XmlElementRef(name = "SearchCheckinNetDoorResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultArrayOfCheckinNetDoorResponse> searchCheckinNetDoorResult;

    /**
     * Gets the value of the searchCheckinNetDoorResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfCheckinNetDoorResponse }{@code >}
     *     
     */
    public JAXBElement<InvokeResultArrayOfCheckinNetDoorResponse> getSearchCheckinNetDoorResult() {
        return searchCheckinNetDoorResult;
    }

    /**
     * Sets the value of the searchCheckinNetDoorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfCheckinNetDoorResponse }{@code >}
     *     
     */
    public void setSearchCheckinNetDoorResult(JAXBElement<InvokeResultArrayOfCheckinNetDoorResponse> value) {
        this.searchCheckinNetDoorResult = ((JAXBElement<InvokeResultArrayOfCheckinNetDoorResponse> ) value);
    }

}
