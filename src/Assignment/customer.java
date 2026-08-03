package Assignment;

public class customer {
	
	String name;
	int customerid;
	String address;

	public customer(String name, int customerid, String string) {
		super();
		this.name = name;
		this.customerid = customerid;
		this.address = string;
	}

	public void displaycustomerinfo() {
		System.out.println("Customer name: "+name);
		System.out.println("CustomerId: "+customerid);
		System.out.println("Address: "+address);
	}
	public static void main(String[] args) {
		customer c=new customer("joe",2,"Nashik");
		// TODO Auto-generated method stub

	}

}
