package Encapsulstion;

public class StudentUser {

	public static void main(String[] args) {
	Student s= new Student();
s.setName("sneha");
s.setRollno(12);
s.setMarks(99);
s.setAttendance(45);

System.out.println(s.getName("root"));
System.out.println(s.getRollno("root"));
System.out.println(s.getMarks("root"));
System.out.println(s.getAttendance("root"));


s.study();
s.WriteExam();
s.display_student("sneha");

	}

}
