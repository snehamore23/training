package Arrays;

public class Check_array {

	public static void main(String[] args) {
		int a[]= {1,2,8,6,0,10,12};
		int n=0;
		boolean found =false;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				found=true;
				break;
			}
		}
			if(found)
				System.out.println("Element is Present");
			else 
				System.out.println("Element is not Present");
			}
}