package Sorting;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		int a[]= {4,2,7,8,9,1,6};
		for (int curr=0;curr<a.length;curr++) {
			for(int next=curr+1;next<a.length;next++) {
				if(a[next]<a[curr]) {
					int temp=a[next];
					a[next]=a[curr];
					a[curr]=temp;
			}
		}
			System.out.print(a[curr]+ " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a));

}
}