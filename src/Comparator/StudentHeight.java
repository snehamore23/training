package Comparator;
import java.util.Comparator;

public class StudentHeight implements Comparator <Student> {


	@Override
	public int compare (Student o1,Student o2) {
		return o1.height-o2.height;
	}

}
