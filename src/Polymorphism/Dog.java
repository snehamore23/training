package Polymorphism;

public class Dog extends Animal{
	public void sound() {
		System.out.println("bow bow");
	}

	public static void main(String[] args) {
		Dog d=new Dog ();
		d.sound();
		// TODO Auto-generated method stub

	}

}
