package Polymorphism;

public class Student {
	String name;
	int rollno;
	int marks;
	
	public void calculategarde(int marks) {
		System.out.println("marks of student: "+marks);
	}
	
	public void calculatesalary(int m1, int m2) {
		System.out.println("Marks of student in 2 subject: "+ (m1+m2));
	}
	public void calculatesalary(int m1, int m2,int m3) {
		System.out.println("Marks of student in 3 subject: "+ (m1+m2+m3));
	}
	public void display() {
		System.out.println("Student Name: "+name);
		System.out.println("Student rollno: "+rollno);
		System.out.println("Student marks: "+marks);
		
	}
	public Student (String name, int rollno, int marks) {
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	

	public static void main(String[] args) {
		Student s=new Student("joe",2,90);
		s.display();
		s.calculategarde(90);
		s.calculatesalary(90,70);
		s.calculatesalary(90, 70,83);
	

	}

}
