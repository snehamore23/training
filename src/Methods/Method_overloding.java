package Methods;

public class Method_overloding {
	public static void add() {
		System.out.println(1+2);
	}
	public static void add(int a) {
		System.out.println(a+a);
	}
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		add();
		add(2);
		add(2,3);
		

	}

}
