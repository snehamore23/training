package Arrays;

public class Two_dimentional_arrays {

	public static void main(String[] args) {
	int b[][]=new int[3][3];
	System.out.println(b);
	System.out.println(b[0]);
	System.out.println(b.length); 
	System.out.println(b[0].length);
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	for(int row=0;row<a.length;row++) {
		for(int col=0;col<a[0].length;col++) {
			System.out.print(a[row][col]+ " ");
		}
		System.out.println();
	}

	}

}
