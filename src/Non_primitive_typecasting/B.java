package Non_primitive_typecasting;

public class B extends A{
	int c=30;
	static int d=40;
	public void m2() {
		System.out.println("B class method");
	}

	public static void main(String[] args) {
		
		B b=new B();
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println(b.c);
		System.out.println(b.d);
			b.m1();
			b.m2();
			
			
			System.out.println("**********upcasting************");
			A a=new B();
			
			//paarent 
			System.out.println(a.a);
			System.out.println(a.b);
			a.m1();
			
			
			System.out.println("*********downcasting********");
			B refb=(B)a;
			System.out.println(refb.a);
			System.out.println(refb.b);
			System.out.println(refb.c);
			System.out.println(refb.d);
			
			refb.m1();
			refb.m2();


	}

}
