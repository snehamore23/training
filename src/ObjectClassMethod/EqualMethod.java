package ObjectClassMethod;

import java.util.Objects;

public class EqualMethod {
	int rollno;
	String name;
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualMethod other = (EqualMethod) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno;
	}


	public EqualMethod(int rollno, String name) {
		super();
		this.rollno=rollno;
		this.name=name;
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		EqualMethod e1=new EqualMethod(1,"joe");
		EqualMethod e2=new EqualMethod(1,"joe");
		System.out.println(e1);
		
		
		
		// TODO Auto-generated method stub

	}

}
