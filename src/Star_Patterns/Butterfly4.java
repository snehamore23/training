package Star_Patterns;

public class Butterfly4 {

	public static void main(String[] args) {
		int star=1;
		int space=7;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print(" * ");
			}
			for(int j=1;j<=space;j++) {
			System.out.print("   ");
			}
			for(int j=1;j<=star;j++) {
				if(j!=5)
				System.out.print(" * ");
				}
			System.out.println();
			star++;
			space-=2;
	}
	}

	}

