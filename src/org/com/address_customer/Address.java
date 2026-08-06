package org.com.address_customer;

public class Address {

    private String city;
    private String zipcode;

    // Constructor
    public Address(String city, String zipcode) {
        this.city = city;
        this.zipcode = zipcode;
    }

    // Display Address
    public void getFullAddress() {
        System.out.println("City : " + city);
        System.out.println("Zip Code : " + zipcode);
    }

    @Override
    public String toString() {
        return city + " - " + zipcode;
    }
}