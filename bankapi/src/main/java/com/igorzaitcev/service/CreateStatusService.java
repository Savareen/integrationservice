package com.igorzaitcev.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.igorzaitcev.soap.createstatus.ContractStatus;
import com.igorzaitcev.soap.createstatus.CreateStatusRequest;
import com.igorzaitcev.soap.createstatus.CreateStatusResponse;
import com.igorzaitcev.soap.createstatus.StatusServerPortType;

public class CreateStatusService implements StatusServerPortType {
	
	private XMLGregorianCalendar calendar;

	@Override
	public CreateStatusResponse createStatus(CreateStatusRequest request) {
		CreateStatusResponse response = new CreateStatusResponse();
		ContractStatus contractStatus = new ContractStatus();
		if (request.isStatus()) {
			contractStatus.setStatus("send");
		} else {
			contractStatus.setStatus("not send");
		}
		contractStatus.setDate(getTime());
		response.setContractStatus(contractStatus);
		return response;
	}

	private XMLGregorianCalendar getTime() {
		LocalDateTime localDatetime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

		String formattedDate = localDatetime.format(formatter);
		try {
			calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(formattedDate);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return calendar;
	}

}
