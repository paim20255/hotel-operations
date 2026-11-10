import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private String names;
    private double payRate;
    private double hoursWorked;
    private int startTime;

    public Employee(String names, double payRate, double hoursWorked, int startTime) {
        this.names = names;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = startTime;
    }
    public void punchIn(int time) {
        System.out.println("hey, " + this.names + " " + "Punched in at" + " " + this.startTime);
        this.startTime = time;
    }
    public void punchIn() {
        LocalDateTime time = LocalDateTime.now();
        int hours = time.getHour();

        this.startTime = hours;
    }


    public void punchOut(int outTime) {
        int hoursToday = outTime - this.startTime;
        this.hoursWorked = this.hoursWorked + hoursToday;
    }
    public void punchOut() {
        LocalDateTime time = LocalDateTime.now();
        int outTime = time.getHour();

        int hoursToday = outTime - this.startTime;
        this.hoursWorked = this.hoursWorked + hoursToday;

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
