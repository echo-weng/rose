
package com.rose.mps.domain.hotel.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.rose.mps.domain.hotel.publicservice.InvokeResultArrayOfRoomType;


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
 *         &lt;element name="GetRoomTypesResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_ArrayOfRoomType" minOccurs="0"/>
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
    "getRoomTypesResult"
})
@XmlRootElement(name = "GetRoomTypesResponse")
public class GetRoomTypesResponse {

    @XmlElementRef(name = "GetRoomTypesResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultArrayOfRoomType> getRoomTypesResult;

    /**
     * Gets the value of the getRoomTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfRoomType }{@code >}
     *     
     */
    public JAXBElement<InvokeResultArrayOfRoomType> getGetRoomTypesResult() {
        return getRoomTypesResult;
    }

    /**
     * Sets the value of the getRoomTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfRoomType }{@code >}
     *     
     */
    public void setGetRoomTypesResult(JAXBElement<InvokeResultArrayOfRoomType> value) {
        this.getRoomTypesResult = ((JAXBElement<InvokeResultArrayOfRoomType> ) value);
    }

}
