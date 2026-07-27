package Multilevel_Inheritance;

public class Developer extends Employee {
String programminglanguage="java";

public void code() {
	System.out.println("developer is coding using language ");
}
	public void displayDeveloper() {

		Employeeinformation();
		System.out.println("Programming Language is: " +programminglanguage );
	}

	public static void main(String[] args) {
	Developer d= new Developer();
	d.displayDeveloper();
	System.out.println("****************😊😊😊😊😊😊😊😊😊😊😊*****************");
	d.code();

	}

}
