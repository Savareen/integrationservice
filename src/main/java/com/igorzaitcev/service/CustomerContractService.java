package com.igorzaitcev.service;

import java.net.MalformedURLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.datatype.XMLGregorianCalendar;

import com.igorzaitcev.exceptions.IntegrationCustomException;
import com.igorzaitcev.service.soap.ClientCreationService;
import com.igorzaitcev.service.soap.ContractCreationService;
import com.igorzaitcev.service.soap.StatusCreationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.igorzaitcev.agent.client.Client;
import com.igorzaitcev.agent.contract.RegisteredClient;
import com.igorzaitcev.agent.status.ContractStatus;
import com.igorzaitcev.controller.ClientController;
import com.igorzaitcev.model.ClientDTO;
import com.igorzaitcev.model.ContractDTO;
import com.igorzaitcev.model.IntegrationData;
import com.igorzaitcev.service.MessageService;

@Service
public class CustomerContractService implements ClientController {
	
	private static final Logger log = LoggerFactory.getLogger(ClientCreationService.class);
	private ClientCreationService clientService;
	private IntegrationData integrationData;
	private ContractCreationService contractService;
	private MessageService messageService;
	private StatusCreationService statusService;
	
	public CustomerContractService(ClientCreationService clientService,
			ContractCreationService contractService, MessageService messageService,
			StatusCreationService statusService) {
		this.clientService = clientService;
		this.integrationData = new IntegrationData();
		this.contractService = contractService;
		this.messageService = messageService;
		this.statusService = statusService;
	}

	@Override
	public Response createClient(ClientDTO clientDTO) {
		Client clientWithId = createNewClient(clientDTO);
		long contractId = createNewContract(clientWithId);
		boolean status = sendContract(contractId);
		renewStatus(status);
		return Response.ok(generateContractDTO()).type(MediaType.APPLICATION_JSON).build();
	}

	private void renewStatus(boolean status) {
		ContractStatus contractStatus = statusService.getStatusContract(status);
		integrationData.setLocalDateTime(convertTime(contractStatus.getDate()));
		integrationData.setStatus(contractStatus.getStatus());
		log.info("Customer contract was successfully registered at {}", integrationData.getLocalDateTime());
	}

	private boolean sendContract(long contractId) {
		boolean status = messageService.sendMessage(contractId);
		if (!status) {
			log.info("Customer request failed Name: {} {} Customer ID: {} Contract number: {}", 
					integrationData.getFirstName(), integrationData.getLastName(),
					integrationData.getClientId(), integrationData.getContractId());
			throw new IntegrationCustomException();
		}
		return status;
	}

	private long createNewContract(Client clientWithId) {
		RegisteredClient registeredClient = mapClientToRegisteredClient(clientWithId);
		long contractId = contractService.getContractsId(registeredClient);
		integrationData.setContractId(contractId);
		log.info("New Contract number {} registered", contractId);
		return contractId;
	}


	private Client createNewClient(ClientDTO clientDTO) {
		Client client = mapClientDTOtoClient(clientDTO);
		log.info("New {} registration", clientDTO);
		client = clientService.getClientsId(client);
		return client;
	}

	private ContractDTO generateContractDTO() {
		ContractDTO contractDTO = new ContractDTO();
		contractDTO.setContractId(integrationData.getContractId());
		contractDTO.setStatus(integrationData.getStatus());
		return contractDTO;
	}

	private Client mapClientDTOtoClient(ClientDTO clientDTO) {
		Client client = new Client();
		String firstName = clientDTO.getFirstName();
		String lastName = clientDTO.getLastName();
		client.setFirstName(firstName);
		client.setLastName(lastName);
		integrationData.setFirstName(firstName);
		integrationData.setLastName(lastName);
		return client;
		
	}
	
	private RegisteredClient mapClientToRegisteredClient(Client clientWithId) {
		RegisteredClient registeredClient = new RegisteredClient();
		long clientId = clientWithId.getClientId();
		integrationData.setClientId(clientId);
		registeredClient.setClientId(clientId);
		registeredClient.setFirstName(clientWithId.getFirstName());
		registeredClient.setLastName(clientWithId.getLastName());
		return registeredClient;
	}

	private LocalDateTime convertTime(XMLGregorianCalendar date) {
		ZonedDateTime utcZoned = date.toGregorianCalendar().toZonedDateTime().withZoneSameInstant(ZoneId.of("UTC"));
		LocalDateTime ldt = utcZoned.toLocalDateTime();
		return ldt;
	}

}
