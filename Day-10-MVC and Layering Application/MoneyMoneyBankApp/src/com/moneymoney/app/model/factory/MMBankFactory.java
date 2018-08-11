package com.moneymoney.app.model.factory;

import java.time.LocalDate;
import java.util.Map;

import com.moneymoney.app.model.account.pojo.MMAddress;
import com.moneymoney.app.model.account.pojo.MMCurrentAccount;
import com.moneymoney.app.model.account.pojo.MMCustomer;
import com.moneymoney.app.model.account.pojo.MMSavingsAccount;
import com.moneymoney.framework.account.pojo.CurrentAccount;
import com.moneymoney.framework.account.pojo.SavingsAccount;
import com.moneymoney.framework.factory.BankFactory;

/**
 * @author Sangeeta
 *
 *         For returning the account objects created
 */
public class MMBankFactory extends BankFactory {

	// overriding the method from current account to obtain the current account
	// details
	@Override
	public CurrentAccount createNewCurrentAccount(Map<String, Object> arg0) {

		MMAddress address = new MMAddress((String) arg0.get("houseNumber"), (String) arg0.get("street"),
				(String) arg0.get("city"), (String) arg0.get("state"), (int) arg0.get("pincode"));

		return new MMCurrentAccount(
				(new MMCustomer((String) arg0.get("accountHolderName"), (long) arg0.get("contactNumber"),
						(LocalDate) arg0.get("dateOfBirth"), (String) arg0.get("nationality"),
						(String) arg0.get("gender"))),
				(double) arg0.get("accountBalance"), (double) arg0.get("overdraft"));
	}

	// overriding the method from savings account to obtain the savings account
	// details
	@Override
	public SavingsAccount createNewSavingsAccount(Map<String, Object> arg0) {

		MMAddress address = new MMAddress((String) arg0.get("houseNumber"), (String) arg0.get("street"),
				(String) arg0.get("city"), (String) arg0.get("state"), (int) arg0.get("pincode"));

		return new MMSavingsAccount(
				(new MMCustomer((String) arg0.get("accountHolderName"), (long) arg0.get("contactNumber"),
						(LocalDate) arg0.get("dateOfBirth"), (String) arg0.get("nationality"),
						(String) arg0.get("gender"))),
				(double) arg0.get("accountBalance"), (boolean) arg0.get("salary"));
	}

}
