package Assignment;

public class Address {
	
	String city;
	String zipcode;
	
	public void Address(String city, String zipCode) {
		this.city=city;
		this.zipcode=zipcode;
	}
	
	public String getFullAddress() {

		 return city + " - " + zipcode;
		
	}
}

