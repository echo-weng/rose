
package com.rose.domain.publicservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.rose.domain.publicservice.model.ArrayOfFloorResponse;
import com.rose.domain.publicservice.model.ArrayOfHotelSearchResponse;
import com.rose.domain.publicservice.model.ArrayOfHotelServiceTag;
import com.rose.domain.publicservice.model.ArrayOfOwnerConfig;
import com.rose.domain.publicservice.model.ArrayOfRoom;
import com.rose.domain.publicservice.model.ArrayOfRoomRemarkResponse;
import com.rose.domain.publicservice.model.ArrayOfRoomType;


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

    private final static QName _InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_PagedResultOfRoomRemarkResponsepM6ZO2Ns");
    private final static QName _InvokeResultBoolean_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_boolean");
    private final static QName _OrderSource_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.BusinessEnum", "OrderSource");
    private final static QName _InvokeResultInt_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_int");
    private final static QName _CheckinType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.BusinessEnum", "CheckinType");
    private final static QName _OrderByRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model", "OrderByRequest");
    private final static QName _InvokeResultArrayOfFloorResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_ArrayOfFloorResponse");
    private final static QName _InvokeResultArrayOfRoom_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_ArrayOfRoom");
    private final static QName _PagedResultOfRoomRemarkResponsepM6ZO2Ns_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "PagedResultOfRoomRemarkResponsepM6ZO2Ns");
    private final static QName _InvokeResultArrayOfHotelSearchResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_ArrayOfHotelSearchResponse");
    private final static QName _InvokeResultArrayOfHotelServiceTag_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_ArrayOfHotelServiceTag");
    private final static QName _InvokeResultArrayOfRoomType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_ArrayOfRoomType");
    private final static QName _InvokeResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult");
    private final static QName _ArrayOfOrderByRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model", "ArrayOfOrderByRequest");
    private final static QName _InvokeResultArrayOfOwnerConfig_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "InvokeResult_ArrayOfOwnerConfig");
    private final static QName _InvokeResultCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "Code");
    private final static QName _InvokeResultArrayOfHotelServiceTagContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", "Content");
    private final static QName _OrderByRequestOrderBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model", "OrderBy");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.nextpms_publicservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvokeResult }
     * 
     */
    public InvokeResult createInvokeResult() {
        return new InvokeResult();
    }

    /**
     * Create an instance of {@link InvokeResultArrayOfHotelServiceTag }
     * 
     */
    public InvokeResultArrayOfHotelServiceTag createInvokeResultArrayOfHotelServiceTag() {
        return new InvokeResultArrayOfHotelServiceTag();
    }

    /**
     * Create an instance of {@link ArrayOfOrderByRequest }
     * 
     */
    public ArrayOfOrderByRequest createArrayOfOrderByRequest() {
        return new ArrayOfOrderByRequest();
    }

    /**
     * Create an instance of {@link InvokeResultArrayOfRoomType }
     * 
     */
    public InvokeResultArrayOfRoomType createInvokeResultArrayOfRoomType() {
        return new InvokeResultArrayOfRoomType();
    }

    /**
     * Create an instance of {@link InvokeResultArrayOfOwnerConfig }
     * 
     */
    public InvokeResultArrayOfOwnerConfig createInvokeResultArrayOfOwnerConfig() {
        return new InvokeResultArrayOfOwnerConfig();
    }

    /**
     * Create an instance of {@link InvokeResultArrayOfRoom }
     * 
     */
    public InvokeResultArrayOfRoom createInvokeResultArrayOfRoom() {
        return new InvokeResultArrayOfRoom();
    }

    /**
     * Create an instance of {@link InvokeResultArrayOfHotelSearchResponse }
     * 
     */
    public InvokeResultArrayOfHotelSearchResponse createInvokeResultArrayOfHotelSearchResponse() {
        return new InvokeResultArrayOfHotelSearchResponse();
    }

    /**
     * Create an instance of {@link InvokeResultArrayOfFloorResponse }
     * 
     */
    public InvokeResultArrayOfFloorResponse createInvokeResultArrayOfFloorResponse() {
        return new InvokeResultArrayOfFloorResponse();
    }

    /**
     * Create an instance of {@link InvokeResultInt }
     * 
     */
    public InvokeResultInt createInvokeResultInt() {
        return new InvokeResultInt();
    }

    /**
     * Create an instance of {@link InvokeResultBoolean }
     * 
     */
    public InvokeResultBoolean createInvokeResultBoolean() {
        return new InvokeResultBoolean();
    }

    /**
     * Create an instance of {@link InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns }
     * 
     */
    public InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns createInvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns() {
        return new InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns();
    }

    /**
     * Create an instance of {@link PagedResultOfRoomRemarkResponsepM6ZO2Ns }
     * 
     */
    public PagedResultOfRoomRemarkResponsepM6ZO2Ns createPagedResultOfRoomRemarkResponsepM6ZO2Ns() {
        return new PagedResultOfRoomRemarkResponsepM6ZO2Ns();
    }

    /**
     * Create an instance of {@link OrderByRequest }
     * 
     */
    public OrderByRequest createOrderByRequest() {
        return new OrderByRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_PagedResultOfRoomRemarkResponsepM6ZO2Ns")
    public JAXBElement<InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns> createInvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns(InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns value) {
        return new JAXBElement<InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns>(_InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns_QNAME, InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.BusinessEnum", name = "OrderSource")
    public JAXBElement<OrderSource> createOrderSource(OrderSource value) {
        return new JAXBElement<OrderSource>(_OrderSource_QNAME, OrderSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_int")
    public JAXBElement<InvokeResultInt> createInvokeResultInt(InvokeResultInt value) {
        return new JAXBElement<InvokeResultInt>(_InvokeResultInt_QNAME, InvokeResultInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.BusinessEnum", name = "CheckinType")
    public JAXBElement<CheckinType> createCheckinType(CheckinType value) {
        return new JAXBElement<CheckinType>(_CheckinType_QNAME, CheckinType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderByRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model", name = "OrderByRequest")
    public JAXBElement<OrderByRequest> createOrderByRequest(OrderByRequest value) {
        return new JAXBElement<OrderByRequest>(_OrderByRequest_QNAME, OrderByRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfFloorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_ArrayOfFloorResponse")
    public JAXBElement<InvokeResultArrayOfFloorResponse> createInvokeResultArrayOfFloorResponse(InvokeResultArrayOfFloorResponse value) {
        return new JAXBElement<InvokeResultArrayOfFloorResponse>(_InvokeResultArrayOfFloorResponse_QNAME, InvokeResultArrayOfFloorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_ArrayOfRoom")
    public JAXBElement<InvokeResultArrayOfRoom> createInvokeResultArrayOfRoom(InvokeResultArrayOfRoom value) {
        return new JAXBElement<InvokeResultArrayOfRoom>(_InvokeResultArrayOfRoom_QNAME, InvokeResultArrayOfRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagedResultOfRoomRemarkResponsepM6ZO2Ns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "PagedResultOfRoomRemarkResponsepM6ZO2Ns")
    public JAXBElement<PagedResultOfRoomRemarkResponsepM6ZO2Ns> createPagedResultOfRoomRemarkResponsepM6ZO2Ns(PagedResultOfRoomRemarkResponsepM6ZO2Ns value) {
        return new JAXBElement<PagedResultOfRoomRemarkResponsepM6ZO2Ns>(_PagedResultOfRoomRemarkResponsepM6ZO2Ns_QNAME, PagedResultOfRoomRemarkResponsepM6ZO2Ns.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfHotelSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_ArrayOfHotelSearchResponse")
    public JAXBElement<InvokeResultArrayOfHotelSearchResponse> createInvokeResultArrayOfHotelSearchResponse(InvokeResultArrayOfHotelSearchResponse value) {
        return new JAXBElement<InvokeResultArrayOfHotelSearchResponse>(_InvokeResultArrayOfHotelSearchResponse_QNAME, InvokeResultArrayOfHotelSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfHotelServiceTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_ArrayOfHotelServiceTag")
    public JAXBElement<InvokeResultArrayOfHotelServiceTag> createInvokeResultArrayOfHotelServiceTag(InvokeResultArrayOfHotelServiceTag value) {
        return new JAXBElement<InvokeResultArrayOfHotelServiceTag>(_InvokeResultArrayOfHotelServiceTag_QNAME, InvokeResultArrayOfHotelServiceTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfRoomType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_ArrayOfRoomType")
    public JAXBElement<InvokeResultArrayOfRoomType> createInvokeResultArrayOfRoomType(InvokeResultArrayOfRoomType value) {
        return new JAXBElement<InvokeResultArrayOfRoomType>(_InvokeResultArrayOfRoomType_QNAME, InvokeResultArrayOfRoomType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult")
    public JAXBElement<InvokeResult> createInvokeResult(InvokeResult value) {
        return new JAXBElement<InvokeResult>(_InvokeResult_QNAME, InvokeResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderByRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model", name = "ArrayOfOrderByRequest")
    public JAXBElement<ArrayOfOrderByRequest> createArrayOfOrderByRequest(ArrayOfOrderByRequest value) {
        return new JAXBElement<ArrayOfOrderByRequest>(_ArrayOfOrderByRequest_QNAME, ArrayOfOrderByRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfOwnerConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "InvokeResult_ArrayOfOwnerConfig")
    public JAXBElement<InvokeResultArrayOfOwnerConfig> createInvokeResultArrayOfOwnerConfig(InvokeResultArrayOfOwnerConfig value) {
        return new JAXBElement<InvokeResultArrayOfOwnerConfig>(_InvokeResultArrayOfOwnerConfig_QNAME, InvokeResultArrayOfOwnerConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResult.class)
    public JAXBElement<String> createInvokeResultCode(String value) {
        return new JAXBElement<String>(_InvokeResultCode_QNAME, String.class, InvokeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelServiceTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultArrayOfHotelServiceTag.class)
    public JAXBElement<ArrayOfHotelServiceTag> createInvokeResultArrayOfHotelServiceTagContent(ArrayOfHotelServiceTag value) {
        return new JAXBElement<ArrayOfHotelServiceTag>(_InvokeResultArrayOfHotelServiceTagContent_QNAME, ArrayOfHotelServiceTag.class, InvokeResultArrayOfHotelServiceTag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultArrayOfHotelServiceTag.class)
    public JAXBElement<String> createInvokeResultArrayOfHotelServiceTagCode(String value) {
        return new JAXBElement<String>(_InvokeResultCode_QNAME, String.class, InvokeResultArrayOfHotelServiceTag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultArrayOfRoomType.class)
    public JAXBElement<ArrayOfRoomType> createInvokeResultArrayOfRoomTypeContent(ArrayOfRoomType value) {
        return new JAXBElement<ArrayOfRoomType>(_InvokeResultArrayOfHotelServiceTagContent_QNAME, ArrayOfRoomType.class, InvokeResultArrayOfRoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultArrayOfRoomType.class)
    public JAXBElement<String> createInvokeResultArrayOfRoomTypeCode(String value) {
        return new JAXBElement<String>(_InvokeResultCode_QNAME, String.class, InvokeResultArrayOfRoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOwnerConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultArrayOfOwnerConfig.class)
    public JAXBElement<ArrayOfOwnerConfig> createInvokeResultArrayOfOwnerConfigContent(ArrayOfOwnerConfig value) {
        return new JAXBElement<ArrayOfOwnerConfig>(_InvokeResultArrayOfHotelServiceTagContent_QNAME, ArrayOfOwnerConfig.class, InvokeResultArrayOfOwnerConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultArrayOfOwnerConfig.class)
    public JAXBElement<String> createInvokeResultArrayOfOwnerConfigCode(String value) {
        return new JAXBElement<String>(_InvokeResultCode_QNAME, String.class, InvokeResultArrayOfOwnerConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultArrayOfRoom.class)
    public JAXBElement<ArrayOfRoom> createInvokeResultArrayOfRoomContent(ArrayOfRoom value) {
        return new JAXBElement<ArrayOfRoom>(_InvokeResultArrayOfHotelServiceTagContent_QNAME, ArrayOfRoom.class, InvokeResultArrayOfRoom.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultArrayOfRoom.class)
    public JAXBElement<String> createInvokeResultArrayOfRoomCode(String value) {
        return new JAXBElement<String>(_InvokeResultCode_QNAME, String.class, InvokeResultArrayOfRoom.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultArrayOfHotelSearchResponse.class)
    public JAXBElement<ArrayOfHotelSearchResponse> createInvokeResultArrayOfHotelSearchResponseContent(ArrayOfHotelSearchResponse value) {
        return new JAXBElement<ArrayOfHotelSearchResponse>(_InvokeResultArrayOfHotelServiceTagContent_QNAME, ArrayOfHotelSearchResponse.class, InvokeResultArrayOfHotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultArrayOfHotelSearchResponse.class)
    public JAXBElement<String> createInvokeResultArrayOfHotelSearchResponseCode(String value) {
        return new JAXBElement<String>(_InvokeResultCode_QNAME, String.class, InvokeResultArrayOfHotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFloorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultArrayOfFloorResponse.class)
    public JAXBElement<ArrayOfFloorResponse> createInvokeResultArrayOfFloorResponseContent(ArrayOfFloorResponse value) {
        return new JAXBElement<ArrayOfFloorResponse>(_InvokeResultArrayOfHotelServiceTagContent_QNAME, ArrayOfFloorResponse.class, InvokeResultArrayOfFloorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultArrayOfFloorResponse.class)
    public JAXBElement<String> createInvokeResultArrayOfFloorResponseCode(String value) {
        return new JAXBElement<String>(_InvokeResultCode_QNAME, String.class, InvokeResultArrayOfFloorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultInt.class)
    public JAXBElement<String> createInvokeResultIntCode(String value) {
        return new JAXBElement<String>(_InvokeResultCode_QNAME, String.class, InvokeResultInt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultBoolean.class)
    public JAXBElement<String> createInvokeResultBooleanCode(String value) {
        return new JAXBElement<String>(_InvokeResultCode_QNAME, String.class, InvokeResultBoolean.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagedResultOfRoomRemarkResponsepM6ZO2Ns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns.class)
    public JAXBElement<PagedResultOfRoomRemarkResponsepM6ZO2Ns> createInvokeResultPagedResultOfRoomRemarkResponsepM6ZO2NsContent(PagedResultOfRoomRemarkResponsepM6ZO2Ns value) {
        return new JAXBElement<PagedResultOfRoomRemarkResponsepM6ZO2Ns>(_InvokeResultArrayOfHotelServiceTagContent_QNAME, PagedResultOfRoomRemarkResponsepM6ZO2Ns.class, InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns.class)
    public JAXBElement<String> createInvokeResultPagedResultOfRoomRemarkResponsepM6ZO2NsCode(String value) {
        return new JAXBElement<String>(_InvokeResultCode_QNAME, String.class, InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomRemarkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Content", scope = PagedResultOfRoomRemarkResponsepM6ZO2Ns.class)
    public JAXBElement<ArrayOfRoomRemarkResponse> createPagedResultOfRoomRemarkResponsepM6ZO2NsContent(ArrayOfRoomRemarkResponse value) {
        return new JAXBElement<ArrayOfRoomRemarkResponse>(_InvokeResultArrayOfHotelServiceTagContent_QNAME, ArrayOfRoomRemarkResponse.class, PagedResultOfRoomRemarkResponsepM6ZO2Ns.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", name = "Code", scope = PagedResultOfRoomRemarkResponsepM6ZO2Ns.class)
    public JAXBElement<String> createPagedResultOfRoomRemarkResponsepM6ZO2NsCode(String value) {
        return new JAXBElement<String>(_InvokeResultCode_QNAME, String.class, PagedResultOfRoomRemarkResponsepM6ZO2Ns.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model", name = "OrderBy", scope = OrderByRequest.class)
    public JAXBElement<String> createOrderByRequestOrderBy(String value) {
        return new JAXBElement<String>(_OrderByRequestOrderBy_QNAME, String.class, OrderByRequest.class, value);
    }

}
