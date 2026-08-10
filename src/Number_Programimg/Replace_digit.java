package Number_Programimg;

public class Replace_digit {

	public static void main(String[] args) {
		int n=12225;
		int digit=2;
		int replace=9;
		int value=0;
		int position=1;
		
		while(n!=0) {
			int rem=n%10;
			if(rem==digit){
				value=value+replace*position;
			}
			else {
				value=value+rem*position;
			}
				position*=10;
				n=n/10;
			}
			System.out.println(value);
		}

	}

