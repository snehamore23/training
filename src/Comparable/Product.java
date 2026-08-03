package Comparable;

import java.util.Arrays;

public class Product implements Comparable <Product>  {
int pid;
String pname;
int quntity;
double price;

	public Product(int pid, String pname, int quntity, double price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.quntity = quntity;
	this.price = price;
}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", quntity=" + quntity + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		Product p1=new Product (1,"watch",3,50000);
		Product p2=new Product (6,"cloth",2,2000);
		Product p3=new Product (3,"shoes",1,10000);
		
		Product arr[]= {p1,p2,p3};
		System.out.println(Arrays.toString(arr));
		
		java.util.Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// TODO Auto-generated method stub

	}
	

}
