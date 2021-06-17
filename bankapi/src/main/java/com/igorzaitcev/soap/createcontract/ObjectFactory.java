
package com.igorzaitcev.soap.createcontract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.igorzaitcev.server.createcontract package. 
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

    private final static QName _CreateContractsRequest_QNAME = new QName("http://createcontract.server.igorzaitcev.com", "createContractsRequest");
    private final static QName _CreateContractsResponse_QNAME = new QName("http://createcontract.server.igorzaitcev.com", "createContractsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.igorzaitcev.server.createcontract
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateContractsRequest }
     * 
     */
    public CreateContractsRequest createCreateContractsRequest() {
        return new CreateContractsRequest();
    }

    /**
     * Create an instance of {@link CreateContractsResponse }
     * 
     */
    public CreateContractsResponse createCreateContractsResponse() {
        return new CreateContractsResponse();
    }

    /**
     * Create an instance of {@link RegisteredClient }
     * 
     */
    public RegisteredClient createRegisteredClient() {
        return new RegisteredClient();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateContractsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateContractsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://createcontract.server.igorzaitcev.com", name = "createContractsRequest")
    public JAXBElement<CreateContractsRequest> createCreateContractsRequest(CreateContractsRequest value) {
        return new JAXBElement<CreateContractsRequest>(_CreateContractsRequest_QNAME, CreateContractsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateContractsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateContractsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://createcontract.server.igorzaitcev.com", name = "createContractsResponse")
    public JAXBElement<CreateContractsResponse> createCreateContractsResponse(CreateContractsResponse value) {
        return new JAXBElement<CreateContractsResponse>(_CreateContractsResponse_QNAME, CreateContractsResponse.class, null, value);
    }

}
