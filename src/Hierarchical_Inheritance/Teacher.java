package Hierarchical_Inheritance;

public class Teacher extends Person {
	String subject;
	
	public void teach() {
		System.out.println("Teacher teach to student");
	}
	public Teacher( String name,int age,  String subject) {
		super(name,age);
		this.subject=subject;
	}
	public void teacherinfo() {

		
		System.out.println("Teacher name: "+name);
		System.out.println("Teacher subject: "+subject);
		System.out.println("Teacher age: "+ age);
	}

	public static void main(String[] args) {
		Teacher t=new Teacher("joe",26,"java");
		t.teacherinfo();
		t.teach();
		
		
		// TODO Auto-generated method stub

	}

}
