package Number_Programimg;

public class OddNo_count {

	public static void main(String[] args) {
          int n=12354567;
		
		int sum=0;
		while(n!=0) {
			if(n%2!=0) {
			sum=sum+n%10;
			}
			n=n/10;
		}
		System.out.println(sum);
	}

}
