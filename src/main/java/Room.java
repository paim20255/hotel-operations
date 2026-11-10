public class Room {
    private int numbersOfBeds;
    private boolean occupied;
    private boolean dirty;

    public Room(int numbersOfBeds, boolean occupied) {
        this.numbersOfBeds = numbersOfBeds;
        this.occupied = occupied;
    }
    public int getNumbersOfBeds() {
        return numbersOfBeds;
    }
    public boolean isOccupied() {
        return !occupied;
    }
    public boolean isAvailable() {
        boolean available = ! occupied;
        return available;
    }

    public boolean isDirty() {
        return dirty;
    }
}
