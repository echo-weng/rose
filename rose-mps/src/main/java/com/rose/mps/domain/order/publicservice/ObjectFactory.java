
package com.rose.mps.domain.order.publicservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.rose.mps.domain.order.mpsinterface.PageModelOfOrderResponsepM6ZO2Ns;
import com.rose.mps.domain.order.publicservice.model.ArrayOfCheckinGuestResponse;
import com.rose.mps.domain.order.publicservice.model.ArrayOfCheckinNetDoorResponse;
import com.rose.mps.domain.order.publicservice.model.ArrayOfCheckinResponse;
import com.rose.mps.domain.order.publicservice.model.ArrayOfCheckoutResponse;
import com.rose.mps.domain.order.publicservice.model.ArrayOfOccupationResponse;
import com.rose.mps.domain.order.publicservice.model.ArrayOfPromotionPolicyResponse;
import com.rose.mps.domain.order.publicservice.model.CheckinResponse;
import com.rose.mps.domain.order.publicservice.model.OrderAddResponse;
import com.rose.mps.domain.order.publicservice.model.OrderResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.nextpms_publicservice package. 
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

    private final static QName _InvokeResultArrayOfCheckinGuestResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_ArrayOfCheckinGuestResponse");
    private final static QName _InvokeResultOrderAddResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_OrderAddResponse");
    private final static QName _InvokeResultArrayOfCheckoutResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_ArrayOfCheckoutResponse");
    private final static QName _InvokeResultCheckinResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_CheckinResponse");
    private final static QName _InvokeResultBoolean_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_boolean");
    private final static QName _InvokeResultArrayOfCheckinResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_ArrayOfCheckinResponse");
    private final static QName _InvokeResultArrayOfCheckinNetDoorResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_ArrayOfCheckinNetDoorResponse");
    private final static QName _InvokeResultOrderResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_OrderResponse");
    private final static QName _InvokeResultArrayOfPromotionPolicyResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_ArrayOfPromotionPolicyResponse");
    private final static QName _InvokeResultArrayOfOccupationResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_ArrayOfOccupationResponse");
    private final static QName _InvokeResultPageModelOfOrderResponsepM6ZO2Ns_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_PageModelOfOrderResponsepM6ZO2Ns");
    private final static QName _InvokeResultBooleanCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "Code");
    private final static QName _InvokeResultArrayOfCheckinGuestResponseContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "Content");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.nextpms_publicservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvokeResultBoolean }
     * 
     */
    public InvokeResultBoolean createInvokeResultBoolean() {
        return new InvokeResultBoolean();
    }

    /**
     * Create an instance of {@link InvokeResultArrayOfCheckinGuestResponse }
     * 
     */
    public InvokeResultArrayOfCheckinGuestResponse createInvokeResultArrayOfCheckinGuestResponse() {
        return new InvokeResultArrayOfCheckinGuestResponse();
    }

    /**
     * Create an instance of {@link InvokeResultOrderResponse }
     * 
     */
    public InvokeResultOrderResponse createInvokeResultOrderResponse() {
        return new InvokeResultOrderResponse();
    }

    /**
     * Create an instance of {@link InvokeResultArrayOfCheckinResponse }
     * 
     */
    public InvokeResultArrayOfCheckinResponse createInvokeResultArrayOfCheckinResponse() {
        return new InvokeResultArrayOfCheckinResponse();
    }

    /**
     * Create an instance of {@link InvokeResultOrderAddResponse }
     * 
     */
    public InvokeResultOrderAddResponse createInvokeResultOrderAddResponse() {
        return new InvokeResultOrderAddResponse();
    }

    /**
     * Create an instance of {@link InvokeResultPageModelOfOrderResponsepM6ZO2Ns }
     * 
     */
    public InvokeResultPageModelOfOrderResponsepM6ZO2Ns createInvokeResultPageModelOfOrderResponsepM6ZO2Ns() {
        return new InvokeResultPageModelOfOrderResponsepM6ZO2Ns();
    }

    /**
     * Create an instance of {@link InvokeResultCheckinResponse }
     * 
     */
    public InvokeResultCheckinResponse createInvokeResultCheckinResponse() {
        return new InvokeResultCheckinResponse();
    }

    /**
     * Create an instance of {@link InvokeResultArrayOfOccupationResponse }
     * 
     */
    public InvokeResultArrayOfOccupationResponse createInvokeResultArrayOfOccupationResponse() {
        return new InvokeResultArrayOfOccupationResponse();
    }

    /**
     * Create an instance of {@link InvokeResultArrayOfPromotionPolicyResponse }
     * 
     */
    public InvokeResultArrayOfPromotionPolicyResponse createInvokeResultArrayOfPromotionPolicyResponse() {
        return new InvokeResultArrayOfPromotionPolicyResponse();
    }

    /**
     * Create an instance of {@link InvokeResultArrayOfCheckinNetDoorResponse }
     * 
     */
    public InvokeResultArrayOfCheckinNetDoorResponse createInvokeResultArrayOfCheckinNetDoorResponse() {
        return new InvokeResultArrayOfCheckinNetDoorResponse();
    }

    /**
     * Create an instance of {@link InvokeResultArrayOfCheckoutResponse }
     * 
     */
    public InvokeResultArrayOfCheckoutResponse createInvokeResultArrayOfCheckoutResponse() {
        return new InvokeResultArrayOfCheckoutResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfCheckinGuestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_ArrayOfCheckinGuestResponse")
    public JAXBElement<InvokeResultArrayOfCheckinGuestResponse> createInvokeResultArrayOfCheckinGuestResponse(InvokeResultArrayOfCheckinGuestResponse value) {
        return new JAXBElement<InvokeResultArrayOfCheckinGuestResponse>(_InvokeResultArrayOfCheckinGuestResponse_QNAME, InvokeResultArrayOfCheckinGuestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultOrderAddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_OrderAddResponse")
    public JAXBElement<InvokeResultOrderAddResponse> createInvokeResultOrderAddResponse(InvokeResultOrderAddResponse value) {
        return new JAXBElement<InvokeResultOrderAddResponse>(_InvokeResultOrderAddResponse_QNAME, InvokeResultOrderAddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfCheckoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_ArrayOfCheckoutResponse")
    public JAXBElement<InvokeResultArrayOfCheckoutResponse> createInvokeResultArrayOfCheckoutResponse(InvokeResultArrayOfCheckoutResponse value) {
        return new JAXBElement<InvokeResultArrayOfCheckoutResponse>(_InvokeResultArrayOfCheckoutResponse_QNAME, InvokeResultArrayOfCheckoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultCheckinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_CheckinResponse")
    public JAXBElement<InvokeResultCheckinResponse> createInvokeResultCheckinResponse(InvokeResultCheckinResponse value) {
        return new JAXBElement<InvokeResultCheckinResponse>(_InvokeResultCheckinResponse_QNAME, InvokeResultCheckinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultBoolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_boolean")
    public JAXBElement<InvokeResultBoolean> createInvokeResultBoolean(InvokeResultBoolean value) {
        return new JAXBElement<InvokeResultBoolean>(_InvokeResultBoolean_QNAME, InvokeResultBoolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfCheckinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_ArrayOfCheckinResponse")
    public JAXBElement<InvokeResultArrayOfCheckinResponse> createInvokeResultArrayOfCheckinResponse(InvokeResultArrayOfCheckinResponse value) {
        return new JAXBElement<InvokeResultArrayOfCheckinResponse>(_InvokeResultArrayOfCheckinResponse_QNAME, InvokeResultArrayOfCheckinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfCheckinNetDoorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_ArrayOfCheckinNetDoorResponse")
    public JAXBElement<InvokeResultArrayOfCheckinNetDoorResponse> createInvokeResultArrayOfCheckinNetDoorResponse(InvokeResultArrayOfCheckinNetDoorResponse value) {
        return new JAXBElement<InvokeResultArrayOfCheckinNetDoorResponse>(_InvokeResultArrayOfCheckinNetDoorResponse_QNAME, InvokeResultArrayOfCheckinNetDoorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_OrderResponse")
    public JAXBElement<InvokeResultOrderResponse> createInvokeResultOrderResponse(InvokeResultOrderResponse value) {
        return new JAXBElement<InvokeResultOrderResponse>(_InvokeResultOrderResponse_QNAME, InvokeResultOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfPromotionPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_ArrayOfPromotionPolicyResponse")
    public JAXBElement<InvokeResultArrayOfPromotionPolicyResponse> createInvokeResultArrayOfPromotionPolicyResponse(InvokeResultArrayOfPromotionPolicyResponse value) {
        return new JAXBElement<InvokeResultArrayOfPromotionPolicyResponse>(_InvokeResultArrayOfPromotionPolicyResponse_QNAME, InvokeResultArrayOfPromotionPolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfOccupationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_ArrayOfOccupationResponse")
    public JAXBElement<InvokeResultArrayOfOccupationResponse> createInvokeResultArrayOfOccupationResponse(InvokeResultArrayOfOccupationResponse value) {
        return new JAXBElement<InvokeResultArrayOfOccupationResponse>(_InvokeResultArrayOfOccupationResponse_QNAME, InvokeResultArrayOfOccupationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultPageModelOfOrderResponsepM6ZO2Ns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_PageModelOfOrderResponsepM6ZO2Ns")
    public JAXBElement<InvokeResultPageModelOfOrderResponsepM6ZO2Ns> createInvokeResultPageModelOfOrderResponsepM6ZO2Ns(InvokeResultPageModelOfOrderResponsepM6ZO2Ns value) {
        return new JAXBElement<InvokeResultPageModelOfOrderResponsepM6ZO2Ns>(_InvokeResultPageModelOfOrderResponsepM6ZO2Ns_QNAME, InvokeResultPageModelOfOrderResponsepM6ZO2Ns.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultBoolean.class)
    public JAXBElement<String> createInvokeResultBooleanCode(String value) {
        return new JAXBElement<String>(_InvokeResultBooleanCode_QNAME, String.class, InvokeResultBoolean.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckinGuestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultArrayOfCheckinGuestResponse.class)
    public JAXBElement<ArrayOfCheckinGuestResponse> createInvokeResultArrayOfCheckinGuestResponseContent(ArrayOfCheckinGuestResponse value) {
        return new JAXBElement<ArrayOfCheckinGuestResponse>(_InvokeResultArrayOfCheckinGuestResponseContent_QNAME, ArrayOfCheckinGuestResponse.class, InvokeResultArrayOfCheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultArrayOfCheckinGuestResponse.class)
    public JAXBElement<String> createInvokeResultArrayOfCheckinGuestResponseCode(String value) {
        return new JAXBElement<String>(_InvokeResultBooleanCode_QNAME, String.class, InvokeResultArrayOfCheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultOrderResponse.class)
    public JAXBElement<OrderResponse> createInvokeResultOrderResponseContent(OrderResponse value) {
        return new JAXBElement<OrderResponse>(_InvokeResultArrayOfCheckinGuestResponseContent_QNAME, OrderResponse.class, InvokeResultOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultOrderResponse.class)
    public JAXBElement<String> createInvokeResultOrderResponseCode(String value) {
        return new JAXBElement<String>(_InvokeResultBooleanCode_QNAME, String.class, InvokeResultOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultArrayOfCheckinResponse.class)
    public JAXBElement<ArrayOfCheckinResponse> createInvokeResultArrayOfCheckinResponseContent(ArrayOfCheckinResponse value) {
        return new JAXBElement<ArrayOfCheckinResponse>(_InvokeResultArrayOfCheckinGuestResponseContent_QNAME, ArrayOfCheckinResponse.class, InvokeResultArrayOfCheckinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultArrayOfCheckinResponse.class)
    public JAXBElement<String> createInvokeResultArrayOfCheckinResponseCode(String value) {
        return new JAXBElement<String>(_InvokeResultBooleanCode_QNAME, String.class, InvokeResultArrayOfCheckinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderAddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultOrderAddResponse.class)
    public JAXBElement<OrderAddResponse> createInvokeResultOrderAddResponseContent(OrderAddResponse value) {
        return new JAXBElement<OrderAddResponse>(_InvokeResultArrayOfCheckinGuestResponseContent_QNAME, OrderAddResponse.class, InvokeResultOrderAddResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultOrderAddResponse.class)
    public JAXBElement<String> createInvokeResultOrderAddResponseCode(String value) {
        return new JAXBElement<String>(_InvokeResultBooleanCode_QNAME, String.class, InvokeResultOrderAddResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageModelOfOrderResponsepM6ZO2Ns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultPageModelOfOrderResponsepM6ZO2Ns.class)
    public JAXBElement<PageModelOfOrderResponsepM6ZO2Ns> createInvokeResultPageModelOfOrderResponsepM6ZO2NsContent(PageModelOfOrderResponsepM6ZO2Ns value) {
        return new JAXBElement<PageModelOfOrderResponsepM6ZO2Ns>(_InvokeResultArrayOfCheckinGuestResponseContent_QNAME, PageModelOfOrderResponsepM6ZO2Ns.class, InvokeResultPageModelOfOrderResponsepM6ZO2Ns.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultPageModelOfOrderResponsepM6ZO2Ns.class)
    public JAXBElement<String> createInvokeResultPageModelOfOrderResponsepM6ZO2NsCode(String value) {
        return new JAXBElement<String>(_InvokeResultBooleanCode_QNAME, String.class, InvokeResultPageModelOfOrderResponsepM6ZO2Ns.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultCheckinResponse.class)
    public JAXBElement<CheckinResponse> createInvokeResultCheckinResponseContent(CheckinResponse value) {
        return new JAXBElement<CheckinResponse>(_InvokeResultArrayOfCheckinGuestResponseContent_QNAME, CheckinResponse.class, InvokeResultCheckinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultCheckinResponse.class)
    public JAXBElement<String> createInvokeResultCheckinResponseCode(String value) {
        return new JAXBElement<String>(_InvokeResultBooleanCode_QNAME, String.class, InvokeResultCheckinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOccupationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultArrayOfOccupationResponse.class)
    public JAXBElement<ArrayOfOccupationResponse> createInvokeResultArrayOfOccupationResponseContent(ArrayOfOccupationResponse value) {
        return new JAXBElement<ArrayOfOccupationResponse>(_InvokeResultArrayOfCheckinGuestResponseContent_QNAME, ArrayOfOccupationResponse.class, InvokeResultArrayOfOccupationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultArrayOfOccupationResponse.class)
    public JAXBElement<String> createInvokeResultArrayOfOccupationResponseCode(String value) {
        return new JAXBElement<String>(_InvokeResultBooleanCode_QNAME, String.class, InvokeResultArrayOfOccupationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPromotionPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultArrayOfPromotionPolicyResponse.class)
    public JAXBElement<ArrayOfPromotionPolicyResponse> createInvokeResultArrayOfPromotionPolicyResponseContent(ArrayOfPromotionPolicyResponse value) {
        return new JAXBElement<ArrayOfPromotionPolicyResponse>(_InvokeResultArrayOfCheckinGuestResponseContent_QNAME, ArrayOfPromotionPolicyResponse.class, InvokeResultArrayOfPromotionPolicyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultArrayOfPromotionPolicyResponse.class)
    public JAXBElement<String> createInvokeResultArrayOfPromotionPolicyResponseCode(String value) {
        return new JAXBElement<String>(_InvokeResultBooleanCode_QNAME, String.class, InvokeResultArrayOfPromotionPolicyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckinNetDoorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultArrayOfCheckinNetDoorResponse.class)
    public JAXBElement<ArrayOfCheckinNetDoorResponse> createInvokeResultArrayOfCheckinNetDoorResponseContent(ArrayOfCheckinNetDoorResponse value) {
        return new JAXBElement<ArrayOfCheckinNetDoorResponse>(_InvokeResultArrayOfCheckinGuestResponseContent_QNAME, ArrayOfCheckinNetDoorResponse.class, InvokeResultArrayOfCheckinNetDoorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultArrayOfCheckinNetDoorResponse.class)
    public JAXBElement<String> createInvokeResultArrayOfCheckinNetDoorResponseCode(String value) {
        return new JAXBElement<String>(_InvokeResultBooleanCode_QNAME, String.class, InvokeResultArrayOfCheckinNetDoorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultArrayOfCheckoutResponse.class)
    public JAXBElement<ArrayOfCheckoutResponse> createInvokeResultArrayOfCheckoutResponseContent(ArrayOfCheckoutResponse value) {
        return new JAXBElement<ArrayOfCheckoutResponse>(_InvokeResultArrayOfCheckinGuestResponseContent_QNAME, ArrayOfCheckoutResponse.class, InvokeResultArrayOfCheckoutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultArrayOfCheckoutResponse.class)
    public JAXBElement<String> createInvokeResultArrayOfCheckoutResponseCode(String value) {
        return new JAXBElement<String>(_InvokeResultBooleanCode_QNAME, String.class, InvokeResultArrayOfCheckoutResponse.class, value);
    }

}
