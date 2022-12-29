
package com.sltc.soa.client.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



@XmlRegistry
public class ObjectFactory {

    private final static QName _Convert_QNAME = new QName("http://ws.currency.soa.sltc.com/", "convert");
    private final static QName _ConvertResponse_QNAME = new QName("http://ws.currency.soa.sltc.com/", "convertResponse");


    public ObjectFactory() {
    }


    public ConvertResponse createConvertResponse() {
        return new ConvertResponse();
    }


    public Convert createConvert() {
        return new Convert();
    }


    @XmlElementDecl(namespace = "http://ws.currency.soa.sltc.com/", name = "convert")
    public JAXBElement<Convert> createConvert(Convert value) {
        return new JAXBElement<Convert>(_Convert_QNAME, Convert.class, null, value);
    }


    @XmlElementDecl(namespace = "http://ws.currency.soa.sltc.com/", name = "convertResponse")
    public JAXBElement<ConvertResponse> createConvertResponse(ConvertResponse value) {
        return new JAXBElement<ConvertResponse>(_ConvertResponse_QNAME, ConvertResponse.class, null, value);
    }

}
