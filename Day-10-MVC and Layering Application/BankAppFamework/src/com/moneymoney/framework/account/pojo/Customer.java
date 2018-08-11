package com.moneymoney.framework.account.pojo;

import java.time.LocalDate;

/**
 * 
 * @author Sangeeta
 *
 *         Maintaining customer details of money money bank
 */
public abstract class Customer {

	private final int customerId;
	private String customerName;
	private long contactNumber;
	private LocalDate dateOfBirth;
	private String nationality;
	private String gender;

	/**
	 * 
	 * @param customerId
	 * @param customerName
	 * @param contactNumber
	 * @param dateOfBirth
	 * @param nationality
	 * @param gender
	 * 
	 */

	private static int custId;

	// gets invoked whenever a class is loaded
	static {
		custId = 200;
	}

	// gets invoked whenever a new object is created
	{
		this.customerId = ++custId;
	}

	// This is a Ctor..
	public Customer(String customerName, long contactNumber, LocalDate dateOfBirth, String nationality, String gender) {

		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
		this.gender = gender;
	}

	// getters and setters
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGender() {
		return gender;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getCustomerId() {
		return customerId;
	}

	// toString method to print all the values
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", dateOfBirth=" + dateOfBirth + ", nationality=" + nationality + ", gender=" + gender
				+ "]";
	}
}
