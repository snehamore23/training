package Hierarchical_Inheritance;

public class Tester extends Employee{
	
	String testingtool;
	
	public void testingsoftware() {
		System.out.println("Testing application with the help of: "+testingtool);
	}

	public Tester(int empid, String ename,String testingtool) {
		super(empid,ename);
		this.testingtool=testingtool;
	}
	
	public void dispalytester() {
		System.out.println("Name of tester: "+ename);
		System.out.println("Empid of tester: "+empid);
		System.out.println("Testing Tool: "+testingtool);
	}
	
	public static void main(String[] args) {
		Tester t=new Tester(1,"joe", "fireflink");
		t.testingsoftware();
		t.dispalytester();
		// TODO Auto-generated method stub

	}

}
