package Hierarchical_Inheritance;

public class Student extends Person {
int rollno;
String course;

public void study() {
	System.out.println("Student studying");
}

public Student(int age,String course,String name,int rollno) {
	super(name,age);
	this.course=course;
	this.rollno=rollno;
	
}
public void displaystudent() {
	System.out.println("Student rollno: "+ rollno);
	System.out.println("Student course: "+ course);
}
	public static void main(String[] args) {
		Student s=new Student(23,"java","joe",2);
		s.study();
		s.displaystudent();
		s.display();
		//TODO Auto-generated method stub

	}

}
