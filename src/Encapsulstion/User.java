package Encapsulstion;

public class User {

	public static void main(String[] args) {
//	a1.setAccNo(1234567891);
//	System.out.println(a1.getAccNo(1234567891));
//	
//	a1.setCustomerName("vaish");
//	System.out.println(a1.getCustomerName());
////	
//	a1.setBalance(1000);
//	System.out.println(a1.getBalance());
	
	Account a1=new Account();
	a1.setAccnumber(1234567891);
	a1.setCustomerName("vaish");
	a1.setAccountType("saving");
	a1.setBalance(1000);
	
	a1.deposit(1000, 1234567891);
	a1.withdraw(500, 1234567891);
	a1.checkBalance(1234567891);
	a1.displayAccountDetails(1234567891);
	
	

	}

}

