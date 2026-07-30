package Polymorphism;

public class Circle extends Shape {

    public Circle(String shape, String properties, String color, int borderWidth, String material) {
        super(shape, properties, color, borderWidth, material);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Circle = πr²");
    }

    public static void main(String[] args) {

        Shape s = new Circle("Circle", "Round", "Red", 2, "Plastic");

        s.display();
        s.draw();
        s.calculateArea();
    }
}