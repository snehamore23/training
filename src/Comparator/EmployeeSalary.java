package Comparator;
import java.util.Comparator;
import java.util.Arrays;

public class EmployeeSalary implements Comparator <Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o1.salary-o2.salary);
		
		
	}

}
