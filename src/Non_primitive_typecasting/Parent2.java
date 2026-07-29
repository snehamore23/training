package Non_primitive_typecasting;

public class Parent2 extends Grandparent {
	int b=30;

	
	public static void m2() {
		System.out.println("static method of class Child1");
	}

	public static void main(String[] args) {
		System.out.println("*********upcasting**********");
		Grandparent g= new Parent2();
		g.m1();
		System.out.println(g.a);
		
//		//child
		System.out.println("***********Downcasting**********");
		Parent2 p=(Parent2)g;
		g.m1();
		System.out.println(p.a);
		p.m2();
		System.out.println(p.b);
	}

}
