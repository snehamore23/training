package Comparator;
import java.util.Comparator;
import java.util.Arrays;

public class EmployeeId implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.empid-o2.empid;
		
	}

}
