package com.moneymoney.framework.account.pojo;

/**
 * @author Sangeeta
 *
 *         This is an address class to maintain the address of the customer.
 */
public abstract class Address {

	private String houseNo;
	private String street;
	private String city;
	private String state;
	private int pinCode;

	/**
	 * 
	 * @param houseNo
	 * @param street
	 * @param city
	 * @param state
	 * @param pinCode
	 * 
	 *                This is a Ctor...
	 */
	public Address(String houseNo, String street, String city, String state, int pinCode) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	// using getter and setter methods
	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	// using toString method to print all the parameters along with values
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", pinCode=" + pinCode + "]";
	}
}
