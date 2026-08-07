package Exeption;
import java.sql.SQLException;
public class ExceptionPropagation {
	
	public static void m1() throws SQLException {
		System.out.println("method 1");
		m2();
	}

	public static void m2() throws SQLException {
		System.out.println("method 2");
		m3();
	}

	public static void m3()throws SQLException {
		System.out.println("method 3");
		try {
			throw new SQLException();
		}
		catch(Exception e){
		 }
		}

	public static void main(String[] args)throws SQLException {
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
		// TODO Auto-generated method stub

	}

}

