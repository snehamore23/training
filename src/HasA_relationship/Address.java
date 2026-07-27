package HasA_relationship;

public class Address {

	String houseno;
	String state;
	String city;
	
	public void displayAddress() {
		System.out.println("Student houseno: " +houseno );
		System.out.println("studnet city: " +city);
		System.out.println("studnt state: " + state);
	}
	
	public Address(String houseno, String city, String state) {
		this.houseno=houseno;
		this.city=city;
		this.state=state;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
