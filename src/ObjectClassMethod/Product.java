package ObjectClassMethod;

import java.util.Objects;

public class Product {
	int productid;
	String productname;
	double price;
	int quantity;
	
	public Product(int productid,
	String productname,
	double price,
	int quantity) {
		this.productid=productid;
		this.productname=productname;
		this.price=price;
		this.quantity=quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, productid, productname, quantity);
	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Product other = (Product) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && productid == other.productid
				&& Objects.equals(productname, other.productname) && quantity == other.quantity;
	}

	public static void main(String[] args) {
		Product p1=new Product(1,"watch",500,3);
		Product p2=new Product(1,"watch",500,3);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		// TODO Auto-generated method stub

	}

}
