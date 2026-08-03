package Wrapperclasses;

	public class Character1 {
		char a;
		public Character1(char a) {
			this.a=a;
		}
		public static Character1 valueOf(char value) {
			return new Character1(value);
		}
		public char charValue() {
			return a;
		}

		public static void main1(String[] args) {
			char a='a';
			Character1 ref1=Character1.valueOf(a); //boxing
			double value=ref1.charValue();//unboxing
			
			System.out.println(ref1);
			System.out.println(value);		// TODO Auto-generated method stub

		}

		

	}

