package Exeption;

import java.util.Scanner;

public class Person {

    public static void main(String[] args) throws InvalidCheckEmail {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        if (email.contains("@")) {
            System.out.println("Valid Email");
        } else {
            throw new InvalidCheckEmail("Invalid Email");
        }

        sc.close();
    }
}

//	} else {
//	   // throw new InvalidEmailException("Invalid Email");
//	//}
	
	//else throw new InvalidAgeException();
		// TODO Auto-generated method stu
