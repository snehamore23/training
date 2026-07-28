package Hierarchical_Inheritance;

public class Child1 extends Parent{
	
	int c=30;
	static int d=40;
	
	public static void m3() {
		System.out.println("child 1 class static method 1");
	}

	public  void m4() {
		System.out.println("child 1 class static method 1");
	}
	public static void main(String[] args) {
		Child1 c1= new Child1();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
		
	}
}
		
	
		
