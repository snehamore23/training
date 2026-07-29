package Polymorphism;

public class Dog extends Animal{
	public void Sound() {
		System.out.println("bow bow");
	}

	public static void main(String[] args) {
//		Dog d=new Dog ();
//		d.sound();
		Animal a=new Dog();
		a.Sound();
		// TODO Auto-generated method stub

	}

}
