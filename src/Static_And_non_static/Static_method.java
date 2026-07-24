package Static_And_non_static;

public class Static_method {
static int a=10;
static int b=20;
static int c=30;

public static void m1() {
	System.out.println("static method1");
	System.out.println(a);
}
public static void m2() {
	System.out.println("static method2");
	System.out.println(b);
}
public static void m3() {
	System.out.println("static method3");
	System.out.println(c);
}


	public static void main(String[] args) {
		System.out.println("directly aceesing with the help of object");
		//directly accesing
		m1();
		m2();
		m3();
//		Static_method.m1();
//		Static_method.m2();
//		Static_method.m3();
		
		// access with the help of object
		System.out.println("aceesing with the help of object");
		Static_method obj1=new Static_method();
		obj1.m1();
		obj1.m2();
		obj1.m3();
		

	}

}
