package ObjectClassMethod;

public class CloneMethodObject implements Cloneable {
	int age;
	String name;
	double height;
	
	public CloneMethodObject(int age, String name, double height) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
	}
	public void display() {
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
		System.out.println("Height: "+height);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneMethodObject c1=new CloneMethodObject(22,"ram",6);
		CloneMethodObject c2=(CloneMethodObject)c1.clone();
		c1.display();
		c2.display();
		
		// TODO Auto-generated method stub

	}

}
