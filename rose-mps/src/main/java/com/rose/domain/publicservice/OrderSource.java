
package com.rose.domain.publicservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="Crs"/>
 *     &lt;enumeration value="Web"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="Ett"/>
 *     &lt;enumeration value="Oth"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderSource", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.BusinessEnum")
@XmlEnum
public enum OrderSource {

    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Crs")
    CRS("Crs"),
    @XmlEnumValue("Web")
    WEB("Web"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Ett")
    ETT("Ett"),
    @XmlEnumValue("Oth")
    OTH("Oth");
    private final String value;

    OrderSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderSource fromValue(String v) {
        for (OrderSource c: OrderSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
