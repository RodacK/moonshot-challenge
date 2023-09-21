package com.moonshot.rob.configs;

import com.moonshot.rob.model.wsdl.AddResponse;
import com.moonshot.rob.utils.Constants;
import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SoapClient extends WebServiceGatewaySupport {
    public AddResponse add(Object request) {
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(Constants.SOAP_URI, request);
        return (AddResponse) res.getValue();
    }
}
