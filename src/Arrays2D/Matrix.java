package Arrays2D;

import java.util.Arrays;

public class Matrix {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int c[][]=new int [3][3];
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				c[col][row]=a[row][col];
			}
		}
					System.out.println(Arrays.deepToString(c));
					
		int res[][]=new int [3][3];
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				res[i][j]=a[i][j]+c[i][j];
			}
		}
					System.out.println(Arrays.deepToString(res));
			}
}
