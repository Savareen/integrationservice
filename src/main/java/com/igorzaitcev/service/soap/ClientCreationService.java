package com.igorzaitcev.service.soap;

import java.net.MalformedURLException;
import java.net.URL;

import com.igorzaitcev.exceptions.IntegrationCustomException;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.igorzaitcev.agent.client.Client;
import com.igorzaitcev.agent.client.ClientsServerPortType;
import com.igorzaitcev.agent.client.CreateClientsRequest;
import com.igorzaitcev.agent.client.CreateClientsResponse;
import com.igorzaitcev.agent.client.CreateClientsServiceService;

import javax.xml.ws.WebServiceException;

@Service
public class ClientCreationService {

	private static final Logger log = LoggerFactory.getLogger(ClientCreationService.class);
	private static final String CREATE_CLIENT_URL = "http://localhost:8081/api/clientscreateservice?wsdl";
	private CreateClientsServiceService service;

	public Client getClientsId(Client client)  {
		try {
			service = new CreateClientsServiceService(new URL(CREATE_CLIENT_URL));
		} catch (WebServiceException | MalformedURLException e) {
			e.printStackTrace();
			throw new IntegrationCustomException();
		}
		ClientsServerPortType clientsPort = service.getCreateClientsServicePort();
		CreateClientsRequest request = new CreateClientsRequest();
		request.setClient(client);
		log.info("Request {} to the Client service", client);
		CreateClientsResponse response = clientsPort.createClients(request);
		log.info("Respons {} from the Client service", response.getClient());
		return response.getClient();

	}

}
