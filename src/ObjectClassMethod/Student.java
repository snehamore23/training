package ObjectClassMethod;

public class Student {
	String name;
	int rollno;
	String course;
	double marks;

	public Student(String name,int rollno,String course,double marks) {
		super();
		this.name=name;
		this.rollno=rollno;
		this.course=course;
		this.marks=marks;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollno);
		System.out.println("Course: "+course);
		System.out.println("marks: "+marks);
		
	}

	
		@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", course=" + course + ", marks=" + marks + "]";
	}
		public static void main(String[] args) {
			Student s=new Student("joe", 33, "java", 90);
			System.out.println(s);
			//t.display();
			// TODO Auto-generated method stub

		}

	}

