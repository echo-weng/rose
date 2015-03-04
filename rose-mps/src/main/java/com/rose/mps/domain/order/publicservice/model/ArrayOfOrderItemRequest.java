
package com.rose.mps.domain.order.publicservice.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrderItemRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderItemRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderItemRequest" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order}OrderItemRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderItemRequest", propOrder = {
    "orderItemRequest"
})
public class ArrayOfOrderItemRequest {

    @XmlElement(name = "OrderItemRequest", nillable = true)
    protected List<OrderItemRequest> orderItemRequest;

    /**
     * Gets the value of the orderItemRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemRequest }
     * 
     * 
     */
    public List<OrderItemRequest> getOrderItemRequest() {
        if (orderItemRequest == null) {
            orderItemRequest = new ArrayList<OrderItemRequest>();
        }
        return this.orderItemRequest;
    }

}
