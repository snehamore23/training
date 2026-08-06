package Exeption;

public class DHE {

	public static void main(String[] args) {
		System.out.println("statement 0");
		System.out.println("statement 1");
		
//		try {
//			throw new ArithmeticException();
//		}
//		catch (ArithmeticException e) {
//			e.printStackTrace();
//		}
//		 System.out.println("statement 2");
//		 System.out.println("statement 3");

		
		try {
			throw new  ArithmeticException();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("statement 2");
		System.out.println("statement 3");
			
		}
	}


