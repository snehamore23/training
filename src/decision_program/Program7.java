package decision_program;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter your year:");
		int year = sc.nextInt();

		if (year % 4 ==0){
		   System.out.print("leap year");

		}else if(year % 100==0 && year % 400==0){
		    System.out.print("not a leap year");
		}else{
		    System.out.print("not a leap year");
		}

		}
		}


