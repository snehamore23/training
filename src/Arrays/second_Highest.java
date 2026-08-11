package Arrays;

public class second_Highest {

	public static void main(String[] args) {
	int b[]= {1,2,8,6,0,10,12};
	int max1=-1;
	int max2=-1;
	for(int i=0;i<b.length;i++) {
		if(b[i]>max1) {
			max2=max1; //only for highest
			max1=b[i];
			
		}else if(b[i]>max2&&b[i]<max1) {
			max2=b[i];
		}
	}
	System.out.println("Highst: "+max1);
	System.out.println("Second Higest:"+max2);//

	}

}
