package com.hollywood.webform.api.model;

import java.util.Date;

public class IPOOrder {
	private String firstName;
	private String lastName;
	private Date dateCreated;
	private String productCode;
	private float price;

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

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "IPOOrder [firstName=" + firstName + ", lastName=" + lastName
				+ ", dateCreated=" + dateCreated + ", productCode="
				+ productCode + ", price=" + price + "]";
	}
}
