package com.igorzaitcev.service;

import com.igorzaitcev.model.ClientDTO;
import com.igorzaitcev.model.ContractDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.ws.rs.core.Response;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerContractServiceTest {

    @Autowired
    CustomerContractService customerContractService;

    private ContractDTO expected;

    @Test
    void createClient() {
        init();
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setFirstName("Han");
        clientDTO.setLastName("Solo");
        Response response = customerContractService.createClient(clientDTO);
        ContractDTO contractDTO = (ContractDTO) response.getEntity();
        assertTrue(expected.equals(contractDTO));
    }

    private void init() {
        expected = new ContractDTO();
        expected.setContractId(1L);
        expected.setStatus("send");
    }
}