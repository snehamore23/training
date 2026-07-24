package Static_And_non_static;

public class SIB {
	static int a;
	static int b;
	static int c;
static{
	System.out.println(a);
	System.out.println("sib1");
	a=10;
	System.out.println(a);
}
static{
	System.out.println(b);

	System.out.println("sib2");
	b=20;
	System.out.println(b);
}
static{
	System.out.println(c);

	System.out.println("sib3");
	c=30;
    System.out.println(c);
}
	public static void main(String[] args) {
		System.out.println("main method");
		// TODO Auto-generated method stub

	}

}
