package com.moneymoney.framework.account.dao;

import java.util.HashSet;
import java.util.Set;

import com.moneymoney.framework.account.pojo.BankAccount;

/**
 * @author Sangeeta
 *
 *         This is a class for maintaining the list of all unique account
 *         objects.
 *
 */
public abstract class BankAccountCollection {

	private static Set<BankAccount> bankAccountSet;

	static {
		bankAccountSet = new HashSet<>();
	}

	/**
	 * @param bankAccount
	 * 
	 *                    This method takes account object and adds it in the
	 *                    database
	 */
	public void addBankAccount(BankAccount bankAccount) {
		bankAccountSet.add(bankAccount);
	}

	/**
	 * @return Set of Accounts
	 * 
	 *         This method is responsible for returning all the active accounts
	 */
	public Set<BankAccount> viewAll() {
		return bankAccountSet;
	}
}
