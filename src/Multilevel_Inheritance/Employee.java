package Multilevel_Inheritance;

public class Employee extends Person {
int empid=11;
double salary=50000;

public void work() {
	System.out.println("Employee doing the work");
}
public void Employeeinformation() {
	System.out.println("employee id is: " +empid);
	System.out.println("employee salary is: " +salary);
	
	display();
}
	public static void main(String[] args) {
		Employee e =new Employee();
				e.work();
				e.Employeeinformation();
				

	}

}
