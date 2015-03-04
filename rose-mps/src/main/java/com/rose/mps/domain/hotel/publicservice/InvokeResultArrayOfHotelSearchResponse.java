
package com.rose.mps.domain.hotel.publicservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import com.rose.mps.domain.hotel.publicservice.model.ArrayOfHotelSearchResponse;


/**
 * <p>Java class for InvokeResult_ArrayOfHotelSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvokeResult_ArrayOfHotelSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order}ArrayOfHotelSearchResponse" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvokeResult_ArrayOfHotelSearchResponse", propOrder = {
    "code",
    "content",
    "id",
    "success"
})
public class InvokeResultArrayOfHotelSearchResponse {

    @XmlElementRef(name = "Code", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", type = JAXBElement.class)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "Content", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", type = JAXBElement.class)
    protected JAXBElement<ArrayOfHotelSearchResponse> content;
    @XmlElement(name = "Id")
    protected Long id;
    @XmlElement(name = "Success")
    protected Boolean success;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCode(JAXBElement<String> value) {
        this.code = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotelSearchResponse }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHotelSearchResponse> getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotelSearchResponse }{@code >}
     *     
     */
    public void setContent(JAXBElement<ArrayOfHotelSearchResponse> value) {
        this.content = ((JAXBElement<ArrayOfHotelSearchResponse> ) value);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuccess(Boolean value) {
        this.success = value;
    }

}
