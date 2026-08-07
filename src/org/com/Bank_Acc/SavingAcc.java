package org.com.Bank_Acc;

import org.com.address_customer.Customer;

public class SavingAcc {

    private String accountNo;
    private double balance;
    private Customer customer;
    private double minimumBalance;
    private double annualInterestRate;

    public SavingAcc(String accountNo, double balance, Customer customer,
                     double minimumBalance, double annualInterestRate) {

        this.accountNo = accountNo;
        this.balance = balance;
        this.customer = customer;
        this.minimumBalance = minimumBalance;
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited : " + amount);
    }

    public void checkBalance() {
        System.out.println("Current Balance : " + balance);
    }

    public void applyMonthlyInterest() {
        double interest = (balance * annualInterestRate) / (12 * 100);
        balance += interest;
        System.out.println("Monthly Interest Added : " + interest);
    }

    public void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Amount Withdrawn : " + amount);
        } else {
            System.out.println("Insufficient Balance! Minimum Balance should be maintained.");
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNo);
        System.out.println("Customer Details : " + customer);
        System.out.println("Balance : " + balance);
        System.out.println("Minimum Balance : " + minimumBalance);
        System.out.println("Interest Rate : " + annualInterestRate + "%");
    }

	}