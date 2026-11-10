public class Room {
    private int numbersOfBeds;
    private double price;
    private boolean occupied;

    public Room(int numbersOfBeds, double price, boolean occupied) {
        this.numbersOfBeds = numbersOfBeds;
        this.price = price;
        this.occupied = occupied;
    }

    public int getNumbersOfBeds() {
        return numbersOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }
    public boolean isAvailable() {
        boolean available = ! occupied;
        return available;
    }
}
