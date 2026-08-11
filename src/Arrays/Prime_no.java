package Arrays;

public class Prime_no {

	public static void main(String[] args) {
		int a[]= {1,3,2,4,6,5,7,9};
		int  n=4;
		for(int i=1;i<a.length;i++) {
			int count = 0;
		
			if(n % i == 0) {
			for(int j = 1; j <= a[i]; j++) {
			if(a[i] % j == 0) {
			count++;
			 }
		}
			  if(count == 2) {
		System.out.print(a[i] + " ");

}
}
		}
	}
}