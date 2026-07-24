package Static_And_non_static;

public class Khichadi {
	static int a;
	static int b;
	
	int d;
	int e;
	
	public static void m1() {
		System.out.println("static method1");
	}
	
	public static void m2() {
		System.out.println("static method2");
	}
	
	public void m3() {
		System.out.println("non static method3");
	}
	
	public void m4() {
		System.out.println("non static method4");
	}
	
	static {
		a=10;
		System.out.println("static block1");
	}
	static
	{
		b=20;
		System.out.println("static block2");
	}
	{
	d=30;
	System.out.println("non static block1");
}
	{
		e=40;
		System.out.println("non static block2");
	}
//	public Khichadi (int d,int e) {
//	this.d=d();
//	this.e=e();
//	}
	public static void main(String[] args) {
		Khichadi obj1=new Khichadi();
		m1();
		m2();
		obj1.m3();
		obj1.m4();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(obj1.d);
		System.out.println(obj1.e);
		// TODO Auto-generated method stub

	}

}
