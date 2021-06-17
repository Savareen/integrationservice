package com.igorzaitcev.soap.createclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.4
 * 2021-06-16T13:03:35.915+02:00
 * Generated source version: 3.4.4
 *
 */
@WebServiceClient(name = "ClientsServer",
                  wsdlLocation = "file:/Users/igorzaitcev/SpringToolSuite/bankapi/src/main/resources/wsdl/CreateClientServer.wsdl",
                  targetNamespace = "http://createclient.server.igorzaitcev.com")
public class ClientsServer extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://createclient.server.igorzaitcev.com", "ClientsServer");
    public final static QName ClientsServerPort = new QName("http://createclient.server.igorzaitcev.com", "ClientsServerPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/igorzaitcev/SpringToolSuite/bankapi/src/main/resources/wsdl/CreateClientServer.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ClientsServer.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/igorzaitcev/SpringToolSuite/bankapi/src/main/resources/wsdl/CreateClientServer.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ClientsServer(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ClientsServer(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClientsServer() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ClientsServer(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ClientsServer(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ClientsServer(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ClientsServerPortType
     */
    @WebEndpoint(name = "ClientsServerPort")
    public ClientsServerPortType getClientsServerPort() {
        return super.getPort(ClientsServerPort, ClientsServerPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClientsServerPortType
     */
    @WebEndpoint(name = "ClientsServerPort")
    public ClientsServerPortType getClientsServerPort(WebServiceFeature... features) {
        return super.getPort(ClientsServerPort, ClientsServerPortType.class, features);
    }

}
