package Exeption;

import java.util.Scanner;

public class user {
	public static void main(String[] args) throws InvalidPasswordException1 {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Password:");
		String password=sc.nextLine();
		
		if(password.length()>=8)System.out.println("valid");
		else throw new InvalidPasswordException1 ("invalid");
	}
}
