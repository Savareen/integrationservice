
package com.igorzaitcev.agent.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createContractsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createContractsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="client" type="{http://createcontract.server.igorzaitcev.com}registeredClient"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createContractsRequest", propOrder = {
    "client"
})
public class CreateContractsRequest {

    @XmlElement(required = true)
    protected RegisteredClient client;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredClient }
     *     
     */
    public RegisteredClient getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredClient }
     *     
     */
    public void setClient(RegisteredClient value) {
        this.client = value;
    }

}
