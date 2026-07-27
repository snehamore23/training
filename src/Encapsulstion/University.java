package Encapsulstion;

public class University {

    private int employeeId;
    private String employeeName;
    private double salary;
    private String department;

    public void work() {
        System.out.println("Employee is working");
    }

    public void applyLeave() {
        System.out.println("Employee applied for leave");
    }

    public void calculateSalary() {
        System.out.println("Employee salary calculated");
    }

    public void displayEmployeeDetails() {
        System.out.println("----------Employee Details----------");
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary : " + salary);
        System.out.println("Department : " + department);
    }

    // Getter & Setter

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        if (employeeId >= 1 && employeeId <= 50) {
            this.employeeId = employeeId;
            System.out.println("Employee ID has been assigned");
        } else {
            System.out.println("Invalid Employee ID");
        }
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        if (employeeName != null) {
            this.employeeName = employeeName;
            System.out.println("Employee name has been assigned");
        } else {
            System.out.println("Invalid Employee Name");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0 && salary <= 50000) {
            this.salary = salary;
            System.out.println("Salary has been assigned");
        } else {
            System.out.println("Invalid Salary");
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department != null) {
            this.department = department;
            System.out.println("Department has been assigned");
        } else {
            System.out.println("Invalid Department");
        }
    }

    public static void main(String[] args) {

        University emp = new University();

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