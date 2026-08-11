package Arrays;

public class Average_even_odd {

			public static void main(String[] args) {
				int a[]= {1,2,3,4,5,6,7,8};
				int evensum=0,evencount=0;
				int oddsum=0,oddcount=0;
				for (int i = 0; i < a.length; i++) {

		            if (a[i] % 2 == 0) {
		                evensum = evensum + a[i];
		                evencount++;
		            } else {
		                oddsum = oddsum + a[i];
		                oddcount++;
		            }
		        }

		        System.out.println("Sum of even elements: " + evensum/evencount);
		        System.out.println("Sum of odd elements: " + oddsum/oddcount);
	}

}
