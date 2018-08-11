package com.moneymoney.app.model.account.pojo;

import java.time.LocalDate;

import com.moneymoney.framework.account.pojo.Address;
import com.moneymoney.framework.account.pojo.Customer;

/**
 * @author Sangeeta
 * 
 *         Inheriting Customer parameters from BankApp
 *
 */
public class MMCustomer extends Customer {

	public MMCustomer(String customerName, long contactNumber, LocalDate dateOfBirth, String nationality,
			String gender) {
		super(customerName, contactNumber, dateOfBirth, nationality, gender);
	}

}
