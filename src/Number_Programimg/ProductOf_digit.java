package Number_Programimg;

public class ProductOf_digit {

	public static void main(String[] args) {
		int n=234;
        int product=1;
		
		while (n!=0) {
			int digit = n % 10;
			product=product*digit;
			n=n/10;
		}
			System.out.println(product);

	}

}
