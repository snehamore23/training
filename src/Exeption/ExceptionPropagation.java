package Exeption;

public class ExceptionPropagation {
	
	public static void m1() {
		System.out.println("method 1");
		m2();
	}

	public static void m2() {
		System.out.println("method 2");
		m3();
	}

	public static void m3() {
		System.out.println("method 3");
	}

	public static void main(String[] args) {
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
		// TODO Auto-generated method stub

	}

}
