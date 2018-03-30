
package org.simple.engine.service.endpoint;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServerStarterService", targetNamespace = "http://endpoint.service.engine.simple.org/", wsdlLocation = "http://127.0.0.1:8083/engine?wsdl")
public class ServerStarterService
    extends Service
{

    private final static URL SERVERSTARTERSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVERSTARTERSERVICE_EXCEPTION;
    private final static QName SERVERSTARTERSERVICE_QNAME = new QName("http://endpoint.service.engine.simple.org/", "ServerStarterService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8083/engine?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVERSTARTERSERVICE_WSDL_LOCATION = url;
        SERVERSTARTERSERVICE_EXCEPTION = e;
    }

    public ServerStarterService() {
        super(__getWsdlLocation(), SERVERSTARTERSERVICE_QNAME);
    }

    public ServerStarterService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVERSTARTERSERVICE_QNAME, features);
    }

    public ServerStarterService(URL wsdlLocation) {
        super(wsdlLocation, SERVERSTARTERSERVICE_QNAME);
    }

    public ServerStarterService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVERSTARTERSERVICE_QNAME, features);
    }

    public ServerStarterService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServerStarterService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Server
     */
    @WebEndpoint(name = "ServerPort")
    public Server getServerPort() {
        return super.getPort(new QName("http://endpoint.service.engine.simple.org/", "ServerPort"), Server.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Server
     */
    @WebEndpoint(name = "ServerPort")
    public Server getServerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://endpoint.service.engine.simple.org/", "ServerPort"), Server.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVERSTARTERSERVICE_EXCEPTION!= null) {
            throw SERVERSTARTERSERVICE_EXCEPTION;
        }
        return SERVERSTARTERSERVICE_WSDL_LOCATION;
    }

}
