package Hierarchical_Inheritance;

public class Employee {
	int empid;
	String ename;
	
	public void work() {
		System.out.println("Employee is working");
	}
	public Employee(int empid, String ename) {
		this.empid=empid;
		this.ename=ename;
	}

	public static void main(String[] args) {
	
	}

}
