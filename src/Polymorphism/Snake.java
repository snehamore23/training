package Polymorphism;

public class Snake extends Animal{
	public void Sound() {
		System.out.println("shhhhhhhhhh");
	}

	public static void main(String[] args) {
//		Snake s=new Snake();
//		s.sound();
		
		Animal a=new Snake();
		a.Sound();
		// TODO Auto-generated method stub

	}

}
