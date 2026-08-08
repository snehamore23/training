package Star_Patterns;

public class Char_pattern6 {

	public static void main(String[] args) {
		int space=0;
		int star=7;
		for(int i=1;i<=4;i++) {
			int n=1;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				if(j<=star/2)
					System.out.print(n++);
				else
					System.out.print(n--);
		}
		System.out.println();
			space++;
			star-=2;
	}

	}

}
