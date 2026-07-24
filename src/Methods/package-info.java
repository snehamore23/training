package Methods;

public class P {
	public static void m1() {
		for(int i=1;i<=5;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void m2(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		m1();
		m2(5);

	}

}