package com.moneymoney.app.console.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import com.moneymoney.app.model.dao.MMBankCollection;
import com.moneymoney.app.model.factory.MMBankFactory;
import com.moneymoney.framework.account.dao.BankAccountCollection;
import com.moneymoney.framework.account.pojo.BankAccount;
import com.moneymoney.framework.account.pojo.Customer;
import com.moneymoney.framework.controller.BankController;
import com.moneymoney.framework.factory.BankFactory;

/**
 * @author Sangeeta
 *
 *         This is a controller which requests the processor to perform various
 *         tasks
 */
public class MMBankAccountController extends BankController {

	BankFactory bankfactory;
	BankAccountCollection bankcollection;

	// This is a Ctor..
	public MMBankAccountController() {
		bankfactory = new MMBankFactory();
		bankcollection = new MMBankCollection();
	}

	// overriding the methods from bank controller
	// creating current account
	@Override
	public void createNewCurrentAccount(Map<String, Object> arg0) {

		bankcollection.addBankAccount(bankfactory.createNewCurrentAccount(arg0));
	}

	// creating savings account
	@Override
	public void createNewSavingsAccount(Map<String, Object> arg0) {

		bankcollection.addBankAccount(bankfactory.createNewSavingsAccount(arg0));

	}

	// used to view all the account details
	@Override
	public Collection<BankAccount> getAllAccounts() {

		return bankcollection.viewAll();
	}

	// used to view all the customer details
	@Override
	public Collection<Customer> getAllCustomers() {

		ArrayList<Customer> customer = new ArrayList<>();
		(bankcollection.viewAll()).stream().forEach((element) -> customer.add(element.getAccountHolder()));
		return customer;
	}

	// search account by account number
	@Override
	public BankAccount getAccountById(int id) {

		for (BankAccount account : bankcollection.viewAll()) {
			if (account.getAccountNumber() == id) {
				return account;
			}
		}
		return null;
	}

}
