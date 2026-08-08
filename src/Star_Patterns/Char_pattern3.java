package Star_Patterns;

public class Char_pattern3 {

	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=4;i++) {
		for(int j=1;j<=4;j++) {
			if(num==9) {
			System.out.print(num);
			num=1;
		}
			else 
				System.out.print(num++);
		}
		System.out.println();

	}
	}

}
