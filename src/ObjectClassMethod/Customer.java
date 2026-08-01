package ObjectClassMethod;

import java.util.Objects;

public class Customer {

	int custometid;
	String customername;
	String city;
	
	public Customer(int custometid,
	String custometname,
	String city){
		this.custometid=custometid;
		this.customername=customername;
		this.city=city;
		
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(city, customername, custometid);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(city, other.city) && Objects.equals(customername, other.customername)
				&& custometid == other.custometid;
	}




	public static void main(String[] args) {
		Customer c1=new Customer(1,"joe","nsk");
		Customer c2=new Customer(1,"joe","nsk");
		
		System.out.println(c1.equals(c2));
		// TODO Auto-generated method stub

	}

}
