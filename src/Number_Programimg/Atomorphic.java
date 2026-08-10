package Number_Programimg;

public class Atomorphic {

	public static void main(String[] args) {
	int n=50;
	int temp=n;
	int sqr=n*n;
	int position=1;
	while(n!=0) {
		position*=10;
		n=n/10;
	}
	if(sqr%position==temp) {
		System.out.println("Atomorphic");
	}else {
		System.out.println("Not Atomorphic" );
	}

	}

}
