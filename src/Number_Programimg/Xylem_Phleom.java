package Number_Programimg;

public class Xylem_Phleom {

	public static void main(String[] args) {
		
	int n=1210;
	int exsum=n%10;
	n=n/10;
	int middlesum=0;
    while (n>9) {
    	int rem=n%10;
    	middlesum+=rem;
    	n=n/10;
    }
    if(middlesum==exsum+n)
    System.out.println("xylem");
    
    else System.out.println("Phleom");

	}

}
