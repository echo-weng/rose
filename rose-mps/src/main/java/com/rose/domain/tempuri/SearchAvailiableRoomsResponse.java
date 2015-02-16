
package com.rose.domain.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.domain.publicservice.InvokeResultArrayOfRoom;


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
 *         &lt;element name="SearchAvailiableRoomsResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_ArrayOfRoom" minOccurs="0"/>
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
    "searchAvailiableRoomsResult"
})
@XmlRootElement(name = "SearchAvailiableRoomsResponse")
public class SearchAvailiableRoomsResponse {

    @XmlElementRef(name = "SearchAvailiableRoomsResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultArrayOfRoom> searchAvailiableRoomsResult;

    /**
     * Gets the value of the searchAvailiableRoomsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfRoom }{@code >}
     *     
     */
    public JAXBElement<InvokeResultArrayOfRoom> getSearchAvailiableRoomsResult() {
        return searchAvailiableRoomsResult;
    }

    /**
     * Sets the value of the searchAvailiableRoomsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfRoom }{@code >}
     *     
     */
    public void setSearchAvailiableRoomsResult(JAXBElement<InvokeResultArrayOfRoom> value) {
        this.searchAvailiableRoomsResult = ((JAXBElement<InvokeResultArrayOfRoom> ) value);
    }

}
