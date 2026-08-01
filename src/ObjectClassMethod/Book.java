package ObjectClassMethod;

import java.util.Objects;

public class Book {

	int bookid;
	String title;
	String author;
	
	public Book(int bookid, String title,String author){
		this.bookid=bookid;
		this.title=title;
		this.author=author;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(author, bookid, title);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bookid == other.bookid && Objects.equals(title, other.title);
	}


	public static void main(String[] args) {
		Book b1=new Book(1,"ekigai","xyz");
		Book b2=new Book(1,"ekigai","xyz");
		System.out.println(b1.equals(b2));
		// TODO Auto-generated method stub

	}

}
