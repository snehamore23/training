package Star_Patterns;

public class Y_pattern {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			
			for(int j=1;j<=4;j++) {
				if(i==4||i==7||j==4||j==1&&i<=4)
				System.out.print(" * ");
				else
					System.out.print("   ");
				
			}
			System.out.println();

}
	}
}
