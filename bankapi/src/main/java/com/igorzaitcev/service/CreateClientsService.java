package com.igorzaitcev.service;

import com.igorzaitcev.soap.createclient.Client;
import com.igorzaitcev.soap.createclient.ClientsServerPortType;
import com.igorzaitcev.soap.createclient.CreateClientsRequest;
import com.igorzaitcev.soap.createclient.CreateClientsResponse;

public class CreateClientsService implements ClientsServerPortType {

	private static long clientId;

	@Override
	public CreateClientsResponse createClients(CreateClientsRequest request) {
		CreateClientsResponse response = new CreateClientsResponse();
		Client client = request.getClient();
		client.setClientId(++clientId);
		response.setClient(client);
		return response;
	}

}
