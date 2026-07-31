package Abstraction;

public class developer implements emp{
		int empid;
		String name;
		String dep;
		double salary;
		
		public developer(int empid,String name,String dep,double salary) {
			this.empid=empid;
			this.name=name;
			this.dep=dep;
			this.salary=salary;
		}
		
		 public void work() {
			System.out.println(" developer is working");
			
		}
		 
		 public void calculatesalary(){
				System.out.println(" developer salary is"+salary);

			 
		 }
		 
		 public void atteendmet() {
			 System.out.println("develoepr is attending meeting");
		 }
		 
		 public void displayemp() {
			 System.out.println("dev id is "+empid);
			 System.out.println("dev name is "+name);

			 System.out.println("dev dep is"+dep);

			 System.out.println("dev salary is "+salary);

		 }


		
		
	}
