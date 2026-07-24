package Static_And_non_static;

public class Non_static_method_ex {
	int a=10;
	int b=20;
	int c=30;
	static int d=40;
	static int e=50;
	static int f=60;
	
	public  void m1 () {
		System.out.println("non static method 1");
		System.out.println(a);
		System.out.println(d);
		m1();
	}
	public void m2 () {
		System.out.println("non static method 2");
		System.out.println(b);
		System.out.println(e);
		m2();
	}
	public void m3 () {
		System.out.println("non static method 3");
		System.out.println(c);
		System.out.println(f);
		m3();
	}

	public static void main(String[] args) {
		Non_static_method_ex obj1=new Non_static_method_ex();
		System.out.println(obj1);
	//obj1 .m1();
	//obj1 .m2();
	//obj1. m3();
	System.out.println(obj1.a);
	System.out.println(obj1.b);
	System.out.println(obj1.c);

	
	}

}
