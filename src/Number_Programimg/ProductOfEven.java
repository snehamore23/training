package Number_Programimg;

public class ProductOfEven {

	public static void main(String[] args) {
		 int n=1234;
			
			int product=1;
			while(n>9) {
				if(n%2==0) {
					int digit =n%10;
				product*=digit;
				}
				n=n/10;
			}
			System.out.println(product);

	}

}
