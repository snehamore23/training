package Non_primitive_typecasting;

public class Child4 extends Parent2 {
	int c=80;

	
	public static void m3() {
		System.out.println("method of Child4 parent");
	}
	


	public static void main(String[] args) {
		System.out.println("*********upcasting**********");
		Parent2 p=new Child4();
		p.m1();
		p.m2();
		System.out.println(p.a);
		System.out.println(p.b);
		
		System.out.println("***********Downcasting**********");
		Child4 c=(Child4)p;
		p.m1();
		p.m2();
		System.out.println(c.a);
		System.out.println(c.b);
		
		
		// TODO Auto-generated method stub

	}

}
