package oopsfundamentals;

public class Demo_object {

	public static void main(String[] args) {
		Demo_object ref1= new Demo_object();
		Demo_object ref2= new Demo_object();
		Demo_object ref3= new Demo_object();


			
		System.out.println(ref1==ref2);
		System.out.println(ref2==ref3);
		System.out.println(ref3==ref1);
		
		Demo_object ref4=ref1;
		Demo_object ref5= ref2;
		Demo_object ref6=ref3; 
		
		System.out.println(ref4==ref1);
		System.out.println(ref5==ref2);
		System.out.println(ref6==ref3);
		}


	}


