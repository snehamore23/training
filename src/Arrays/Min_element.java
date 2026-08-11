package Arrays;

public class Min_element {

	public static void main(String[] args) {
		int b[]= {1,2,8,6,0,10,12};
		int min1=b[0];
		for(int i=0;i<b.length;i++) {
			if(b[i]<min1) {
				min1=b[i];
				
			}else if(b[i]<min1&&b[i]>min1) {
				min1=b[i];
			}
		}
		System.out.println("Lowest: "+min1);

	}

}
