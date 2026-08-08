package Star_Patterns;

public class Char_pattern4 {

	public static void main(String[] args) {
		int num=1;
		char ch='A';
		for(int i=1;i<=4;i++) {
		for(int j=1;j<=4;j++) {
			if(i%2==0) {
			System.out.print(ch++);
		}
			else 
				System.out.print(ch);
		}
		System.out.println();
		}

	}

}
