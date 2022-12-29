
package com.sltc.soa.client.stub;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


@WebService(name = "DemoWS", targetNamespace = "http://soa.sltc.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DemoWS {


    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addition", targetNamespace = "http://soa.sltc.com/", className = "com.sltc.soa.client.stub.Addition")
    @ResponseWrapper(localName = "additionResponse", targetNamespace = "http://soa.sltc.com/", className = "com.sltc.soa.client.stub.AdditionResponse")
    @Action(input = "http://soa.sltc.com/DemoWS/additionRequest", output = "http://soa.sltc.com/DemoWS/additionResponse")
    public int addition(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "substraction", targetNamespace = "http://soa.sltc.com/", className = "com.sltc.soa.client.stub.Substraction")
    @ResponseWrapper(localName = "substractionResponse", targetNamespace = "http://soa.sltc.com/", className = "com.sltc.soa.client.stub.SubstractionResponse")
    @Action(input = "http://soa.sltc.com/DemoWS/substractionRequest", output = "http://soa.sltc.com/DemoWS/substractionResponse")
    public int substraction(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
