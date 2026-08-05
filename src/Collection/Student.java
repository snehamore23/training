package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
	
	int age;
	String name;
	double marks;
	int weight;
	

	public Student(int age, String name, double marks, int weight) {
		super();
		this.age = age;
		this.name = name;
		this.marks = marks;
		this.weight = weight;
	}
	@Override
	public int compareTo(Student o) {
		//return this.age-o.age;
		//return (int) ((int)this.marks-o.marks);
		//return this.weight-o.weight;
		return this.name.compareTo(o.name);
	}


	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", marks=" + marks + ", weight=" + weight + "]";
	}
	
	public static void main(String[] args) {
		Student s1=new Student(19,"joe",88.8,60);
		Student s2=new Student(20,"tom",98.8,50);
		Student s3=new Student(18,"sam",78.8,45);
		Student s4=new Student(19,"joy",82.3,50);
		Student s5=new Student(21,"anni",83.5,40);
		
		ArrayList al= new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
	
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList num= new ArrayList();
		num.add(50);
		num.add(30);
		num.add(34);
		num.add(20);
		num.add(12);
		
		System.out.println(num);
		Collections.sort(num);
		System.out.println(num);
		
		ArrayList Double= new ArrayList();
		Double.add(30.0);
		Double.add(10);
		Double.add(25.0);
		Double.add("name");
		Double.add('c');
		
		System.out.println(Double);
		
		//generice arraylist
		
		ArrayList <Double> doubledata=new ArrayList<Double>();
		doubledata.add(20.0);
		
		
	}

}
