package com.moneymoney.framework.account.pojo;

/**
 * 
 * @author Sangeeta
 *
 *         Maintaining savings account details of money money bank
 */
public abstract class SavingsAccount extends BankAccount {

	private boolean salary;

	// This is a Ctor..
	public SavingsAccount(Customer accountHolder, double accountBalance, boolean salary) {
		super(accountHolder, accountBalance);
		this.salary = salary;
	}

	public SavingsAccount(Customer accountHolder, boolean salary) {
		super(accountHolder);
		this.salary = salary;
	}

	// to check if the account is zero balance or not
	public boolean isSalary() {
		return salary;
	}

	// asking the user to enter the amount
	public void setSalary(boolean salary) {
		this.salary = salary;
	}

	// toString method prints the values
	@Override
	public String toString() {
		return "SavingsAccount [salary=" + salary + ", toString()=" + super.toString() + "]";
	}
}
