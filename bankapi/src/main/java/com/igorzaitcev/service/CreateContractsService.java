package com.igorzaitcev.service;

import com.igorzaitcev.soap.createcontract.ContractsServerPortType;
import com.igorzaitcev.soap.createcontract.CreateContractsRequest;
import com.igorzaitcev.soap.createcontract.CreateContractsResponse;

public class CreateContractsService implements ContractsServerPortType {

	private static long contractId;
	
	@Override
	public CreateContractsResponse createContracts(CreateContractsRequest request) {
		CreateContractsResponse response = new CreateContractsResponse();
		response.setContractId(++contractId);;
		return response;
	}

}
