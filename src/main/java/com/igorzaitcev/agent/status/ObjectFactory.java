
package com.igorzaitcev.agent.status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.igorzaitcev.server.createstatus package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateStatusRequest_QNAME = new QName("http://createstatus.server.igorzaitcev.com", "createStatusRequest");
    private final static QName _CreateStatusResponse_QNAME = new QName("http://createstatus.server.igorzaitcev.com", "createStatusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.igorzaitcev.server.createstatus
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateStatusRequest }
     * 
     */
    public CreateStatusRequest createCreateStatusRequest() {
        return new CreateStatusRequest();
    }

    /**
     * Create an instance of {@link CreateStatusResponse }
     * 
     */
    public CreateStatusResponse createCreateStatusResponse() {
        return new CreateStatusResponse();
    }

    /**
     * Create an instance of {@link ContractStatus }
     * 
     */
    public ContractStatus createContractStatus() {
        return new ContractStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStatusRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateStatusRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://createstatus.server.igorzaitcev.com", name = "createStatusRequest")
    public JAXBElement<CreateStatusRequest> createCreateStatusRequest(CreateStatusRequest value) {
        return new JAXBElement<CreateStatusRequest>(_CreateStatusRequest_QNAME, CreateStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://createstatus.server.igorzaitcev.com", name = "createStatusResponse")
    public JAXBElement<CreateStatusResponse> createCreateStatusResponse(CreateStatusResponse value) {
        return new JAXBElement<CreateStatusResponse>(_CreateStatusResponse_QNAME, CreateStatusResponse.class, null, value);
    }

}
