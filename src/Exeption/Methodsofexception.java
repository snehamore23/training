package Exeption;

public class Methodsofexception {

		public static void main(String[] args) {
//			try {
//				System.out.println(10/0);
////				String s=null;
////				System.out.println(s.length());
//			}
//			catch(ArithmeticException e) {
//				System.out.println("arithemetic exception blocked executed");
//				System.out.println(e.getMessage());
//				
//			}
//			catch( Exception e) {
//				System.out.println(e.getMessage());
//			}
		
			System.out.println("statement 1");
			try {
				System.out.println("statement 2");
			}
//			catch(Exception e){
//				
//			}
			finally {
				System.out.println(10/0);

				System.out.println("finally blocekd executed");
			}
			System.out.println(10/10);
		}

	}



