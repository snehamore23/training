package Number_Programimg;

public class Remove_first {
	
public static int Reverse(int n) {
	int rev=0;
	while(n!=0) {
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	return rev;
}


	public static void main(String[] args) {
         int n=54321;
//		
//		int temp =0;
//		while(n>9) {
//			
//			int rem= n%10;
//			temp=temp*10+rem;
//			n=n/10;
//			
//		}
//		System.out.println(Reverse(temp));
		
		int num=Reverse(n);
		System.out.println(Reverse(num/10));
			

	}

}
