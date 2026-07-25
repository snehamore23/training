package Encapsulstion;

public class Student {

	private String name;
	private double marks;
	private double attendance;
	private int rollno;
	String subject ="java";
	int age=20;
	
	public String getName(String username) {
		if(username==name)
		return "student name is:-" +name;
		else {
			System.out.println("invalid user to access the name");
			return null;
	}
	}
	
	
	public void setName(String name) {
		if(name!=null) {
			this.name=name;
		System.out.println("name is assign");
	}
		else {
			System.out.println("invalid name to assign");
}
	}
	
	
	public double getMarks(String username) {
		if(username==name)
		return marks;
		else {
		System.out.println("invalid user to access marks");
		return 0.0;
		}
	}
	
	public void setMarks(double marks) {
		if(marks>=0&&marks<=100) {
		this.marks = marks;
		System.out.println("marks has been assign");
		}else {
			System.out.println("marks not assign");
	}
	}
	
	
	public double getAttendance(String username) {
		if(username==name)
		return attendance;
		else {
			System.out.println("invalid user to access the attendance");
		}
		return attendance;
	}
	public void setAttendance(double attendance) {
		if(attendance>=0&&attendance<=100) {
		this.attendance = attendance;
		System.out.println("attendance has been assign");
		}
		else {
			System.out.println("invalid attendance assign");
		}
	}
	
	
	public int getRollno(String username) {
		if(username==name)
		return rollno;
		else {
			System.out.println("invalid user to access the roll no");
			return 0;
		}
	}
	public void setRollno(int rollno) {
		if(rollno>=0&&rollno<=50) {
			this.rollno=rollno;
			System.out.println("roll no has been assign");
		}
		else System.out.println();
	}

		public void study() {
			System.out.println(name+ "studying the java subject");
			
		}
		public void WriteExam() {
			System.out.println("writing the java exam");
		}
		public void display_student(String username) {
			if(username==name) {
			System.out.println("----------student info---------");
			System.out.println("student name: "+name);
			System.out.println("student rollno: "+rollno);
			System.out.println("student marks: "+marks);
			System.out.println("student attendance: "+attendance);
		}
		else {
			System.out.println("invalid  username");
		}
}

	}

