package Arrays;

import java.util.Arrays;

public class Move_Zero_front {

	public static void main(String[] args) {
		int a[]= {0,1,0,2,0,3};
		int i=a.length-1;
		for(int j =a.length-1;j>0;j--) {
			if(a[j]!=0) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				i--;
			}
		}
			System.out.println(Arrays.toString(a));
		}

	}