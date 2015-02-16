
package com.rose.domain.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.domain.publicservice.InvokeResultInt;


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
 *         &lt;element name="GetRoomsCountResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_int" minOccurs="0"/>
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
    "getRoomsCountResult"
})
@XmlRootElement(name = "GetRoomsCountResponse")
public class GetRoomsCountResponse {

    @XmlElementRef(name = "GetRoomsCountResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultInt> getRoomsCountResult;

    /**
     * Gets the value of the getRoomsCountResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultInt }{@code >}
     *     
     */
    public JAXBElement<InvokeResultInt> getGetRoomsCountResult() {
        return getRoomsCountResult;
    }

    /**
     * Sets the value of the getRoomsCountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultInt }{@code >}
     *     
     */
    public void setGetRoomsCountResult(JAXBElement<InvokeResultInt> value) {
        this.getRoomsCountResult = ((JAXBElement<InvokeResultInt> ) value);
    }

}
