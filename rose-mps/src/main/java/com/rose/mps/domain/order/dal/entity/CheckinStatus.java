
package com.rose.mps.domain.order.dal.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckinStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckinStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckinStatus", namespace = "http://schemas.datacontract.org/2004/07/NextPms.Dal.Entity.BusinessEnum")
@XmlEnum
public enum CheckinStatus {

    I,
    O,
    S;

    public String value() {
        return name();
    }

    public static CheckinStatus fromValue(String v) {
        return valueOf(v);
    }

}
