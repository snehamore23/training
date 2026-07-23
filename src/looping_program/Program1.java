package looping_program;

public class Program1 {

	public static void main(String[] args) {
		//for loop
		
	//for(int i=1; i<=5; i++) {
		//System.out.println("*");
		
		
		//while loop
		
		/*int i=1;
		
		while(i<=5) {
			System.out.println("*");
			i++;
	}
	//*/
		
		
		
		//do while loop
/*int i=1;
do {
	System.out.println("*");
	i++;
	
}while(i<=5);
*/
		
		//nested loop
		for(int i=1; i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	
		
		int n=255;
		if(n%100==5) {
			System.out.println("no ends with 55");
				}else {
					System.out.println("not ending with 55");
				}

	
	int side1=10;
	int side2=10;
	int side3=10;
	
	if(side1==side2 && side2==side3 && side3==side1) {
		System.out.println("all side are equal");
	}
	else if(side1==side2 || side2==side3 || side3==side1) {
		System.out.println("two side are equal");
	}
	else {
		System.out.println("all side are diff");
	}
	}
}