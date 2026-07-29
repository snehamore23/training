package Non_primitive_typecasting;

public class Child2 extends Parent1 {

	int e=50;
	static int f=60;
	
	public static void m5() {
		System.out.println("static method of class Child1");
	}
	
	public static void m6() {
		System.out.println("non static method of class Child1");
	}

	public static void main(String[] args) {
		System.out.println("*********upcasting**********");
		Parent1 p=new Child2();
		//parent
		p.m1();
		p.m2();
		System.out.println(p.a);
		System.out.println(p.b);
		
//		//child
		Child2 c2=(Child2)p;
		
System.out.println("***********Downcasting**********");
		
		c2.m1();
		c2.m2();
		System.out.println(c2.a);
		System.out.println(c2.b);
		
		c2.m5();
		c2.m6();
		System.out.println(c2.e);
		System.out.println(c2.f);
		
		// TODO Auto-generated method stub

	}

}
