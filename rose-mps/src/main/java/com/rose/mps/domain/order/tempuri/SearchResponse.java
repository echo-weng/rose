
package com.rose.mps.domain.order.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.mps.domain.order.publicservice.InvokeResultPageModelOfOrderResponsepM6ZO2Ns;


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
 *         &lt;element name="SearchResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_PageModelOfOrderResponsepM6ZO2Ns" minOccurs="0"/>
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
    "searchResult"
})
@XmlRootElement(name = "SearchResponse")
public class SearchResponse {

    @XmlElementRef(name = "SearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultPageModelOfOrderResponsepM6ZO2Ns> searchResult;

    /**
     * Gets the value of the searchResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultPageModelOfOrderResponsepM6ZO2Ns }{@code >}
     *     
     */
    public JAXBElement<InvokeResultPageModelOfOrderResponsepM6ZO2Ns> getSearchResult() {
        return searchResult;
    }

    /**
     * Sets the value of the searchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultPageModelOfOrderResponsepM6ZO2Ns }{@code >}
     *     
     */
    public void setSearchResult(JAXBElement<InvokeResultPageModelOfOrderResponsepM6ZO2Ns> value) {
        this.searchResult = ((JAXBElement<InvokeResultPageModelOfOrderResponsepM6ZO2Ns> ) value);
    }

}
