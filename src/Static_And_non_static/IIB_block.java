package Static_And_non_static;

public class IIB_block {
	int a;
	int b;
	int c;
	static int d=40;
	static int e=50;
	static int f=60;
	
		{
			System.out.println("iib1");
			System.out.println(a);
			a=10;
			System.out.println(a);
			System.out.println("static variable"+ d);
		}
		{
			System.out.println("iib2");
			System.out.println(b);
			b=20;
			System.out.println(b);
			System.out.println("static variable"+ e);
		}
		{
			System.out.println("iib3");
			System.out.println(c);
			c=30;
			System.out.println(c);
			System.out.println("static variable"+ f);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IIB_block obj =new IIB_block();
	}

}
