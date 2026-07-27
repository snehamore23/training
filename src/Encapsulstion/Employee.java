package Encapsulstion;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private String department;
	private String name;
	
	
	public void work() {
		System.out.println("employees working");
		
	}
public void applyLeave() {
System.out.println("employee applyleave");
		
	}
public void calculateSalary() {
	System.out.println("employee calculate salary");
	
}
public void displayEmployeeDetails() {
		System.out.println("----------student info---------");
		System.out.println("employee id: "+employeeId);
		System.out.println("employee name: "+employeeName);
		System.out.println("employee salary: "+salary);
		System.out.println("employee department: "+department);
	}
	


	public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
		if(employeeId>=0&&employeeId<=50) {
			this.employeeId = employeeId;
			System.out.println("employeeid  has been assign");
		}
		else System.out.println();
	}


public String getEmployeeName() {
	if(name==employeeName);
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	if(employeeName!=null) {
	this.employeeName = employeeName;
	System.out.println("name has been assign");
	}
}

public double getSalary() {
	if(name==employeeName) {
	return salary;
	}
	else {
		System.out.println();
		return 0.0;
	}
}
public void setSalary(double salary) {
	if(salary>0&&salary<=50000) {
		this.salary = salary;
		System.out.println("salary has been assign");
		}
		else {
			System.out.println("not assign");
		}
	}


public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	if(department!=null) {
	this.department = department;
	System.out.println("department has been assign");
}else {
	System.out.println("envalid department");
}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
