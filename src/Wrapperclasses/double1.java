package Wrapperclasses;

public class double1 {
	double a;
	public double1(double a) {
		this.a=a;
	}
	public static double1 valueOf(double value) {
		return new double1 (value);
	}
	public double doubleValue() {
		return a;
	}

	public static void main(String[] args) {
		double a=20;
		double1 ref1=double1.valueOf(a); //boxing
		double value=ref1.doubleValue();//unboxing
		
		System.out.println(ref1);
		System.out.println(value);
;		// TODO Auto-generated method stub

	}

}


