
package com.rose.mps.domain.hotel.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.rose.mps.domain.hotel.publicservice.InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns;


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
 *         &lt;element name="SearchRoomRemarkResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_PagedResultOfRoomRemarkResponsepM6ZO2Ns" minOccurs="0"/>
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
    "searchRoomRemarkResult"
})
@XmlRootElement(name = "SearchRoomRemarkResponse")
public class SearchRoomRemarkResponse {

    @XmlElementRef(name = "SearchRoomRemarkResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns> searchRoomRemarkResult;

    /**
     * Gets the value of the searchRoomRemarkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns }{@code >}
     *     
     */
    public JAXBElement<InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns> getSearchRoomRemarkResult() {
        return searchRoomRemarkResult;
    }

    /**
     * Sets the value of the searchRoomRemarkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns }{@code >}
     *     
     */
    public void setSearchRoomRemarkResult(JAXBElement<InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns> value) {
        this.searchRoomRemarkResult = ((JAXBElement<InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns> ) value);
    }

}
