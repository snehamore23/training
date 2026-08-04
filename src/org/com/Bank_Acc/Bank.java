package org.com.Bank_Acc;

import org.com.address_customer.Customer;

public abstract class Bank {
	String Acc_no;
	double balance;
	Customer AccountHolder;
	

	public Bank(String acc_no) {
		super();
		this.Acc_no = acc_no;
		this.balance = balance;
		this.AccountHolder = AccountHolder;
	}

			public void deposit(double amount) {
				System.out.println("Previous Balance: "+balance);
				balance+=amount;
				System.out.println("Amount deposited: "+amount);
			}
			public abstract void withdraw (double amount);
			
			public void transfer(Bank targetAccount, double amount) {
				 withdraw(amount);
			        targetAccount.deposit(amount);

			        System.out.println("Transfer Successful");			
			}
			public void checkBalance() {
				 System.out.println("Current Balance : " + balance);	
			}
			public void displayAccountDetails() {

			    System.out.println("===== Bank Account Details =====");
			    System.out.println("Account Number : " + Acc_no);
			    System.out.println("Balance : " + balance);

			    System.out.println("Customer Name : " + AccountHolder.name);
			    System.out.println("Customer ID : " + AccountHolder.customerid);

		    }
			public String getAccountNumber() {
				return Acc_no;
			}


}
