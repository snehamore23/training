package Static_And_non_static;

public class Student {

	
	int rollno;
	String subject;
	String name;
	int age;
	String gender;
	String dept;
	double marks;
	//double percent;
	static String collegeName;
    static String univercityName;

	
	static {
		collegeName="pvgcoe";
		univercityName="sppu";
	}

	public void study(){
		System.out.println(name+ " studying subjedt "+subject);
}
	public void ViewMarks (){
		System.out.println(" marks of the student "+marks);
		}
	
	public static void collegerules() {
		System.out.println("wear id card");
		System.out.println("75% atttendace");
		System.out.println("dress code");
	}
	public void displaystudentdetails() {
		System.out.println("------------STUDENT INFO---------------");
		System.out.println("student name: "+name);
		System.out.println("student rollno: "+rollno);
		System.out.println("student subject: "+subject);
		System.out.println("student marks: "+marks);
		System.out.println("student age: "+ age);
		System.out.println("student gender: "+ gender);
		System.out.println("student dept: "+ dept);
		System.out.println("student college name "+collegeName);
		System.out.println("student univercity name"+ univercityName);
		;
	}
		public Student(String subject) {
			this.subject=subject;
		}
		public Student(String subject, int rollno) {
			this.subject=subject;
			this.rollno=rollno;
	}
		public Student(String subject, int rollno,String name) {
			this.subject=subject;
			this.rollno=rollno;
			this.name=name;
	}
		
		public Student(String subject, int rollno,String name,double marks,String dept, int age, String gender) {
			this.subject=subject;
			this.rollno=rollno;
			this.name=name;
			this.marks=marks;
			this.dept=dept;
			this.age=age;
			this.gender=gender;
	}
		
//	public void AttendClass(){
//	}
//	public void WriteExam(){
//		System.out.println("writting exam");
//	}

//	public void PayFees(){
//	}
//	public void DisplayStudentDetails(){
//	}
//	{
		public static void main(String[] args) {
	
			
			Student s1=new Student ("java", 101, "vaish", 99, "IT", 21,"female");
			Student s2=new Student ("python", 103, "manu", 94, "Com", 21,"female");
			Student s3=new Student ("c++", 105, "om", 97, "aids", 21,"male");
			Student s4=new Student ("c", 108, "mayur", 93, "IT", 21,"male");
			Student s5=new Student ("java", 102, "sakshi", 99, "IT", 21,"female");
			s1.displaystudentdetails();
			s2.displaystudentdetails();
			s3.displaystudentdetails();
			s4.displaystudentdetails();
			s5.displaystudentdetails();
		


//

	}

}
