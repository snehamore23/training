package Multilevel_Inheritance;

public class Department extends College {
	String departmentName;
	

	public Department(String collegeName, String location,String departmentName) {
		super(collegeName, location);
		this.departmentName=departmentName;
		
		// TODO Auto-generated constructor stub
	}

	
	public void departmentinfo() {
		System.out.println("DepartmentName: " +departmentName);
		
	}
	
	public static void main(String[] args) {
		Department d=new Department("PVGCOE", "Nashik", "IT");
		d.collegeInfo();
		d.departmentinfo();
				
		// TODO Auto-generated method stub

	}

}
