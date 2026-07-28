package Hierarchical_Inheritance;

public class Developer extends Employee {
	
	String pglang;
	
	public void writecode() {
		System.out.println("Developer is writing the code using: "+ pglang);
		
	}
	public Developer(int empid,String ename,String pglang) {
		super(empid,ename);
		this.pglang=pglang;
		
	}
	public void displaydeveloper() {
		System.out.println("Name of developer: "+ename);
		System.out.println("Empid: "+empid);
		System.out.println("Progrmming language: "+pglang);
	}

	public static void main(String[] args) {
		Developer d= new Developer(1,"joe", "java");
		d.writecode();
		d.displaydeveloper();
		// TODO Auto-generated method stub

	}

}
