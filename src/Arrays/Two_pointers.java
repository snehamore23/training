package Arrays;

public class Two_pointers {

	public static void main(String[] args) {
	
		int a[]= {2,1,3,4,2,1};
		int k=3;
//		int maxsum=0;
//		for(int i=0;i<a.length-k;i++) {
//			
//			int sum=0;
//			for(int j=i;j<i+k;j++) {
//				sum+=a[j];
//			}
//			maxsum=Math.max(maxsum, sum);
//		}
//		System.out.println(maxsum);

		
		int windowsum = 0;{
		for(int i=0;i<k;i++) {
			windowsum+=a[i];
	
		}
		int maxsum=windowsum;
		for(int j=k;j<a.length;j++) {
			windowsum=windowsum-a[j-k]+a[j];
			maxsum=Math.max(maxsum, windowsum);
			
		}
		System.out.println(maxsum);
		}
		
	}

}
