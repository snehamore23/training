package Exeption;

public class ExampleCustom {

	public static void main(String[] args) {
		int age =18;
		if(age<=18) {
			System.out.println("allow to vote");
		}else {
			throw new ArithmeticException();
		}
		System.out.println("further process");
		System.out.println("document verification");
		System.out.println("successfull");
		// TODO Auto-generated method stub

	}

}
