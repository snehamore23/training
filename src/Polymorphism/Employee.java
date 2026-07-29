package Polymorphism;

public class Employee {
	String name;
	int id;
	double salary;
	
	

	public void calculatesalary(double salary) {
		System.out.println("Total salary: "+salary);
	}
	
	public void calculatesalary(double salary,double bonus) {
		System.out.println("Total salary+Bonus :" +salary+bonus);
	}
	public void calculatesalary(double salary,double bonus,double tax) {
		System.out.println("In salary tax aslo include");
	}
	public void display() {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee id: "+id);
		System.out.println("Employee salary: "+salary);
		
	}
	public Employee (String name, int id, double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	

	public static void main(String[] args) {
		Employee e=new Employee("joe",2,50000.0);
		e.display();
		e.calculatesalary(40000.0);
		e.calculatesalary(40000.0,10000.0);
		e.calculatesalary(40000.0,10000.0,1000.0);
	

	}

}
