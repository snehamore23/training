package Number_Programimg;

public class SumOf_no {

	public static void main(String[] args) {
		int n=13215;
          int sum=0;
		
		while (n>0) {
			sum=sum+n%10;
			n=n/10;
		}
			System.out.println(sum);
		
	}

}
