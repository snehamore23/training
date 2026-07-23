package Methods;

import java.util.Scanner;

public class Scanner_class_method {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the int type of data");
		int a=sc.nextInt();
		System.out.println("the integer data is"+a);
		
		System.out.println("enter the decimal type of data");
		double b=sc.nextDouble();
		System.out.println("the decimal data is"+b);
		
		System.out.println("enter the boolean type of data");
		boolean c=sc.nextBoolean();
		System.out.println("enter boolean data is"+c);
		
		System.out.println("enter the String type of data");
		String d=sc.next();
		System.out.println("the string of the data is"+d);




	}

}
