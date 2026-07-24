package Static_And_non_static;

public class Static_variable {
static int a;
static int b;
static int c;

	public static void main(String[] args) {
		// directly initializing the variables
		
		a=10;
		b=20;
		c=30;
		
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	//object assigning the data
	Static_variable obj =new Static_variable();
	obj.a=40;
	obj.b=50;
	obj.c=60;

	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
}
