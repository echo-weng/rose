
package com.rose.domain.publicservice.model;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rose.domain.serialization.array.ArrayOflong;
import com.rose.domain.serialization.array.ArrayOfstring;
import com.rose.domain.publicservice.ArrayOfOrderByRequest;
import com.rose.domain.publicservice.CheckinType;
import com.rose.domain.publicservice.OrderSource;


/**
 * <p>Java class for HotelSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelSearchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BasicInfoOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CheckinType" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.BusinessEnum}CheckinType" minOccurs="0"/>
 *         &lt;element name="CityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommercialLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentPageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrentPageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DistrictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExcludePrices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExcludeRoomCounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HotelIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeDetailCounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MemberLevels" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="OnlyOpenedHotel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderByRequests" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model}ArrayOfOrderByRequest" minOccurs="0"/>
 *         &lt;element name="OrgSns" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PhysicalRoomTypeOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RoomTypeIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="ServiceTags" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.BusinessEnum}OrderSource" minOccurs="0"/>
 *         &lt;element name="Star" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelSearchRequest", propOrder = {
    "basicInfoOnly",
    "beginDate",
    "checkinType",
    "cityId",
    "commercialLocationId",
    "currentPageIndex",
    "currentPageSize",
    "distance",
    "districtId",
    "endDate",
    "excludePrices",
    "excludeRoomCounts",
    "hotelIds",
    "hotelName",
    "includeDetailCounts",
    "latitude",
    "longitude",
    "memberLevels",
    "onlyOpenedHotel",
    "orderByRequests",
    "orgSns",
    "pageIndex",
    "pageSize",
    "physicalRoomTypeOnly",
    "roomTypeIds",
    "serviceTags",
    "source",
    "star"
})
public class HotelSearchRequest {

    @XmlElement(name = "BasicInfoOnly")
    protected Boolean basicInfoOnly;
    @XmlElement(name = "BeginDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDate;
    @XmlElementRef(name = "CheckinType", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<CheckinType> checkinType;
    @XmlElementRef(name = "CityId", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> cityId;
    @XmlElementRef(name = "CommercialLocationId", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> commercialLocationId;
    @XmlElement(name = "CurrentPageIndex")
    protected Integer currentPageIndex;
    @XmlElement(name = "CurrentPageSize")
    protected Integer currentPageSize;
    @XmlElementRef(name = "Distance", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<Integer> distance;
    @XmlElementRef(name = "DistrictId", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> districtId;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "ExcludePrices")
    protected Boolean excludePrices;
    @XmlElement(name = "ExcludeRoomCounts")
    protected Boolean excludeRoomCounts;
    @XmlElementRef(name = "HotelIds", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<ArrayOflong> hotelIds;
    @XmlElementRef(name = "HotelName", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<String> hotelName;
    @XmlElement(name = "IncludeDetailCounts")
    protected Boolean includeDetailCounts;
    @XmlElementRef(name = "Latitude", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> latitude;
    @XmlElementRef(name = "Longitude", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> longitude;
    @XmlElementRef(name = "MemberLevels", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> memberLevels;
    @XmlElement(name = "OnlyOpenedHotel")
    protected Boolean onlyOpenedHotel;
    @XmlElementRef(name = "OrderByRequests", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<ArrayOfOrderByRequest> orderByRequests;
    @XmlElementRef(name = "OrgSns", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> orgSns;
    @XmlElementRef(name = "PageIndex", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<Integer> pageIndex;
    @XmlElementRef(name = "PageSize", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<Integer> pageSize;
    @XmlElement(name = "PhysicalRoomTypeOnly")
    protected Boolean physicalRoomTypeOnly;
    @XmlElementRef(name = "RoomTypeIds", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> roomTypeIds;
    @XmlElementRef(name = "ServiceTags", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> serviceTags;
    @XmlElementRef(name = "Source", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<OrderSource> source;
    @XmlElementRef(name = "Star", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Model.Order", type = JAXBElement.class)
    protected JAXBElement<Integer> star;

    /**
     * Gets the value of the basicInfoOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBasicInfoOnly() {
        return basicInfoOnly;
    }

    /**
     * Sets the value of the basicInfoOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBasicInfoOnly(Boolean value) {
        this.basicInfoOnly = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the checkinType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CheckinType }{@code >}
     *     
     */
    public JAXBElement<CheckinType> getCheckinType() {
        return checkinType;
    }

    /**
     * Sets the value of the checkinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CheckinType }{@code >}
     *     
     */
    public void setCheckinType(JAXBElement<CheckinType> value) {
        this.checkinType = ((JAXBElement<CheckinType> ) value);
    }

    /**
     * Gets the value of the cityId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCityId() {
        return cityId;
    }

    /**
     * Sets the value of the cityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCityId(JAXBElement<String> value) {
        this.cityId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the commercialLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommercialLocationId() {
        return commercialLocationId;
    }

    /**
     * Sets the value of the commercialLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommercialLocationId(JAXBElement<String> value) {
        this.commercialLocationId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the currentPageIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentPageIndex() {
        return currentPageIndex;
    }

    /**
     * Sets the value of the currentPageIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentPageIndex(Integer value) {
        this.currentPageIndex = value;
    }

    /**
     * Gets the value of the currentPageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentPageSize() {
        return currentPageSize;
    }

    /**
     * Sets the value of the currentPageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentPageSize(Integer value) {
        this.currentPageSize = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDistance(JAXBElement<Integer> value) {
        this.distance = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the districtId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistrictId() {
        return districtId;
    }

    /**
     * Sets the value of the districtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistrictId(JAXBElement<String> value) {
        this.districtId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the excludePrices property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludePrices() {
        return excludePrices;
    }

    /**
     * Sets the value of the excludePrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludePrices(Boolean value) {
        this.excludePrices = value;
    }

    /**
     * Gets the value of the excludeRoomCounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeRoomCounts() {
        return excludeRoomCounts;
    }

    /**
     * Sets the value of the excludeRoomCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeRoomCounts(Boolean value) {
        this.excludeRoomCounts = value;
    }

    /**
     * Gets the value of the hotelIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getHotelIds() {
        return hotelIds;
    }

    /**
     * Sets the value of the hotelIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setHotelIds(JAXBElement<ArrayOflong> value) {
        this.hotelIds = ((JAXBElement<ArrayOflong> ) value);
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotelName(JAXBElement<String> value) {
        this.hotelName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the includeDetailCounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDetailCounts() {
        return includeDetailCounts;
    }

    /**
     * Sets the value of the includeDetailCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDetailCounts(Boolean value) {
        this.includeDetailCounts = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLatitude(JAXBElement<BigDecimal> value) {
        this.latitude = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLongitude(JAXBElement<BigDecimal> value) {
        this.longitude = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the memberLevels property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getMemberLevels() {
        return memberLevels;
    }

    /**
     * Sets the value of the memberLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setMemberLevels(JAXBElement<ArrayOfstring> value) {
        this.memberLevels = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the onlyOpenedHotel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyOpenedHotel() {
        return onlyOpenedHotel;
    }

    /**
     * Sets the value of the onlyOpenedHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyOpenedHotel(Boolean value) {
        this.onlyOpenedHotel = value;
    }

    /**
     * Gets the value of the orderByRequests property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderByRequest }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderByRequest> getOrderByRequests() {
        return orderByRequests;
    }

    /**
     * Sets the value of the orderByRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderByRequest }{@code >}
     *     
     */
    public void setOrderByRequests(JAXBElement<ArrayOfOrderByRequest> value) {
        this.orderByRequests = ((JAXBElement<ArrayOfOrderByRequest> ) value);
    }

    /**
     * Gets the value of the orgSns property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getOrgSns() {
        return orgSns;
    }

    /**
     * Sets the value of the orgSns property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setOrgSns(JAXBElement<ArrayOfstring> value) {
        this.orgSns = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the pageIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPageIndex(JAXBElement<Integer> value) {
        this.pageIndex = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPageSize(JAXBElement<Integer> value) {
        this.pageSize = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the physicalRoomTypeOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhysicalRoomTypeOnly() {
        return physicalRoomTypeOnly;
    }

    /**
     * Sets the value of the physicalRoomTypeOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhysicalRoomTypeOnly(Boolean value) {
        this.physicalRoomTypeOnly = value;
    }

    /**
     * Gets the value of the roomTypeIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getRoomTypeIds() {
        return roomTypeIds;
    }

    /**
     * Sets the value of the roomTypeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setRoomTypeIds(JAXBElement<ArrayOfstring> value) {
        this.roomTypeIds = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the serviceTags property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getServiceTags() {
        return serviceTags;
    }

    /**
     * Sets the value of the serviceTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setServiceTags(JAXBElement<ArrayOfstring> value) {
        this.serviceTags = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderSource }{@code >}
     *     
     */
    public JAXBElement<OrderSource> getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderSource }{@code >}
     *     
     */
    public void setSource(JAXBElement<OrderSource> value) {
        this.source = ((JAXBElement<OrderSource> ) value);
    }

    /**
     * Gets the value of the star property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStar() {
        return star;
    }

    /**
     * Sets the value of the star property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStar(JAXBElement<Integer> value) {
        this.star = ((JAXBElement<Integer> ) value);
    }

}
