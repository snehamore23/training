package Wrapperclasses;

public class Boolean1 {
		Boolean a;
		public Boolean1(Boolean a) {
			this.a=a;
		}
		public static Boolean1 valueOf(Boolean value) {
			return new Boolean1(value);
		}
		public static void main1(String[] args) {
			boolean a=true;
			Boolean1 ref1=Boolean1.valueOf(a); //boxing
			Boolean1 value=ref1.BooleanValue();//unboxing
			
			System.out.println(ref1);
			System.out.println(value);
			// TODO Auto-generated method stub

		}
		

	}


