package Methods;

public class Parameterized_method {
	
	
	public static void m1(int a) {
		System.out.println("the data is "+a);
	}
	
	public static void m2(String s) {
		System.out.println("the data is "+s);
	}
	
	public static void m3(int a, int b) {
		System.out.println("the data is "+(a+b));
	}

	public static void main(String[] args) {
		System.out.println("main ends");
		m1(10);
		m2("hello");
		m3(2,2);
		System.out.println("main ends");

	}

}
