package ObjectClassMethod;

import java.util.Objects;

public class Movie {
	
	int movieid;
	String moviename;
	String language;
	int rating;

	public Movie(int movieid,
	String moviename,
	String language,
	int rating){
		this.movieid=movieid;
		this.moviename=moviename;
		this.language=language;
		this.rating=rating;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(language, movieid, moviename, rating);
	}

	@Override
	public boolean equals(Object obj) {
		Movie other = (Movie) obj;
		return Objects.equals(language, other.language) && movieid == other.movieid
				&& Objects.equals(moviename, other.moviename) && rating == other.rating;
	}

	public static void main(String[] args) {
		Movie m1=new Movie(1,"spiderman","english",5);
		Movie m2=new Movie(1,"spiderman","english",5);
		System.out.println(m1.equals(m2));
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		// TODO Auto-generated method stub

	}

}
