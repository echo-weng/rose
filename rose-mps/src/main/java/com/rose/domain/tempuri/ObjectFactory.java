
package com.rose.domain.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.rose.domain.serialization.array.ArrayOflong;
import com.rose.domain.serialization.array.ArrayOfstring;
import com.rose.domain.publicservice.InvokeResult;
import com.rose.domain.publicservice.InvokeResultArrayOfFloorResponse;
import com.rose.domain.publicservice.InvokeResultArrayOfHotelSearchResponse;
import com.rose.domain.publicservice.InvokeResultArrayOfHotelServiceTag;
import com.rose.domain.publicservice.InvokeResultArrayOfOwnerConfig;
import com.rose.domain.publicservice.InvokeResultArrayOfRoom;
import com.rose.domain.publicservice.InvokeResultArrayOfRoomType;
import com.rose.domain.publicservice.InvokeResultBoolean;
import com.rose.domain.publicservice.InvokeResultInt;
import com.rose.domain.publicservice.InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns;
import com.rose.domain.publicservice.model.ArrayOfRoomType;
import com.rose.domain.publicservice.model.HotelLocationUpdateRequest;
import com.rose.domain.publicservice.model.HotelSearchRequest;
import com.rose.domain.publicservice.model.RoomRemarkAddRequest;
import com.rose.domain.publicservice.model.RoomRemarkSearchRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rose.domain.tempuri package. 
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

    private final static QName _GetRoomsResponseGetRoomsResult_QNAME = new QName("http://tempuri.org/", "GetRoomsResult");
    private final static QName _GetHotelRoomTypesResponseGetHotelRoomTypesResult_QNAME = new QName("http://tempuri.org/", "GetHotelRoomTypesResult");
    private final static QName _GetHotelsByHotelNosResponseGetHotelsByHotelNosResult_QNAME = new QName("http://tempuri.org/", "GetHotelsByHotelNosResult");
    private final static QName _GetAllHotelsSignature_QNAME = new QName("http://tempuri.org/", "signature");
    private final static QName _GetHotelsByHotelIdsResponseGetHotelsByHotelIdsResult_QNAME = new QName("http://tempuri.org/", "GetHotelsByHotelIdsResult");
    private final static QName _GetHotelBrandsResponseGetHotelBrandsResult_QNAME = new QName("http://tempuri.org/", "GetHotelBrandsResult");
    private final static QName _GetRoomTypesResponseGetRoomTypesResult_QNAME = new QName("http://tempuri.org/", "GetRoomTypesResult");
    private final static QName _SearchRoomRemarkRoomRemarkSearchRequest_QNAME = new QName("http://tempuri.org/", "roomRemarkSearchRequest");
    private final static QName _GetServiceTagsResponseGetServiceTagsResult_QNAME = new QName("http://tempuri.org/", "GetServiceTagsResult");
    private final static QName _AddRoomRemarkResponseAddRoomRemarkResult_QNAME = new QName("http://tempuri.org/", "AddRoomRemarkResult");
    private final static QName _SearchRoomRemarkResponseSearchRoomRemarkResult_QNAME = new QName("http://tempuri.org/", "SearchRoomRemarkResult");
    private final static QName _SearchSearchRequest_QNAME = new QName("http://tempuri.org/", "searchRequest");
    private final static QName _GetRoomsCountRoomStatus_QNAME = new QName("http://tempuri.org/", "roomStatus");
    private final static QName _GetSearchResultCountResponseGetSearchResultCountResult_QNAME = new QName("http://tempuri.org/", "GetSearchResultCountResult");
    private final static QName _AddRoomTypesResponseAddRoomTypesResult_QNAME = new QName("http://tempuri.org/", "AddRoomTypesResult");
    private final static QName _SearchAvailiableRoomsSearchAvailiableRoomModel_QNAME = new QName("http://tempuri.org/", "searchAvailiableRoomModel");
    private final static QName _UpdateHotelLocationIdHotelLocationUpdateRequest_QNAME = new QName("http://tempuri.org/", "hotelLocationUpdateRequest");
    private final static QName _GetHotelsByHotelIdsHotelIds_QNAME = new QName("http://tempuri.org/", "hotelIds");
    private final static QName _UpdateHotelLocationIdResponseUpdateHotelLocationIdResult_QNAME = new QName("http://tempuri.org/", "UpdateHotelLocationIdResult");
    private final static QName _GetFloorResponseGetFloorResult_QNAME = new QName("http://tempuri.org/", "GetFloorResult");
    private final static QName _SearchResponseSearchResult_QNAME = new QName("http://tempuri.org/", "SearchResult");
    private final static QName _GetHotelsByHotelNosHotelNos_QNAME = new QName("http://tempuri.org/", "hotelNos");
    private final static QName _AddRoomRemarkRoomRemarkAddRequest_QNAME = new QName("http://tempuri.org/", "roomRemarkAddRequest");
    private final static QName _GetAllHotelsResponseGetAllHotelsResult_QNAME = new QName("http://tempuri.org/", "GetAllHotelsResult");
    private final static QName _AddRoomTypesNewRoomTypes_QNAME = new QName("http://tempuri.org/", "newRoomTypes");
    private final static QName _GetRoomsCountResponseGetRoomsCountResult_QNAME = new QName("http://tempuri.org/", "GetRoomsCountResult");
    private final static QName _SearchAvailiableRoomsResponseSearchAvailiableRoomsResult_QNAME = new QName("http://tempuri.org/", "SearchAvailiableRoomsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rose.domain.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRoomsResponse }
     * 
     */
    public GetRoomsResponse createGetRoomsResponse() {
        return new GetRoomsResponse();
    }

    /**
     * Create an instance of {@link GetHotelRoomTypesResponse }
     * 
     */
    public GetHotelRoomTypesResponse createGetHotelRoomTypesResponse() {
        return new GetHotelRoomTypesResponse();
    }

    /**
     * Create an instance of {@link GetHotelsByHotelNosResponse }
     * 
     */
    public GetHotelsByHotelNosResponse createGetHotelsByHotelNosResponse() {
        return new GetHotelsByHotelNosResponse();
    }

    /**
     * Create an instance of {@link GetAllHotels }
     * 
     */
    public GetAllHotels createGetAllHotels() {
        return new GetAllHotels();
    }

    /**
     * Create an instance of {@link GetHotelsByHotelIdsResponse }
     * 
     */
    public GetHotelsByHotelIdsResponse createGetHotelsByHotelIdsResponse() {
        return new GetHotelsByHotelIdsResponse();
    }

    /**
     * Create an instance of {@link GetHotelBrandsResponse }
     * 
     */
    public GetHotelBrandsResponse createGetHotelBrandsResponse() {
        return new GetHotelBrandsResponse();
    }

    /**
     * Create an instance of {@link GetRoomTypesResponse }
     * 
     */
    public GetRoomTypesResponse createGetRoomTypesResponse() {
        return new GetRoomTypesResponse();
    }

    /**
     * Create an instance of {@link SearchRoomRemark }
     * 
     */
    public SearchRoomRemark createSearchRoomRemark() {
        return new SearchRoomRemark();
    }

    /**
     * Create an instance of {@link GetHotelRoomTypes }
     * 
     */
    public GetHotelRoomTypes createGetHotelRoomTypes() {
        return new GetHotelRoomTypes();
    }

    /**
     * Create an instance of {@link GetServiceTagsResponse }
     * 
     */
    public GetServiceTagsResponse createGetServiceTagsResponse() {
        return new GetServiceTagsResponse();
    }

    /**
     * Create an instance of {@link AddRoomRemarkResponse }
     * 
     */
    public AddRoomRemarkResponse createAddRoomRemarkResponse() {
        return new AddRoomRemarkResponse();
    }

    /**
     * Create an instance of {@link GetRoomTypes }
     * 
     */
    public GetRoomTypes createGetRoomTypes() {
        return new GetRoomTypes();
    }

    /**
     * Create an instance of {@link SearchRoomRemarkResponse }
     * 
     */
    public SearchRoomRemarkResponse createSearchRoomRemarkResponse() {
        return new SearchRoomRemarkResponse();
    }

    /**
     * Create an instance of {@link GetServiceTags }
     * 
     */
    public GetServiceTags createGetServiceTags() {
        return new GetServiceTags();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link GetFloor }
     * 
     */
    public GetFloor createGetFloor() {
        return new GetFloor();
    }

    /**
     * Create an instance of {@link GetRoomsCount }
     * 
     */
    public GetRoomsCount createGetRoomsCount() {
        return new GetRoomsCount();
    }

    /**
     * Create an instance of {@link GetSearchResultCountResponse }
     * 
     */
    public GetSearchResultCountResponse createGetSearchResultCountResponse() {
        return new GetSearchResultCountResponse();
    }

    /**
     * Create an instance of {@link AddRoomTypesResponse }
     * 
     */
    public AddRoomTypesResponse createAddRoomTypesResponse() {
        return new AddRoomTypesResponse();
    }

    /**
     * Create an instance of {@link com.rose.domain.tempuri.SearchAvailiableRooms }
     * 
     */
    public com.rose.domain.tempuri.SearchAvailiableRooms createSearchAvailiableRooms() {
        return new com.rose.domain.tempuri.SearchAvailiableRooms();
    }

    /**
     * Create an instance of {@link UpdateHotelLocationId }
     * 
     */
    public UpdateHotelLocationId createUpdateHotelLocationId() {
        return new UpdateHotelLocationId();
    }

    /**
     * Create an instance of {@link GetHotelsByHotelIds }
     * 
     */
    public GetHotelsByHotelIds createGetHotelsByHotelIds() {
        return new GetHotelsByHotelIds();
    }

    /**
     * Create an instance of {@link GetSearchResultCount }
     * 
     */
    public GetSearchResultCount createGetSearchResultCount() {
        return new GetSearchResultCount();
    }

    /**
     * Create an instance of {@link GetHotelBrands }
     * 
     */
    public GetHotelBrands createGetHotelBrands() {
        return new GetHotelBrands();
    }

    /**
     * Create an instance of {@link UpdateHotelLocationIdResponse }
     * 
     */
    public UpdateHotelLocationIdResponse createUpdateHotelLocationIdResponse() {
        return new UpdateHotelLocationIdResponse();
    }

    /**
     * Create an instance of {@link GetFloorResponse }
     * 
     */
    public GetFloorResponse createGetFloorResponse() {
        return new GetFloorResponse();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link GetHotelsByHotelNos }
     * 
     */
    public GetHotelsByHotelNos createGetHotelsByHotelNos() {
        return new GetHotelsByHotelNos();
    }

    /**
     * Create an instance of {@link AddRoomRemark }
     * 
     */
    public AddRoomRemark createAddRoomRemark() {
        return new AddRoomRemark();
    }

    /**
     * Create an instance of {@link GetAllHotelsResponse }
     * 
     */
    public GetAllHotelsResponse createGetAllHotelsResponse() {
        return new GetAllHotelsResponse();
    }

    /**
     * Create an instance of {@link GetRoomsCountResponse }
     * 
     */
    public GetRoomsCountResponse createGetRoomsCountResponse() {
        return new GetRoomsCountResponse();
    }

    /**
     * Create an instance of {@link AddRoomTypes }
     * 
     */
    public AddRoomTypes createAddRoomTypes() {
        return new AddRoomTypes();
    }

    /**
     * Create an instance of {@link GetRooms }
     * 
     */
    public GetRooms createGetRooms() {
        return new GetRooms();
    }

    /**
     * Create an instance of {@link SearchAvailiableRoomsResponse }
     * 
     */
    public SearchAvailiableRoomsResponse createSearchAvailiableRoomsResponse() {
        return new SearchAvailiableRoomsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRoomsResult", scope = GetRoomsResponse.class)
    public JAXBElement<InvokeResultArrayOfRoom> createGetRoomsResponseGetRoomsResult(InvokeResultArrayOfRoom value) {
        return new JAXBElement<InvokeResultArrayOfRoom>(_GetRoomsResponseGetRoomsResult_QNAME, InvokeResultArrayOfRoom.class, GetRoomsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfRoomType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetHotelRoomTypesResult", scope = GetHotelRoomTypesResponse.class)
    public JAXBElement<InvokeResultArrayOfRoomType> createGetHotelRoomTypesResponseGetHotelRoomTypesResult(InvokeResultArrayOfRoomType value) {
        return new JAXBElement<InvokeResultArrayOfRoomType>(_GetHotelRoomTypesResponseGetHotelRoomTypesResult_QNAME, InvokeResultArrayOfRoomType.class, GetHotelRoomTypesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfHotelSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetHotelsByHotelNosResult", scope = GetHotelsByHotelNosResponse.class)
    public JAXBElement<InvokeResultArrayOfHotelSearchResponse> createGetHotelsByHotelNosResponseGetHotelsByHotelNosResult(InvokeResultArrayOfHotelSearchResponse value) {
        return new JAXBElement<InvokeResultArrayOfHotelSearchResponse>(_GetHotelsByHotelNosResponseGetHotelsByHotelNosResult_QNAME, InvokeResultArrayOfHotelSearchResponse.class, GetHotelsByHotelNosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = GetAllHotels.class)
    public JAXBElement<String> createGetAllHotelsSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, GetAllHotels.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfHotelSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetHotelsByHotelIdsResult", scope = GetHotelsByHotelIdsResponse.class)
    public JAXBElement<InvokeResultArrayOfHotelSearchResponse> createGetHotelsByHotelIdsResponseGetHotelsByHotelIdsResult(InvokeResultArrayOfHotelSearchResponse value) {
        return new JAXBElement<InvokeResultArrayOfHotelSearchResponse>(_GetHotelsByHotelIdsResponseGetHotelsByHotelIdsResult_QNAME, InvokeResultArrayOfHotelSearchResponse.class, GetHotelsByHotelIdsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfOwnerConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetHotelBrandsResult", scope = GetHotelBrandsResponse.class)
    public JAXBElement<InvokeResultArrayOfOwnerConfig> createGetHotelBrandsResponseGetHotelBrandsResult(InvokeResultArrayOfOwnerConfig value) {
        return new JAXBElement<InvokeResultArrayOfOwnerConfig>(_GetHotelBrandsResponseGetHotelBrandsResult_QNAME, InvokeResultArrayOfOwnerConfig.class, GetHotelBrandsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfRoomType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRoomTypesResult", scope = GetRoomTypesResponse.class)
    public JAXBElement<InvokeResultArrayOfRoomType> createGetRoomTypesResponseGetRoomTypesResult(InvokeResultArrayOfRoomType value) {
        return new JAXBElement<InvokeResultArrayOfRoomType>(_GetRoomTypesResponseGetRoomTypesResult_QNAME, InvokeResultArrayOfRoomType.class, GetRoomTypesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = SearchRoomRemark.class)
    public JAXBElement<String> createSearchRoomRemarkSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, SearchRoomRemark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomRemarkSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "roomRemarkSearchRequest", scope = SearchRoomRemark.class)
    public JAXBElement<RoomRemarkSearchRequest> createSearchRoomRemarkRoomRemarkSearchRequest(RoomRemarkSearchRequest value) {
        return new JAXBElement<RoomRemarkSearchRequest>(_SearchRoomRemarkRoomRemarkSearchRequest_QNAME, RoomRemarkSearchRequest.class, SearchRoomRemark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = GetHotelRoomTypes.class)
    public JAXBElement<String> createGetHotelRoomTypesSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, GetHotelRoomTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfHotelServiceTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetServiceTagsResult", scope = GetServiceTagsResponse.class)
    public JAXBElement<InvokeResultArrayOfHotelServiceTag> createGetServiceTagsResponseGetServiceTagsResult(InvokeResultArrayOfHotelServiceTag value) {
        return new JAXBElement<InvokeResultArrayOfHotelServiceTag>(_GetServiceTagsResponseGetServiceTagsResult_QNAME, InvokeResultArrayOfHotelServiceTag.class, GetServiceTagsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultBoolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddRoomRemarkResult", scope = AddRoomRemarkResponse.class)
    public JAXBElement<InvokeResultBoolean> createAddRoomRemarkResponseAddRoomRemarkResult(InvokeResultBoolean value) {
        return new JAXBElement<InvokeResultBoolean>(_AddRoomRemarkResponseAddRoomRemarkResult_QNAME, InvokeResultBoolean.class, AddRoomRemarkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = GetRoomTypes.class)
    public JAXBElement<String> createGetRoomTypesSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, GetRoomTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SearchRoomRemarkResult", scope = SearchRoomRemarkResponse.class)
    public JAXBElement<InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns> createSearchRoomRemarkResponseSearchRoomRemarkResult(InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns value) {
        return new JAXBElement<InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns>(_SearchRoomRemarkResponseSearchRoomRemarkResult_QNAME, InvokeResultPagedResultOfRoomRemarkResponsepM6ZO2Ns.class, SearchRoomRemarkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = GetServiceTags.class)
    public JAXBElement<String> createGetServiceTagsSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, GetServiceTags.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "searchRequest", scope = Search.class)
    public JAXBElement<HotelSearchRequest> createSearchSearchRequest(HotelSearchRequest value) {
        return new JAXBElement<HotelSearchRequest>(_SearchSearchRequest_QNAME, HotelSearchRequest.class, Search.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = Search.class)
    public JAXBElement<String> createSearchSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, Search.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = GetFloor.class)
    public JAXBElement<String> createGetFloorSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, GetFloor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = GetRoomsCount.class)
    public JAXBElement<String> createGetRoomsCountSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, GetRoomsCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "roomStatus", scope = GetRoomsCount.class)
    public JAXBElement<String> createGetRoomsCountRoomStatus(String value) {
        return new JAXBElement<String>(_GetRoomsCountRoomStatus_QNAME, String.class, GetRoomsCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSearchResultCountResult", scope = GetSearchResultCountResponse.class)
    public JAXBElement<InvokeResultInt> createGetSearchResultCountResponseGetSearchResultCountResult(InvokeResultInt value) {
        return new JAXBElement<InvokeResultInt>(_GetSearchResultCountResponseGetSearchResultCountResult_QNAME, InvokeResultInt.class, GetSearchResultCountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddRoomTypesResult", scope = AddRoomTypesResponse.class)
    public JAXBElement<InvokeResult> createAddRoomTypesResponseAddRoomTypesResult(InvokeResult value) {
        return new JAXBElement<InvokeResult>(_AddRoomTypesResponseAddRoomTypesResult_QNAME, InvokeResult.class, AddRoomTypesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.rose.domain.publicservice.model.SearchAvailiableRooms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "searchAvailiableRoomModel", scope = com.rose.domain.tempuri.SearchAvailiableRooms.class)
    public JAXBElement<com.rose.domain.publicservice.model.SearchAvailiableRooms> createSearchAvailiableRoomsSearchAvailiableRoomModel(com.rose.domain.publicservice.model.SearchAvailiableRooms value) {
        return new JAXBElement<com.rose.domain.publicservice.model.SearchAvailiableRooms>(_SearchAvailiableRoomsSearchAvailiableRoomModel_QNAME, com.rose.domain.publicservice.model.SearchAvailiableRooms.class, com.rose.domain.tempuri.SearchAvailiableRooms.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = com.rose.domain.tempuri.SearchAvailiableRooms.class)
    public JAXBElement<String> createSearchAvailiableRoomsSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, com.rose.domain.tempuri.SearchAvailiableRooms.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = UpdateHotelLocationId.class)
    public JAXBElement<String> createUpdateHotelLocationIdSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, UpdateHotelLocationId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelLocationUpdateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "hotelLocationUpdateRequest", scope = UpdateHotelLocationId.class)
    public JAXBElement<HotelLocationUpdateRequest> createUpdateHotelLocationIdHotelLocationUpdateRequest(HotelLocationUpdateRequest value) {
        return new JAXBElement<HotelLocationUpdateRequest>(_UpdateHotelLocationIdHotelLocationUpdateRequest_QNAME, HotelLocationUpdateRequest.class, UpdateHotelLocationId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = GetHotelsByHotelIds.class)
    public JAXBElement<String> createGetHotelsByHotelIdsSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, GetHotelsByHotelIds.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "hotelIds", scope = GetHotelsByHotelIds.class)
    public JAXBElement<ArrayOflong> createGetHotelsByHotelIdsHotelIds(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_GetHotelsByHotelIdsHotelIds_QNAME, ArrayOflong.class, GetHotelsByHotelIds.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "searchRequest", scope = GetSearchResultCount.class)
    public JAXBElement<HotelSearchRequest> createGetSearchResultCountSearchRequest(HotelSearchRequest value) {
        return new JAXBElement<HotelSearchRequest>(_SearchSearchRequest_QNAME, HotelSearchRequest.class, GetSearchResultCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = GetSearchResultCount.class)
    public JAXBElement<String> createGetSearchResultCountSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, GetSearchResultCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = GetHotelBrands.class)
    public JAXBElement<String> createGetHotelBrandsSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, GetHotelBrands.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultBoolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdateHotelLocationIdResult", scope = UpdateHotelLocationIdResponse.class)
    public JAXBElement<InvokeResultBoolean> createUpdateHotelLocationIdResponseUpdateHotelLocationIdResult(InvokeResultBoolean value) {
        return new JAXBElement<InvokeResultBoolean>(_UpdateHotelLocationIdResponseUpdateHotelLocationIdResult_QNAME, InvokeResultBoolean.class, UpdateHotelLocationIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfFloorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetFloorResult", scope = GetFloorResponse.class)
    public JAXBElement<InvokeResultArrayOfFloorResponse> createGetFloorResponseGetFloorResult(InvokeResultArrayOfFloorResponse value) {
        return new JAXBElement<InvokeResultArrayOfFloorResponse>(_GetFloorResponseGetFloorResult_QNAME, InvokeResultArrayOfFloorResponse.class, GetFloorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfHotelSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SearchResult", scope = SearchResponse.class)
    public JAXBElement<InvokeResultArrayOfHotelSearchResponse> createSearchResponseSearchResult(InvokeResultArrayOfHotelSearchResponse value) {
        return new JAXBElement<InvokeResultArrayOfHotelSearchResponse>(_SearchResponseSearchResult_QNAME, InvokeResultArrayOfHotelSearchResponse.class, SearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = GetHotelsByHotelNos.class)
    public JAXBElement<String> createGetHotelsByHotelNosSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, GetHotelsByHotelNos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "hotelNos", scope = GetHotelsByHotelNos.class)
    public JAXBElement<ArrayOfstring> createGetHotelsByHotelNosHotelNos(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetHotelsByHotelNosHotelNos_QNAME, ArrayOfstring.class, GetHotelsByHotelNos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomRemarkAddRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "roomRemarkAddRequest", scope = AddRoomRemark.class)
    public JAXBElement<RoomRemarkAddRequest> createAddRoomRemarkRoomRemarkAddRequest(RoomRemarkAddRequest value) {
        return new JAXBElement<RoomRemarkAddRequest>(_AddRoomRemarkRoomRemarkAddRequest_QNAME, RoomRemarkAddRequest.class, AddRoomRemark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = AddRoomRemark.class)
    public JAXBElement<String> createAddRoomRemarkSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, AddRoomRemark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfHotelSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllHotelsResult", scope = GetAllHotelsResponse.class)
    public JAXBElement<InvokeResultArrayOfHotelSearchResponse> createGetAllHotelsResponseGetAllHotelsResult(InvokeResultArrayOfHotelSearchResponse value) {
        return new JAXBElement<InvokeResultArrayOfHotelSearchResponse>(_GetAllHotelsResponseGetAllHotelsResult_QNAME, InvokeResultArrayOfHotelSearchResponse.class, GetAllHotelsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "newRoomTypes", scope = AddRoomTypes.class)
    public JAXBElement<ArrayOfRoomType> createAddRoomTypesNewRoomTypes(ArrayOfRoomType value) {
        return new JAXBElement<ArrayOfRoomType>(_AddRoomTypesNewRoomTypes_QNAME, ArrayOfRoomType.class, AddRoomTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = AddRoomTypes.class)
    public JAXBElement<String> createAddRoomTypesSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, AddRoomTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRoomsCountResult", scope = GetRoomsCountResponse.class)
    public JAXBElement<InvokeResultInt> createGetRoomsCountResponseGetRoomsCountResult(InvokeResultInt value) {
        return new JAXBElement<InvokeResultInt>(_GetRoomsCountResponseGetRoomsCountResult_QNAME, InvokeResultInt.class, GetRoomsCountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signature", scope = GetRooms.class)
    public JAXBElement<String> createGetRoomsSignature(String value) {
        return new JAXBElement<String>(_GetAllHotelsSignature_QNAME, String.class, GetRooms.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "roomStatus", scope = GetRooms.class)
    public JAXBElement<String> createGetRoomsRoomStatus(String value) {
        return new JAXBElement<String>(_GetRoomsCountRoomStatus_QNAME, String.class, GetRooms.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeResultArrayOfRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SearchAvailiableRoomsResult", scope = SearchAvailiableRoomsResponse.class)
    public JAXBElement<InvokeResultArrayOfRoom> createSearchAvailiableRoomsResponseSearchAvailiableRoomsResult(InvokeResultArrayOfRoom value) {
        return new JAXBElement<InvokeResultArrayOfRoom>(_SearchAvailiableRoomsResponseSearchAvailiableRoomsResult_QNAME, InvokeResultArrayOfRoom.class, SearchAvailiableRoomsResponse.class, value);
    }

}
