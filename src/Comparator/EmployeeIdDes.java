package Comparator;
import java.util.Arrays;
import java.util.Comparator;

public class EmployeeIdDes implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.empid-o1.empid;
	}

}
