package com.moonshot.rob.service;

import com.moonshot.rob.model.wsdl.Add;
import com.moonshot.rob.model.wsdl.AddResponse;
import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SoapClient extends WebServiceGatewaySupport {
    public AddResponse add(Object request) {
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive("http://localhost:8080/calculator-ws/CalculatorService", request);
        return (AddResponse) res.getValue();
    }
}
