package Exeption;

public class Customizedexeptionhandling {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
//			try {
//				System.out.println(10/10);
//			}
//			catch(ArithemeticException e) {
//				e.printStackTree();
//				
//			}
//			System.out.println("no error");


			
//			try {
//				System.out.println(10/10);
//			}
//			catch(ArithmeticException  e) {
//				System.out.println("statement 2");
	//
//			}
//			System.out.println("no error");
			
			
			try {
				System.out.println(10/0);
			}
			catch(ArithmeticException  e) {
				System.out.println("statement 2");
				System.out.println(10/0);


			}
			System.out.println("no error");
		}

}
