
package com.rose.mps.domain.hotel.publicservice.model;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import com.rose.mps.domain.hotel.publicservice.ArrayOfOrderByRequest;
import com.rose.mps.domain.hotel.publicservice.CheckinType;
import com.rose.mps.domain.hotel.publicservice.OrderSource;
import com.rose.mps.domain.hotel.serialization.array.ArrayOfint;
import com.rose.mps.domain.hotel.serialization.array.ArrayOflong;
import com.rose.mps.domain.hotel.serialization.array.ArrayOfstring;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rose.domain.publicservice_model package. 
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

    private final static QName _HotelSearchResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "HotelSearchResponse");
    private final static QName _FloorResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "FloorResponse");
    private final static QName _RoomCount_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomCount");
    private final static QName _OwnerConfig_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Common", "OwnerConfig");
    private final static QName _ArrayOfHotelServiceTag_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfHotelServiceTag");
    private final static QName _ArrayOfOwnerConfig_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Common", "ArrayOfOwnerConfig");
    private final static QName _HotelSearchRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "HotelSearchRequest");
    private final static QName _RoomType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomType");
    private final static QName _ArrayOfRoomCount_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfRoomCount");
    private final static QName _RoomPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomPrice");
    private final static QName _HotelLocationUpdateRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "HotelLocationUpdateRequest");
    private final static QName _RoomRemarkResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomRemarkResponse");
    private final static QName _RoomRemarkSearchRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomRemarkSearchRequest");
    private final static QName _ArrayOfRoom_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfRoom");
    private final static QName _ArrayOfHotelSearchResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfHotelSearchResponse");
    private final static QName _ArrayOfRoomRemarkResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfRoomRemarkResponse");
    private final static QName _HotelServiceTag_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "HotelServiceTag");
    private final static QName _SearchAvailiableRooms_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "SearchAvailiableRooms");
    private final static QName _Room_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Room");
    private final static QName _ArrayOfRoomType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfRoomType");
    private final static QName _ArrayOfFloorResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfFloorResponse");
    private final static QName _ArrayOfRoomPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ArrayOfRoomPrice");
    private final static QName _RoomRemarkAddRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomRemarkAddRequest");
    private final static QName _HotelLocationUpdateRequestWeChatLocationId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "WeChatLocationId");
    private final static QName _OwnerConfigName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Common", "Name");
    private final static QName _OwnerConfigDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Common", "Description");
    private final static QName _OwnerConfigKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Common", "Key");
    private final static QName _HotelSearchResponseRoomCounts_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomCounts");
    private final static QName _HotelSearchResponseDecorationDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "DecorationDate");
    private final static QName _HotelSearchResponseCanNetOpen_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CanNetOpen");
    private final static QName _HotelSearchResponseFax_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Fax");
    private final static QName _HotelSearchResponsePhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Phone");
    private final static QName _HotelSearchResponseCityId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CityId");
    private final static QName _HotelSearchResponseDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Description");
    private final static QName _HotelSearchResponseHotelNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "HotelNo");
    private final static QName _HotelSearchResponseSpecialPrices_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "SpecialPrices");
    private final static QName _HotelSearchResponseBrand_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Brand");
    private final static QName _HotelSearchResponseLongitude_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Longitude");
    private final static QName _HotelSearchResponseOpeningDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OpeningDate");
    private final static QName _HotelSearchResponseLatitude_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Latitude");
    private final static QName _HotelSearchResponseImageUris_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ImageUris");
    private final static QName _HotelSearchResponseStar_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Star");
    private final static QName _HotelSearchResponseServiceTags_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ServiceTags");
    private final static QName _HotelSearchResponseAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Address");
    private final static QName _HotelSearchResponseDetailPrices_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "DetailPrices");
    private final static QName _HotelSearchResponseLowestPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "LowestPrice");
    private final static QName _HotelSearchResponseSpecialRoomCounts_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "SpecialRoomCounts");
    private final static QName _HotelSearchResponseName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Name");
    private final static QName _HotelSearchResponseHotelInfoType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "HotelInfoType");
    private final static QName _SearchAvailiableRoomsFloorIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "FloorIds");
    private final static QName _SearchAvailiableRoomsHallIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "HallIds");
    private final static QName _SearchAvailiableRoomsRoomAttributeIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomAttributeIds");
    private final static QName _SearchAvailiableRoomsRoomTypeIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomTypeIds");
    private final static QName _RoomTypeAbbreviation_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Abbreviation");
    private final static QName _RoomTypeHotelRoomTypeDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "HotelRoomTypeDescription");
    private final static QName _RoomTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Id");
    private final static QName _RoomTypePhysicalRoomTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "PhysicalRoomTypeId");
    private final static QName _RoomTypeBedType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "BedType");
    private final static QName _RoomTypeBedAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "BedAmount");
    private final static QName _RoomTypeRoomTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomTypeName");
    private final static QName _HotelServiceTagServiceKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ServiceKey");
    private final static QName _HotelServiceTagServiceName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ServiceName");
    private final static QName _RoomRemarkAddRequestRemark_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Remark");
    private final static QName _RoomRemarkAddRequestCleanScore_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CleanScore");
    private final static QName _RoomRemarkAddRequestFacilityScore_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "FacilityScore");
    private final static QName _RoomRemarkAddRequestServiceScore_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "ServiceScore");
    private final static QName _RoomRemarkAddRequestRoomNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomNumber");
    private final static QName _RoomPriceRoomTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "RoomTypeId");
    private final static QName _RoomRemarkSearchRequestPageIndex_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "PageIndex");
    private final static QName _RoomRemarkSearchRequestOccupationId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OccupationId");
    private final static QName _RoomRemarkSearchRequestPageSize_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "PageSize");
    private final static QName _RoomRemarkSearchRequestOrderId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OrderId");
    private final static QName _RoomRemarkSearchRequestCheckinId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckinId");
    private final static QName _FloorResponseHallName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "HallName");
    private final static QName _FloorResponseFloorName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "FloorName");
    private final static QName _RoomCountDetailCounts_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "DetailCounts");
    private final static QName _RoomMaintainBeginTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "MaintainBeginTime");
    private final static QName _RoomFloorId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "FloorId");
    private final static QName _RoomAttribute_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Attribute");
    private final static QName _RoomMaintainEndTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "MaintainEndTime");
    private final static QName _RoomHallId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "HallId");
    private final static QName _RoomMaintainMemo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "MaintainMemo");
    private final static QName _RoomStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Status");
    private final static QName _HotelSearchRequestMemberLevels_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "MemberLevels");
    private final static QName _HotelSearchRequestDistrictId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "DistrictId");
    private final static QName _HotelSearchRequestDistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Distance");
    private final static QName _HotelSearchRequestHotelName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "HotelName");
    private final static QName _HotelSearchRequestCommercialLocationId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CommercialLocationId");
    private final static QName _HotelSearchRequestHotelIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "HotelIds");
    private final static QName _HotelSearchRequestOrgSns_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OrgSns");
    private final static QName _HotelSearchRequestOrderByRequests_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "OrderByRequests");
    private final static QName _HotelSearchRequestSource_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "Source");
    private final static QName _HotelSearchRequestCheckinType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", "CheckinType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rose.domain.publicservice_model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfRoomPrice }
     * 
     */
    public ArrayOfRoomPrice createArrayOfRoomPrice() {
        return new ArrayOfRoomPrice();
    }

    /**
     * Create an instance of {@link ArrayOfHotelSearchResponse }
     * 
     */
    public ArrayOfHotelSearchResponse createArrayOfHotelSearchResponse() {
        return new ArrayOfHotelSearchResponse();
    }

    /**
     * Create an instance of {@link HotelLocationUpdateRequest }
     * 
     */
    public HotelLocationUpdateRequest createHotelLocationUpdateRequest() {
        return new HotelLocationUpdateRequest();
    }

    /**
     * Create an instance of {@link ArrayOfRoomType }
     * 
     */
    public ArrayOfRoomType createArrayOfRoomType() {
        return new ArrayOfRoomType();
    }

    /**
     * Create an instance of {@link OwnerConfig }
     * 
     */
    public OwnerConfig createOwnerConfig() {
        return new OwnerConfig();
    }

    /**
     * Create an instance of {@link HotelSearchResponse }
     * 
     */
    public HotelSearchResponse createHotelSearchResponse() {
        return new HotelSearchResponse();
    }

    /**
     * Create an instance of {@link SearchAvailiableRooms }
     * 
     */
    public SearchAvailiableRooms createSearchAvailiableRooms() {
        return new SearchAvailiableRooms();
    }

    /**
     * Create an instance of {@link RoomType }
     * 
     */
    public RoomType createRoomType() {
        return new RoomType();
    }

    /**
     * Create an instance of {@link ArrayOfRoomRemarkResponse }
     * 
     */
    public ArrayOfRoomRemarkResponse createArrayOfRoomRemarkResponse() {
        return new ArrayOfRoomRemarkResponse();
    }

    /**
     * Create an instance of {@link HotelServiceTag }
     * 
     */
    public HotelServiceTag createHotelServiceTag() {
        return new HotelServiceTag();
    }

    /**
     * Create an instance of {@link RoomRemarkAddRequest }
     * 
     */
    public RoomRemarkAddRequest createRoomRemarkAddRequest() {
        return new RoomRemarkAddRequest();
    }

    /**
     * Create an instance of {@link RoomRemarkResponse }
     * 
     */
    public RoomRemarkResponse createRoomRemarkResponse() {
        return new RoomRemarkResponse();
    }

    /**
     * Create an instance of {@link RoomPrice }
     * 
     */
    public RoomPrice createRoomPrice() {
        return new RoomPrice();
    }

    /**
     * Create an instance of {@link RoomRemarkSearchRequest }
     * 
     */
    public RoomRemarkSearchRequest createRoomRemarkSearchRequest() {
        return new RoomRemarkSearchRequest();
    }

    /**
     * Create an instance of {@link FloorResponse }
     * 
     */
    public FloorResponse createFloorResponse() {
        return new FloorResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRoomCount }
     * 
     */
    public ArrayOfRoomCount createArrayOfRoomCount() {
        return new ArrayOfRoomCount();
    }

    /**
     * Create an instance of {@link RoomCount }
     * 
     */
    public RoomCount createRoomCount() {
        return new RoomCount();
    }

    /**
     * Create an instance of {@link Room }
     * 
     */
    public Room createRoom() {
        return new Room();
    }

    /**
     * Create an instance of {@link ArrayOfRoom }
     * 
     */
    public ArrayOfRoom createArrayOfRoom() {
        return new ArrayOfRoom();
    }

    /**
     * Create an instance of {@link ArrayOfHotelServiceTag }
     * 
     */
    public ArrayOfHotelServiceTag createArrayOfHotelServiceTag() {
        return new ArrayOfHotelServiceTag();
    }

    /**
     * Create an instance of {@link ArrayOfOwnerConfig }
     * 
     */
    public ArrayOfOwnerConfig createArrayOfOwnerConfig() {
        return new ArrayOfOwnerConfig();
    }

    /**
     * Create an instance of {@link ArrayOfFloorResponse }
     * 
     */
    public ArrayOfFloorResponse createArrayOfFloorResponse() {
        return new ArrayOfFloorResponse();
    }

    /**
     * Create an instance of {@link HotelSearchRequest }
     * 
     */
    public HotelSearchRequest createHotelSearchRequest() {
        return new HotelSearchRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "HotelSearchResponse")
    public JAXBElement<HotelSearchResponse> createHotelSearchResponse(HotelSearchResponse value) {
        return new JAXBElement<HotelSearchResponse>(_HotelSearchResponse_QNAME, HotelSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FloorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "FloorResponse")
    public JAXBElement<FloorResponse> createFloorResponse(FloorResponse value) {
        return new JAXBElement<FloorResponse>(_FloorResponse_QNAME, FloorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomCount")
    public JAXBElement<RoomCount> createRoomCount(RoomCount value) {
        return new JAXBElement<RoomCount>(_RoomCount_QNAME, RoomCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Common", name = "OwnerConfig")
    public JAXBElement<OwnerConfig> createOwnerConfig(OwnerConfig value) {
        return new JAXBElement<OwnerConfig>(_OwnerConfig_QNAME, OwnerConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelServiceTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfHotelServiceTag")
    public JAXBElement<ArrayOfHotelServiceTag> createArrayOfHotelServiceTag(ArrayOfHotelServiceTag value) {
        return new JAXBElement<ArrayOfHotelServiceTag>(_ArrayOfHotelServiceTag_QNAME, ArrayOfHotelServiceTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOwnerConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Common", name = "ArrayOfOwnerConfig")
    public JAXBElement<ArrayOfOwnerConfig> createArrayOfOwnerConfig(ArrayOfOwnerConfig value) {
        return new JAXBElement<ArrayOfOwnerConfig>(_ArrayOfOwnerConfig_QNAME, ArrayOfOwnerConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "HotelSearchRequest")
    public JAXBElement<HotelSearchRequest> createHotelSearchRequest(HotelSearchRequest value) {
        return new JAXBElement<HotelSearchRequest>(_HotelSearchRequest_QNAME, HotelSearchRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfRoomCount")
    public JAXBElement<ArrayOfRoomCount> createArrayOfRoomCount(ArrayOfRoomCount value) {
        return new JAXBElement<ArrayOfRoomCount>(_ArrayOfRoomCount_QNAME, ArrayOfRoomCount.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelLocationUpdateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "HotelLocationUpdateRequest")
    public JAXBElement<HotelLocationUpdateRequest> createHotelLocationUpdateRequest(HotelLocationUpdateRequest value) {
        return new JAXBElement<HotelLocationUpdateRequest>(_HotelLocationUpdateRequest_QNAME, HotelLocationUpdateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomRemarkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomRemarkResponse")
    public JAXBElement<RoomRemarkResponse> createRoomRemarkResponse(RoomRemarkResponse value) {
        return new JAXBElement<RoomRemarkResponse>(_RoomRemarkResponse_QNAME, RoomRemarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomRemarkSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomRemarkSearchRequest")
    public JAXBElement<RoomRemarkSearchRequest> createRoomRemarkSearchRequest(RoomRemarkSearchRequest value) {
        return new JAXBElement<RoomRemarkSearchRequest>(_RoomRemarkSearchRequest_QNAME, RoomRemarkSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfRoom")
    public JAXBElement<ArrayOfRoom> createArrayOfRoom(ArrayOfRoom value) {
        return new JAXBElement<ArrayOfRoom>(_ArrayOfRoom_QNAME, ArrayOfRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfHotelSearchResponse")
    public JAXBElement<ArrayOfHotelSearchResponse> createArrayOfHotelSearchResponse(ArrayOfHotelSearchResponse value) {
        return new JAXBElement<ArrayOfHotelSearchResponse>(_ArrayOfHotelSearchResponse_QNAME, ArrayOfHotelSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomRemarkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfRoomRemarkResponse")
    public JAXBElement<ArrayOfRoomRemarkResponse> createArrayOfRoomRemarkResponse(ArrayOfRoomRemarkResponse value) {
        return new JAXBElement<ArrayOfRoomRemarkResponse>(_ArrayOfRoomRemarkResponse_QNAME, ArrayOfRoomRemarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelServiceTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "HotelServiceTag")
    public JAXBElement<HotelServiceTag> createHotelServiceTag(HotelServiceTag value) {
        return new JAXBElement<HotelServiceTag>(_HotelServiceTag_QNAME, HotelServiceTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAvailiableRooms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "SearchAvailiableRooms")
    public JAXBElement<SearchAvailiableRooms> createSearchAvailiableRooms(SearchAvailiableRooms value) {
        return new JAXBElement<SearchAvailiableRooms>(_SearchAvailiableRooms_QNAME, SearchAvailiableRooms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Room }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Room")
    public JAXBElement<Room> createRoom(Room value) {
        return new JAXBElement<Room>(_Room_QNAME, Room.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfRoomType")
    public JAXBElement<ArrayOfRoomType> createArrayOfRoomType(ArrayOfRoomType value) {
        return new JAXBElement<ArrayOfRoomType>(_ArrayOfRoomType_QNAME, ArrayOfRoomType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFloorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ArrayOfFloorResponse")
    public JAXBElement<ArrayOfFloorResponse> createArrayOfFloorResponse(ArrayOfFloorResponse value) {
        return new JAXBElement<ArrayOfFloorResponse>(_ArrayOfFloorResponse_QNAME, ArrayOfFloorResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomRemarkAddRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomRemarkAddRequest")
    public JAXBElement<RoomRemarkAddRequest> createRoomRemarkAddRequest(RoomRemarkAddRequest value) {
        return new JAXBElement<RoomRemarkAddRequest>(_RoomRemarkAddRequest_QNAME, RoomRemarkAddRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "WeChatLocationId", scope = HotelLocationUpdateRequest.class)
    public JAXBElement<String> createHotelLocationUpdateRequestWeChatLocationId(String value) {
        return new JAXBElement<String>(_HotelLocationUpdateRequestWeChatLocationId_QNAME, String.class, HotelLocationUpdateRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Common", name = "Name", scope = OwnerConfig.class)
    public JAXBElement<String> createOwnerConfigName(String value) {
        return new JAXBElement<String>(_OwnerConfigName_QNAME, String.class, OwnerConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Common", name = "Description", scope = OwnerConfig.class)
    public JAXBElement<String> createOwnerConfigDescription(String value) {
        return new JAXBElement<String>(_OwnerConfigDescription_QNAME, String.class, OwnerConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Common", name = "Key", scope = OwnerConfig.class)
    public JAXBElement<String> createOwnerConfigKey(String value) {
        return new JAXBElement<String>(_OwnerConfigKey_QNAME, String.class, OwnerConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomCounts", scope = HotelSearchResponse.class)
    public JAXBElement<ArrayOfRoomCount> createHotelSearchResponseRoomCounts(ArrayOfRoomCount value) {
        return new JAXBElement<ArrayOfRoomCount>(_HotelSearchResponseRoomCounts_QNAME, ArrayOfRoomCount.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "DecorationDate", scope = HotelSearchResponse.class)
    public JAXBElement<XMLGregorianCalendar> createHotelSearchResponseDecorationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_HotelSearchResponseDecorationDate_QNAME, XMLGregorianCalendar.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "WeChatLocationId", scope = HotelSearchResponse.class)
    public JAXBElement<String> createHotelSearchResponseWeChatLocationId(String value) {
        return new JAXBElement<String>(_HotelLocationUpdateRequestWeChatLocationId_QNAME, String.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CanNetOpen", scope = HotelSearchResponse.class)
    public JAXBElement<Boolean> createHotelSearchResponseCanNetOpen(Boolean value) {
        return new JAXBElement<Boolean>(_HotelSearchResponseCanNetOpen_QNAME, Boolean.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Fax", scope = HotelSearchResponse.class)
    public JAXBElement<String> createHotelSearchResponseFax(String value) {
        return new JAXBElement<String>(_HotelSearchResponseFax_QNAME, String.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Phone", scope = HotelSearchResponse.class)
    public JAXBElement<String> createHotelSearchResponsePhone(String value) {
        return new JAXBElement<String>(_HotelSearchResponsePhone_QNAME, String.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CityId", scope = HotelSearchResponse.class)
    public JAXBElement<String> createHotelSearchResponseCityId(String value) {
        return new JAXBElement<String>(_HotelSearchResponseCityId_QNAME, String.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Description", scope = HotelSearchResponse.class)
    public JAXBElement<String> createHotelSearchResponseDescription(String value) {
        return new JAXBElement<String>(_HotelSearchResponseDescription_QNAME, String.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "HotelNo", scope = HotelSearchResponse.class)
    public JAXBElement<String> createHotelSearchResponseHotelNo(String value) {
        return new JAXBElement<String>(_HotelSearchResponseHotelNo_QNAME, String.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "SpecialPrices", scope = HotelSearchResponse.class)
    public JAXBElement<ArrayOfRoomPrice> createHotelSearchResponseSpecialPrices(ArrayOfRoomPrice value) {
        return new JAXBElement<ArrayOfRoomPrice>(_HotelSearchResponseSpecialPrices_QNAME, ArrayOfRoomPrice.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Brand", scope = HotelSearchResponse.class)
    public JAXBElement<String> createHotelSearchResponseBrand(String value) {
        return new JAXBElement<String>(_HotelSearchResponseBrand_QNAME, String.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Longitude", scope = HotelSearchResponse.class)
    public JAXBElement<BigDecimal> createHotelSearchResponseLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HotelSearchResponseLongitude_QNAME, BigDecimal.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OpeningDate", scope = HotelSearchResponse.class)
    public JAXBElement<XMLGregorianCalendar> createHotelSearchResponseOpeningDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_HotelSearchResponseOpeningDate_QNAME, XMLGregorianCalendar.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Latitude", scope = HotelSearchResponse.class)
    public JAXBElement<BigDecimal> createHotelSearchResponseLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HotelSearchResponseLatitude_QNAME, BigDecimal.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ImageUris", scope = HotelSearchResponse.class)
    public JAXBElement<String> createHotelSearchResponseImageUris(String value) {
        return new JAXBElement<String>(_HotelSearchResponseImageUris_QNAME, String.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Star", scope = HotelSearchResponse.class)
    public JAXBElement<Integer> createHotelSearchResponseStar(Integer value) {
        return new JAXBElement<Integer>(_HotelSearchResponseStar_QNAME, Integer.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ServiceTags", scope = HotelSearchResponse.class)
    public JAXBElement<ArrayOfstring> createHotelSearchResponseServiceTags(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_HotelSearchResponseServiceTags_QNAME, ArrayOfstring.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Address", scope = HotelSearchResponse.class)
    public JAXBElement<String> createHotelSearchResponseAddress(String value) {
        return new JAXBElement<String>(_HotelSearchResponseAddress_QNAME, String.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "DetailPrices", scope = HotelSearchResponse.class)
    public JAXBElement<ArrayOfRoomPrice> createHotelSearchResponseDetailPrices(ArrayOfRoomPrice value) {
        return new JAXBElement<ArrayOfRoomPrice>(_HotelSearchResponseDetailPrices_QNAME, ArrayOfRoomPrice.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "LowestPrice", scope = HotelSearchResponse.class)
    public JAXBElement<ArrayOfRoomPrice> createHotelSearchResponseLowestPrice(ArrayOfRoomPrice value) {
        return new JAXBElement<ArrayOfRoomPrice>(_HotelSearchResponseLowestPrice_QNAME, ArrayOfRoomPrice.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "SpecialRoomCounts", scope = HotelSearchResponse.class)
    public JAXBElement<ArrayOfRoomCount> createHotelSearchResponseSpecialRoomCounts(ArrayOfRoomCount value) {
        return new JAXBElement<ArrayOfRoomCount>(_HotelSearchResponseSpecialRoomCounts_QNAME, ArrayOfRoomCount.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Name", scope = HotelSearchResponse.class)
    public JAXBElement<String> createHotelSearchResponseName(String value) {
        return new JAXBElement<String>(_HotelSearchResponseName_QNAME, String.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "HotelInfoType", scope = HotelSearchResponse.class)
    public JAXBElement<String> createHotelSearchResponseHotelInfoType(String value) {
        return new JAXBElement<String>(_HotelSearchResponseHotelInfoType_QNAME, String.class, HotelSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "FloorIds", scope = SearchAvailiableRooms.class)
    public JAXBElement<ArrayOflong> createSearchAvailiableRoomsFloorIds(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SearchAvailiableRoomsFloorIds_QNAME, ArrayOflong.class, SearchAvailiableRooms.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "HallIds", scope = SearchAvailiableRooms.class)
    public JAXBElement<ArrayOflong> createSearchAvailiableRoomsHallIds(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_SearchAvailiableRoomsHallIds_QNAME, ArrayOflong.class, SearchAvailiableRooms.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomAttributeIds", scope = SearchAvailiableRooms.class)
    public JAXBElement<ArrayOfstring> createSearchAvailiableRoomsRoomAttributeIds(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_SearchAvailiableRoomsRoomAttributeIds_QNAME, ArrayOfstring.class, SearchAvailiableRooms.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomTypeIds", scope = SearchAvailiableRooms.class)
    public JAXBElement<ArrayOfstring> createSearchAvailiableRoomsRoomTypeIds(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_SearchAvailiableRoomsRoomTypeIds_QNAME, ArrayOfstring.class, SearchAvailiableRooms.class, value);
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
        return new JAXBElement<String>(_RoomTypePhysicalRoomTypeId_QNAME, String.class, RoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ImageUris", scope = RoomType.class)
    public JAXBElement<String> createRoomTypeImageUris(String value) {
        return new JAXBElement<String>(_HotelSearchResponseImageUris_QNAME, String.class, RoomType.class, value);
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
        return new JAXBElement<String>(_HotelSearchResponseDescription_QNAME, String.class, RoomType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ServiceKey", scope = HotelServiceTag.class)
    public JAXBElement<String> createHotelServiceTagServiceKey(String value) {
        return new JAXBElement<String>(_HotelServiceTagServiceKey_QNAME, String.class, HotelServiceTag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ServiceName", scope = HotelServiceTag.class)
    public JAXBElement<String> createHotelServiceTagServiceName(String value) {
        return new JAXBElement<String>(_HotelServiceTagServiceName_QNAME, String.class, HotelServiceTag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Remark", scope = RoomRemarkAddRequest.class)
    public JAXBElement<String> createRoomRemarkAddRequestRemark(String value) {
        return new JAXBElement<String>(_RoomRemarkAddRequestRemark_QNAME, String.class, RoomRemarkAddRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CleanScore", scope = RoomRemarkAddRequest.class)
    public JAXBElement<Integer> createRoomRemarkAddRequestCleanScore(Integer value) {
        return new JAXBElement<Integer>(_RoomRemarkAddRequestCleanScore_QNAME, Integer.class, RoomRemarkAddRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "FacilityScore", scope = RoomRemarkAddRequest.class)
    public JAXBElement<Integer> createRoomRemarkAddRequestFacilityScore(Integer value) {
        return new JAXBElement<Integer>(_RoomRemarkAddRequestFacilityScore_QNAME, Integer.class, RoomRemarkAddRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ServiceScore", scope = RoomRemarkAddRequest.class)
    public JAXBElement<Integer> createRoomRemarkAddRequestServiceScore(Integer value) {
        return new JAXBElement<Integer>(_RoomRemarkAddRequestServiceScore_QNAME, Integer.class, RoomRemarkAddRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomNumber", scope = RoomRemarkAddRequest.class)
    public JAXBElement<String> createRoomRemarkAddRequestRoomNumber(String value) {
        return new JAXBElement<String>(_RoomRemarkAddRequestRoomNumber_QNAME, String.class, RoomRemarkAddRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Remark", scope = RoomRemarkResponse.class)
    public JAXBElement<String> createRoomRemarkResponseRemark(String value) {
        return new JAXBElement<String>(_RoomRemarkAddRequestRemark_QNAME, String.class, RoomRemarkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CleanScore", scope = RoomRemarkResponse.class)
    public JAXBElement<Integer> createRoomRemarkResponseCleanScore(Integer value) {
        return new JAXBElement<Integer>(_RoomRemarkAddRequestCleanScore_QNAME, Integer.class, RoomRemarkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "FacilityScore", scope = RoomRemarkResponse.class)
    public JAXBElement<Integer> createRoomRemarkResponseFacilityScore(Integer value) {
        return new JAXBElement<Integer>(_RoomRemarkAddRequestFacilityScore_QNAME, Integer.class, RoomRemarkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ServiceScore", scope = RoomRemarkResponse.class)
    public JAXBElement<Integer> createRoomRemarkResponseServiceScore(Integer value) {
        return new JAXBElement<Integer>(_RoomRemarkAddRequestServiceScore_QNAME, Integer.class, RoomRemarkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomNumber", scope = RoomRemarkResponse.class)
    public JAXBElement<String> createRoomRemarkResponseRoomNumber(String value) {
        return new JAXBElement<String>(_RoomRemarkAddRequestRoomNumber_QNAME, String.class, RoomRemarkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomTypeId", scope = RoomPrice.class)
    public JAXBElement<String> createRoomPriceRoomTypeId(String value) {
        return new JAXBElement<String>(_RoomPriceRoomTypeId_QNAME, String.class, RoomPrice.class, value);
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
        return new JAXBElement<String>(_HotelSearchResponseDescription_QNAME, String.class, RoomPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PageIndex", scope = RoomRemarkSearchRequest.class)
    public JAXBElement<Integer> createRoomRemarkSearchRequestPageIndex(Integer value) {
        return new JAXBElement<Integer>(_RoomRemarkSearchRequestPageIndex_QNAME, Integer.class, RoomRemarkSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OccupationId", scope = RoomRemarkSearchRequest.class)
    public JAXBElement<Long> createRoomRemarkSearchRequestOccupationId(Long value) {
        return new JAXBElement<Long>(_RoomRemarkSearchRequestOccupationId_QNAME, Long.class, RoomRemarkSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PageSize", scope = RoomRemarkSearchRequest.class)
    public JAXBElement<Integer> createRoomRemarkSearchRequestPageSize(Integer value) {
        return new JAXBElement<Integer>(_RoomRemarkSearchRequestPageSize_QNAME, Integer.class, RoomRemarkSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OrderId", scope = RoomRemarkSearchRequest.class)
    public JAXBElement<Long> createRoomRemarkSearchRequestOrderId(Long value) {
        return new JAXBElement<Long>(_RoomRemarkSearchRequestOrderId_QNAME, Long.class, RoomRemarkSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomNumber", scope = RoomRemarkSearchRequest.class)
    public JAXBElement<String> createRoomRemarkSearchRequestRoomNumber(String value) {
        return new JAXBElement<String>(_RoomRemarkAddRequestRoomNumber_QNAME, String.class, RoomRemarkSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinId", scope = RoomRemarkSearchRequest.class)
    public JAXBElement<Long> createRoomRemarkSearchRequestCheckinId(Long value) {
        return new JAXBElement<Long>(_RoomRemarkSearchRequestCheckinId_QNAME, Long.class, RoomRemarkSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "HallName", scope = FloorResponse.class)
    public JAXBElement<String> createFloorResponseHallName(String value) {
        return new JAXBElement<String>(_FloorResponseHallName_QNAME, String.class, FloorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "FloorName", scope = FloorResponse.class)
    public JAXBElement<String> createFloorResponseFloorName(String value) {
        return new JAXBElement<String>(_FloorResponseFloorName_QNAME, String.class, FloorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomTypeId", scope = RoomCount.class)
    public JAXBElement<String> createRoomCountRoomTypeId(String value) {
        return new JAXBElement<String>(_RoomPriceRoomTypeId_QNAME, String.class, RoomCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomType", scope = RoomCount.class)
    public JAXBElement<RoomType> createRoomCountRoomType(RoomType value) {
        return new JAXBElement<RoomType>(_RoomType_QNAME, RoomType.class, RoomCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "DetailCounts", scope = RoomCount.class)
    public JAXBElement<ArrayOfint> createRoomCountDetailCounts(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_RoomCountDetailCounts_QNAME, ArrayOfint.class, RoomCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "MaintainBeginTime", scope = Room.class)
    public JAXBElement<XMLGregorianCalendar> createRoomMaintainBeginTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RoomMaintainBeginTime_QNAME, XMLGregorianCalendar.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "FloorId", scope = Room.class)
    public JAXBElement<Long> createRoomFloorId(Long value) {
        return new JAXBElement<Long>(_RoomFloorId_QNAME, Long.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Attribute", scope = Room.class)
    public JAXBElement<String> createRoomAttribute(String value) {
        return new JAXBElement<String>(_RoomAttribute_QNAME, String.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ImageUris", scope = Room.class)
    public JAXBElement<String> createRoomImageUris(String value) {
        return new JAXBElement<String>(_HotelSearchResponseImageUris_QNAME, String.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CanNetOpen", scope = Room.class)
    public JAXBElement<Boolean> createRoomCanNetOpen(Boolean value) {
        return new JAXBElement<Boolean>(_HotelSearchResponseCanNetOpen_QNAME, Boolean.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomTypeId", scope = Room.class)
    public JAXBElement<String> createRoomRoomTypeId(String value) {
        return new JAXBElement<String>(_RoomPriceRoomTypeId_QNAME, String.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Description", scope = Room.class)
    public JAXBElement<String> createRoomDescription(String value) {
        return new JAXBElement<String>(_HotelSearchResponseDescription_QNAME, String.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "MaintainEndTime", scope = Room.class)
    public JAXBElement<XMLGregorianCalendar> createRoomMaintainEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RoomMaintainEndTime_QNAME, XMLGregorianCalendar.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "HallId", scope = Room.class)
    public JAXBElement<Long> createRoomHallId(Long value) {
        return new JAXBElement<Long>(_RoomHallId_QNAME, Long.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "MaintainMemo", scope = Room.class)
    public JAXBElement<String> createRoomMaintainMemo(String value) {
        return new JAXBElement<String>(_RoomMaintainMemo_QNAME, String.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Status", scope = Room.class)
    public JAXBElement<String> createRoomStatus(String value) {
        return new JAXBElement<String>(_RoomStatus_QNAME, String.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomNumber", scope = Room.class)
    public JAXBElement<String> createRoomRoomNumber(String value) {
        return new JAXBElement<String>(_RoomRemarkAddRequestRoomNumber_QNAME, String.class, Room.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "MemberLevels", scope = HotelSearchRequest.class)
    public JAXBElement<ArrayOfstring> createHotelSearchRequestMemberLevels(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_HotelSearchRequestMemberLevels_QNAME, ArrayOfstring.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "DistrictId", scope = HotelSearchRequest.class)
    public JAXBElement<String> createHotelSearchRequestDistrictId(String value) {
        return new JAXBElement<String>(_HotelSearchRequestDistrictId_QNAME, String.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PageSize", scope = HotelSearchRequest.class)
    public JAXBElement<Integer> createHotelSearchRequestPageSize(Integer value) {
        return new JAXBElement<Integer>(_RoomRemarkSearchRequestPageSize_QNAME, Integer.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Distance", scope = HotelSearchRequest.class)
    public JAXBElement<Integer> createHotelSearchRequestDistance(Integer value) {
        return new JAXBElement<Integer>(_HotelSearchRequestDistance_QNAME, Integer.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CityId", scope = HotelSearchRequest.class)
    public JAXBElement<String> createHotelSearchRequestCityId(String value) {
        return new JAXBElement<String>(_HotelSearchResponseCityId_QNAME, String.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "HotelName", scope = HotelSearchRequest.class)
    public JAXBElement<String> createHotelSearchRequestHotelName(String value) {
        return new JAXBElement<String>(_HotelSearchRequestHotelName_QNAME, String.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "PageIndex", scope = HotelSearchRequest.class)
    public JAXBElement<Integer> createHotelSearchRequestPageIndex(Integer value) {
        return new JAXBElement<Integer>(_RoomRemarkSearchRequestPageIndex_QNAME, Integer.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CommercialLocationId", scope = HotelSearchRequest.class)
    public JAXBElement<String> createHotelSearchRequestCommercialLocationId(String value) {
        return new JAXBElement<String>(_HotelSearchRequestCommercialLocationId_QNAME, String.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Longitude", scope = HotelSearchRequest.class)
    public JAXBElement<BigDecimal> createHotelSearchRequestLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HotelSearchResponseLongitude_QNAME, BigDecimal.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "HotelIds", scope = HotelSearchRequest.class)
    public JAXBElement<ArrayOflong> createHotelSearchRequestHotelIds(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_HotelSearchRequestHotelIds_QNAME, ArrayOflong.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Latitude", scope = HotelSearchRequest.class)
    public JAXBElement<BigDecimal> createHotelSearchRequestLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HotelSearchResponseLatitude_QNAME, BigDecimal.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OrgSns", scope = HotelSearchRequest.class)
    public JAXBElement<ArrayOfstring> createHotelSearchRequestOrgSns(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_HotelSearchRequestOrgSns_QNAME, ArrayOfstring.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Star", scope = HotelSearchRequest.class)
    public JAXBElement<Integer> createHotelSearchRequestStar(Integer value) {
        return new JAXBElement<Integer>(_HotelSearchResponseStar_QNAME, Integer.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "ServiceTags", scope = HotelSearchRequest.class)
    public JAXBElement<ArrayOfstring> createHotelSearchRequestServiceTags(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_HotelSearchResponseServiceTags_QNAME, ArrayOfstring.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderByRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "OrderByRequests", scope = HotelSearchRequest.class)
    public JAXBElement<ArrayOfOrderByRequest> createHotelSearchRequestOrderByRequests(ArrayOfOrderByRequest value) {
        return new JAXBElement<ArrayOfOrderByRequest>(_HotelSearchRequestOrderByRequests_QNAME, ArrayOfOrderByRequest.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "Source", scope = HotelSearchRequest.class)
    public JAXBElement<OrderSource> createHotelSearchRequestSource(OrderSource value) {
        return new JAXBElement<OrderSource>(_HotelSearchRequestSource_QNAME, OrderSource.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "RoomTypeIds", scope = HotelSearchRequest.class)
    public JAXBElement<ArrayOfstring> createHotelSearchRequestRoomTypeIds(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_SearchAvailiableRoomsRoomTypeIds_QNAME, ArrayOfstring.class, HotelSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", name = "CheckinType", scope = HotelSearchRequest.class)
    public JAXBElement<CheckinType> createHotelSearchRequestCheckinType(CheckinType value) {
        return new JAXBElement<CheckinType>(_HotelSearchRequestCheckinType_QNAME, CheckinType.class, HotelSearchRequest.class, value);
    }

}
