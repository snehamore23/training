package Arrays;

public class Occurance_element {
	public static void main(String[] args) {
	
	int a[]={1,1,1,2,2,2,2,2,3,3,3,4,4,4,4};
	boolean check[]=new boolean[a.length];
	
	for (int i=0;i<a.length;i++){
		int count=0;
		if(check[i]==true) {
			continue;
		}
		for(int j=0;j<a.length;j++) {
			if (a[i]==a[j]){
				count++;
				check[j]=true;
			}
		}
		if(count>1) {
			
			System.out.println(a[i]+" occurance of each no: "+count);
		}
	}
	}

}
