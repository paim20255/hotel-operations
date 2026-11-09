public class Employee {
    private int employeeId;
    private String names;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String names, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.names = names;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getNames() {
        return names;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}
