import java.util.ArrayList;

public class Bedroom  extends Room {

    private  int roomNumber;
    private String roomType;
    private int nightlyRate;

    public Bedroom(ArrayList<Guest> guests, int capacity, int roomNumber, String roomType, int nightlyRate ) {
        super(guests, capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;

    }
}
