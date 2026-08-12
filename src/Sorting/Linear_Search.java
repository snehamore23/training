package Sorting;

public class Linear_Search {

	public static void main(String[] args) {
	int a[]= {2,6,8,3,9};
	int target = 2;
	
	boolean found=false;
	for(int i=0;i<a.length;i++) {
		if(a[i]==target) {
			found=true;
			break;
		}
		}
		
		if (found)	System.out.println("Found");
		else System.out.println("Not found");
		}
	
	}
