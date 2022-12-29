
package com.sltc.soa.client.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convertResponse", propOrder = {
    "_return"
})
public class ConvertResponse {

    @XmlElement(name = "return")
    protected double _return;


    public double getReturn() {
        return _return;
    }


    public void setReturn(double value) {
        this._return = value;
    }

}
