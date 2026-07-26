package Encapsulstion;

public class employee1 {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setEmployeeId(10);
        emp.setEmployeeName("Sneha");
        emp.setSalary(45000);
        emp.setDepartment("IT");

        emp.work();
        emp.applyLeave();
        emp.calculateSalary();

        emp.displayEmployeeDetails();
    }
}

