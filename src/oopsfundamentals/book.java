package oopsfundamentals;

public class book {
	
	int pages;
	String title;
	String author;

	public static void main(String[] args) {
		book b1 =new book();
		book b2 =new book();
		book b3 =new book();
		
		b1.title="java";
		b1.author="james";
		b1.pages=120;
		System.out.println(b1.author);
		System.out.println(b1.pages);
		System.out.println(b1.title);
	
		b2.title="python";
		b2.author="riya";
		b2.pages=100;
		System.out.println(b2.author);
		System.out.println(b2.pages);
		System.out.println(b2.title);
		
		b3.title="c";
		b3.author="jerry";
		b3.pages=120;
		System.out.println(b3.author);
		System.out.println(b3.pages);
		System.out.println(b3.title);
		
	}

}
