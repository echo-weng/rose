
package com.rose.mps.domain.order.publicservice.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.rose.mps.domain.order.serialization.array.ArrayOflong;
import com.rose.mps.domain.order.serialization.array.ArrayOfstring;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.nextpms_publicservice_model package. 
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

    private final static QName _CheckinSearchRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckinSearchRequest");
    private final static QName _CheckGuestIdCardRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckGuestIdCardRequest");
    private final static QName _OrderAddResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OrderAddResponse");
    private final static QName _CustomerRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CustomerRequest");
    private final static QName _CheckinResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckinResponse");
    private final static QName _ArrayOfOrderResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfOrderResponse");
    private final static QName _RoomType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomType");
    private final static QName _ArrayOfCheckinGuestResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfCheckinGuestResponse");
    private final static QName _ArrayOfGuest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfGuest");
    private final static QName _CheckoutResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckoutResponse");
    private final static QName _ArrayOfOrderItemRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfOrderItemRequest");
    private final static QName _CheckoutRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckoutRequest");
    private final static QName _OccupationResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OccupationResponse");
    private final static QName _RoomPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomPrice");
    private final static QName _ArrayOfCheckinResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfCheckinResponse");
    private final static QName _CheckinNetDoorResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckinNetDoorResponse");
    private final static QName _CheckinNetDoorRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckinNetDoorRequest");
    private final static QName _ArrayOfCheckoutResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfCheckoutResponse");
    private final static QName _ChangeStayRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ChangeStayRequest");
    private final static QName _ArrayOfRoomPlan_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfRoomPlan");
    private final static QName _CreditCard_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CreditCard");
    private final static QName _OrderAddRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OrderAddRequest");
    private final static QName _GetOrdersByMemberIdRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "GetOrdersByMemberIdRequest");
    private final static QName _ArrayOfCheckinNetDoorResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfCheckinNetDoorResponse");
    private final static QName _CheckinRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckinRequest");
    private final static QName _CheckinNetDoorOpenRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckinNetDoorOpenRequest");
    private final static QName _ArrayOfOccupationResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfOccupationResponse");
    private final static QName _PromotionPolicyResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "PromotionPolicyResponse");
    private final static QName _ArrayOfPromotionPolicyResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfPromotionPolicyResponse");
    private final static QName _CheckinGuestRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckinGuestRequest");
    private final static QName _ArrayOfRoomPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfRoomPrice");
    private final static QName _OccupationSearchRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OccupationSearchRequest");
    private final static QName _RoomPlan_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomPlan");
    private final static QName _SearchRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "SearchRequest");
    private final static QName _OrderCancelRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OrderCancelRequest");
    private final static QName _OrderItemRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OrderItemRequest");
    private final static QName _ArrayOfLiaison_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfLiaison");
    private final static QName _OrderResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OrderResponse");
    private final static QName _CheckinGuestResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckinGuestResponse");
    private final static QName _Guest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Guest");
    private final static QName _Liaison_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Liaison");
    private final static QName _ChangeStayRequestReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Reason");
    private final static QName _ChangeStayRequestOperateType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OperateType");
    private final static QName _GuestNationality_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Nationality");
    private final static QName _GuestMobile_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Mobile");
    private final static QName _GuestGender_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Gender");
    private final static QName _GuestFax_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Fax");
    private final static QName _GuestEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Email");
    private final static QName _GuestPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Phone");
    private final static QName _GuestName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Name");
    private final static QName _CheckGuestIdCardRequestIdCardLastNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "IdCardLastNo");
    private final static QName _CheckGuestIdCardRequestRoomNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomNumber");
    private final static QName _CustomerRequestCardNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CardNo");
    private final static QName _CustomerRequestCardTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CardTypeId");
    private final static QName _CheckinResponseCheckinCustomer_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckinCustomer");
    private final static QName _CheckinResponseBillNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "BillNo");
    private final static QName _CheckinResponseCheckinNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckinNo");
    private final static QName _CheckinResponseActualDepatureTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ActualDepatureTime");
    private final static QName _CheckinResponseMemo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Memo");
    private final static QName _CheckinResponseChannel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Channel");
    private final static QName _PromotionPolicyResponseDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Description");
    private final static QName _OccupationResponsePriceRoomTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "PriceRoomTypeId");
    private final static QName _OccupationResponsePhysicalRoomTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "PhysicalRoomTypeId");
    private final static QName _OrderResponseMemberId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "MemberId");
    private final static QName _OrderResponseActualArriveTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ActualArriveTime");
    private final static QName _OrderResponseGuests_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Guests");
    private final static QName _OrderResponseExpireKeepTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ExpireKeepTime");
    private final static QName _OrderResponseOrderStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OrderStatus");
    private final static QName _OrderResponsePublicMemo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "PublicMemo");
    private final static QName _OrderResponseRoomPlans_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomPlans");
    private final static QName _OrderResponseCustomerCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CustomerCategory");
    private final static QName _OrderResponseCancelReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CancelReason");
    private final static QName _OrderResponseLiaisons_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Liaisons");
    private final static QName _OrderResponseOrderNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OrderNo");
    private final static QName _OrderResponseOrderSource_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OrderSource");
    private final static QName _OrderResponseCheckinType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckinType");
    private final static QName _OrderResponsePrePaymentTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "PrePaymentTypeId");
    private final static QName _CheckoutRequestCheckinIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckinIds");
    private final static QName _CheckinGuestRequestCheckinStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckinStatus");
    private final static QName _CheckinGuestRequestBeginTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "BeginTime");
    private final static QName _CreditCardCVC_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CVC");
    private final static QName _CreditCardBankName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "BankName");
    private final static QName _CreditCardBankKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "BankKey");
    private final static QName _CreditCardBeginValidTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "BeginValidTime");
    private final static QName _CreditCardAuthorizeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "AuthorizeId");
    private final static QName _CreditCardEndValidTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "EndValidTime");
    private final static QName _CreditCardCardNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CardNumber");
    private final static QName _RoomPlanRoomTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomTypeId");
    private final static QName _RoomPlanPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Price");
    private final static QName _SearchRequestKeywords_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Keywords");
    private final static QName _SearchRequestPageIndex_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "PageIndex");
    private final static QName _SearchRequestOrderStatusIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OrderStatusIds");
    private final static QName _SearchRequestPageSize_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "PageSize");
    private final static QName _SearchRequestEndArriveTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "EndArriveTime");
    private final static QName _SearchRequestHotelId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "HotelId");
    private final static QName _SearchRequestBeginArriveTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "BeginArriveTime");
    private final static QName _OrderAddRequestIsExtenalPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "IsExtenalPrice");
    private final static QName _OrderAddRequestExternalPriceName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ExternalPriceName");
    private final static QName _OrderAddRequestOrderItemRequests_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OrderItemRequests");
    private final static QName _OrderAddRequestSalerId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "SalerId");
    private final static QName _RoomTypeAbbreviation_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Abbreviation");
    private final static QName _RoomTypeHotelRoomTypeDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "HotelRoomTypeDescription");
    private final static QName _RoomTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Id");
    private final static QName _RoomTypeImageUris_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ImageUris");
    private final static QName _RoomTypeBedType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "BedType");
    private final static QName _RoomTypeBedAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "BedAmount");
    private final static QName _RoomTypeRoomTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomTypeName");
    private final static QName _CheckinGuestResponseCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "City");
    private final static QName _CheckinGuestResponseCheckoutTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckoutTime");
    private final static QName _CheckinGuestResponseCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Country");
    private final static QName _CheckinGuestResponseProvince_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Province");
    private final static QName _CheckinGuestResponseRace_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Race");
    private final static QName _CheckinGuestResponseRoomNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomNo");
    private final static QName _CheckinGuestResponseIDCardNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "IDCardNo");
    private final static QName _CheckinGuestResponseIDCardTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "IDCardTypeId");
    private final static QName _CheckinGuestResponseAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Address");
    private final static QName _CheckinGuestResponseStatusId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "StatusId");
    private final static QName _CheckinGuestResponseBirthday_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Birthday");
    private final static QName _CheckinGuestResponseCheckinTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckinTime");
    private final static QName _CheckinGuestResponseGuestName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "GuestName");
    private final static QName _CheckinRequestCustomer_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Customer");
    private final static QName _CheckinSearchRequestRoomNumbers_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomNumbers");
    private final static QName _CheckinSearchRequestOccupationIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OccupationIds");
    private final static QName _CheckinSearchRequestMemberCardId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "MemberCardId");
    private final static QName _CheckinSearchRequestOrderIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OrderIds");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.nextpms_publicservice_model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Guest }
     * 
     */
    public Guest createGuest() {
        return new Guest();
    }

    /**
     * Create an instance of {@link ChangeStayRequest }
     * 
     */
    public ChangeStayRequest createChangeStayRequest() {
        return new ChangeStayRequest();
    }

    /**
     * Create an instance of {@link OccupationSearchRequest }
     * 
     */
    public OccupationSearchRequest createOccupationSearchRequest() {
        return new OccupationSearchRequest();
    }

    /**
     * Create an instance of {@link CheckinNetDoorOpenRequest }
     * 
     */
    public CheckinNetDoorOpenRequest createCheckinNetDoorOpenRequest() {
        return new CheckinNetDoorOpenRequest();
    }

    /**
     * Create an instance of {@link ArrayOfOccupationResponse }
     * 
     */
    public ArrayOfOccupationResponse createArrayOfOccupationResponse() {
        return new ArrayOfOccupationResponse();
    }

    /**
     * Create an instance of {@link CheckinNetDoorResponse }
     * 
     */
    public CheckinNetDoorResponse createCheckinNetDoorResponse() {
        return new CheckinNetDoorResponse();
    }

    /**
     * Create an instance of {@link CheckGuestIdCardRequest }
     * 
     */
    public CheckGuestIdCardRequest createCheckGuestIdCardRequest() {
        return new CheckGuestIdCardRequest();
    }

    /**
     * Create an instance of {@link ArrayOfLiaison }
     * 
     */
    public ArrayOfLiaison createArrayOfLiaison() {
        return new ArrayOfLiaison();
    }

    /**
     * Create an instance of {@link CustomerRequest }
     * 
     */
    public CustomerRequest createCustomerRequest() {
        return new CustomerRequest();
    }

    /**
     * Create an instance of {@link CheckinResponse }
     * 
     */
    public CheckinResponse createCheckinResponse() {
        return new CheckinResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCheckoutResponse }
     * 
     */
    public ArrayOfCheckoutResponse createArrayOfCheckoutResponse() {
        return new ArrayOfCheckoutResponse();
    }

    /**
     * Create an instance of {@link CheckoutResponse }
     * 
     */
    public CheckoutResponse createCheckoutResponse() {
        return new CheckoutResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPromotionPolicyResponse }
     * 
     */
    public ArrayOfPromotionPolicyResponse createArrayOfPromotionPolicyResponse() {
        return new ArrayOfPromotionPolicyResponse();
    }

    /**
     * Create an instance of {@link PromotionPolicyResponse }
     * 
     */
    public PromotionPolicyResponse createPromotionPolicyResponse() {
        return new PromotionPolicyResponse();
    }

    /**
     * Create an instance of {@link OccupationResponse }
     * 
     */
    public OccupationResponse createOccupationResponse() {
        return new OccupationResponse();
    }

    /**
     * Create an instance of {@link OrderResponse }
     * 
     */
    public OrderResponse createOrderResponse() {
        return new OrderResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCheckinGuestResponse }
     * 
     */
    public ArrayOfCheckinGuestResponse createArrayOfCheckinGuestResponse() {
        return new ArrayOfCheckinGuestResponse();
    }

    /**
     * Create an instance of {@link CheckoutRequest }
     * 
     */
    public CheckoutRequest createCheckoutRequest() {
        return new CheckoutRequest();
    }

    /**
     * Create an instance of {@link CheckinGuestRequest }
     * 
     */
    public CheckinGuestRequest createCheckinGuestRequest() {
        return new CheckinGuestRequest();
    }

    /**
     * Create an instance of {@link OrderAddResponse }
     * 
     */
    public OrderAddResponse createOrderAddResponse() {
        return new OrderAddResponse();
    }

    /**
     * Create an instance of {@link OrderItemRequest }
     * 
     */
    public OrderItemRequest createOrderItemRequest() {
        return new OrderItemRequest();
    }

    /**
     * Create an instance of {@link CheckinNetDoorRequest }
     * 
     */
    public CheckinNetDoorRequest createCheckinNetDoorRequest() {
        return new CheckinNetDoorRequest();
    }

    /**
     * Create an instance of {@link ArrayOfOrderResponse }
     * 
     */
    public ArrayOfOrderResponse createArrayOfOrderResponse() {
        return new ArrayOfOrderResponse();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link RoomPlan }
     * 
     */
    public RoomPlan createRoomPlan() {
        return new RoomPlan();
    }

    /**
     * Create an instance of {@link ArrayOfRoomPrice }
     * 
     */
    public ArrayOfRoomPrice createArrayOfRoomPrice() {
        return new ArrayOfRoomPrice();
    }

    /**
     * Create an instance of {@link ArrayOfOrderItemRequest }
     * 
     */
    public ArrayOfOrderItemRequest createArrayOfOrderItemRequest() {
        return new ArrayOfOrderItemRequest();
    }

    /**
     * Create an instance of {@link RoomPrice }
     * 
     */
    public RoomPrice createRoomPrice() {
        return new RoomPrice();
    }

    /**
     * Create an instance of {@link SearchRequest }
     * 
     */
    public SearchRequest createSearchRequest() {
        return new SearchRequest();
    }

    /**
     * Create an instance of {@link RoomType }
     * 
     */
    public RoomType createRoomType() {
        return new RoomType();
    }

    /**
     * Create an instance of {@link OrderAddRequest }
     * 
     */
    public OrderAddRequest createOrderAddRequest() {
        return new OrderAddRequest();
    }

    /**
     * Create an instance of {@link ArrayOfCheckinNetDoorResponse }
     * 
     */
    public ArrayOfCheckinNetDoorResponse createArrayOfCheckinNetDoorResponse() {
        return new ArrayOfCheckinNetDoorResponse();
    }

    /**
     * Create an instance of {@link ArrayOfGuest }
     * 
     */
    public ArrayOfGuest createArrayOfGuest() {
        return new ArrayOfGuest();
    }

    /**
     * Create an instance of {@link CheckinGuestResponse }
     * 
     */
    public CheckinGuestResponse createCheckinGuestResponse() {
        return new CheckinGuestResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRoomPlan }
     * 
     */
    public ArrayOfRoomPlan createArrayOfRoomPlan() {
        return new ArrayOfRoomPlan();
    }

    /**
     * Create an instance of {@link ArrayOfCheckinResponse }
     * 
     */
    public ArrayOfCheckinResponse createArrayOfCheckinResponse() {
        return new ArrayOfCheckinResponse();
    }

    /**
     * Create an instance of {@link CheckinRequest }
     * 
     */
    public CheckinRequest createCheckinRequest() {
        return new CheckinRequest();
    }

    /**
     * Create an instance of {@link Liaison }
     * 
     */
    public Liaison createLiaison() {
        return new Liaison();
    }

    /**
     * Create an instance of {@link GetOrdersByMemberIdRequest }
     * 
     */
    public GetOrdersByMemberIdRequest createGetOrdersByMemberIdRequest() {
        return new GetOrdersByMemberIdRequest();
    }

    /**
     * Create an instance of {@link OrderCancelRequest }
     * 
     */
    public OrderCancelRequest createOrderCancelRequest() {
        return new OrderCancelRequest();
    }

    /**
     * Create an instance of {@link CheckinSearchRequest }
     * 
     */
    public CheckinSearchRequest createCheckinSearchRequest() {
        return new CheckinSearchRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinSearchRequest")
    public JAXBElement<CheckinSearchRequest> createCheckinSearchRequest(CheckinSearchRequest value) {
        return new JAXBElement<CheckinSearchRequest>(_CheckinSearchRequest_QNAME, CheckinSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckGuestIdCardRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckGuestIdCardRequest")
    public JAXBElement<CheckGuestIdCardRequest> createCheckGuestIdCardRequest(CheckGuestIdCardRequest value) {
        return new JAXBElement<CheckGuestIdCardRequest>(_CheckGuestIdCardRequest_QNAME, CheckGuestIdCardRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderAddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OrderAddResponse")
    public JAXBElement<OrderAddResponse> createOrderAddResponse(OrderAddResponse value) {
        return new JAXBElement<OrderAddResponse>(_OrderAddResponse_QNAME, OrderAddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CustomerRequest")
    public JAXBElement<CustomerRequest> createCustomerRequest(CustomerRequest value) {
        return new JAXBElement<CustomerRequest>(_CustomerRequest_QNAME, CustomerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinResponse")
    public JAXBElement<CheckinResponse> createCheckinResponse(CheckinResponse value) {
        return new JAXBElement<CheckinResponse>(_CheckinResponse_QNAME, CheckinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfOrderResponse")
    public JAXBElement<ArrayOfOrderResponse> createArrayOfOrderResponse(ArrayOfOrderResponse value) {
        return new JAXBElement<ArrayOfOrderResponse>(_ArrayOfOrderResponse_QNAME, ArrayOfOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomType")
    public JAXBElement<RoomType> createRoomType(RoomType value) {
        return new JAXBElement<RoomType>(_RoomType_QNAME, RoomType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckinGuestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfCheckinGuestResponse")
    public JAXBElement<ArrayOfCheckinGuestResponse> createArrayOfCheckinGuestResponse(ArrayOfCheckinGuestResponse value) {
        return new JAXBElement<ArrayOfCheckinGuestResponse>(_ArrayOfCheckinGuestResponse_QNAME, ArrayOfCheckinGuestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGuest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfGuest")
    public JAXBElement<ArrayOfGuest> createArrayOfGuest(ArrayOfGuest value) {
        return new JAXBElement<ArrayOfGuest>(_ArrayOfGuest_QNAME, ArrayOfGuest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckoutResponse")
    public JAXBElement<CheckoutResponse> createCheckoutResponse(CheckoutResponse value) {
        return new JAXBElement<CheckoutResponse>(_CheckoutResponse_QNAME, CheckoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderItemRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfOrderItemRequest")
    public JAXBElement<ArrayOfOrderItemRequest> createArrayOfOrderItemRequest(ArrayOfOrderItemRequest value) {
        return new JAXBElement<ArrayOfOrderItemRequest>(_ArrayOfOrderItemRequest_QNAME, ArrayOfOrderItemRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckoutRequest")
    public JAXBElement<CheckoutRequest> createCheckoutRequest(CheckoutRequest value) {
        return new JAXBElement<CheckoutRequest>(_CheckoutRequest_QNAME, CheckoutRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OccupationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OccupationResponse")
    public JAXBElement<OccupationResponse> createOccupationResponse(OccupationResponse value) {
        return new JAXBElement<OccupationResponse>(_OccupationResponse_QNAME, OccupationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomPrice")
    public JAXBElement<RoomPrice> createRoomPrice(RoomPrice value) {
        return new JAXBElement<RoomPrice>(_RoomPrice_QNAME, RoomPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfCheckinResponse")
    public JAXBElement<ArrayOfCheckinResponse> createArrayOfCheckinResponse(ArrayOfCheckinResponse value) {
        return new JAXBElement<ArrayOfCheckinResponse>(_ArrayOfCheckinResponse_QNAME, ArrayOfCheckinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinNetDoorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinNetDoorResponse")
    public JAXBElement<CheckinNetDoorResponse> createCheckinNetDoorResponse(CheckinNetDoorResponse value) {
        return new JAXBElement<CheckinNetDoorResponse>(_CheckinNetDoorResponse_QNAME, CheckinNetDoorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinNetDoorRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinNetDoorRequest")
    public JAXBElement<CheckinNetDoorRequest> createCheckinNetDoorRequest(CheckinNetDoorRequest value) {
        return new JAXBElement<CheckinNetDoorRequest>(_CheckinNetDoorRequest_QNAME, CheckinNetDoorRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfCheckoutResponse")
    public JAXBElement<ArrayOfCheckoutResponse> createArrayOfCheckoutResponse(ArrayOfCheckoutResponse value) {
        return new JAXBElement<ArrayOfCheckoutResponse>(_ArrayOfCheckoutResponse_QNAME, ArrayOfCheckoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStayRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ChangeStayRequest")
    public JAXBElement<ChangeStayRequest> createChangeStayRequest(ChangeStayRequest value) {
        return new JAXBElement<ChangeStayRequest>(_ChangeStayRequest_QNAME, ChangeStayRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfRoomPlan")
    public JAXBElement<ArrayOfRoomPlan> createArrayOfRoomPlan(ArrayOfRoomPlan value) {
        return new JAXBElement<ArrayOfRoomPlan>(_ArrayOfRoomPlan_QNAME, ArrayOfRoomPlan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CreditCard")
    public JAXBElement<CreditCard> createCreditCard(CreditCard value) {
        return new JAXBElement<CreditCard>(_CreditCard_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderAddRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OrderAddRequest")
    public JAXBElement<OrderAddRequest> createOrderAddRequest(OrderAddRequest value) {
        return new JAXBElement<OrderAddRequest>(_OrderAddRequest_QNAME, OrderAddRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByMemberIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "GetOrdersByMemberIdRequest")
    public JAXBElement<GetOrdersByMemberIdRequest> createGetOrdersByMemberIdRequest(GetOrdersByMemberIdRequest value) {
        return new JAXBElement<GetOrdersByMemberIdRequest>(_GetOrdersByMemberIdRequest_QNAME, GetOrdersByMemberIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckinNetDoorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfCheckinNetDoorResponse")
    public JAXBElement<ArrayOfCheckinNetDoorResponse> createArrayOfCheckinNetDoorResponse(ArrayOfCheckinNetDoorResponse value) {
        return new JAXBElement<ArrayOfCheckinNetDoorResponse>(_ArrayOfCheckinNetDoorResponse_QNAME, ArrayOfCheckinNetDoorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinRequest")
    public JAXBElement<CheckinRequest> createCheckinRequest(CheckinRequest value) {
        return new JAXBElement<CheckinRequest>(_CheckinRequest_QNAME, CheckinRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinNetDoorOpenRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinNetDoorOpenRequest")
    public JAXBElement<CheckinNetDoorOpenRequest> createCheckinNetDoorOpenRequest(CheckinNetDoorOpenRequest value) {
        return new JAXBElement<CheckinNetDoorOpenRequest>(_CheckinNetDoorOpenRequest_QNAME, CheckinNetDoorOpenRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOccupationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfOccupationResponse")
    public JAXBElement<ArrayOfOccupationResponse> createArrayOfOccupationResponse(ArrayOfOccupationResponse value) {
        return new JAXBElement<ArrayOfOccupationResponse>(_ArrayOfOccupationResponse_QNAME, ArrayOfOccupationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PromotionPolicyResponse")
    public JAXBElement<PromotionPolicyResponse> createPromotionPolicyResponse(PromotionPolicyResponse value) {
        return new JAXBElement<PromotionPolicyResponse>(_PromotionPolicyResponse_QNAME, PromotionPolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPromotionPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfPromotionPolicyResponse")
    public JAXBElement<ArrayOfPromotionPolicyResponse> createArrayOfPromotionPolicyResponse(ArrayOfPromotionPolicyResponse value) {
        return new JAXBElement<ArrayOfPromotionPolicyResponse>(_ArrayOfPromotionPolicyResponse_QNAME, ArrayOfPromotionPolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinGuestRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinGuestRequest")
    public JAXBElement<CheckinGuestRequest> createCheckinGuestRequest(CheckinGuestRequest value) {
        return new JAXBElement<CheckinGuestRequest>(_CheckinGuestRequest_QNAME, CheckinGuestRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfRoomPrice")
    public JAXBElement<ArrayOfRoomPrice> createArrayOfRoomPrice(ArrayOfRoomPrice value) {
        return new JAXBElement<ArrayOfRoomPrice>(_ArrayOfRoomPrice_QNAME, ArrayOfRoomPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OccupationSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OccupationSearchRequest")
    public JAXBElement<OccupationSearchRequest> createOccupationSearchRequest(OccupationSearchRequest value) {
        return new JAXBElement<OccupationSearchRequest>(_OccupationSearchRequest_QNAME, OccupationSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomPlan")
    public JAXBElement<RoomPlan> createRoomPlan(RoomPlan value) {
        return new JAXBElement<RoomPlan>(_RoomPlan_QNAME, RoomPlan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "SearchRequest")
    public JAXBElement<SearchRequest> createSearchRequest(SearchRequest value) {
        return new JAXBElement<SearchRequest>(_SearchRequest_QNAME, SearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCancelRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OrderCancelRequest")
    public JAXBElement<OrderCancelRequest> createOrderCancelRequest(OrderCancelRequest value) {
        return new JAXBElement<OrderCancelRequest>(_OrderCancelRequest_QNAME, OrderCancelRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderItemRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OrderItemRequest")
    public JAXBElement<OrderItemRequest> createOrderItemRequest(OrderItemRequest value) {
        return new JAXBElement<OrderItemRequest>(_OrderItemRequest_QNAME, OrderItemRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLiaison }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfLiaison")
    public JAXBElement<ArrayOfLiaison> createArrayOfLiaison(ArrayOfLiaison value) {
        return new JAXBElement<ArrayOfLiaison>(_ArrayOfLiaison_QNAME, ArrayOfLiaison.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OrderResponse")
    public JAXBElement<OrderResponse> createOrderResponse(OrderResponse value) {
        return new JAXBElement<OrderResponse>(_OrderResponse_QNAME, OrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinGuestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinGuestResponse")
    public JAXBElement<CheckinGuestResponse> createCheckinGuestResponse(CheckinGuestResponse value) {
        return new JAXBElement<CheckinGuestResponse>(_CheckinGuestResponse_QNAME, CheckinGuestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Guest")
    public JAXBElement<Guest> createGuest(Guest value) {
        return new JAXBElement<Guest>(_Guest_QNAME, Guest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Liaison }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Liaison")
    public JAXBElement<Liaison> createLiaison(Liaison value) {
        return new JAXBElement<Liaison>(_Liaison_QNAME, Liaison.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Reason", scope = ChangeStayRequest.class)
    public JAXBElement<String> createChangeStayRequestReason(String value) {
        return new JAXBElement<String>(_ChangeStayRequestReason_QNAME, String.class, ChangeStayRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OperateType", scope = ChangeStayRequest.class)
    public JAXBElement<String> createChangeStayRequestOperateType(String value) {
        return new JAXBElement<String>(_ChangeStayRequestOperateType_QNAME, String.class, ChangeStayRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Nationality", scope = Guest.class)
    public JAXBElement<String> createGuestNationality(String value) {
        return new JAXBElement<String>(_GuestNationality_QNAME, String.class, Guest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Mobile", scope = Guest.class)
    public JAXBElement<String> createGuestMobile(String value) {
        return new JAXBElement<String>(_GuestMobile_QNAME, String.class, Guest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Gender", scope = Guest.class)
    public JAXBElement<Short> createGuestGender(Short value) {
        return new JAXBElement<Short>(_GuestGender_QNAME, Short.class, Guest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Fax", scope = Guest.class)
    public JAXBElement<String> createGuestFax(String value) {
        return new JAXBElement<String>(_GuestFax_QNAME, String.class, Guest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Email", scope = Guest.class)
    public JAXBElement<String> createGuestEmail(String value) {
        return new JAXBElement<String>(_GuestEmail_QNAME, String.class, Guest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Phone", scope = Guest.class)
    public JAXBElement<String> createGuestPhone(String value) {
        return new JAXBElement<String>(_GuestPhone_QNAME, String.class, Guest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Name", scope = Guest.class)
    public JAXBElement<String> createGuestName(String value) {
        return new JAXBElement<String>(_GuestName_QNAME, String.class, Guest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "IdCardLastNo", scope = CheckGuestIdCardRequest.class)
    public JAXBElement<String> createCheckGuestIdCardRequestIdCardLastNo(String value) {
        return new JAXBElement<String>(_CheckGuestIdCardRequestIdCardLastNo_QNAME, String.class, CheckGuestIdCardRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomNumber", scope = CheckGuestIdCardRequest.class)
    public JAXBElement<String> createCheckGuestIdCardRequestRoomNumber(String value) {
        return new JAXBElement<String>(_CheckGuestIdCardRequestRoomNumber_QNAME, String.class, CheckGuestIdCardRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CardNo", scope = CustomerRequest.class)
    public JAXBElement<String> createCustomerRequestCardNo(String value) {
        return new JAXBElement<String>(_CustomerRequestCardNo_QNAME, String.class, CustomerRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Mobile", scope = CustomerRequest.class)
    public JAXBElement<String> createCustomerRequestMobile(String value) {
        return new JAXBElement<String>(_GuestMobile_QNAME, String.class, CustomerRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CardTypeId", scope = CustomerRequest.class)
    public JAXBElement<String> createCustomerRequestCardTypeId(String value) {
        return new JAXBElement<String>(_CustomerRequestCardTypeId_QNAME, String.class, CustomerRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Name", scope = CustomerRequest.class)
    public JAXBElement<String> createCustomerRequestName(String value) {
        return new JAXBElement<String>(_GuestName_QNAME, String.class, CustomerRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinCustomer", scope = CheckinResponse.class)
    public JAXBElement<Guest> createCheckinResponseCheckinCustomer(Guest value) {
        return new JAXBElement<Guest>(_CheckinResponseCheckinCustomer_QNAME, Guest.class, CheckinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "BillNo", scope = CheckinResponse.class)
    public JAXBElement<String> createCheckinResponseBillNo(String value) {
        return new JAXBElement<String>(_CheckinResponseBillNo_QNAME, String.class, CheckinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinNo", scope = CheckinResponse.class)
    public JAXBElement<String> createCheckinResponseCheckinNo(String value) {
        return new JAXBElement<String>(_CheckinResponseCheckinNo_QNAME, String.class, CheckinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ActualDepatureTime", scope = CheckinResponse.class)
    public JAXBElement<XMLGregorianCalendar> createCheckinResponseActualDepatureTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CheckinResponseActualDepatureTime_QNAME, XMLGregorianCalendar.class, CheckinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Memo", scope = CheckinResponse.class)
    public JAXBElement<String> createCheckinResponseMemo(String value) {
        return new JAXBElement<String>(_CheckinResponseMemo_QNAME, String.class, CheckinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Channel", scope = CheckinResponse.class)
    public JAXBElement<String> createCheckinResponseChannel(String value) {
        return new JAXBElement<String>(_CheckinResponseChannel_QNAME, String.class, CheckinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomNumber", scope = CheckinResponse.class)
    public JAXBElement<String> createCheckinResponseRoomNumber(String value) {
        return new JAXBElement<String>(_CheckGuestIdCardRequestRoomNumber_QNAME, String.class, CheckinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Memo", scope = CheckoutResponse.class)
    public JAXBElement<String> createCheckoutResponseMemo(String value) {
        return new JAXBElement<String>(_CheckinResponseMemo_QNAME, String.class, CheckoutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Description", scope = PromotionPolicyResponse.class)
    public JAXBElement<String> createPromotionPolicyResponseDescription(String value) {
        return new JAXBElement<String>(_PromotionPolicyResponseDescription_QNAME, String.class, PromotionPolicyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Name", scope = PromotionPolicyResponse.class)
    public JAXBElement<String> createPromotionPolicyResponseName(String value) {
        return new JAXBElement<String>(_GuestName_QNAME, String.class, PromotionPolicyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PriceRoomTypeId", scope = OccupationResponse.class)
    public JAXBElement<String> createOccupationResponsePriceRoomTypeId(String value) {
        return new JAXBElement<String>(_OccupationResponsePriceRoomTypeId_QNAME, String.class, OccupationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PhysicalRoomTypeId", scope = OccupationResponse.class)
    public JAXBElement<String> createOccupationResponsePhysicalRoomTypeId(String value) {
        return new JAXBElement<String>(_OccupationResponsePhysicalRoomTypeId_QNAME, String.class, OccupationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomNumber", scope = OccupationResponse.class)
    public JAXBElement<String> createOccupationResponseRoomNumber(String value) {
        return new JAXBElement<String>(_CheckGuestIdCardRequestRoomNumber_QNAME, String.class, OccupationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "MemberId", scope = OrderResponse.class)
    public JAXBElement<String> createOrderResponseMemberId(String value) {
        return new JAXBElement<String>(_OrderResponseMemberId_QNAME, String.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ActualArriveTime", scope = OrderResponse.class)
    public JAXBElement<XMLGregorianCalendar> createOrderResponseActualArriveTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderResponseActualArriveTime_QNAME, XMLGregorianCalendar.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CreditCard", scope = OrderResponse.class)
    public JAXBElement<CreditCard> createOrderResponseCreditCard(CreditCard value) {
        return new JAXBElement<CreditCard>(_CreditCard_QNAME, CreditCard.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGuest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Guests", scope = OrderResponse.class)
    public JAXBElement<ArrayOfGuest> createOrderResponseGuests(ArrayOfGuest value) {
        return new JAXBElement<ArrayOfGuest>(_OrderResponseGuests_QNAME, ArrayOfGuest.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ExpireKeepTime", scope = OrderResponse.class)
    public JAXBElement<XMLGregorianCalendar> createOrderResponseExpireKeepTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderResponseExpireKeepTime_QNAME, XMLGregorianCalendar.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OrderStatus", scope = OrderResponse.class)
    public JAXBElement<String> createOrderResponseOrderStatus(String value) {
        return new JAXBElement<String>(_OrderResponseOrderStatus_QNAME, String.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PublicMemo", scope = OrderResponse.class)
    public JAXBElement<String> createOrderResponsePublicMemo(String value) {
        return new JAXBElement<String>(_OrderResponsePublicMemo_QNAME, String.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomPlans", scope = OrderResponse.class)
    public JAXBElement<ArrayOfRoomPlan> createOrderResponseRoomPlans(ArrayOfRoomPlan value) {
        return new JAXBElement<ArrayOfRoomPlan>(_OrderResponseRoomPlans_QNAME, ArrayOfRoomPlan.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CustomerCategory", scope = OrderResponse.class)
    public JAXBElement<String> createOrderResponseCustomerCategory(String value) {
        return new JAXBElement<String>(_OrderResponseCustomerCategory_QNAME, String.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CancelReason", scope = OrderResponse.class)
    public JAXBElement<String> createOrderResponseCancelReason(String value) {
        return new JAXBElement<String>(_OrderResponseCancelReason_QNAME, String.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLiaison }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Liaisons", scope = OrderResponse.class)
    public JAXBElement<ArrayOfLiaison> createOrderResponseLiaisons(ArrayOfLiaison value) {
        return new JAXBElement<ArrayOfLiaison>(_OrderResponseLiaisons_QNAME, ArrayOfLiaison.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OrderNo", scope = OrderResponse.class)
    public JAXBElement<String> createOrderResponseOrderNo(String value) {
        return new JAXBElement<String>(_OrderResponseOrderNo_QNAME, String.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OrderSource", scope = OrderResponse.class)
    public JAXBElement<String> createOrderResponseOrderSource(String value) {
        return new JAXBElement<String>(_OrderResponseOrderSource_QNAME, String.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinType", scope = OrderResponse.class)
    public JAXBElement<String> createOrderResponseCheckinType(String value) {
        return new JAXBElement<String>(_OrderResponseCheckinType_QNAME, String.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PrePaymentTypeId", scope = OrderResponse.class)
    public JAXBElement<String> createOrderResponsePrePaymentTypeId(String value) {
        return new JAXBElement<String>(_OrderResponsePrePaymentTypeId_QNAME, String.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinIds", scope = CheckoutRequest.class)
    public JAXBElement<ArrayOflong> createCheckoutRequestCheckinIds(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_CheckoutRequestCheckinIds_QNAME, ArrayOflong.class, CheckoutRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinStatus", scope = CheckinGuestRequest.class)
    public JAXBElement<ArrayOfstring> createCheckinGuestRequestCheckinStatus(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CheckinGuestRequestCheckinStatus_QNAME, ArrayOfstring.class, CheckinGuestRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "BeginTime", scope = CheckinGuestRequest.class)
    public JAXBElement<XMLGregorianCalendar> createCheckinGuestRequestBeginTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CheckinGuestRequestBeginTime_QNAME, XMLGregorianCalendar.class, CheckinGuestRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OrderNo", scope = OrderAddResponse.class)
    public JAXBElement<String> createOrderAddResponseOrderNo(String value) {
        return new JAXBElement<String>(_OrderResponseOrderNo_QNAME, String.class, OrderAddResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinIds", scope = CheckinNetDoorRequest.class)
    public JAXBElement<ArrayOflong> createCheckinNetDoorRequestCheckinIds(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_CheckoutRequestCheckinIds_QNAME, ArrayOflong.class, CheckinNetDoorRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CVC", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCVC(String value) {
        return new JAXBElement<String>(_CreditCardCVC_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "BankName", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBankName(String value) {
        return new JAXBElement<String>(_CreditCardBankName_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "BankKey", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBankKey(String value) {
        return new JAXBElement<String>(_CreditCardBankKey_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "BeginValidTime", scope = CreditCard.class)
    public JAXBElement<XMLGregorianCalendar> createCreditCardBeginValidTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreditCardBeginValidTime_QNAME, XMLGregorianCalendar.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "AuthorizeId", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardAuthorizeId(String value) {
        return new JAXBElement<String>(_CreditCardAuthorizeId_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "EndValidTime", scope = CreditCard.class)
    public JAXBElement<XMLGregorianCalendar> createCreditCardEndValidTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreditCardEndValidTime_QNAME, XMLGregorianCalendar.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CardNumber", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardNumber(String value) {
        return new JAXBElement<String>(_CreditCardCardNumber_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomTypeId", scope = RoomPlan.class)
    public JAXBElement<String> createRoomPlanRoomTypeId(String value) {
        return new JAXBElement<String>(_RoomPlanRoomTypeId_QNAME, String.class, RoomPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Price", scope = RoomPlan.class)
    public JAXBElement<ArrayOfRoomPrice> createRoomPlanPrice(ArrayOfRoomPrice value) {
        return new JAXBElement<ArrayOfRoomPrice>(_RoomPlanPrice_QNAME, ArrayOfRoomPrice.class, RoomPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomType", scope = RoomPlan.class)
    public JAXBElement<RoomType> createRoomPlanRoomType(RoomType value) {
        return new JAXBElement<RoomType>(_RoomType_QNAME, RoomType.class, RoomPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomTypeId", scope = RoomPrice.class)
    public JAXBElement<String> createRoomPriceRoomTypeId(String value) {
        return new JAXBElement<String>(_RoomPlanRoomTypeId_QNAME, String.class, RoomPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomType", scope = RoomPrice.class)
    public JAXBElement<RoomType> createRoomPriceRoomType(RoomType value) {
        return new JAXBElement<RoomType>(_RoomType_QNAME, RoomType.class, RoomPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Description", scope = RoomPrice.class)
    public JAXBElement<String> createRoomPriceDescription(String value) {
        return new JAXBElement<String>(_PromotionPolicyResponseDescription_QNAME, String.class, RoomPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Keywords", scope = SearchRequest.class)
    public JAXBElement<String> createSearchRequestKeywords(String value) {
        return new JAXBElement<String>(_SearchRequestKeywords_QNAME, String.class, SearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PageIndex", scope = SearchRequest.class)
    public JAXBElement<Integer> createSearchRequestPageIndex(Integer value) {
        return new JAXBElement<Integer>(_SearchRequestPageIndex_QNAME, Integer.class, SearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OrderStatusIds", scope = SearchRequest.class)
    public JAXBElement<ArrayOfstring> createSearchRequestOrderStatusIds(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_SearchRequestOrderStatusIds_QNAME, ArrayOfstring.class, SearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PageSize", scope = SearchRequest.class)
    public JAXBElement<Integer> createSearchRequestPageSize(Integer value) {
        return new JAXBElement<Integer>(_SearchRequestPageSize_QNAME, Integer.class, SearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "EndArriveTime", scope = SearchRequest.class)
    public JAXBElement<XMLGregorianCalendar> createSearchRequestEndArriveTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SearchRequestEndArriveTime_QNAME, XMLGregorianCalendar.class, SearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "HotelId", scope = SearchRequest.class)
    public JAXBElement<Long> createSearchRequestHotelId(Long value) {
        return new JAXBElement<Long>(_SearchRequestHotelId_QNAME, Long.class, SearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Channel", scope = SearchRequest.class)
    public JAXBElement<String> createSearchRequestChannel(String value) {
        return new JAXBElement<String>(_CheckinResponseChannel_QNAME, String.class, SearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "BeginArriveTime", scope = SearchRequest.class)
    public JAXBElement<XMLGregorianCalendar> createSearchRequestBeginArriveTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SearchRequestBeginArriveTime_QNAME, XMLGregorianCalendar.class, SearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "IsExtenalPrice", scope = OrderAddRequest.class)
    public JAXBElement<Boolean> createOrderAddRequestIsExtenalPrice(Boolean value) {
        return new JAXBElement<Boolean>(_OrderAddRequestIsExtenalPrice_QNAME, Boolean.class, OrderAddRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomPlans", scope = OrderAddRequest.class)
    public JAXBElement<ArrayOfRoomPlan> createOrderAddRequestRoomPlans(ArrayOfRoomPlan value) {
        return new JAXBElement<ArrayOfRoomPlan>(_OrderResponseRoomPlans_QNAME, ArrayOfRoomPlan.class, OrderAddRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "MemberId", scope = OrderAddRequest.class)
    public JAXBElement<String> createOrderAddRequestMemberId(String value) {
        return new JAXBElement<String>(_OrderResponseMemberId_QNAME, String.class, OrderAddRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGuest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Guests", scope = OrderAddRequest.class)
    public JAXBElement<ArrayOfGuest> createOrderAddRequestGuests(ArrayOfGuest value) {
        return new JAXBElement<ArrayOfGuest>(_OrderResponseGuests_QNAME, ArrayOfGuest.class, OrderAddRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLiaison }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Liaisons", scope = OrderAddRequest.class)
    public JAXBElement<ArrayOfLiaison> createOrderAddRequestLiaisons(ArrayOfLiaison value) {
        return new JAXBElement<ArrayOfLiaison>(_OrderResponseLiaisons_QNAME, ArrayOfLiaison.class, OrderAddRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ExternalPriceName", scope = OrderAddRequest.class)
    public JAXBElement<String> createOrderAddRequestExternalPriceName(String value) {
        return new JAXBElement<String>(_OrderAddRequestExternalPriceName_QNAME, String.class, OrderAddRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderItemRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OrderItemRequests", scope = OrderAddRequest.class)
    public JAXBElement<ArrayOfOrderItemRequest> createOrderAddRequestOrderItemRequests(ArrayOfOrderItemRequest value) {
        return new JAXBElement<ArrayOfOrderItemRequest>(_OrderAddRequestOrderItemRequests_QNAME, ArrayOfOrderItemRequest.class, OrderAddRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "SalerId", scope = OrderAddRequest.class)
    public JAXBElement<String> createOrderAddRequestSalerId(String value) {
        return new JAXBElement<String>(_OrderAddRequestSalerId_QNAME, String.class, OrderAddRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ExpireKeepTime", scope = OrderAddRequest.class)
    public JAXBElement<XMLGregorianCalendar> createOrderAddRequestExpireKeepTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrderResponseExpireKeepTime_QNAME, XMLGregorianCalendar.class, OrderAddRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PublicMemo", scope = OrderAddRequest.class)
    public JAXBElement<String> createOrderAddRequestPublicMemo(String value) {
        return new JAXBElement<String>(_OrderResponsePublicMemo_QNAME, String.class, OrderAddRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PrePaymentTypeId", scope = OrderAddRequest.class)
    public JAXBElement<String> createOrderAddRequestPrePaymentTypeId(String value) {
        return new JAXBElement<String>(_OrderResponsePrePaymentTypeId_QNAME, String.class, OrderAddRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Abbreviation", scope = RoomType.class)
    public JAXBElement<String> createRoomTypeAbbreviation(String value) {
        return new JAXBElement<String>(_RoomTypeAbbreviation_QNAME, String.class, RoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "HotelRoomTypeDescription", scope = RoomType.class)
    public JAXBElement<String> createRoomTypeHotelRoomTypeDescription(String value) {
        return new JAXBElement<String>(_RoomTypeHotelRoomTypeDescription_QNAME, String.class, RoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Id", scope = RoomType.class)
    public JAXBElement<String> createRoomTypeId(String value) {
        return new JAXBElement<String>(_RoomTypeId_QNAME, String.class, RoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PhysicalRoomTypeId", scope = RoomType.class)
    public JAXBElement<String> createRoomTypePhysicalRoomTypeId(String value) {
        return new JAXBElement<String>(_OccupationResponsePhysicalRoomTypeId_QNAME, String.class, RoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ImageUris", scope = RoomType.class)
    public JAXBElement<String> createRoomTypeImageUris(String value) {
        return new JAXBElement<String>(_RoomTypeImageUris_QNAME, String.class, RoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "BedType", scope = RoomType.class)
    public JAXBElement<String> createRoomTypeBedType(String value) {
        return new JAXBElement<String>(_RoomTypeBedType_QNAME, String.class, RoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "BedAmount", scope = RoomType.class)
    public JAXBElement<Integer> createRoomTypeBedAmount(Integer value) {
        return new JAXBElement<Integer>(_RoomTypeBedAmount_QNAME, Integer.class, RoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomTypeName", scope = RoomType.class)
    public JAXBElement<String> createRoomTypeRoomTypeName(String value) {
        return new JAXBElement<String>(_RoomTypeRoomTypeName_QNAME, String.class, RoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Description", scope = RoomType.class)
    public JAXBElement<String> createRoomTypeDescription(String value) {
        return new JAXBElement<String>(_PromotionPolicyResponseDescription_QNAME, String.class, RoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "City", scope = CheckinGuestResponse.class)
    public JAXBElement<String> createCheckinGuestResponseCity(String value) {
        return new JAXBElement<String>(_CheckinGuestResponseCity_QNAME, String.class, CheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Nationality", scope = CheckinGuestResponse.class)
    public JAXBElement<String> createCheckinGuestResponseNationality(String value) {
        return new JAXBElement<String>(_GuestNationality_QNAME, String.class, CheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckoutTime", scope = CheckinGuestResponse.class)
    public JAXBElement<XMLGregorianCalendar> createCheckinGuestResponseCheckoutTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CheckinGuestResponseCheckoutTime_QNAME, XMLGregorianCalendar.class, CheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Country", scope = CheckinGuestResponse.class)
    public JAXBElement<String> createCheckinGuestResponseCountry(String value) {
        return new JAXBElement<String>(_CheckinGuestResponseCountry_QNAME, String.class, CheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Province", scope = CheckinGuestResponse.class)
    public JAXBElement<String> createCheckinGuestResponseProvince(String value) {
        return new JAXBElement<String>(_CheckinGuestResponseProvince_QNAME, String.class, CheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Race", scope = CheckinGuestResponse.class)
    public JAXBElement<String> createCheckinGuestResponseRace(String value) {
        return new JAXBElement<String>(_CheckinGuestResponseRace_QNAME, String.class, CheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomNo", scope = CheckinGuestResponse.class)
    public JAXBElement<String> createCheckinGuestResponseRoomNo(String value) {
        return new JAXBElement<String>(_CheckinGuestResponseRoomNo_QNAME, String.class, CheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "IDCardNo", scope = CheckinGuestResponse.class)
    public JAXBElement<String> createCheckinGuestResponseIDCardNo(String value) {
        return new JAXBElement<String>(_CheckinGuestResponseIDCardNo_QNAME, String.class, CheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "IDCardTypeId", scope = CheckinGuestResponse.class)
    public JAXBElement<String> createCheckinGuestResponseIDCardTypeId(String value) {
        return new JAXBElement<String>(_CheckinGuestResponseIDCardTypeId_QNAME, String.class, CheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Address", scope = CheckinGuestResponse.class)
    public JAXBElement<String> createCheckinGuestResponseAddress(String value) {
        return new JAXBElement<String>(_CheckinGuestResponseAddress_QNAME, String.class, CheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Gender", scope = CheckinGuestResponse.class)
    public JAXBElement<Short> createCheckinGuestResponseGender(Short value) {
        return new JAXBElement<Short>(_GuestGender_QNAME, Short.class, CheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "StatusId", scope = CheckinGuestResponse.class)
    public JAXBElement<String> createCheckinGuestResponseStatusId(String value) {
        return new JAXBElement<String>(_CheckinGuestResponseStatusId_QNAME, String.class, CheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Birthday", scope = CheckinGuestResponse.class)
    public JAXBElement<XMLGregorianCalendar> createCheckinGuestResponseBirthday(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CheckinGuestResponseBirthday_QNAME, XMLGregorianCalendar.class, CheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinTime", scope = CheckinGuestResponse.class)
    public JAXBElement<XMLGregorianCalendar> createCheckinGuestResponseCheckinTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CheckinGuestResponseCheckinTime_QNAME, XMLGregorianCalendar.class, CheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "GuestName", scope = CheckinGuestResponse.class)
    public JAXBElement<String> createCheckinGuestResponseGuestName(String value) {
        return new JAXBElement<String>(_CheckinGuestResponseGuestName_QNAME, String.class, CheckinGuestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Customer", scope = CheckinRequest.class)
    public JAXBElement<CustomerRequest> createCheckinRequestCustomer(CustomerRequest value) {
        return new JAXBElement<CustomerRequest>(_CheckinRequestCustomer_QNAME, CustomerRequest.class, CheckinRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Mobile", scope = Liaison.class)
    public JAXBElement<String> createLiaisonMobile(String value) {
        return new JAXBElement<String>(_GuestMobile_QNAME, String.class, Liaison.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Gender", scope = Liaison.class)
    public JAXBElement<Short> createLiaisonGender(Short value) {
        return new JAXBElement<Short>(_GuestGender_QNAME, Short.class, Liaison.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Fax", scope = Liaison.class)
    public JAXBElement<String> createLiaisonFax(String value) {
        return new JAXBElement<String>(_GuestFax_QNAME, String.class, Liaison.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Email", scope = Liaison.class)
    public JAXBElement<String> createLiaisonEmail(String value) {
        return new JAXBElement<String>(_GuestEmail_QNAME, String.class, Liaison.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Phone", scope = Liaison.class)
    public JAXBElement<String> createLiaisonPhone(String value) {
        return new JAXBElement<String>(_GuestPhone_QNAME, String.class, Liaison.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Name", scope = Liaison.class)
    public JAXBElement<String> createLiaisonName(String value) {
        return new JAXBElement<String>(_GuestName_QNAME, String.class, Liaison.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "MemberId", scope = GetOrdersByMemberIdRequest.class)
    public JAXBElement<String> createGetOrdersByMemberIdRequestMemberId(String value) {
        return new JAXBElement<String>(_OrderResponseMemberId_QNAME, String.class, GetOrdersByMemberIdRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PageIndex", scope = GetOrdersByMemberIdRequest.class)
    public JAXBElement<Integer> createGetOrdersByMemberIdRequestPageIndex(Integer value) {
        return new JAXBElement<Integer>(_SearchRequestPageIndex_QNAME, Integer.class, GetOrdersByMemberIdRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OrderStatusIds", scope = GetOrdersByMemberIdRequest.class)
    public JAXBElement<ArrayOfstring> createGetOrdersByMemberIdRequestOrderStatusIds(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_SearchRequestOrderStatusIds_QNAME, ArrayOfstring.class, GetOrdersByMemberIdRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PageSize", scope = GetOrdersByMemberIdRequest.class)
    public JAXBElement<Integer> createGetOrdersByMemberIdRequestPageSize(Integer value) {
        return new JAXBElement<Integer>(_SearchRequestPageSize_QNAME, Integer.class, GetOrdersByMemberIdRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Reason", scope = OrderCancelRequest.class)
    public JAXBElement<String> createOrderCancelRequestReason(String value) {
        return new JAXBElement<String>(_ChangeStayRequestReason_QNAME, String.class, OrderCancelRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "MemberId", scope = CheckinSearchRequest.class)
    public JAXBElement<String> createCheckinSearchRequestMemberId(String value) {
        return new JAXBElement<String>(_OrderResponseMemberId_QNAME, String.class, CheckinSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PageIndex", scope = CheckinSearchRequest.class)
    public JAXBElement<Integer> createCheckinSearchRequestPageIndex(Integer value) {
        return new JAXBElement<Integer>(_SearchRequestPageIndex_QNAME, Integer.class, CheckinSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinStatus", scope = CheckinSearchRequest.class)
    public JAXBElement<ArrayOfstring> createCheckinSearchRequestCheckinStatus(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CheckinGuestRequestCheckinStatus_QNAME, ArrayOfstring.class, CheckinSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomNumbers", scope = CheckinSearchRequest.class)
    public JAXBElement<ArrayOfstring> createCheckinSearchRequestRoomNumbers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CheckinSearchRequestRoomNumbers_QNAME, ArrayOfstring.class, CheckinSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OccupationIds", scope = CheckinSearchRequest.class)
    public JAXBElement<ArrayOflong> createCheckinSearchRequestOccupationIds(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_CheckinSearchRequestOccupationIds_QNAME, ArrayOflong.class, CheckinSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PageSize", scope = CheckinSearchRequest.class)
    public JAXBElement<Integer> createCheckinSearchRequestPageSize(Integer value) {
        return new JAXBElement<Integer>(_SearchRequestPageSize_QNAME, Integer.class, CheckinSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinIds", scope = CheckinSearchRequest.class)
    public JAXBElement<ArrayOflong> createCheckinSearchRequestCheckinIds(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_CheckoutRequestCheckinIds_QNAME, ArrayOflong.class, CheckinSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "MemberCardId", scope = CheckinSearchRequest.class)
    public JAXBElement<String> createCheckinSearchRequestMemberCardId(String value) {
        return new JAXBElement<String>(_CheckinSearchRequestMemberCardId_QNAME, String.class, CheckinSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OrderIds", scope = CheckinSearchRequest.class)
    public JAXBElement<ArrayOflong> createCheckinSearchRequestOrderIds(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_CheckinSearchRequestOrderIds_QNAME, ArrayOflong.class, CheckinSearchRequest.class, value);
    }

}
