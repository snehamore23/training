package Hierarchical_Inheritance;

public class Child2 extends Parent{

	int e=50;
	static int f=60;
	
	public static void m5() {
		System.out.println("child 2 class static method 1");
	}

	public  void m6() {
		System.out.println("child 2 class static method 1");
	}
	public static void main(String[] args) {
		Child2 c2= new Child2();
		System.out.println(c2.a);
		System.out.println(c2.b);
		System.out.println(c2.e);
		System.out.println(c2.f);
		
		c2.m1();
		c2.m2();
		c2.m5();
		c2.m6();
		// TODO Auto-generated method stub

	}

}

