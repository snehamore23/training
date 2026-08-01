package ObjectClassMethod;

public class ToStringMethod {
String name;
int rollno;
int age;
int height;

public ToStringMethod(String name,int rollno,int age,int height) {
	super();
	this.name=name;
	this.rollno=rollno;
	this.height=height;
	this.age=age;
}
public void display() {
	System.out.println("Name: "+name);
	System.out.println("Rollno: "+rollno);
	System.out.println("Height: "+height);
	System.out.println("Age: "+age);
	
}

	@Override
public String toString() {
	return "ToStringMethod [name=" + name + ", rollno=" + rollno + ", age=" + age + ", height=" + height + "]";
}
	public static void main(String[] args) {
		ToStringMethod t=new ToStringMethod("joe", 33, 21,6);
		System.out.println(t);
		//t.display();
		// TODO Auto-generated method stub

	}

}
