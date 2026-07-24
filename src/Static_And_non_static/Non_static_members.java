package Static_And_non_static;

public class Non_static_members {
	int a;
	int b;
	int c;
	{
	a=10;	
	}
	{
		b=20;
	}
	{
		c=30;
	}
	
	public void m1() {
		System.out.println(a);
		
	}
     public void m2() {
		System.out.println(b);
	}
      public void m3() {
    	  System.out.println(c);
	
}
	
	public static void main(String[] args) {
		Non_static_members obj1 =new Non_static_members();
		obj1.m1();
		obj1.m2();
		obj1.m3();
		
	}

}
