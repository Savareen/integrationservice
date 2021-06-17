package com.igorzaitcev.service.soap;

import java.net.MalformedURLException;
import java.net.URL;

import com.igorzaitcev.exceptions.IntegrationCustomException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.igorzaitcev.agent.status.ContractStatus;
import com.igorzaitcev.agent.status.CreateStatusRequest;
import com.igorzaitcev.agent.status.CreateStatusResponse;
import com.igorzaitcev.agent.status.CreateStatusServiceService;
import com.igorzaitcev.agent.status.StatusServerPortType;

import javax.xml.ws.WebServiceException;

@Service
public class StatusCreationService {
	
	private static final Logger log = LoggerFactory.getLogger(StatusCreationService.class);
	private static final String CREATE_STATUS_URL = "http://localhost:8081/api/statuscreateservice?wsdl";
	private CreateStatusServiceService service;
	
	public ContractStatus getStatusContract(boolean status) {
		try {
		service = new CreateStatusServiceService(new URL(CREATE_STATUS_URL));
		} catch (WebServiceException | MalformedURLException e) {
			e.printStackTrace();
			throw new IntegrationCustomException();
		}
		StatusServerPortType statusPort = service.getCreateStatusServicePort();
		CreateStatusRequest request = new CreateStatusRequest();
		request.setStatus(status);
		log.info("Request status {} to the Status service", request.isStatus());
		CreateStatusResponse response = statusPort.createStatus(request);
		log.info("Respons {} from the Status service", response.getContractStatus());
		return response.getContractStatus();
	}

}
