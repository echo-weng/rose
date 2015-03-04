
package com.rose.mps.domain.hotel.serialization.array;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfint", propOrder = {
    "_int"
})
public class ArrayOfint {

    @XmlElement(name = "int", type = Integer.class)
    protected List<Integer> _int;

    public List<Integer> getInt() {
        if (_int == null) {
            _int = new ArrayList<Integer>();
        }
        return this._int;
    }

}
