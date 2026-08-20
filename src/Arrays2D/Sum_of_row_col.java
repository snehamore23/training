package Arrays2D;

public class Sum_of_row_col {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int row=0;row<a.length;row++) {
			int sum=0;
		
			for (int col=0;col<a[row].length;col++) {
				sum+=a[row][col];
			}
			System.out.println("row sum: "+ sum);

	}

	}
}
