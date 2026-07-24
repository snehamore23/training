package Static_And_non_static;

public class Non_static_method_ex {
	int a=10;
	int b=20;
	int c=30;
	
	public  void m1 () {
		System.out.println("non static method 1");
		System.out.println(a);
	}
	public void m2 () {
		System.out.println("non static method 2");
		System.out.println(b);
	}
	public void m3 () {
		System.out.println("non static method 3");
		System.out.println(c);
	}

	public static void main(String[] args) {
		Non_static_method_ex obj1=new Non_static_method_ex();
		System.out.println(obj1);
	obj1 .m1();
	obj1 .m2();
	obj1. m3();
	
	}

}
