package Number_Programimg;

public class Neon_no {

	public static void main(String[] args) {
		int n=9;
		int square=n*n;
		int sum=0;
		
		while(square!=0) {
			  int rem = square % 10;
	            sum = sum + rem;
	            square = square / 10;
		}
		if(sum==n)System.out.println("Neon no:" +sum);
		else System.out.println("Not neon no:" +sum);
			
			
		}

	}

