package Sorting;

import java.util.Arrays;

public class Insertion_sort {

	public static void main(String[] args) {
		int a[]= {8,5,7,3,2};
		for (int i=0;i<a.length;i++) {
				int temp=a[i];
				int j=i-1;
				while(j>=0&&a[j]>temp) {
					a[j+1]=a[j];
					j--;
				}
				a[j+1]=temp;
				System.out.println(Arrays.toString(a));
			}
		}

}
	