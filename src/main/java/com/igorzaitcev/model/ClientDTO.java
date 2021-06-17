package com.igorzaitcev.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ClientDTO")
public class ClientDTO {

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastNameame) {
		lastName = lastNameame;
	}

	@Override
	public String toString() {
		return "ClientDTO [firstName=" + firstName + ", LastName=" + lastName + "]";
	}

}
