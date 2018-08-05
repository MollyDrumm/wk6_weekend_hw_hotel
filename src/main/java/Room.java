import java.util.ArrayList;

public abstract class Room {

 private ArrayList<Guest> guests;
 private int capacity;

    public Room(ArrayList<Guest> guests, int capacity) {
        this.guests = guests;
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getCapacity() {
        return capacity;
    }
}
