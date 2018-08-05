import java.util.ArrayList;

public class Bedroom  extends Room {

    ArrayList<Guest> newGuest;

    private  int roomNumber;
    private BedroomType roomType;
    private int nightlyRate;

    public Bedroom(ArrayList<Guest> guests, int capacity, int roomNumber, BedroomType roomType, int nightlyRate ) {
        super(guests, capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
        this.newGuest = new ArrayList<>();

    }

    public void addGuest(Guest guest){
        this.newGuest.add(guest);
    }

    public int guestCount() {
        return this.newGuest.size();
    }

}
