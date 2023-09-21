package com.moonshot.rob.model.wsdl;

import java.net.URL;
import jakarta.annotation.Generated;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.2
 * Generated source version: 4.0.2
 *
 */
@WebServiceClient(name = "CalculatorService",
                  wsdlLocation = "calculus.wsdl",
                  targetNamespace = "http://www.jboss.org/eap/quickstarts/wscalculator/Calculator")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", comments = "Apache CXF 4.0.2")
public class CalculatorService_Service extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava")
    public final static QName SERVICE = new QName("http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", "CalculatorService");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava")
    public final static QName Calculator = new QName("http://www.jboss.org/eap/quickstarts/wscalculator/Calculator", "Calculator");
    static {
        URL url = CalculatorService_Service.class.getResource("calculus.wsdl");
        if (url == null) {
            url = CalculatorService_Service.class.getClassLoader().getResource("calculus.wsdl");
        }
        if (url == null) {
            java.util.logging.Logger.getLogger(CalculatorService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "calculus.wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava")
    public CalculatorService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava")
    public CalculatorService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava")
    public CalculatorService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava")
    public CalculatorService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava")
    public CalculatorService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava")
    public CalculatorService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CalculatorService
     */
    @WebEndpoint(name = "Calculator")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava")
    public CalculatorService getCalculator() {
        return super.getPort(Calculator, CalculatorService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorService
     */
    @WebEndpoint(name = "Calculator")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava")
    public CalculatorService getCalculator(WebServiceFeature... features) {
        return super.getPort(Calculator, CalculatorService.class, features);
    }

}