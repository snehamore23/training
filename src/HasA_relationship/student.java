package HasA_relationship;

public class student {
	String name;
	String gender;
	int age;
	double marks;
	
	Address address=new Address("6-1-6/2","nashik","maharastra");
	
	public void display() {
		System.out.println("student name: " + name);
		System.out.println("studnet age: " + age);
		System.out.println("student gender: " + gender);
		System.out.println("student marks: " + marks);
        address.displayAddress();
	}
	
	public student(String name, int age, String gender, double marks) {
       this.name=name;
       this.age=age;
       this.gender=gender;
       this.marks=marks;
	}

	public static void main(String[] args) {
	student s1= new student("sneha", 21, "female",99.0);
	s1.address=new Address("6-1-6/2","nashik","maharastra");
	s1.display();
	s1.address.displayAddress();

	}

}
