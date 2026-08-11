package Arrays;

public class Even_index {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		
		 System.out.println("Elements at even index:");
		for (int i=1;i<8;i++) {
			if(i%2==0) {
				System.out.println(a[i]);
		}
	}
	System.out.println("Elements at odd index:");
	for (int j=1;j<8;j++) {
		if(j%2!=0)
			System.out.println(a[j]);

	}
}
}

