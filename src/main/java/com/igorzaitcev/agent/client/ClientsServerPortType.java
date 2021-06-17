package com.igorzaitcev.agent.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.4
 * 2021-06-16T15:34:00.951+02:00
 * Generated source version: 3.4.4
 *
 */
@WebService(targetNamespace = "http://createclient.server.igorzaitcev.com", name = "ClientsServerPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ClientsServerPortType {

    @WebMethod(action = "http://igorzaitcev.com/NewOperation")
    @WebResult(name = "createClientsResponse", targetNamespace = "http://createclient.server.igorzaitcev.com", partName = "parameters")
    public CreateClientsResponse createClients(

        @WebParam(partName = "parameters", name = "createClientsRequest", targetNamespace = "http://createclient.server.igorzaitcev.com")
        CreateClientsRequest parameters
    );
}