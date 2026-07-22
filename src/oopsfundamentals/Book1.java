package oopsfundamentals;

public class Book1 {

	
	/*int pages;
	String title;
	String author;
	
	public Book1() {
		this.pages=120;
		this.title="kotlin";
		this.author="sneha";
	}
		public Book1(int pages) {
			this.pages=pages;
			this.title=title;
			this.author=author;
	}
		public Book1(int pages,String title) {
			this.pages=pages;
			this.title=title;
			this.author=author;
		}
		
		public Book1(int pages,String title,String author) {
			this.pages=pages;
			this.title=title;
			this.author=author;
		}
		
		
	public static void main(String[] args) {
		Book1 b1 = new Book1();
		Book1 b2 = new Book1(120);
		Book1 b3 = new Book1(130,"golan");
		Book1 b4 = new Book1(100, "Sneha", "kotlin");
		
		
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.pages);
		
		
		System.out.println(b2.title);
		System.out.println(b2.author);
		System.out.println(b2.pages);
		
		System.out.println(b3.title);
		System.out.println(b3.author);
		System.out.println(b3.pages);
		
		System.out.println(b4.title);
		System.out.println(b4.author);
		System.out.println(b4.pages);
		
		*/
		
		
		int pages;
		String title;
		String author;
		
		public Book1() {
			this.pages=120;
			this.title="kotlin";
			this.author="sneha";
		}
			public Book1(int pages) {
				this();
				this.pages=pages;
		}
			
			public Book1(int pages, String title) {
				this(pages);
				this.title=title;
		}
			public Book1(int pages, String title, String author) {
				this(pages, title);
				this.author=author;
		}
			public static void main (String[]args) {
				Book1 b4=new Book1(148,"javascript","manu");
				
				System.out.println(b4.title);
				System.out.println(b4.author);
				System.out.println(b4.pages);
				
			
	}

}
