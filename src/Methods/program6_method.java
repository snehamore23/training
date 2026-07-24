package Methods;

public class program6_method {

		public static void m1() {
			for(char i='A';i<='Z';i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		public static void m2(char ch) {
			for(char i='A';i<='Z';i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		public static void main(String[] args) {
			m1();
			m2('Z');

	}

}
