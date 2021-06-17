package com.igorzaitcev.soap.createstatus;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.4
 * 2021-06-16T13:57:05.454+02:00
 * Generated source version: 3.4.4
 *
 */
@WebService(targetNamespace = "http://createstatus.server.igorzaitcev.com", name = "StatusServerPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface StatusServerPortType {

    @WebMethod(action = "http://igorzaitcev.com/NewOperation")
    @WebResult(name = "createStatusResponse", targetNamespace = "http://createstatus.server.igorzaitcev.com", partName = "parameters")
    public CreateStatusResponse createStatus(

        @WebParam(partName = "parameters", name = "createStatusRequest", targetNamespace = "http://createstatus.server.igorzaitcev.com")
        CreateStatusRequest parameters
    );
}