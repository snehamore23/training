package Polymorphism;

public class Area {
	double length;
	double breadth;
	double radius;
	
	public static void area(int length) {
		System.out.println("Area of square:" +(length*length));
	}
	
	public static void area(double length,double breadth) {
		System.out.println("Area of rectangle:" +(length*breadth));
	}
	public static void area(double radius) {
		System.out.println("Area of circle:" +(3.14*radius*radius));
	}

	public static void main(String[] args) {
		area(8);
		area(20,10);
		area(5.0);
	// TODO Auto-generated method stub

	}

}
