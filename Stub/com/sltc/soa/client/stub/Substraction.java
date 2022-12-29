
package com.sltc.soa.client.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "substraction", propOrder = {
    "arg0",
    "arg1"
})
public class Substraction {

    protected int arg0;
    protected int arg1;

    public int getArg0() {
        return arg0;
    }


    public void setArg0(int value) {
        this.arg0 = value;
    }


    public int getArg1() {
        return arg1;
    }


    public void setArg1(int value) {
        this.arg1 = value;
    }

}
