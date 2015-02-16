
package com.rose.domain.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.domain.publicservice.InvokeResultBoolean;


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
 *         &lt;element name="AddRoomRemarkResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult_boolean" minOccurs="0"/>
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
    "addRoomRemarkResult"
})
@XmlRootElement(name = "AddRoomRemarkResponse")
public class AddRoomRemarkResponse {

    @XmlElementRef(name = "AddRoomRemarkResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResultBoolean> addRoomRemarkResult;

    /**
     * Gets the value of the addRoomRemarkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultBoolean }{@code >}
     *     
     */
    public JAXBElement<InvokeResultBoolean> getAddRoomRemarkResult() {
        return addRoomRemarkResult;
    }

    /**
     * Sets the value of the addRoomRemarkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResultBoolean }{@code >}
     *     
     */
    public void setAddRoomRemarkResult(JAXBElement<InvokeResultBoolean> value) {
        this.addRoomRemarkResult = ((JAXBElement<InvokeResultBoolean> ) value);
    }

}
