package Number_Programimg;

public class Smallest_digit {

	public static void main(String[] args) {
		int num=24325;
		int temp=num/10;
		//int temp=9;
		
		while(num!=0) {
			int rem=num%10;
			if(rem<temp)
				temp=rem;
			num=num/10;
		}
		System.out.println("Smallest digit: "+temp);
	}

}
