package Sorting;

import java.util.Arrays;

public class Selection_sort {

	public static void main(String[] args) {
		int a[]= {4,2,7,8,9,1,6};
		for (int curr=0;curr<a.length;curr++) {
			int minindex=curr;
		
			for(int next=curr+1;next<a.length;next++) {
				if(a[next]<a[minindex]) {
					minindex=next;
				}
			}
			int temp=a[minindex];
			a[minindex]=a[curr];
			a[curr]=temp;

System.out.println(Arrays.toString(a));
	}

}
}
