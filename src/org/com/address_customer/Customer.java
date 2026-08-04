package org.com.address_customer;

public class Customer{

	public String name;
	public int customerid;
	Address address;

	public Customer(String name, int customerid, Address address) {
		super();
		this.name = name;
		this.customerid = customerid;
		this.address = address;
	}

	public void displaycustomerinfo() {
		System.out.println("Customer name: "+name);
		System.out.println("CustomerId: "+customerid);
		System.out.println("Address: "+address);
	}
}
