package Non_primitive_typecasting;

public class Child1 extends Parent1 {
	int c=30;
	static int d=40;
	
	public static void m3() {
		System.out.println("static method of class Child1");
	}
	
	public static void m4() {
		System.out.println("non static method of class Child1");
	}

	public static void main(String[] args) {
		System.out.println("*********upcasting**********");
		Parent1 p=new Child1();
		//parent
		p.m1();
		p.m2();
		System.out.println(p.a);
		System.out.println(p.b);
		
//		//child
		Child1 c=(Child1)p;
//		
		
		System.out.println("***********Downcasting**********");
		
		c.m1();
		c.m2();
		System.out.println(c.a);
		System.out.println(c.b);
		c.m3();
		c.m4();
		;
		System.out.println(c.c);
		System.out.println(c.d);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

	

}
