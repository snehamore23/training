package Polymorphism;

public class Cat extends Animal{
	
	public void Sound() {
		System.out.println("meow meow");
	}

	public static void main(String[] args) {
//		Cat c=new Cat();
//		c.Sound();
		
		Animal a=new Cat();
		a.Sound();
		// TODO Auto-generated method stub

	}

}
