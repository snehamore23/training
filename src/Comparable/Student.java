package Comparable;
import java.util.Arrays;

public class Student{
	
	String name;
	int age;
	int rollno;
	int height;
	public Student(String name,
	int age,
	int rollno,
	int height) {
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		this.height=height;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollno=" + rollno + ", height=" + height + "]";
	}

	public static void main(String[] args) {
		Student s1=new Student("sneha",21, 8,6);
		Student s2=new Student("vaish",20, 10,6);
		Student s3=new Student("sakshi",21, 19,6);
		Student s4=new Student("bhagya",20, 30,6);
		Student s5=new Student("neha",21, 8,6);
		// TODO Auto-generated method stub
	}
	

}
