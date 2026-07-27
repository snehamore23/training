package IsA_relationship_inheritance;

public class Dog extends Animal {
String breed;

public void bark() {
	System.out.println("Dog are barking laoudly");
}

public Dog(String Name, int Age ,String breed) {
	this.name=Name;
	this.age=Age;
    this.breed=breed;

}
public void display() {
	System.out.println("Dog name is: "+name);
	System.out.println("Dog age is: "+age);
	System.out.println("Dog Breed:" +breed);
	System.out.println("*****************************************");
}


	public static void main(String[] args) {
	 Dog d =new Dog ("Leo", 5,"Golden Retriver");
	 System.out.println();
	 d.display();
	 d.bark();
	 d.eat();
	 d.sleep();

	}

}
