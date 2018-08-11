package com.moneymoney.framework.account.pojo;

/**
 * 
 * @author Sangeeta
 *
 *         Maintaining current account details of all the holders
 */
public abstract class CurrentAccount extends BankAccount {

	private double odLimit;

	// This is a Ctor..
	public CurrentAccount(Customer accountHolder, double accountBalance, double odLimit) {
		super(accountHolder, accountBalance);
		this.odLimit = odLimit;
	}

	// getters and setters
	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}

	// toString method to print the values
	@Override
	public String toString() {
		return "CurrentAccount [odLimit=" + odLimit + ", toString()=" + super.toString() + "]";
	}
}
