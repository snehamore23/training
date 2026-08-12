package Arrays;

import java.util.Arrays;

public class rotate_Array_left {

	public static void RotationArray(int a[]) {
		int temp=a[0];
		for(int i=1;i<a.length;i++) {
		a[i-1]=a[i];
	}
	a[a.length-1]=temp;
}
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int k=2;
	System.out.println(Arrays.toString(a));
for(int i=1;i<=k;i++) {
	RotationArray(a);
	}
System.out.println(Arrays.toString(a));
}
}

