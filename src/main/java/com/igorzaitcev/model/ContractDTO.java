package com.igorzaitcev.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement(name = "ContractDTO")
public class ContractDTO {

	private long contractId;
	private String status;

	public long getContractId() {
		return contractId;
	}

	public void setContractId(long contractId) {
		this.contractId = contractId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ContractDTO that = (ContractDTO) o;
		return contractId == that.contractId && Objects.equals(status, that.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(contractId, status);
	}
}
