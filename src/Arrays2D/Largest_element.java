package Arrays2D;

public class Largest_element {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int max=0;
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[0].length;col++) {
				if(a[row][col]>max)
					max=a[row][col];
			}
			}
				System.out.print(max);
	}

}
