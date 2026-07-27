package Multilevel_Inheritance;

public class B extends A{
	int c=10;
	 int d=20;
	 public void m3() {
		 System.out.println("B class method");
	 }
	 public void m4() {
		 System.out.println("B class method");
	 }

	public static void main(String[] args) {
		B b1=new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.c);
		System.out.println(b1.d);
		
		b1.m1();
		b1.m2();
		b1.m3(); 
		b1.m4();
		
//		System.out.println(b1.e);
//		System.out.println(b1.f);
//		
//		b1.m5();
//		b1.m6();
		
		// TODO Auto-generated method stub

	}

}
