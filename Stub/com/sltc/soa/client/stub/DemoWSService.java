
package com.sltc.soa.client.stub;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;



@WebServiceClient(name = "DemoWSService", targetNamespace = "http://soa.sltc.com/", wsdlLocation = "http://localhost:8888/DemoWebService?wsdl")
public class DemoWSService
    extends Service
{

    private final static URL DEMOWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException DEMOWSSERVICE_EXCEPTION;
    private final static QName DEMOWSSERVICE_QNAME = new QName("http://soa.sltc.com/", "DemoWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/DemoWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DEMOWSSERVICE_WSDL_LOCATION = url;
        DEMOWSSERVICE_EXCEPTION = e;
    }

    public DemoWSService() {
        super(__getWsdlLocation(), DEMOWSSERVICE_QNAME);
    }

    public DemoWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DEMOWSSERVICE_QNAME, features);
    }

    public DemoWSService(URL wsdlLocation) {
        super(wsdlLocation, DEMOWSSERVICE_QNAME);
    }

    public DemoWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DEMOWSSERVICE_QNAME, features);
    }

    public DemoWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DemoWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    @WebEndpoint(name = "DemoWSPort")
    public DemoWS getDemoWSPort() {
        return super.getPort(new QName("http://soa.sltc.com/", "DemoWSPort"), DemoWS.class);
    }


    @WebEndpoint(name = "DemoWSPort")
    public DemoWS getDemoWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soa.sltc.com/", "DemoWSPort"), DemoWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DEMOWSSERVICE_EXCEPTION!= null) {
            throw DEMOWSSERVICE_EXCEPTION;
        }
        return DEMOWSSERVICE_WSDL_LOCATION;
    }

}
