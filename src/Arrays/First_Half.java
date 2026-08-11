package Arrays;

public class First_Half {

	public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60};
	
	System.out.println("First half:");
	int mid=a.length/2;
	for(int i=0;i<mid;i++) {
		System.out.print(a[i]+ " " );
	}

	System.out.println();
	System.out.println("Second half:");
	int mid1=a.length/2;
	for(int i=mid1;i<a.length;i++) {
		System.out.print(a[i]+ " " );
	}
}
}
