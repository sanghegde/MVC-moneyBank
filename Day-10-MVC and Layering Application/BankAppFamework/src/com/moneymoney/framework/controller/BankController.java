package com.moneymoney.framework.controller;

import java.util.Collection;
import java.util.Map;

import com.moneymoney.framework.account.pojo.BankAccount;
import com.moneymoney.framework.account.pojo.Customer;

/**
 * @author Sangeeta
 * 
 *         This is a controller which has all abstraction of bank services
 */
public abstract class BankController {

	public abstract void createNewSavingsAccount(Map<String, Object> account);

	public abstract void createNewCurrentAccount(Map<String, Object> account);

	// accepting the current balance
	public double getCurrrentBalance(BankAccount bankAccount) {
		return bankAccount.getAccountBalance();
	}

	// to print the next account number
	public int getNextAccountNumber() {
		return BankAccount.getNextAccountNumber();
	}

	public abstract Collection<BankAccount> getAllAccounts();

	public abstract Collection<Customer> getAllCustomers();

	public abstract BankAccount getAccountById(int id);

}
