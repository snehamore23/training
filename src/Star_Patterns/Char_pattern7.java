package Star_Patterns;

public class Char_pattern7 {

	public static void main(String[] args) {
		int space=3;
		int star=1;
		for(int i=1;i<=7;i++) {
			char ch='A';
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				if(j<=star/2)
					System.out.print(ch++);
				else
					System.out.print(ch--);
		}
		System.out.println();
		if(i<=3) {
			space--;
			star+=2;
	      }else {
		      space++;
		       star-=2;
	}
		}
	}

}
