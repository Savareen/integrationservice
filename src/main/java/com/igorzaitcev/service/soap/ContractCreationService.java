package com.igorzaitcev.service.soap;

import java.net.MalformedURLException;
import java.net.URL;

import com.igorzaitcev.exceptions.IntegrationCustomException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.igorzaitcev.agent.contract.ContractsServerPortType;
import com.igorzaitcev.agent.contract.CreateContractsRequest;
import com.igorzaitcev.agent.contract.CreateContractsResponse;
import com.igorzaitcev.agent.contract.CreateContractsServiceService;
import com.igorzaitcev.agent.contract.RegisteredClient;

import javax.xml.ws.WebServiceException;

@Service
public class ContractCreationService {

	private static final Logger log = LoggerFactory.getLogger(ContractCreationService.class);
	private static final String CREATE_CONTRACT_URL = "http://localhost:8081/api/contractscreateservice?wsdl";
	private CreateContractsServiceService service;

	public long getContractsId(RegisteredClient registeredclient) {
		try {
			service = new CreateContractsServiceService(new URL(CREATE_CONTRACT_URL));
		} catch (WebServiceException | MalformedURLException e) {
			e.printStackTrace();
			throw new IntegrationCustomException();
		}
		ContractsServerPortType contractsPort = service.getCreateContractsServicePort();
		CreateContractsRequest request = new CreateContractsRequest();
		log.info("Request {} to the Contract service", registeredclient);
		CreateContractsResponse response = contractsPort.createContracts(request);
		log.info("Respons Contract number {} from the Contract service", response.getContractId());
		return response.getContractId();

	}
}
