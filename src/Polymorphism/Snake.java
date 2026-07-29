package Polymorphism;

public class Snake extends Animal{
	public void sound() {
		System.out.println("shhhhhhhhhh");
	}

	public static void main(String[] args) {
		Snake s=new Snake();
		s.sound();
		// TODO Auto-generated method stub

	}

}
