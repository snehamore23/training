package Number_Programimg;

public class PrimeNo {
	
	public static boolean isPrime(int n) {
		if(n<=1) return false;
		
		for(int i=2;i<n;i++) {
			if(n%i==0)return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
	int n=13;
	
	if(isPrime(n)) System.out.println("prime");	
	else 
		System.out.println("not prime");	

	}
}

