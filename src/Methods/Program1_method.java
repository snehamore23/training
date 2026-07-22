package Methods;

public class Program1_method {
	
	public static void m1() {
		int a= 10;
		if(a>0)System.out.println("positive no");
	else if (a<0)System.out.println("negative no");
	else System.out.println("zero");
	}
	
	public static void m2(int a) {
		if(a>0)System.out.println("positive no");
	else if (a<0)System.out.println("negative no");
	else System.out.println("zero");
	}

	
	public static String m3() {
		int a= 10;
		if(a>0) return "positive";
	else if (a<0) return "negative";
	else return "zero";
	}
	
	
	public static String m4(int a) {
		if(a>0) return "positive";
	else if (a<0) return "negative";
	else return "zero";
	}
	
	
	public static void main(String[] args) {
		m1();
		m2(-1);
		m2(0);
		System.out.println(m3());
		System.out.println(m4(0));
		System.out.println(m4(2));
		System.out.println(m4(-6));


		
		
		

	}

}
