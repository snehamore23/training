package Main;
import org.com.address_customer.*;
import org.com.Bank_Acc.*;
import Exception.*;

public class BankSystem {

	public static void main(String[] args) {
		 Address a1 = new Address("Nashik", "422003");
	       // Address a2 = new Address("Pune", "411001");
	        
	        
	        //Bank b1 = new Bank("State Bank of India");

	      
	        Customer c1 = new Customer("Sneha", 101, a1);
	       // Customer c2 = new Customer("Rahul", "102", a2);

	        // Create Savings Account objects
	        SavingAcc s1 = new SavingAcc("SB101", 10000, c1, 1000, 6);
	      //  SavingAcc s2 = new SavingAcc("SB102", 5000, c2, 1000, 5);

	        // Display Details
	        s1.displayAccountDetails();
	        System.out.println();

	        s1.displayAccountDetails();
	        System.out.println();

	        // Deposit
	        s1.deposit(2000);

//	        // Withdraw
        s1.withdraw(1500);
//
//	        // Transfer
//        s1.Transfer( 3000);

	        // Apply Interest
	        s1.applyMonthlyInterest();
	        //s2.applyMonthlyInterest();

	        // Check Balance
	        s1.checkBalance();
		// TODO Auto-generated method stub

	}

}
