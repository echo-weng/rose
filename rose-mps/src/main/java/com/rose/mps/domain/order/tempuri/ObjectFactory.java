
package com.rose.mps.domain.order.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.rose.mps.domain.order.publicservice.InvokeResultArrayOfCheckinGuestResponse;
import com.rose.mps.domain.order.publicservice.InvokeResultArrayOfCheckinNetDoorResponse;
import com.rose.mps.domain.order.publicservice.InvokeResultArrayOfCheckinResponse;
import com.rose.mps.domain.order.publicservice.InvokeResultArrayOfCheckoutResponse;
import com.rose.mps.domain.order.publicservice.InvokeResultArrayOfOccupationResponse;
import com.rose.mps.domain.order.publicservice.InvokeResultArrayOfPromotionPolicyResponse;
import com.rose.mps.domain.order.publicservice.InvokeResultBoolean;
import com.rose.mps.domain.order.publicservice.InvokeResultCheckinResponse;
import com.rose.mps.domain.order.publicservice.InvokeResultOrderAddResponse;
import com.rose.mps.domain.order.publicservice.InvokeResultOrderResponse;
import com.rose.mps.domain.order.publicservice.InvokeResultPageModelOfOrderResponsepM6ZO2Ns;
import com.rose.mps.domain.order.publicservice.model.ChangeStayRequest;
import com.rose.mps.domain.order.publicservice.model.CheckGuestIdCardRequest;
import com.rose.mps.domain.order.publicservice.model.CheckinGuestRequest;
import com.rose.mps.domain.order.publicservice.model.CheckinNetDoorOpenRequest;
import com.rose.mps.domain.order.publicservice.model.CheckinNetDoorRequest;
import com.rose.mps.domain.order.publicservice.model.CheckinRequest;
import com.rose.mps.domain.order.publicservice.model.CheckinSearchRequest;
import com.rose.mps.domain.order.publicservice.model.CheckoutRequest;
import com.rose.mps.domain.order.publicservice.model.GetOrdersByMemberIdRequest;
import com.rose.mps.domain.order.publicservice.model.OccupationSearchRequest;
import com.rose.mps.domain.order.publicservice.model.OrderAddRequest;
import com.rose.mps.domain.order.publicservice.model.OrderCancelRequest;
import com.rose.mps.domain.order.publicservice.model.SearchRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _AddCheckinSignature_QNAME = new QName("http://tempuri.org/", "signature");
    private final static QName _AddCheckinCheckinRequest_QNAME = new QName("http://tempuri.org/", "checkinRequest");
    private final static QName _SearchResponseSearchResult_QNAME = new QName("http://tempuri.org/", "SearchResult");
    private final static QName _SearchCheckinCheckinSearchRequest_QNAME = new QName("http://tempuri.org/", "checkinSearchRequest");
    private final static QName _GetPromotionPolicyResponseOrderAddRequest_QNAME = new QName("http://tempuri.org/", "orderAddRequest");
    private final static QName _SearchCheckinResponseSearchCheckinResult_QNAME = new QName("http://tempuri.org/", "SearchCheckinResult");
    private final static QName _SearchCheckinNetDoorResponseSearchCheckinNetDoorResult_QNAME = new QName("http://tempuri.org/", "SearchCheckinNetDoorResult");
    private final static QName _ChangeStayChangeStayRequest_QNAME = new QName("http://tempuri.org/", "changeStayRequest");
    private final static QName _CancelOrderOrderCancelRequest_QNAME = new QName("http://tempuri.org/", "orderCancelRequest");
    private final static QName _SearchCheckinNetDoorCheckinNetDoorRequest_QNAME = new QName("http://tempuri.org/", "checkinNetDoorRequest");
    private final static QName _GetOrdersByMemberIdOrdersByMemberIdRequest_QNAME = new QName("http://tempuri.org/", "ordersByMemberIdRequest");
    private final static QName _ChangeStayResponseChangeStayResult_QNAME = new QName("http://tempuri.org/", "ChangeStayResult");
    private final static QName _SearchOccupationOccupationSearchRequest_QNAME = new QName("http://tempuri.org/", "occupationSearchRequest");
    private final static QName _CancelOrderResponseCancelOrderResult_QNAME = new QName("http://tempuri.org/", "CancelOrderResult");
    private final static QName _GetPromotionPolicyResponseResponseGetPromotionPolicyResponseResult_QNAME = new QName("http://tempuri.org/", "GetPromotionPolicyResponseResult");
    private final static QName _CheckGuestIdCardCheckGuestIdCardRequest_QNAME = new QName("http://tempuri.org/", "checkGuestIdCardRequest");
    private final static QName _GetCheckinGuestResponseGetCheckinGuestResult_QNAME = new QName("http://tempuri.org/", "GetCheckinGuestResult");
    private final static QName _GetOrderResponseGetOrderResult_QNAME = new QName("http://tempuri.org/", "GetOrderResult");
    private final static QName _CheckGuestIdCardResponseCheckGuestIdCardResult_QNAME = new QName("http://tempuri.org/", "CheckGuestIdCardResult");
    private final static QName _CheckoutResponseCheckoutResult_QNAME = new QName("http://tempuri.org/", "CheckoutResult");
    private final static QName _AddOrderResponseAddOrderResult_QNAME = new QName("http://tempuri.org/", "AddOrderResult");
    private final static QName _GetOrdersByMemberIdResponseGetOrdersByMemberIdResult_QNAME = new QName("http://tempuri.org/", "GetOrdersByMemberIdResult");
    private final static QName _CheckoutCheckoutRequest_QNAME = new QName("http://tempuri.org/", "checkoutRequest");
    private final static QName _OpenCheckinNetDoorResponseOpenCheckinNetDoorResult_QNAME = new QName("http://tempuri.org/", "OpenCheckinNetDoorResult");
    private final static QName _AddCheckinResponseAddCheckinResult_QNAME = new QName("http://tempuri.org/", "AddCheckinResult");
    private final static QName _SetOrderRoomResponseSetOrderRoomResult_QNAME = new QName("http://tempuri.org/", "SetOrderRoomResult");
    private final static QName _OpenCheckinNetDoorCheckinNetDoorOpenRequest_QNAME = new QName("http://tempuri.org/", "checkinNetDoorOpenRequest");
    private final static QName _GetCheckinGuestCheckinGuestRequest_QNAME = new QName("http://tempuri.org/", "checkinGuestRequest");
    private final static QName _SearchOccupationResponseSearchOccupationResult_QNAME = new QName("http://tempuri.org/", "SearchOccupationResult");
    private final static QName _SearchSearchRequest_QNAME = new QName("http://tempuri.org/", "searchRequest");
    private final static QName _GetPromotionRemainsResponseGetPromotionRemainsResult_QNAME = new QName("http://tempuri.org/", "GetPromotionRemainsResult");
    private final static QName _SetOrderRoomRoomNumber_QNAME = new QName("http://tempuri.org/", "roomNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCheckin }
     * 
     */
    public AddCheckin createAddCheckin() {
        return new AddCheckin();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link SearchCheckin }
     * 
     */
    public SearchCheckin createSearchCheckin() {
        return new SearchCheckin();
    }

    /**
     * Create an instance of {@link GetPromotionPolicyResponse }
     * 
     */
    public GetPromotionPolicyResponse createGetPromotionPolicyResponse() {
        return new GetPromotionPolicyResponse();
    }

    /**
     * Create an instance of {@link SearchCheckinResponse }
     * 
     */
    public SearchCheckinResponse createSearchCheckinResponse() {
        return new SearchCheckinResponse();
    }

    /**
     * Create an instance of {@link AddOrder }
     * 
     */
    public AddOrder createAddOrder() {
        return new AddOrder();
    }

    /**
     * Create an instance of {@link SearchCheckinNetDoorResponse }
     * 
     */
    public SearchCheckinNetDoorResponse createSearchCheckinNetDoorResponse() {
        return new SearchCheckinNetDoorResponse();
    }

    /**
     * Create an instance of {@link ChangeStay }
     * 
     */
    public ChangeStay createChangeStay() {
        return new ChangeStay();
    }

    /**
     * Create an instance of {@link CancelOrder }
     * 
     */
    public CancelOrder createCancelOrder() {
        return new CancelOrder();
    }

    /**
     * Create an instance of {@link SearchCheckinNetDoor }
     * 
     */
    public SearchCheckinNetDoor createSearchCheckinNetDoor() {
        return new SearchCheckinNetDoor();
    }

    /**
     * Create an instance of {@link GetOrdersByMemberId }
     * 
     */
    public GetOrdersByMemberId createGetOrdersByMemberId() {
        return new GetOrdersByMemberId();
    }

    /**
     * Create an instance of {@link ChangeStayResponse }
     * 
     */
    public ChangeStayResponse createChangeStayResponse() {
        return new ChangeStayResponse();
    }

    /**
     * Create an instance of {@link SearchOccupation }
     * 
     */
    public SearchOccupation createSearchOccupation() {
        return new SearchOccupation();
    }

    /**
     * Create an instance of {@link CancelOrderResponse }
     * 
     */
    public CancelOrderResponse createCancelOrderResponse() {
        return new CancelOrderResponse();
    }

    /**
     * Create an instance of {@link CheckGuestIdCard }
     * 
     */
    public CheckGuestIdCard createCheckGuestIdCard() {
        return new CheckGuestIdCard();
    }

    /**
     * Create an instance of {@link GetPromotionPolicyResponseResponse }
     * 
     */
    public GetPromotionPolicyResponseResponse createGetPromotionPolicyResponseResponse() {
        return new GetPromotionPolicyResponseResponse();
    }

    /**
     * Create an instance of {@link GetCheckinGuestResponse }
     * 
     */
    public GetCheckinGuestResponse createGetCheckinGuestResponse() {
        return new GetCheckinGuestResponse();
    }

    /**
     * Create an instance of {@link GetOrderResponse }
     * 
     */
    public GetOrderResponse createGetOrderResponse() {
        return new GetOrderResponse();
    }

    /**
     * Create an instance of {@link CheckGuestIdCardResponse }
     * 
     */
    public CheckGuestIdCardResponse createCheckGuestIdCardResponse() {
        return new CheckGuestIdCardResponse();
    }

    /**
     * Create an instance of {@link CheckoutResponse }
     * 
     */
    public CheckoutResponse createCheckoutResponse() {
        return new CheckoutResponse();
    }

    /**
     * Create an instance of {@link AddOrderResponse }
     * 
     */
    public AddOrderResponse createAddOrderResponse() {
        return new AddOrderResponse();
    }

    /**
     * Create an instance of {@link GetOrdersByMemberIdResponse }
     * 
     */
    public GetOrdersByMemberIdResponse createGetOrdersByMemberIdResponse() {
        return new GetOrdersByMemberIdResponse();
    }

    /**
     * Create an instance of {@link GetPromotionRemains }
     * 
     */
    public GetPromotionRemains createGetPromotionRemains() {
        return new GetPromotionRemains();
    }

    /**
     * Create an instance of {@link OpenCheckinNetDoorResponse }
     * 
     */
    public OpenCheckinNetDoorResponse createOpenCheckinNetDoorResponse() {
        return new OpenCheckinNetDoorResponse();
    }

    /**
     * Create an instance of {@link Checkout }
     * 
     */
    public Checkout createCheckout() {
        return new Checkout();
    }

    /**
     * Create an instance of {@link AddCheckinResponse }
     * 
     */
    public AddCheckinResponse createAddCheckinResponse() {
        return new AddCheckinResponse();
    }

    /**
     * Create an instance of {@link SetOrderRoomResponse }
     * 
     */
    public SetOrderRoomResponse createSetOrderRoomResponse() {
        return new SetOrderRoomResponse();
    }

    /**
     * Create an instance of {@link GetCheckinGuest }
     * 
     */
    public GetCheckinGuest createGetCheckinGuest() {
        return new GetCheckinGuest();
    }

    /**
     * Create an instance of {@link OpenCheckinNetDoor }
     * 
     */
    public OpenCheckinNetDoor createOpenCheckinNetDoor() {
        return new OpenCheckinNetDoor();
    }

    /**
     * Create an instance of {@link SearchOccupationResponse }
     * 
     */
    public SearchOccupationResponse createSearchOccupationResponse() {
        return new SearchOccupationResponse();
    }

    /**
     * Create an instance of {@link GetPromotionRemainsResponse }
     * 
     */
    public GetPromotionRemainsResponse createGetPromotionRemainsResponse() {
        return new GetPromotionRemainsResponse();
    }

    /**
     * Create an instance of {@link GetOrder }
     * 
     */
    public GetOrder createGetOrder() {
        return new GetOrder();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link SetOrderRoom }
     * 
     */
    public SetOrderRoom createSetOrderRoom() {
        return new SetOrderRoom();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = AddCheckin.class)
    public JAXBElement<String> createAddCheckinSignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, AddCheckin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "checkinRequest", scope = AddCheckin.class)
    public JAXBElement<CheckinRequest> createAddCheckinCheckinRequest(CheckinRequest value) {
        return new JAXBElement<CheckinRequest>(_AddCheckinCheckinRequest_QNAME, CheckinRequest.class, AddCheckin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultPageModelOfOrderResponsepM6ZO2Ns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SearchResult", scope = SearchResponse.class)
    public JAXBElement<InvokeResultPageModelOfOrderResponsepM6ZO2Ns> createSearchResponseSearchResult(InvokeResultPageModelOfOrderResponsepM6ZO2Ns value) {
        return new JAXBElement<InvokeResultPageModelOfOrderResponsepM6ZO2Ns>(_SearchResponseSearchResult_QNAME, InvokeResultPageModelOfOrderResponsepM6ZO2Ns.class, SearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "checkinSearchRequest", scope = SearchCheckin.class)
    public JAXBElement<CheckinSearchRequest> createSearchCheckinCheckinSearchRequest(CheckinSearchRequest value) {
        return new JAXBElement<CheckinSearchRequest>(_SearchCheckinCheckinSearchRequest_QNAME, CheckinSearchRequest.class, SearchCheckin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = SearchCheckin.class)
    public JAXBElement<String> createSearchCheckinSignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, SearchCheckin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = GetPromotionPolicyResponse.class)
    public JAXBElement<String> createGetPromotionPolicyResponseSignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, GetPromotionPolicyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderAddRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "orderAddRequest", scope = GetPromotionPolicyResponse.class)
    public JAXBElement<OrderAddRequest> createGetPromotionPolicyResponseOrderAddRequest(OrderAddRequest value) {
        return new JAXBElement<OrderAddRequest>(_GetPromotionPolicyResponseOrderAddRequest_QNAME, OrderAddRequest.class, GetPromotionPolicyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfCheckinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SearchCheckinResult", scope = SearchCheckinResponse.class)
    public JAXBElement<InvokeResultArrayOfCheckinResponse> createSearchCheckinResponseSearchCheckinResult(InvokeResultArrayOfCheckinResponse value) {
        return new JAXBElement<InvokeResultArrayOfCheckinResponse>(_SearchCheckinResponseSearchCheckinResult_QNAME, InvokeResultArrayOfCheckinResponse.class, SearchCheckinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = AddOrder.class)
    public JAXBElement<String> createAddOrderSignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, AddOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderAddRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "orderAddRequest", scope = AddOrder.class)
    public JAXBElement<OrderAddRequest> createAddOrderOrderAddRequest(OrderAddRequest value) {
        return new JAXBElement<OrderAddRequest>(_GetPromotionPolicyResponseOrderAddRequest_QNAME, OrderAddRequest.class, AddOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfCheckinNetDoorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SearchCheckinNetDoorResult", scope = SearchCheckinNetDoorResponse.class)
    public JAXBElement<InvokeResultArrayOfCheckinNetDoorResponse> createSearchCheckinNetDoorResponseSearchCheckinNetDoorResult(InvokeResultArrayOfCheckinNetDoorResponse value) {
        return new JAXBElement<InvokeResultArrayOfCheckinNetDoorResponse>(_SearchCheckinNetDoorResponseSearchCheckinNetDoorResult_QNAME, InvokeResultArrayOfCheckinNetDoorResponse.class, SearchCheckinNetDoorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStayRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "changeStayRequest", scope = ChangeStay.class)
    public JAXBElement<ChangeStayRequest> createChangeStayChangeStayRequest(ChangeStayRequest value) {
        return new JAXBElement<ChangeStayRequest>(_ChangeStayChangeStayRequest_QNAME, ChangeStayRequest.class, ChangeStay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = ChangeStay.class)
    public JAXBElement<String> createChangeStaySignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, ChangeStay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCancelRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "orderCancelRequest", scope = CancelOrder.class)
    public JAXBElement<OrderCancelRequest> createCancelOrderOrderCancelRequest(OrderCancelRequest value) {
        return new JAXBElement<OrderCancelRequest>(_CancelOrderOrderCancelRequest_QNAME, OrderCancelRequest.class, CancelOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = CancelOrder.class)
    public JAXBElement<String> createCancelOrderSignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, CancelOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = SearchCheckinNetDoor.class)
    public JAXBElement<String> createSearchCheckinNetDoorSignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, SearchCheckinNetDoor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinNetDoorRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "checkinNetDoorRequest", scope = SearchCheckinNetDoor.class)
    public JAXBElement<CheckinNetDoorRequest> createSearchCheckinNetDoorCheckinNetDoorRequest(CheckinNetDoorRequest value) {
        return new JAXBElement<CheckinNetDoorRequest>(_SearchCheckinNetDoorCheckinNetDoorRequest_QNAME, CheckinNetDoorRequest.class, SearchCheckinNetDoor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByMemberIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ordersByMemberIdRequest", scope = GetOrdersByMemberId.class)
    public JAXBElement<GetOrdersByMemberIdRequest> createGetOrdersByMemberIdOrdersByMemberIdRequest(GetOrdersByMemberIdRequest value) {
        return new JAXBElement<GetOrdersByMemberIdRequest>(_GetOrdersByMemberIdOrdersByMemberIdRequest_QNAME, GetOrdersByMemberIdRequest.class, GetOrdersByMemberId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = GetOrdersByMemberId.class)
    public JAXBElement<String> createGetOrdersByMemberIdSignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, GetOrdersByMemberId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultCheckinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ChangeStayResult", scope = ChangeStayResponse.class)
    public JAXBElement<InvokeResultCheckinResponse> createChangeStayResponseChangeStayResult(InvokeResultCheckinResponse value) {
        return new JAXBElement<InvokeResultCheckinResponse>(_ChangeStayResponseChangeStayResult_QNAME, InvokeResultCheckinResponse.class, ChangeStayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OccupationSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "occupationSearchRequest", scope = SearchOccupation.class)
    public JAXBElement<OccupationSearchRequest> createSearchOccupationOccupationSearchRequest(OccupationSearchRequest value) {
        return new JAXBElement<OccupationSearchRequest>(_SearchOccupationOccupationSearchRequest_QNAME, OccupationSearchRequest.class, SearchOccupation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = SearchOccupation.class)
    public JAXBElement<String> createSearchOccupationSignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, SearchOccupation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultBoolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CancelOrderResult", scope = CancelOrderResponse.class)
    public JAXBElement<InvokeResultBoolean> createCancelOrderResponseCancelOrderResult(InvokeResultBoolean value) {
        return new JAXBElement<InvokeResultBoolean>(_CancelOrderResponseCancelOrderResult_QNAME, InvokeResultBoolean.class, CancelOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfPromotionPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPromotionPolicyResponseResult", scope = GetPromotionPolicyResponseResponse.class)
    public JAXBElement<InvokeResultArrayOfPromotionPolicyResponse> createGetPromotionPolicyResponseResponseGetPromotionPolicyResponseResult(InvokeResultArrayOfPromotionPolicyResponse value) {
        return new JAXBElement<InvokeResultArrayOfPromotionPolicyResponse>(_GetPromotionPolicyResponseResponseGetPromotionPolicyResponseResult_QNAME, InvokeResultArrayOfPromotionPolicyResponse.class, GetPromotionPolicyResponseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = CheckGuestIdCard.class)
    public JAXBElement<String> createCheckGuestIdCardSignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, CheckGuestIdCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckGuestIdCardRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "checkGuestIdCardRequest", scope = CheckGuestIdCard.class)
    public JAXBElement<CheckGuestIdCardRequest> createCheckGuestIdCardCheckGuestIdCardRequest(CheckGuestIdCardRequest value) {
        return new JAXBElement<CheckGuestIdCardRequest>(_CheckGuestIdCardCheckGuestIdCardRequest_QNAME, CheckGuestIdCardRequest.class, CheckGuestIdCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfCheckinGuestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCheckinGuestResult", scope = GetCheckinGuestResponse.class)
    public JAXBElement<InvokeResultArrayOfCheckinGuestResponse> createGetCheckinGuestResponseGetCheckinGuestResult(InvokeResultArrayOfCheckinGuestResponse value) {
        return new JAXBElement<InvokeResultArrayOfCheckinGuestResponse>(_GetCheckinGuestResponseGetCheckinGuestResult_QNAME, InvokeResultArrayOfCheckinGuestResponse.class, GetCheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetOrderResult", scope = GetOrderResponse.class)
    public JAXBElement<InvokeResultOrderResponse> createGetOrderResponseGetOrderResult(InvokeResultOrderResponse value) {
        return new JAXBElement<InvokeResultOrderResponse>(_GetOrderResponseGetOrderResult_QNAME, InvokeResultOrderResponse.class, GetOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultBoolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CheckGuestIdCardResult", scope = CheckGuestIdCardResponse.class)
    public JAXBElement<InvokeResultBoolean> createCheckGuestIdCardResponseCheckGuestIdCardResult(InvokeResultBoolean value) {
        return new JAXBElement<InvokeResultBoolean>(_CheckGuestIdCardResponseCheckGuestIdCardResult_QNAME, InvokeResultBoolean.class, CheckGuestIdCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfCheckoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CheckoutResult", scope = CheckoutResponse.class)
    public JAXBElement<InvokeResultArrayOfCheckoutResponse> createCheckoutResponseCheckoutResult(InvokeResultArrayOfCheckoutResponse value) {
        return new JAXBElement<InvokeResultArrayOfCheckoutResponse>(_CheckoutResponseCheckoutResult_QNAME, InvokeResultArrayOfCheckoutResponse.class, CheckoutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultOrderAddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddOrderResult", scope = AddOrderResponse.class)
    public JAXBElement<InvokeResultOrderAddResponse> createAddOrderResponseAddOrderResult(InvokeResultOrderAddResponse value) {
        return new JAXBElement<InvokeResultOrderAddResponse>(_AddOrderResponseAddOrderResult_QNAME, InvokeResultOrderAddResponse.class, AddOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultPageModelOfOrderResponsepM6ZO2Ns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetOrdersByMemberIdResult", scope = GetOrdersByMemberIdResponse.class)
    public JAXBElement<InvokeResultPageModelOfOrderResponsepM6ZO2Ns> createGetOrdersByMemberIdResponseGetOrdersByMemberIdResult(InvokeResultPageModelOfOrderResponsepM6ZO2Ns value) {
        return new JAXBElement<InvokeResultPageModelOfOrderResponsepM6ZO2Ns>(_GetOrdersByMemberIdResponseGetOrdersByMemberIdResult_QNAME, InvokeResultPageModelOfOrderResponsepM6ZO2Ns.class, GetOrdersByMemberIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = GetPromotionRemains.class)
    public JAXBElement<String> createGetPromotionRemainsSignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, GetPromotionRemains.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "checkoutRequest", scope = Checkout.class)
    public JAXBElement<CheckoutRequest> createCheckoutCheckoutRequest(CheckoutRequest value) {
        return new JAXBElement<CheckoutRequest>(_CheckoutCheckoutRequest_QNAME, CheckoutRequest.class, Checkout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = Checkout.class)
    public JAXBElement<String> createCheckoutSignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, Checkout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultBoolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OpenCheckinNetDoorResult", scope = OpenCheckinNetDoorResponse.class)
    public JAXBElement<InvokeResultBoolean> createOpenCheckinNetDoorResponseOpenCheckinNetDoorResult(InvokeResultBoolean value) {
        return new JAXBElement<InvokeResultBoolean>(_OpenCheckinNetDoorResponseOpenCheckinNetDoorResult_QNAME, InvokeResultBoolean.class, OpenCheckinNetDoorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultBoolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddCheckinResult", scope = AddCheckinResponse.class)
    public JAXBElement<InvokeResultBoolean> createAddCheckinResponseAddCheckinResult(InvokeResultBoolean value) {
        return new JAXBElement<InvokeResultBoolean>(_AddCheckinResponseAddCheckinResult_QNAME, InvokeResultBoolean.class, AddCheckinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultBoolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SetOrderRoomResult", scope = SetOrderRoomResponse.class)
    public JAXBElement<InvokeResultBoolean> createSetOrderRoomResponseSetOrderRoomResult(InvokeResultBoolean value) {
        return new JAXBElement<InvokeResultBoolean>(_SetOrderRoomResponseSetOrderRoomResult_QNAME, InvokeResultBoolean.class, SetOrderRoomResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = OpenCheckinNetDoor.class)
    public JAXBElement<String> createOpenCheckinNetDoorSignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, OpenCheckinNetDoor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinNetDoorOpenRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "checkinNetDoorOpenRequest", scope = OpenCheckinNetDoor.class)
    public JAXBElement<CheckinNetDoorOpenRequest> createOpenCheckinNetDoorCheckinNetDoorOpenRequest(CheckinNetDoorOpenRequest value) {
        return new JAXBElement<CheckinNetDoorOpenRequest>(_OpenCheckinNetDoorCheckinNetDoorOpenRequest_QNAME, CheckinNetDoorOpenRequest.class, OpenCheckinNetDoor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinGuestRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "checkinGuestRequest", scope = GetCheckinGuest.class)
    public JAXBElement<CheckinGuestRequest> createGetCheckinGuestCheckinGuestRequest(CheckinGuestRequest value) {
        return new JAXBElement<CheckinGuestRequest>(_GetCheckinGuestCheckinGuestRequest_QNAME, CheckinGuestRequest.class, GetCheckinGuest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = GetCheckinGuest.class)
    public JAXBElement<String> createGetCheckinGuestSignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, GetCheckinGuest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfOccupationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SearchOccupationResult", scope = SearchOccupationResponse.class)
    public JAXBElement<InvokeResultArrayOfOccupationResponse> createSearchOccupationResponseSearchOccupationResult(InvokeResultArrayOfOccupationResponse value) {
        return new JAXBElement<InvokeResultArrayOfOccupationResponse>(_SearchOccupationResponseSearchOccupationResult_QNAME, InvokeResultArrayOfOccupationResponse.class, SearchOccupationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "searchRequest", scope = Search.class)
    public JAXBElement<SearchRequest> createSearchSearchRequest(SearchRequest value) {
        return new JAXBElement<SearchRequest>(_SearchSearchRequest_QNAME, SearchRequest.class, Search.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = Search.class)
    public JAXBElement<String> createSearchSignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, Search.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = GetOrder.class)
    public JAXBElement<String> createGetOrderSignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, GetOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfPromotionPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPromotionRemainsResult", scope = GetPromotionRemainsResponse.class)
    public JAXBElement<InvokeResultArrayOfPromotionPolicyResponse> createGetPromotionRemainsResponseGetPromotionRemainsResult(InvokeResultArrayOfPromotionPolicyResponse value) {
        return new JAXBElement<InvokeResultArrayOfPromotionPolicyResponse>(_GetPromotionRemainsResponseGetPromotionRemainsResult_QNAME, InvokeResultArrayOfPromotionPolicyResponse.class, GetPromotionRemainsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "roomNumber", scope = SetOrderRoom.class)
    public JAXBElement<String> createSetOrderRoomRoomNumber(String value) {
        return new JAXBElement<String>(_SetOrderRoomRoomNumber_QNAME, String.class, SetOrderRoom.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = SetOrderRoom.class)
    public JAXBElement<String> createSetOrderRoomSignature(String value) {
        return new JAXBElement<String>(_AddCheckinSignature_QNAME, String.class, SetOrderRoom.class, value);
    }

}
