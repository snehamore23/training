package Collection;

import java.util.Comparator;
import java.util.TreeMap;

public class Student2 implements Comparator <Student2>{
	int age;
	String name;
	double marks;
	int rollno;
	

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Student2(int age, String name, double marks, int rollno) {
		super();
		this.age = age;
		this.name = name;
		this.marks = marks;
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		TreeMap<Student1,String> tm=new TreeMap<Student1 ,String>();
		tm.put(new Student1 (29,"ram", 90.0,1),"present");
		tm.put(new Student1(20,"sham", 80.0,1),"present");
		tm.put(new Student1 (21,"siya", 76.0,1),"present");
		tm.put(new Student1 (30,"jiya", 98.5,1),"present");
		tm.put(new Student1 (24,"piya", 93.5,1),"present");
		tm.put(new Student1 (22,"tina", 90.8,1),"present");
		
		
		// TODO Auto-generated method stub

	}



}
