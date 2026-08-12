package Arrays;

import java.util.Arrays;

public class Move_zero_last{

	public static void main(String[] args) {
		int a[]= {0,1,0,2,0,3};
		int i=0;
		for(int j = 1;j<a.length;j++) {
			if(a[j]!=0) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				i++;
			}
		}
			System.out.println(Arrays.toString(a));
		}

	}
