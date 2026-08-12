package Sorting;

import java.util.Arrays;

public class Copy_Arr {

	public static void main(String[] args) {
		int a[]= {2,5,3,6,8,9,1};
		int b[]=  new int[a.length];
		int maxdiff=0;
		
		for(int i=0;i<a.length;i++) {
		    b[i] = a[i];
		}
			  for (int i = 0; i < a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				int diff=b[j]-a[i];
				maxdiff=Math.max(maxdiff, diff);
			}
		}
			  System.out.println("Copied Array: " + Arrays.toString(b));
		        System.out.println("Maximum Difference: " + maxdiff);
	}

}
