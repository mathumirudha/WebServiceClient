
package com.sltc.soa.client.stub;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;



@WebService(name = "CurrencyConversionWs", targetNamespace = "http://ws.currency.soa.sltc.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CurrencyConversionWs {

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convert", targetNamespace = "http://ws.currency.soa.sltc.com/", className = "com.sltc.soa.client.stub.Convert")
    @ResponseWrapper(localName = "convertResponse", targetNamespace = "http://ws.currency.soa.sltc.com/", className = "com.sltc.soa.client.stub.ConvertResponse")
    @Action(input = "http://ws.currency.soa.sltc.com/CurrencyConversionWs/convertRequest", output = "http://ws.currency.soa.sltc.com/CurrencyConversionWs/convertResponse")
    public double convert(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

}
