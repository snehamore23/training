package Methods;

public class Method_with_returntype_npm {

	
	public static byte bytemethod () {
		return 1;
	}
	public static short shortmethod() {
		return 2;
	}
	public static int intmethod1() {
		return 1000;
	}
	public static long longmethod() {
		return 13244596454l;
	}
	public static float floatmethod() {
		return 13244.43546f;
	}
	public static double doublemethod() {
		return 132445.96454;
	}
	public static char charmethod() {
		return 'c';
	}
	public static boolean booleanmethod() {
		return true;
	}
	public static String StringMethod() {
		return "sneha";
	}
	public static int[] arraymethod() {
		int a[]= {1,2,3,4,5,6};
		return a;
	}
	
	public static Method_with_returntype_npm objectMethod() {
		Method_with_returntype_npm object =new Method_with_returntype_npm();
		return object;
	}
	public static void normalmethod() {
		System.out.println("notmal method with no return type");
		
	}
	public static void main(String[]args) {
	System.out.println(bytemethod());
	System.out.println(shortmethod());
	System.out.println(intmethod1());
	System.out.println(longmethod());
	System.out.println(floatmethod());
	System.out.println(doublemethod());
	System.out.println(charmethod());
	System.out.println(booleanmethod());
	System.out.println(StringMethod());
	System.out.println(arraymethod());
	normalmethod();
	//System.out.println(objectmethod);=


	}

}
