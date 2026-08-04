package org.com.address_customer;

public class Address {
	String city;
	String zipcode;
	
	public Address(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public void Address(String city, String zipCode) {
		this.city=city;
		this.zipcode=zipcode;
	}
	
	public void getFullAddress() {
		System.out.println("Address is: "+("city"+"zipcode"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
