package com.igorzaitcev.soap.createstatus;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.4
 * 2021-06-16T13:57:05.487+02:00
 * Generated source version: 3.4.4
 *
 */
@WebServiceClient(name = "StatusServer",
                  wsdlLocation = "file:/Users/igorzaitcev/SpringToolSuite/bankapi/src/main/resources/wsdl/CreateStatusServer.wsdl",
                  targetNamespace = "http://createstatus.server.igorzaitcev.com")
public class StatusServer extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://createstatus.server.igorzaitcev.com", "StatusServer");
    public final static QName StatusServerPort = new QName("http://createstatus.server.igorzaitcev.com", "StatusServerPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/igorzaitcev/SpringToolSuite/bankapi/src/main/resources/wsdl/CreateStatusServer.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(StatusServer.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/igorzaitcev/SpringToolSuite/bankapi/src/main/resources/wsdl/CreateStatusServer.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public StatusServer(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public StatusServer(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StatusServer() {
        super(WSDL_LOCATION, SERVICE);
    }

    public StatusServer(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public StatusServer(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public StatusServer(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns StatusServerPortType
     */
    @WebEndpoint(name = "StatusServerPort")
    public StatusServerPortType getStatusServerPort() {
        return super.getPort(StatusServerPort, StatusServerPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StatusServerPortType
     */
    @WebEndpoint(name = "StatusServerPort")
    public StatusServerPortType getStatusServerPort(WebServiceFeature... features) {
        return super.getPort(StatusServerPort, StatusServerPortType.class, features);
    }

}
