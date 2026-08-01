package Exeption;
import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Person age:");
		int age=sc.nextInt();
		
		if(age>=18) System.out.println("eligle to vote");
		else throw new InvalidAgeException();
		
		System.out.println("further process");
		System.out.println("document verification");
		System.out.println("done with the process");
		System.out.println("successfull");
	}

}
