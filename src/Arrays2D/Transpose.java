package Arrays2D;

import java.util.Arrays;

public class Transpose {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int c[][]=new int [3][3];
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				c[col][row]=a[row][col];
			}
		}
					System.out.println(Arrays.deepToString(c));
			}
		}

