package Arrays;

import java.util.Arrays;

public class rotate_Array_Right {

	public static void RotationArray(int a[]) {
		int temp=a[a.length-1];
		for(int i=a.length-2;i>=0;i--) {
		a[i+1]=a[i];
	}
	a[0]=temp;
}
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int k=3;
	System.out.println(Arrays.toString(a));
for(int i=1;i<=k;i++) {
	RotationArray(a);
	}
System.out.println(Arrays.toString(a));
}
}

