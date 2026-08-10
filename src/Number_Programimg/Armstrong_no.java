package Number_Programimg;

public class Armstrong_no {

	public static void main(String[] args) {
		int n = 153;
        int original = n;
        int sum = 0;

        while (n != 0) {

            int rem = n % 10;
            
            sum = sum + rem * rem * rem;
            n=n/10;
        }

        if (sum == original) {
            System.out.println(original + " is Armstrong Number");
        } else {
            System.out.println(original + " is not Armstrong Number");
        }
			

	}

}
