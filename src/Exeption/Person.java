package Exeption;

import java.util.Scanner;

public class Person{
	public static void main(String[] args) throws InvalidCheckEmail {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter email:");
		String email = sc.nextLine();
		if (email.contains("@"))System.out.println("valid");
		else throw new InvalidCheckEmail ("invalid");
	}
}

//	} else {
//	   // throw new InvalidEmailException("Invalid Email");
//	//}
	
	//else throw new InvalidAgeException();
		// TODO Auto-generated method stu
