package Arrays;

public class Ascending_order {

	public static void main(String[] args) {
	
		int a[]= {1,2,8,6,0,10,12};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println("Assending Order: ");
		for(int i=0;i<a.length;i++) 
		System.out.print(a[i]+ " ");
	}

}
