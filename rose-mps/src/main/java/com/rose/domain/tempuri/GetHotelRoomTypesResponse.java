
package com.rose.domain.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.domain.publicservice.InvokeResultArrayOfRoomType;


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
 *         &lt;element name="GetHotelRoomTypesResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_ArrayOfRoomType" minOccurs="0"/>
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
    "getHotelRoomTypesResult"
})
@XmlRootElement(name = "GetHotelRoomTypesResponse")
public class GetHotelRoomTypesResponse {

    @XmlElementRef(name = "GetHotelRoomTypesResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultArrayOfRoomType> getHotelRoomTypesResult;

    /**
     * Gets the value of the getHotelRoomTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfRoomType }{@code >}
     *     
     */
    public JAXBElement<InvokeResultArrayOfRoomType> getGetHotelRoomTypesResult() {
        return getHotelRoomTypesResult;
    }

    /**
     * Sets the value of the getHotelRoomTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfRoomType }{@code >}
     *     
     */
    public void setGetHotelRoomTypesResult(JAXBElement<InvokeResultArrayOfRoomType> value) {
        this.getHotelRoomTypesResult = ((JAXBElement<InvokeResultArrayOfRoomType> ) value);
    }

}
