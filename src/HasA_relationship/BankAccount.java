package HasA_relationship;

public class BankAccount {
	
	long accountNumber;
	double balance;
	String bankName;
	String IFSC;
	
	
	public void deposite(int amount) {
		balance+=amount;
		System.out.println("amount is deposited: "+amount);
		
	}
	public void withdraw(int amount) {
		balance-=amount;
		System.out.println("amount withdrawn: " +amount);
		
	}
	public void displayBalance() {
		System.out.println("balance amount: "+balance);
	}

	public void displayAccountInformation() {
		System.out.println("account number: "+accountNumber );
		System.out.println("balance: "+balance);
		System.out.println("bankName: " +bankName);
		System.out.println("IFCS code: "+IFSC);
	}
	public BankAccount(long accountNumber, double balance,String bankName,String IFSC) {
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.bankName=bankName;
		this.IFSC=IFSC;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
