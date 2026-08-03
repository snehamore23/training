package Wrapperclasses;

public class AutoBoxingAndAutoUnBoxing {



	public static void main(String[] args) {
		int a=10;
		Integer ref1=a;//autoboxing
		int value1=ref1;//autounboxing
		System.out.println(ref1);
		System.out.println(value1);
		
		Short b=20;
		Short ref2=b;//autoboxing
		Short value2=ref2;//autounboxing
		System.out.println(ref2);
		System.out.println(value2);
		
		Long c=(long) 30;
		Long ref3=c;//autoboxing
		Long value3=ref3;//autounboxing
		System.out.println(ref3);
		System.out.println(value3);
		
		double d=40;
		double ref4=d;//autoboxing
		double value4=ref4;//autounboxing
		System.out.println(ref4);
		System.out.println(value4);
		
		char e='a';
		char ref5=e;//autoboxing
		int value5=ref5;//autounboxing
		System.out.println(ref5);
		System.out.println(value5);
		
		boolean f=true;
		boolean ref6=f;//autoboxing
		boolean value6=ref6;//autounboxing
		System.out.println(ref6);
		System.out.println(value6);
		// TODO Auto-generated method stub

	}

}
