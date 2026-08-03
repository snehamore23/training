package Comparator;
import java.util.Comparator;
import java.util.Arrays;


public class EmployeeExperianceDes implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.experiance-o1.experiance;
	}

}
