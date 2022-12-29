
package com.sltc.soa.client.stub;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;



@WebServiceClient(name = "CurrencyConversionWsService", targetNamespace = "http://ws.currency.soa.sltc.com/", wsdlLocation = "http://localhost:8888/CurrencyConversionService?wsdl")
public class CurrencyConversionWsService
    extends Service
{

    private final static URL CURRENCYCONVERSIONWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException CURRENCYCONVERSIONWSSERVICE_EXCEPTION;
    private final static QName CURRENCYCONVERSIONWSSERVICE_QNAME = new QName("http://ws.currency.soa.sltc.com/", "CurrencyConversionWsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/CurrencyConversionService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CURRENCYCONVERSIONWSSERVICE_WSDL_LOCATION = url;
        CURRENCYCONVERSIONWSSERVICE_EXCEPTION = e;
    }

    public CurrencyConversionWsService() {
        super(__getWsdlLocation(), CURRENCYCONVERSIONWSSERVICE_QNAME);
    }

    public CurrencyConversionWsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CURRENCYCONVERSIONWSSERVICE_QNAME, features);
    }

    public CurrencyConversionWsService(URL wsdlLocation) {
        super(wsdlLocation, CURRENCYCONVERSIONWSSERVICE_QNAME);
    }

    public CurrencyConversionWsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CURRENCYCONVERSIONWSSERVICE_QNAME, features);
    }

    public CurrencyConversionWsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CurrencyConversionWsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }


    @WebEndpoint(name = "CurrencyConversionWsPort")
    public CurrencyConversionWs getCurrencyConversionWsPort() {
        return super.getPort(new QName("http://ws.currency.soa.sltc.com/", "CurrencyConversionWsPort"), CurrencyConversionWs.class);
    }

    @WebEndpoint(name = "CurrencyConversionWsPort")
    public CurrencyConversionWs getCurrencyConversionWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.currency.soa.sltc.com/", "CurrencyConversionWsPort"), CurrencyConversionWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CURRENCYCONVERSIONWSSERVICE_EXCEPTION!= null) {
            throw CURRENCYCONVERSIONWSSERVICE_EXCEPTION;
        }
        return CURRENCYCONVERSIONWSSERVICE_WSDL_LOCATION;
    }

}
