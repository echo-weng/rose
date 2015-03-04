
package com.rose.mps.domain.order.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.mps.domain.order.publicservice.InvokeResultArrayOfOccupationResponse;


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
 *         &lt;element name="SearchOccupationResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_ArrayOfOccupationResponse" minOccurs="0"/>
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
    "searchOccupationResult"
})
@XmlRootElement(name = "SearchOccupationResponse")
public class SearchOccupationResponse {

    @XmlElementRef(name = "SearchOccupationResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultArrayOfOccupationResponse> searchOccupationResult;

    /**
     * Gets the value of the searchOccupationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfOccupationResponse }{@code >}
     *     
     */
    public JAXBElement<InvokeResultArrayOfOccupationResponse> getSearchOccupationResult() {
        return searchOccupationResult;
    }

    /**
     * Sets the value of the searchOccupationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfOccupationResponse }{@code >}
     *     
     */
    public void setSearchOccupationResult(JAXBElement<InvokeResultArrayOfOccupationResponse> value) {
        this.searchOccupationResult = ((JAXBElement<InvokeResultArrayOfOccupationResponse> ) value);
    }

}
