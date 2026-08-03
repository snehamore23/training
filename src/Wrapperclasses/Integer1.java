package Wrapperclasses;

public class Integer1 {
	int a;
	public Integer1(int a) {
		this.a=a;
	}
	public static Integer1 valueOf(int value) {
		return new Integer1(value);
	}
	public int intValue() {
		return a;
	}

	public static void main(String[] args) {
		int a=10;
		Integer1 ref1=Integer1.valueOf(a); //boxing
		int value1=ref1.intValue();//unboxing
		
		System.out.println(ref1);
		System.out.println(value1);
;		// TODO Auto-generated method stub

	}

}
