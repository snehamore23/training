package ObjectClassMethod;

import java.util.Objects;

public class StudentHashcode {
	
	int age;
	String name;
	
	public StudentHashcode(int age,String name) {
		this.age=age;
		this.name=name;
		
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}


	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		StudentHashcode other = (StudentHashcode) obj;
		return age == other.age && Objects.equals(name, other.name);
	}


	public static void main(String[] args) {
		StudentHashcode s1=new StudentHashcode(21,"sneha");
		StudentHashcode s2=new StudentHashcode(21,"sneha");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	

	}

}
