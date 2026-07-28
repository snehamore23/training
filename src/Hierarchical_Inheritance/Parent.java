package Hierarchical_Inheritance;

public class Parent {

	int a=10;
	static int b=20;
	
	public static void m1() {
		System.out.println("parent class static method 1");
	}
	 
	public void m2() {
		System.out.println("parent class non static method");
	}
	public static void main(String[] args) {
		Parent p= new Parent();
		
		System.out.println(p.a);
		System.out.println(p.b);
		
		p.m1();
		p.m2();
		
		
				
	}
}
