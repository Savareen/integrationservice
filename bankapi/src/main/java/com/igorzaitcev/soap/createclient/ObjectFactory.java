
package com.igorzaitcev.soap.createclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.igorzaitcev.server.createclient package. 
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

    private final static QName _CreateClientsRequest_QNAME = new QName("http://createclient.server.igorzaitcev.com", "createClientsRequest");
    private final static QName _CreateClientsResponse_QNAME = new QName("http://createclient.server.igorzaitcev.com", "createClientsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.igorzaitcev.server.createclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateClientsRequest }
     * 
     */
    public CreateClientsRequest createCreateClientsRequest() {
        return new CreateClientsRequest();
    }

    /**
     * Create an instance of {@link CreateClientsResponse }
     * 
     */
    public CreateClientsResponse createCreateClientsResponse() {
        return new CreateClientsResponse();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClientsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateClientsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://createclient.server.igorzaitcev.com", name = "createClientsRequest")
    public JAXBElement<CreateClientsRequest> createCreateClientsRequest(CreateClientsRequest value) {
        return new JAXBElement<CreateClientsRequest>(_CreateClientsRequest_QNAME, CreateClientsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClientsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateClientsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://createclient.server.igorzaitcev.com", name = "createClientsResponse")
    public JAXBElement<CreateClientsResponse> createCreateClientsResponse(CreateClientsResponse value) {
        return new JAXBElement<CreateClientsResponse>(_CreateClientsResponse_QNAME, CreateClientsResponse.class, null, value);
    }

}
