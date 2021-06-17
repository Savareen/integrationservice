package com.igorzaitcev.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.igorzaitcev.service.CreateClientsService;
import com.igorzaitcev.service.CreateContractsService;
import com.igorzaitcev.service.CreateStatusService;

@Configuration
public class WebServiceConfig {
	
	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint createClients() {
		Endpoint endpoint = new EndpointImpl(bus, new CreateClientsService());
		endpoint.publish("/clientscreateservice");
		return endpoint;
	}
	
	@Bean
	public Endpoint createContracts() {
		Endpoint endpoint = new EndpointImpl(bus, new CreateContractsService());
		endpoint.publish("/contractscreateservice");
		return endpoint;
	}

	@Bean
	public Endpoint createStatus() {
		Endpoint endpoint = new EndpointImpl(bus, new CreateStatusService());
		endpoint.publish("/statuscreateservice");
		return endpoint;
	}
}
