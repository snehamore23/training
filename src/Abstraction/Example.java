package Abstraction;

public abstract class Example {
static int a=10;
int b=20;

//public abstract final void m6();
//private abstract void m7();

public static void m1() {
	System.out.println("static method");
}
public void m2() {
	System.out.println("non static method");
}
public Example() {
	System.out.println("constructor executed");
}
public Example(int a) {
	this();
	System.out.println("constructor executed");
}
public abstract void m3() ;

public static void main(String []args) {
	
}
}
