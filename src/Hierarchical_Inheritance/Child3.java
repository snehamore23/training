package Hierarchical_Inheritance;

public class Child3 extends Parent {
	int g=70;
	static int h=80;
	
	public static void m7() {
		System.out.println("child 3 class static method 1");
	}

	public  void m8() {
		System.out.println("child 3 class static method 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child3 c3= new Child3();
		System.out.println(c3.a);
		System.out.println(c3.b);
		System.out.println(c3.g);
		System.out.println(c3.h);
		
		c3.m1();
		c3.m2();
		c3.m7();
		c3.m8();


	}

}
