
package com.rose.domain.serialization.array;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOflong", propOrder = {
    "_long"
})
public class ArrayOflong {

    @XmlElement(name = "long", type = Long.class)
    protected List<Long> _long;

    public List<Long> getLong() {
        if (_long == null) {
            _long = new ArrayList<Long>();
        }
        return this._long;
    }

}
