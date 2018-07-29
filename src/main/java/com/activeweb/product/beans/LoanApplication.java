package com.activeweb.product.beans;

import java.io.Serializable;

public class LoanApplication implements Serializable {

	private static final long serialVersionUID = 9178404937008621182L;

	private String applicationId;
	private String firstName;
	private String lastName;

	public LoanApplication(String string, String string2, String string3) {
		applicationId = string;
		firstName = string2;
		lastName = string3;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
