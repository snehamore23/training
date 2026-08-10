package Number_Programimg;

public class Happy_No {

	public static void main(String[] args) {
		int n=9;
		int temp=n;
		
		while(temp!=4&&temp!=1) {
		
		int sum=0;
		while(temp!=0) {
			int rem=temp%10;
			sum+=rem*rem;
			temp=temp/10;
		}
		temp=sum;
		}
		if(temp==1)System.out.println("Happy no");
		else System.out.println("Unhappy no");
     
	}

}
