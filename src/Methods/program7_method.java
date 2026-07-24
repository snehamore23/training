package Methods;

public class program7_method {
		public static void m1() {
			for(int i=10;i>=1;i--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		public static void m2(int n) {
			for(int i=n;i>=1;i--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		public static void main(String[] args) {
			m1();
			m2(10);
		}

	}

