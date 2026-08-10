package Number_Programimg;

public class SpecificNo {

	public static void main(String[] args) {
		 int n=1234;
			int digit =9;
			boolean value=false;
		
			while(n!=0) {
				int rem=n%10; 
				if(digit==rem) {
					value=true;
					break;
				}
				n=n/10;
			}
				if (value)System.out.println("exist");
				else System.out.println("not exist");
			
	}

}
