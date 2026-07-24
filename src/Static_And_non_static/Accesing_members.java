package Static_And_non_static;

public class Accesing_members {
int a=10;
static int b=20;
public static void m1() {
	System.out.println(b);
	m11();
	Accesing_members obj1= new Accesing_members();
	System.out.println(obj1.a);
	obj1.m2();
}
public static void m11() {
	System.out.println(b);
}
public void m2() {
	System.out.println(a);
	m2();
}
public {
	m22();
}
	public static void main(String[] args) {
		Accesing_members obj1= new Accesing_members();
		m1();
		m2();
		obj1.m11();
		obj1.m22();
		
	}

}
