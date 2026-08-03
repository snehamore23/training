package Wrapperclasses;

public class BoxingAndUnBoxing {

	public static void main(String[] args) {
		byte a=10;
		Byte ref1=Byte.valueOf(a);
		byte value1=ref1.byteValue();
		System.out.println(ref1.toString());
		System.out.println(value1);
		
		
		Short b=20;
		Short ref2=Short.valueOf(b);
		Short value2=ref2.shortValue();
		System.out.println(ref2.toString());
		System.out.println(value2);
		
		
		int c=30;
		Integer ref3=Integer.valueOf(c);
		Integer value3=ref3.intValue();
		System.out.println(ref3.toString());
		System.out.println(value3);
		
		
		long d=40;
		Long ref4=Long.valueOf(d);
		Long value4=ref4.longValue();
		System.out.println(ref4.toString());
		System.out.println(value4);
		
		// TODO Auto-generated method stub

	}

}
