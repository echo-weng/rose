
package com.rose.mps.domain.order.dal.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.nextpms_dal_entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckinType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.Dal.Entity.BusinessEnum", "CheckinType");
    private final static QName _CheckinStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.Dal.Entity.BusinessEnum", "CheckinStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.nextpms_dal_entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.Dal.Entity.BusinessEnum", name = "CheckinType")
    public JAXBElement<CheckinType> createCheckinType(CheckinType value) {
        return new JAXBElement<CheckinType>(_CheckinType_QNAME, CheckinType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.Dal.Entity.BusinessEnum", name = "CheckinStatus")
    public JAXBElement<CheckinStatus> createCheckinStatus(CheckinStatus value) {
        return new JAXBElement<CheckinStatus>(_CheckinStatus_QNAME, CheckinStatus.class, null, value);
    }

}
