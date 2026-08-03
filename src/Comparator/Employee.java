package Comparator;

import java.util.Arrays;

public class Employee {
	
	int empid;
	String empname;
	double salary;
	int experiance;
	
	

	public Employee(int empid, String empname, double salary, int experiance) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.experiance = experiance;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", experiance=" + experiance
				+ "]";
	}

	public static void main(String[] args) {
		Employee e1=new Employee(2,"joe",35000,3);
		Employee e2=new Employee(8,"smith",50000,0);
		Employee e3=new Employee(4,"jon",52000,1);
		Employee e4=new Employee(9,"lina",45000,4);
		Employee e5=new Employee(3,"amit",40000,2);
		
		Employee arr[]= {e1,e2,e3,e4,e5};
		System.out.println("--------------before sorting----------");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("--------------After sorting----------");
		System.out.println("--------------Assending----------");
		Arrays.sort(arr,new EmployeeId());
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,new EmployeeName());
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,new EmployeeExperiance());
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,new EmployeeSalary());
		System.out.println(Arrays.toString(arr));
		
		System.out.println("--------------Dessending----------");
		Arrays.sort(arr,new EmployeeIdDes());
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,new EmployeeNameDes());
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,new EmployeeExperianceDes());
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,new EmployeeSalaryDes());
		System.out.println(Arrays.toString(arr));

	}

}
