
package com.rose.mps.domain.order.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.mps.domain.order.publicservice.InvokeResultArrayOfCheckinResponse;


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
 *         &lt;element name="SearchCheckinResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_ArrayOfCheckinResponse" minOccurs="0"/>
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
    "searchCheckinResult"
})
@XmlRootElement(name = "SearchCheckinResponse")
public class SearchCheckinResponse {

    @XmlElementRef(name = "SearchCheckinResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultArrayOfCheckinResponse> searchCheckinResult;

    /**
     * Gets the value of the searchCheckinResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfCheckinResponse }{@code >}
     *     
     */
    public JAXBElement<InvokeResultArrayOfCheckinResponse> getSearchCheckinResult() {
        return searchCheckinResult;
    }

    /**
     * Sets the value of the searchCheckinResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfCheckinResponse }{@code >}
     *     
     */
    public void setSearchCheckinResult(JAXBElement<InvokeResultArrayOfCheckinResponse> value) {
        this.searchCheckinResult = ((JAXBElement<InvokeResultArrayOfCheckinResponse> ) value);
    }

}
