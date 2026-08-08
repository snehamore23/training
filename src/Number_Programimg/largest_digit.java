package Number_Programimg;

public class largest_digit {

	public static void main(String[] args) {
		int num=214325;
		int temp=0;
		
		while(num!=0) {
			int rem=num%10;
			if(rem>temp)
				temp=rem;
			num=num/10;
		}
		System.out.println("largets digit: "+temp);

	}

}
