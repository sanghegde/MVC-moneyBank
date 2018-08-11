package com.moneymoney.app.model.account.pojo;

import com.moneymoney.framework.account.pojo.Address;

/**
 * @author Sangeeta Inheriting the address parameters from BankApp
 *
 */
public class MMAddress extends Address {

	public MMAddress(String houseNo, String street, String city, String state, int pinCode) {
		super(houseNo, street, city, state, pinCode);
	}

}
