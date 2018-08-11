package com.moneymoney.app.model.account.pojo;

import com.moneymoney.framework.account.pojo.Customer;
import com.moneymoney.framework.account.pojo.SavingsAccount;

/**
 * @author Sangeeeta
 * 
 *         Inheriting SavingsAccount parameters from BankApp
 *
 */
public class MMSavingsAccount extends SavingsAccount {

	public MMSavingsAccount(Customer accountHolder, boolean salary) {
		super(accountHolder, salary);
	}

	public MMSavingsAccount(Customer accountHolder, double accountBalance, boolean salary) {
		super(accountHolder, accountBalance, salary);
	}
}
