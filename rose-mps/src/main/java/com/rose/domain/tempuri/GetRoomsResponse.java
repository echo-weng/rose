
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
 *         &lt;element name="GetRoomsResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_ArrayOfRoom" minOccurs="0"/>
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
    "getRoomsResult"
})
@XmlRootElement(name = "GetRoomsResponse")
public class GetRoomsResponse {

    @XmlElementRef(name = "GetRoomsResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultArrayOfRoom> getRoomsResult;

    /**
     * Gets the value of the getRoomsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfRoom }{@code >}
     *     
     */
    public JAXBElement<InvokeResultArrayOfRoom> getGetRoomsResult() {
        return getRoomsResult;
    }

    /**
     * Sets the value of the getRoomsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultArrayOfRoom }{@code >}
     *     
     */
    public void setGetRoomsResult(JAXBElement<InvokeResultArrayOfRoom> value) {
        this.getRoomsResult = ((JAXBElement<InvokeResultArrayOfRoom> ) value);
    }

}
