package org.com.Bank_Acc;
import org.com.address_customer.Customer;
import Exception.*;
public abstract class Bank {

    protected String accNo;
    protected double balance;
    protected Customer accountHolder;

    // Constructor
    public Bank(String accNo, double balance, Customer accountHolder) {
        this.accNo = accNo;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    // Deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited : " + amount);
    }

    // Abstract Withdraw
    public abstract void withdraw(double amount);

    // Transfer
    public void transfer(Bank targetAccount, double amount) {

        this.withdraw(amount);
        targetAccount.deposit(amount);

        System.out.println("Transfer Successful");
    }

    // Check Balance
    public void checkBalance() {
        System.out.println("Current Balance : " + balance);
    }

    // Display Details
    public void displayAccountDetails() {

        System.out.println("===== Account Details =====");
        System.out.println("Account Number : " + accNo);
        System.out.println("Balance : " + balance);
        System.out.println(accountHolder);
    }

    public String getAccountNumber() {
        return accNo;
    }
}