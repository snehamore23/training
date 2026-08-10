package Number_Programimg;

public class Add_1_toall {
	public static void main(String[] args) {
	int n=1234;
	int result=0;
	int position=1;
	while(n!=0) {
		int rem=n%10+1;
		result=result+rem*position;
		position*=10;
		n=n/10;
	}
	System.out.println(result);


	}

}
