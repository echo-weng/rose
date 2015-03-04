
package com.rose.mps.domain.hotel.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.rose.mps.domain.hotel.publicservice.InvokeResultBoolean;


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
 *         &lt;element name="UpdateHotelLocationIdResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_boolean" minOccurs="0"/>
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
    "updateHotelLocationIdResult"
})
@XmlRootElement(name = "UpdateHotelLocationIdResponse")
public class UpdateHotelLocationIdResponse {

    @XmlElementRef(name = "UpdateHotelLocationIdResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultBoolean> updateHotelLocationIdResult;

    /**
     * Gets the value of the updateHotelLocationIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultBoolean }{@code >}
     *     
     */
    public JAXBElement<InvokeResultBoolean> getUpdateHotelLocationIdResult() {
        return updateHotelLocationIdResult;
    }

    /**
     * Sets the value of the updateHotelLocationIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultBoolean }{@code >}
     *     
     */
    public void setUpdateHotelLocationIdResult(JAXBElement<InvokeResultBoolean> value) {
        this.updateHotelLocationIdResult = ((JAXBElement<InvokeResultBoolean> ) value);
    }

}
