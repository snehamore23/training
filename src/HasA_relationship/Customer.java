package HasA_relationship;

public class Customer {

	String name;
	int id;
	long phone;
	BankAccount account;
	
	public void display() {
		System.out.println("name of customer: "+name);
		System.out.println("id of customer: "+id);
		System.out.println("phone number of customer is: "+phone);
	}
	
	public Customer(String name, int id,long phone,BankAccount account) {
		this.name=name;
		this.id=id;
		this.phone=phone;
		this.account=account;
	}
	public static void main(String[] args) {
		BankAccount acc1=new BankAccount(1234567891l, 1000.0 ,"SBI","sbi@123" );
//		acc1.deposite(0);
//		acc1.withdraw(0);
//		acc1.displayAccountInformation();
		
			Customer c1=new Customer("sneha", 1, 2324668l, acc1);
			c1.display();
			System.out.println();
			c1.account.displayAccountInformation();
			c1.account.deposite(1000);
			c1.account.withdraw(500);
			c1.account.displayBalance();			
			
		}

		// TODO Auto-generated method stub
		
	}

	}

