package Exeption;
import java.util.Scanner;

public class Voter {

	public static void main(String[] args) throws InvalidCheckedException{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Person age:");
		int age=sc.nextInt();
		
		if(age>=18) System.out.println("eligle to vote");
		//else throw new InvalidAgeException();
		else throw new InvalidCheckedException("not eligible to vote");
		
		System.out.println("further process");
		System.out.println("document verification");
		System.out.println("done with the process");
		System.out.println("successfull");
	}

}
