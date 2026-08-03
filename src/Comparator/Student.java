package Comparator;

import java.util.Arrays;

public class Student {
	int age;
	String name;
	int rollno;
	int height;
	

	public Student(int age, String name, int rollno, int height) {
		super();
		this.age = age;
		this.name = name;
		this.rollno = rollno;
		this.height = height;
	}

	

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", rollno=" + rollno + ", height=" + height + "]";
	}



	public static void main(String[] args) {
		Student s1=new Student(22,"joe",27,7);
		Student s2=new Student(24,"siya",20,5);
		Student s3=new Student(20,"riya",42,7);
		Student s4=new Student(21,"tiya",27,6);
		Student s5=new Student(22,"piya",29,6);
		
		
		Student arr[]= {s1,s2,s3,s4,s5};
		System.out.println("--------------before sorting----------");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("--------------After sorting----------");
		Arrays.sort(arr,new StudentHeight());
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,new StudentAge());
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,new StudentRollno());
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,new StudentName());
		System.out.println(Arrays.toString(arr));
		
//		StudentAge ref=new StudentAge();
//		
//		if(ref.compare(s1,s2)>0) System.out.println("s1 object is greater");
//		else if(ref.compare(s1,s2)<0) System.out.println("s1 object lesser");
//		else System.out.println("both are equal");
//	
//		StudentHeight ref2=new StudentHeight();
//		if(ref2.compare(s1,s2)>0) System.out.println("s1 object is greater");
//		else if(ref2.compare(s1,s2)<0) System.out.println("s1 object lesser");
//		else System.out.println("both are equal");
//		// TODO Auto-generated method stub

	}

}
