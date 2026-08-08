package Star_Patterns;

public class Starpattern8 {

	public static void main(String[] args) {
	int star=1;
	int space=3;
	for(int i=1;i<=4 ;i++) {
		int num=1;
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) {
			if(j<=star/2) 
		System.out.print(num++);
		else
			System.out.print(num--);
			
		}
	System.out.println();
		 star+= 2;
		space--;
}
	}
	
}