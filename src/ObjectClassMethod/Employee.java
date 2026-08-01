package ObjectClassMethod;

public class Employee {

		String empname;
		int empid;
		String designation;
		double salary;

		public Employee(String empname,
		int empid,
		String designation,
		double salary) {
			
			super();
			this.empname=empname;
			this.empid=empid;
			this.designation=designation;
			this.salary=salary;
		}
		public void display() {
			System.out.println("Employee Name: "+empname);
			System.out.println("EMp id: "+empid);
			System.out.println("designation: "+designation);
			System.out.println("Salary: "+salary);
			
		}

		
					@Override
		public String toString() {
			return "Employee [empname=" + empname + ", empid=" + empid + ", designation=" + designation + ", salary="
					+ salary + "]";
		}
					public static void main(String[] args) {
				Employee e=new Employee("joe", 4, "HR", 90000);
				System.out.println(e);
				//t.display();
				// TODO Auto-generated method stub

			}

		}

