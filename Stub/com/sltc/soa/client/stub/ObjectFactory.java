
package com.sltc.soa.client.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



@XmlRegistry
public class ObjectFactory {

    private final static QName _AdditionResponse_QNAME = new QName("http://soa.sltc.com/", "additionResponse");
    private final static QName _SubstractionResponse_QNAME = new QName("http://soa.sltc.com/", "substractionResponse");
    private final static QName _Addition_QNAME = new QName("http://soa.sltc.com/", "addition");
    private final static QName _Substraction_QNAME = new QName("http://soa.sltc.com/", "substraction");


    public ObjectFactory() {
    }


    public SubstractionResponse createSubstractionResponse() {
        return new SubstractionResponse();
    }


    public AdditionResponse createAdditionResponse() {
        return new AdditionResponse();
    }


    public Substraction createSubstraction() {
        return new Substraction();
    }


    public Addition createAddition() {
        return new Addition();
    }

    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "additionResponse")
    public JAXBElement<AdditionResponse> createAdditionResponse(AdditionResponse value) {
        return new JAXBElement<AdditionResponse>(_AdditionResponse_QNAME, AdditionResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "substractionResponse")
    public JAXBElement<SubstractionResponse> createSubstractionResponse(SubstractionResponse value) {
        return new JAXBElement<SubstractionResponse>(_SubstractionResponse_QNAME, SubstractionResponse.class, null, value);
    }


    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "addition")
    public JAXBElement<Addition> createAddition(Addition value) {
        return new JAXBElement<Addition>(_Addition_QNAME, Addition.class, null, value);
    }


    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "substraction")
    public JAXBElement<Substraction> createSubstraction(Substraction value) {
        return new JAXBElement<Substraction>(_Substraction_QNAME, Substraction.class, null, value);
    }

}
