package Number_Programimg;

public class Strong_No {

	public static int fact(int n) {
		int res=1;
		for(int i=1;i<=n;i++) {
			res*=1;
		}
		return res;
	}
	public static void main(String[] args) {
		int n=145;
		int temp=n;
		int sumfact=0;
		
		while(n!=0) {
			int rem=n%10;
			sumfact=sumfact+fact(rem);
			n=n/10;
		}
		if(sumfact==temp)
			System.out.println("Strong no");
			
			System.out.println("not Strong no");
	}

}
