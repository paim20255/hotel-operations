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

        Dave.punchIn(10);

        Nate.punchOut(17);

        Dave.punchOut(18);

    }
}
