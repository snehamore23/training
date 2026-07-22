package Methods;

public class Program2_method {

	
	public static void m1() {
		int a= 10;
		int b= 5;
		if(a>b) {
			System.out.println("a is gretest no");
		}
	else {System.out.println("b is gretest no");
	}

	}
	
	public static void m2(int a , int b) {
		if(a>b) {
			System.out.println("a is gretest no");
		}
	else {System.out.println("b is gretest no");
	}

	}
	
	public static String m3() {
		int a= 10;
		int b= 5;
		if(a>b) return "a is gretest no";
		else return "b is gretest no";
	}

	public static String m4(int a, int b) {
		if(a>b) return "a is gretest no";
		else return "b is gretest no";
	}

	public static void main(String[] args) {
		m1();
		m2(4,8);
		System.out.println(m3());
		System.out.println(m4(9,4));
		System.out.println(m4(2,6));
	

	}

}
