package Static_And_non_static;

public class Student {

	int rollno;
	String subject;
	String name;
	//int age;
	//String gender;
	//String dept;
	double marks;
	//double percent;
	static String collegeName;
    static String univercityName;
	

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
		System.out.println("student name "+name);
		System.out.println("student rollno "+rollno);
		System.out.println("student subject "+subject);
		System.out.println("student marks "+marks);
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
	
		Student s1=new Student();
		s1.subject="java";
		s1.rollno=4;
		s1.name="sneha";
		s1.marks=95.0;
		
		s1.collegeName="PVGCOE";
	    s1.univercityName="SPPU";
	    
	    
	    s1.displaystudentdetails();
	  System.out.println("------------student 1----------------");
	    s1.study();
	    s1.ViewMarks();
	    s1.collegerules();
	    System.out.println("----------------------------");
		Student s2=new Student();
		s2.subject="python";
		s2.rollno=7;
		s2.name="vaishnavi";
		s2.marks=98.0;
		
		s2.collegeName="PVGCOE";
	    s2.univercityName="SPPU";
	    
	    
	    s2.displaystudentdetails();
	  System.out.println("-----------student 2-----------------");
	    s2.study();
	    s2.ViewMarks();
	    s2.collegerules();


	}

}
