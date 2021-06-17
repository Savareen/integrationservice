package com.igorzaitcev.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

	private static final String MESSAGE_URL = "http://localhost:8081/api/restclient/message";

	public boolean sendMessage(Long contractId) {
		if (contractId % 2 == 0L) {
			return false;
		}
		return true;
	}

}
