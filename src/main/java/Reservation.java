public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        double price = 0;

        switch (this.roomType){
            case "King" -> { price = 139.00; }
            case "double" -> {price = 124.00; }
            default -> {
                System.out.println("That's not a room type!!");
            }
        }
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public boolean isWeekend() {
        return !weekend;
    }
}
