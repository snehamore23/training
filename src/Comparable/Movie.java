package Comparable;
import java.util.Arrays;

public class Movie implements Comparable <Movie> {
	
	int movieid;
	String moviename;
	String lang;
	int rating;
	

	public Movie(int movieid, String moviename, String lang, int rating) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.lang = lang;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", lang=" + lang + ", rating=" + rating + "]";
	}
	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.movieid-o.movieid;
	}


	public static void main(String[] args) {
		Movie m1=new Movie(2,"spiderman","eng",10);
		Movie m2=new Movie(8,"boyz","marathi",8);
		Movie m3=new Movie(5,"spiderman 3","Eng",9 );
		
		Movie arr[]= {m1,m2,m3};
		System.out.println(Arrays.toString(arr));
		
		java.util.Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		// TODO Auto-generated method stub

	}

}
