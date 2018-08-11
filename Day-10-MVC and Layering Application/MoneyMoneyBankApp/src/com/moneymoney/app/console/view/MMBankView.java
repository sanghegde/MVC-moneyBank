package com.moneymoney.app.console.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.moneymoney.app.console.controller.MMBankAccountController;
import com.moneymoney.framework.account.pojo.BankAccount;
import com.moneymoney.framework.controller.BankController;

/**
 * @author Sangeeta Presentation on the console
 *
 */
public class MMBankView {

	BankController bankController;

	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	Map<String, Object> accountDetails = new HashMap<>();

	// This is a Ctor..
	public MMBankView() {
		super();
		bankController = new MMBankAccountController();
	}

	// to start the money money bank application
	public void start() throws IOException {
		do {
			showMenu();
		} while (true);
	}

	// menu to make a choice
	private void showMenu() throws IOException {
		System.out.println("Make Choice : ");
		System.out.println("1. Add New Savings Account");
		System.out.println("2. Add New Current Account");
		System.out.println("3. Show All Accounts");
		System.out.println("4. Get Next Account Number");
		System.out.println("5. Search Account By Account Number");
		System.out.println("6. Exit");

		acceptChoice();
	}

	// switch case to accept the choice
	private void acceptChoice() throws IOException {

		int choice = Integer.parseInt(bufferedReader.readLine());

		switch (choice) {
		case 1:
			addNewSavingsAccount();
			bankController.createNewSavingsAccount(accountDetails);
			break;
		case 2:
			addNewCurrentAccount();
			bankController.createNewCurrentAccount(accountDetails);
			break;
		case 3:
			showAccounts(bankController.getAllAccounts());
			break;
		case 4:
			System.out.println(bankController.getNextAccountNumber());
			break;
		case 5:
			System.out.println("Enter Account Number");
			BankAccount bankAccount = bankController.getAccountById(Integer.parseInt(bufferedReader.readLine()));
			System.out.println(bankAccount);
			break;
		default:
			System.exit(1);
			break;
		}
	}

	// showing the status of the accounts created
	private void showAccounts(Collection<BankAccount> collection) {
		collection.stream().forEach(System.out::println);
	}

	// generating savings account details
	private void addNewSavingsAccount() throws IOException {

		System.out.println("Enter Account Holder Name: ");
		String accountHolderName = bufferedReader.readLine();
		accountDetails.put("accountHolderName", accountHolderName);

		System.out.println("Enter Account Balance: ");
		double accountBalance = Double.parseDouble(bufferedReader.readLine());
		accountDetails.put("accountBalance", accountBalance);

		System.out.println("Enter Salary?(n/y): ");
		String salary = bufferedReader.readLine();
		accountDetails.put("salary", salary.equalsIgnoreCase("n") ? false : true);

		acceptCustomerDetails();

	}

	// generating current account details
	private void addNewCurrentAccount() throws NumberFormatException, IOException {

		System.out.println("Enter account balance: ");
		double accountBalance = Double.parseDouble(bufferedReader.readLine());
		accountDetails.put("accountBalance", accountBalance);

		System.out.println("Enter OdLimit");
		accountDetails.put("overdraft", Double.parseDouble(bufferedReader.readLine()));

		acceptCustomerDetails();
	}

	// generating customer details
	private void acceptCustomerDetails() throws NumberFormatException, IOException {

		System.out.println("Enter Contact Number: ");
		Long contact = Long.parseLong(bufferedReader.readLine());
		accountDetails.put("contact", contact);

		System.out.println("Enter Date of Birth(dd/mm/yyyy): ");
		String dobStr = bufferedReader.readLine();
		LocalDate dateOfBirth = getDate(dobStr);
		accountDetails.put("dateOfBirth", dateOfBirth);

		System.out.println("Enter Account Holder Name: ");
		String accountHolderName = bufferedReader.readLine();
		accountDetails.put("accountHolderName", accountHolderName);

		System.out.println("Enter Contact Number: ");
		accountDetails.put("contactNumber", Long.parseLong(bufferedReader.readLine()));

		System.out.println("Enter Nationality: ");
		String nationality = bufferedReader.readLine();
		accountDetails.put("nationality", nationality);

		System.out.println("Enter gender:");
		String gender = bufferedReader.readLine();
		accountDetails.put("gender", gender);

		acceptingAddress();
	}

	// generating customer address details
	private void acceptingAddress() throws IOException {

		System.out.println("Enter houseNo: ");
		String houseNo = bufferedReader.readLine();
		accountDetails.put("houseNo", houseNo);

		System.out.println("Enter street: ");
		String street = bufferedReader.readLine();
		accountDetails.put("street", street);

		System.out.println("Enter city: ");
		String city = bufferedReader.readLine();
		accountDetails.put("city", city);

		System.out.println("Enter state: ");
		String state = bufferedReader.readLine();
		accountDetails.put("state", state);

		System.out.println("Enter pincode: ");
		accountDetails.put("pincode", Integer.parseInt(bufferedReader.readLine()));
	}

	// dateformat checking
	private LocalDate getDate(String dobStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(dobStr, formatter);
		return date;
	}

}
