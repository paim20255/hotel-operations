public class Main {
    public static void main(String[] args) {
        Reservation reservation = new Reservation("King", 3, true);

        System.out.println("Does it work:");
        System.out.println("Does this equal 139: " + reservation.getPrice());
        System.out.println("How many nights?: " + reservation.getNumberOfNights());
        System.out.println("Are you staying over the weekend?: " + reservation.isWeekend());

    }
}
