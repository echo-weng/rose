
package com.rose.mps.domain.order.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.mps.domain.order.publicservice.InvokeResultBoolean;


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
 *         &lt;element name="SetOrderRoomResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_boolean" minOccurs="0"/>
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
    "setOrderRoomResult"
})
@XmlRootElement(name = "SetOrderRoomResponse")
public class SetOrderRoomResponse {

    @XmlElementRef(name = "SetOrderRoomResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultBoolean> setOrderRoomResult;

    /**
     * Gets the value of the setOrderRoomResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultBoolean }{@code >}
     *     
     */
    public JAXBElement<InvokeResultBoolean> getSetOrderRoomResult() {
        return setOrderRoomResult;
    }

    /**
     * Sets the value of the setOrderRoomResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultBoolean }{@code >}
     *     
     */
    public void setSetOrderRoomResult(JAXBElement<InvokeResultBoolean> value) {
        this.setOrderRoomResult = ((JAXBElement<InvokeResultBoolean> ) value);
    }

}
