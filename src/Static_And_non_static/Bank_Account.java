package Static_And_non_static;

public class Bank_Account {
int Account_Number;
String Customer_Name;
int Balance;
String Account_type;



static int IFSC_Code;
static String Bank_Name;
static String Branch_Name;
static int Min_Balance;


static {
	IFSC_Code=325679558;
	Bank_Name="SBI";
	Branch_Name="dhule";
	Min_Balance=4000;
	
}
public void depositeMoney(){
	System.out.println(Customer_Name  +  "wants to deposite 4000");
	
}
public void withdrawMoney() {
	System.out.println(Customer_Name  +  "wants to withdraw 4000");
	
}
public void checkBalance() {
	System.out.println(Customer_Name  +  "wants to check balance");

}


public static void displayInterestrate() {
System.out.println("20% per annum");	
}
public static void ShowBankPolicies() {
	System.out.println("5% deposite per year");
	System.out.println("pention");
}

public static void displayCustomerCareNumber() {
	System.out.println("Customer care no 243466");
}

public void displaybankdetails() {
	System.out.println("------------BANK INFO---------------");
	System.out.println("Customer_Name: "+Customer_Name);
	System.out.println("Account_Number: "+Account_Number);
	System.out.println("Account_type: "+Account_type);
	System.out.println("Min_Balance: "+Min_Balance);
	System.out.println("Branch_Name: "+Branch_Name);

	
}
public Bank_Account(String Customer_Name, int Account_Number,String Account_type ) {
	this.Customer_Name=Customer_Name;
	this.Account_Number=Account_Number;
	this.Balance=Balance;
	this.Account_type=Account_type;
	this.Min_Balance=Min_Balance;
	this.Branch_Name=Branch_Name;
}

	public static void main(String[] args) {
		Bank_Account b1=new Bank_Account("vaish",50000,"saving");
	b1.displaybankdetails();
	b1.depositeMoney();
	b1.withdrawMoney();
	}
		
		

	}
