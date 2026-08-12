package Sorting;

public class Binary_Search {

	public static void main(String[] args) {
		int a[]= {2,5,3,6,8,9,1};
		int target=2;
		boolean found=false;
		
		int left=0;
		int right=a.length-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			if(target==a[mid]) {
				found=true;
				break;
			}
			else if (target>a[mid] )left=mid+1;
			else if(target<a[mid]) right=mid-1;
			}
		if(found)System.out.println("found");
		else System.out.println("not found");
	}

	}
