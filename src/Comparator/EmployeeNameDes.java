package Comparator;
import java.util.Comparator;
import java.util.Arrays;


public class EmployeeNameDes implements Comparator<Employee> {


	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.empname.compareTo (o1.empname);
	}

}
