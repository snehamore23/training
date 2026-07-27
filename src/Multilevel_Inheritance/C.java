package Multilevel_Inheritance;

public class C extends B{
	int e=10;
	 int f=20;
	 public void m5() {
		 System.out.println("C class method");
	 }
	 public void m6() {
		 System.out.println("C class method");
	 }

	public static void main(String[] args) {
		
		C c1=new C();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println(c1.e);
		System.out.println(c1.f);
		
		c1.m1();
		c1.m2();
		c1.m3(); 
		c1.m4();
		c1.m5();
		c1.m6();
		
	

	}

}
