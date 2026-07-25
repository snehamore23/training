package Encapsulstion;

public class Account {
	private long accnumber;
	private String CustomerName;
	private double balance;
 	private String accountType;

	
	public void deposite(int amount, long accnumber ) {
		if((accnumber==accnumber)&&(amount>0)){ 
		balance=balance+amount;
		System.out.println(" amount deposited:" + amount);
		
	}
		else System.out.println("invalid amount to assign");
	}	
	
	
	public void withdraw(int amount, long i) {
		if((balance>0 && amount<=balance)&&(accnumber==accnumber)){
			balance=balance-amount;
			System.out.println(" amount withdraw:" +amount);
			
		}else {
			System.out.println("invalid amount to withdraw");
		}
		
	}
	
	
    public void checkbalance(long Accnumber) {
		if(Accnumber==accnumber)
			System.out.println(" balance :"+ balance);
		else
	 System.out.println("invalid user");
		}
    
    
    public void displayaccountdetails(long accnumber) {
    if(accnumber==accnumber) {
    	System.out.println(" accnumber:" +accnumber);
    	System.out.println(" customer name:" + CustomerName);
    	System.out.println(" balance :"+ balance);
		System.out.println(" accounttype is:" + accountType);
    }
    
    }

public long getAccnumber() {
		return accnumber;
	}


	public void setAccnumber(long accnumber) {
		this.accnumber = accnumber;
	}


	public String getCustomerName() {
		return CustomerName;
	}


	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


public static void main(String[] args) {
		Account a1=new Account();
		a1.accnumber=1234567891;
		a1.CustomerName="vaish";
		a1.accountType="saving";
		
		
	

	}
}


