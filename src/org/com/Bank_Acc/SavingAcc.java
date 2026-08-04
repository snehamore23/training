package org.com.Bank_Acc;
import org.com.address_customer.Customer;

public class SavingAcc {
	double minimumBalance;
   double annualInterestRate;
   
	public SavingAcc(double minimumBalance, double annualInterestRate) {
	super();
	this.minimumBalance = minimumBalance;
	this.annualInterestRate = annualInterestRate;
}

	public SavingAcc(String string, int i, Customer c1, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SavingAcc [minimumBalance=" + minimumBalance + ", annualInterestRate=" + annualInterestRate + "]";
	}
    public void applyMonthlyInterest() {
    	 double interest = (minimumBalance * annualInterestRate) / (12 * 100);
         minimumBalance = minimumBalance + interest;

         System.out.println("Monthly Interest Added : " + interest);
    }
	
}
