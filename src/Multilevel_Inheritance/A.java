package Multilevel_Inheritance;

public class A {
 int a=10;
 int b=20;
 public void m1() {
	 System.out.println("A class method");
 }
 public void m2() {
	 System.out.println("A class method");
 }
 
	public static void main(String[] args) {
	 A a1=new A();
	 System.out.println(a1.a);
	 System.out.println(a1.b);
	 a1.m1();
	 a1.m2();
	 
//	 System.out.println(a1.c);
//	 System.out.println(a1.d);
//	 a1.m3();
//	 a1.m4();

	}

}
