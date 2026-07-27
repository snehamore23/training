package Multilevel_Inheritance;

public class Person {
String name="sneha";
int age=21;

public void display() {
	System.out.println("person name:" +name);
	System.out.println("person age: " +age);
}
	public static void main(String[] args) {
		Person p=new Person();
				p.display();

	}

}
