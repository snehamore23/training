package Sorting;

import java.util.Arrays;

public class Reverse_array {

	public static void main(String[] args) {
		int a[]= {2,5,3,6,8,9,1};
		boolean found=false;
		int left=0;
		int right=a.length-1;
		System.out.println(Arrays.toString(a));
		while(left<right) {
			int temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		}
System.out.println(Arrays.toString(a));
	}

}
