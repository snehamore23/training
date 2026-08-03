package Comparable;
import java.util.Arrays;

public class Example1 {
	
	int age;
	String name;
	int height;
	double marks;
	
	public Example1(int age,String name,int height,double marks) {
		this.age=age;
		this.name=name;
		this.height=height;
		this.marks=marks;
		
	}

	public static void main(String[] args) {
		Example1 e1=new Example1(22,"sham",8,80);
		Example1 e2=new Example1(21,"sneha",6,90);
		Example1 e3=new Example1(20,"vaish",7,93);
		Example1 e4=new Example1(21,"om",8,80);
		Example1 e5=new Example1(20,"mayur",6,95);
		
		Example1 value[]= {e1,e2,e3,e4,e5};
		Arrays.sort(value);
		// TODO Auto-generated method stub

	}

}
