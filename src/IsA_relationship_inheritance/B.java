package IsA_relationship_inheritance;

public class B extends A{

	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.c);
		System.out.println(b.d);
		
		b.m3();
		b.m4();
		
		System.out.println(b.a);
		System.out.println(b.b);
		
		b.m1();
		b.m2();

	}

	

}
