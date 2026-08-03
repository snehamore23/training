package Comparator;
import java.util.Comparator;
import java.util.Arrays;

public class EmployeeSalaryDes implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o2.salary-o1.salary);
		
	}



}
