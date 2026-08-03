package Comparator;
import java.util.Comparator;
import java.util.Arrays;

public class EmployeeName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.empname.compareTo (o2.empname);
	}

}
