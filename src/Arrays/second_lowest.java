package Arrays;

public class second_lowest {

	public static void main(String[] args) {
		int b[]= {1,2,8,6,0,10,12};
		int min1=b[0];
		int min2=b[1];
		for(int i=0;i<b.length;i++) {
			if(b[i]<min2) {
				min2=min1;//for lowest
				min1=b[i];
				
			}else if(b[i]<min1&&b[i]>min1) {
				min2=b[i];
			}
		}
		System.out.println("Lowest: "+min1);
		System.out.println("Second lowest:"+min2);//

	}

}
