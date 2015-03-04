
package com.rose.mps.domain.hotel.publicservice.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHotelServiceTag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelServiceTag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelServiceTag" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order}HotelServiceTag" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelServiceTag", propOrder = {
    "hotelServiceTag"
})
public class ArrayOfHotelServiceTag {

    @XmlElement(name = "HotelServiceTag", nillable = true)
    protected List<HotelServiceTag> hotelServiceTag;

    /**
     * Gets the value of the hotelServiceTag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelServiceTag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelServiceTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelServiceTag }
     * 
     * 
     */
    public List<HotelServiceTag> getHotelServiceTag() {
        if (hotelServiceTag == null) {
            hotelServiceTag = new ArrayList<HotelServiceTag>();
        }
        return this.hotelServiceTag;
    }

}
