package Arrays;

public class Max_element {

	public static void main(String[] args) {
		int b[]= {1,2,8,6,0,10,12};
		int max1=-1;
		for(int i=0;i<b.length;i++) {
			if(b[i]>max1) {
				max1=b[i];
				
			}else if(b[i]<max1) {
				max1=b[i];
			}
		}
		System.out.println("Highst: "+max1);

	}

}
