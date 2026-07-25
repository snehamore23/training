package Static_And_non_static;

public class University {
	
	int Number_of_Dept;
	int Number_of_student;
	static String universityName;
	static String country;
	
	public void conductExamination() {
		System.out.println("exam is conducted");
	}
public void publishResult() {
		System.out.println("result display");
	}
public void admitStudent() {
	System.out.println("student is admited");
}
public void displayUniversitydetails() {
	System.out.println("universityName" +universityName);
	System.out.println("country" +country);
	System.out.println("Number_of_Dept" +Number_of_Dept);
	System.out.println("Number_of_student" +Number_of_student);
}

public static void showContactInformation() {
	System.out.println("contact no: "+ 23545468);
	System.out.println("gmail" + "uni@1234");
	
}
	
public University (int Number_of_Dept) {
	this. Number_of_Dept=Number_of_Dept;
}
public University (int Number_of_Dept,int Number_of_student) {
	this. Number_of_Dept=Number_of_Dept;
	this. Number_of_student=Number_of_student;
}




	public static void main(String[] args) {
		University u=new University(3,40);
		u.displayUniversitydetails();
		u.conductExamination();
	u.publishResult();
	u.admitStudent();
	
	
	}

}
