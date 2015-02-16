
package com.rose.domain.publicservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckinType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckinType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="LongTerm"/>
 *     &lt;enumeration value="Trip"/>
 *     &lt;enumeration value="Conference"/>
 *     &lt;enumeration value="Internal"/>
 *     &lt;enumeration value="Free"/>
 *     &lt;enumeration value="Hour1"/>
 *     &lt;enumeration value="Hour2"/>
 *     &lt;enumeration value="Hour3"/>
 *     &lt;enumeration value="Hour4"/>
 *     &lt;enumeration value="Hour5"/>
 *     &lt;enumeration value="Hour6"/>
 *     &lt;enumeration value="Hour7"/>
 *     &lt;enumeration value="Hour8"/>
 *     &lt;enumeration value="Hour9"/>
 *     &lt;enumeration value="Hour10"/>
 *     &lt;enumeration value="Hour11"/>
 *     &lt;enumeration value="Hour12"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckinType", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.BusinessEnum")
@XmlEnum
public enum CheckinType {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("LongTerm")
    LONG_TERM("LongTerm"),
    @XmlEnumValue("Trip")
    TRIP("Trip"),
    @XmlEnumValue("Conference")
    CONFERENCE("Conference"),
    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("Free")
    FREE("Free"),
    @XmlEnumValue("Hour1")
    HOUR_1("Hour1"),
    @XmlEnumValue("Hour2")
    HOUR_2("Hour2"),
    @XmlEnumValue("Hour3")
    HOUR_3("Hour3"),
    @XmlEnumValue("Hour4")
    HOUR_4("Hour4"),
    @XmlEnumValue("Hour5")
    HOUR_5("Hour5"),
    @XmlEnumValue("Hour6")
    HOUR_6("Hour6"),
    @XmlEnumValue("Hour7")
    HOUR_7("Hour7"),
    @XmlEnumValue("Hour8")
    HOUR_8("Hour8"),
    @XmlEnumValue("Hour9")
    HOUR_9("Hour9"),
    @XmlEnumValue("Hour10")
    HOUR_10("Hour10"),
    @XmlEnumValue("Hour11")
    HOUR_11("Hour11"),
    @XmlEnumValue("Hour12")
    HOUR_12("Hour12");
    private final String value;

    CheckinType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckinType fromValue(String v) {
        for (CheckinType c: CheckinType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
