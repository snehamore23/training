package Arrays;

import java.util.Arrays;

public class RotationArrayUsingReverseLogic {
	public static void reverse(int a[],int start,int end) {
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		//System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	System.out.println(Arrays.toString(a));
	int k=2;
	//right roatation
	
//reverse(a, 0, a.length-1);
//reverse(a,0,k-1);
//reverse(a, k, a.length-1);
	
	
//left rotataion
	
reverse(a,0,k-1);
reverse(a, k, a.length-1);
reverse(a, 0, a.length-1);
System.out.println(Arrays.toString(a));

	}

}
