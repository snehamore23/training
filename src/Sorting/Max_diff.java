package Sorting;

public class Max_diff {

	public static void main(String[] args) {
		int a[]= {2,5,3,6,8,9,1};
		int maxdiff=0;
		
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=i+1;i<a.length;j++) {
				sum=a[j]-a[i];
			}
			maxdiff=Math.max(maxdiff, sum);
		}
	
	System.out.println("Maximum diff is: "+maxdiff);
	}
}
