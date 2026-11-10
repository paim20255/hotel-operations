public class Main {
    public static void main(String[] args) {
        Reservation reservation = new Reservation("King", 3, true);

        System.out.println("Does it work:");
        System.out.println("Does this equal 139: " + reservation.getPrice());
        System.out.println("How many nights?: " + reservation.getNumberOfNights());
        System.out.println("Are you staying over the weekend?: " + reservation.isWeekend());

        Employee Nate = new Employee("Nate", 10.0, 55.0, 9);
        Employee Dave = new Employee("Dave", 15.0, 20.0, 10);

        Nate.punchIn(9);
        Nate.punchIn();

        Dave.punchIn(10);
        Dave.punchIn();

        Nate.punchOut(17);
        Nate.punchOut();

        Dave.punchOut(18);
        Dave.punchOut();

        System.out.println("Nate Worked a total of: " + Nate.getHoursWorked());
        System.out.println("Dave Worked a total of: " + Dave.getHoursWorked());

    }
}
