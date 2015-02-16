
package com.rose.domain.publicservice.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHotelSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelSearchResponse" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order}HotelSearchResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelSearchResponse", propOrder = {
    "hotelSearchResponse"
})
public class ArrayOfHotelSearchResponse {

    @XmlElement(name = "HotelSearchResponse", nillable = true)
    protected List<HotelSearchResponse> hotelSearchResponse;

    /**
     * Gets the value of the hotelSearchResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelSearchResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelSearchResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchResponse }
     * 
     * 
     */
    public List<HotelSearchResponse> getHotelSearchResponse() {
        if (hotelSearchResponse == null) {
            hotelSearchResponse = new ArrayList<HotelSearchResponse>();
        }
        return this.hotelSearchResponse;
    }

}
