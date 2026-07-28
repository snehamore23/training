package Multilevel_Inheritance;

public class Student extends Department {

    int rollno;
    String studentName;

    public Student(String collegeName, String location,
                   String departmentName, int rollno, String studentName) {

        super(collegeName, location, departmentName);

        this.rollno = rollno;
        this.studentName = studentName;
    }

    public void studentInfo() {
        System.out.println("Student Roll No: " + rollno);
        System.out.println("Student Name: " + studentName);
    }

    public static void main(String[] args) {

        Student s = new Student(
                "PVGCOE",
                "Nashik",
                "IT",
                12,
                "Joe"
        );

        s.collegeInfo();
        s.departmentinfo();
        s.studentInfo();
    }
}