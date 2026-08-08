package Star_Patterns;

public class hallow_pattern2 {

	public static void main(String[] args) {
	int star=1;
	int space=3;
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print("   ");
		}
			for(int j=1;j<=star;j++) {
				if(j==1||j==star)
				System.out.print(" * ");
			else
			System.out.print("   ");
	}
	System.out.println();
			if(i<=3) {
				space--;
				star+=2;
			}
				else {
					space++;
					star-=2;
				}
				}

	}
}

