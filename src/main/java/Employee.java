public class Employee {
    private String names;
    private double payRate;
    private double hoursWorked;

    public Employee(String names, double payRate, double hoursWorked) {
        this.names = names;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        double totalPay = this.hoursWorked * this.payRate;
        return totalPay;
    }


    public String getNames() {
        return names;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}
