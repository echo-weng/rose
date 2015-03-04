
package com.rose.mps.domain.order.mpsinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.rose.mps.domain.order.publicservice.model.ArrayOfOrderResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.nextpms_interface package. 
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

    private final static QName _PageModelOfOrderResponsepM6ZO2Ns_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.Interface.Model", "PageModelOfOrderResponsepM6ZO2Ns");
    private final static QName _PageModelOfOrderResponsepM6ZO2NsContentInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.Interface.Model", "ContentInfo");
    private final static QName _PageModelOfOrderResponsepM6ZO2NsContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.Interface.Model", "Content");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.nextpms_interface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PageModelOfOrderResponsepM6ZO2Ns }
     * 
     */
    public PageModelOfOrderResponsepM6ZO2Ns createPageModelOfOrderResponsepM6ZO2Ns() {
        return new PageModelOfOrderResponsepM6ZO2Ns();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageModelOfOrderResponsepM6ZO2Ns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.Interface.Model", name = "PageModelOfOrderResponsepM6ZO2Ns")
    public JAXBElement<PageModelOfOrderResponsepM6ZO2Ns> createPageModelOfOrderResponsepM6ZO2Ns(PageModelOfOrderResponsepM6ZO2Ns value) {
        return new JAXBElement<PageModelOfOrderResponsepM6ZO2Ns>(_PageModelOfOrderResponsepM6ZO2Ns_QNAME, PageModelOfOrderResponsepM6ZO2Ns.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.Interface.Model", name = "ContentInfo", scope = PageModelOfOrderResponsepM6ZO2Ns.class)
    public JAXBElement<Object> createPageModelOfOrderResponsepM6ZO2NsContentInfo(Object value) {
        return new JAXBElement<Object>(_PageModelOfOrderResponsepM6ZO2NsContentInfo_QNAME, Object.class, PageModelOfOrderResponsepM6ZO2Ns.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.Interface.Model", name = "Content", scope = PageModelOfOrderResponsepM6ZO2Ns.class)
    public JAXBElement<ArrayOfOrderResponse> createPageModelOfOrderResponsepM6ZO2NsContent(ArrayOfOrderResponse value) {
        return new JAXBElement<ArrayOfOrderResponse>(_PageModelOfOrderResponsepM6ZO2NsContent_QNAME, ArrayOfOrderResponse.class, PageModelOfOrderResponsepM6ZO2Ns.class, value);
    }

}
