package Arrays2D;

public class Diagonal {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				if(row+col==a.length-1||row==col)
					System.out.println(a[row][col]);
			}
		}
	}

}
