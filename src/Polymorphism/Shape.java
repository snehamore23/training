package Polymorphism;

public class Shape {
	String shape;
	String Properties;
	String color;
	int borderwidth;
	String material;
	
	public void draw() {
		System.out.println("Draw the shape");
	}
	
	public void calculateArea() {
		System.out.println("calculate area");
	}
	public Shape(String shape,String Properties,String color,int borderwidth,String material) {
		this.shape=shape;
		this.Properties=Properties;
		this.color=color;
		this.borderwidth=borderwidth;
		this.material=material;
	}
	public void display() {
		System.out.println("Shape: "+shape);
		System.out.println("Properties: "+Properties);
		System.out.println("Color: "+color);
		System.out.println("Borderwidth: "+borderwidth);
		System.out.println("Material: "+material);
	}
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
