import java.util.ArrayList;

public class ConferenceRoom extends Room {
    private String name;
    private int dailyRate;

    public ConferenceRoom(ArrayList<Guest> guests, int capacity, String name, int dailyRate) {
        super(guests, capacity);
        this.name = name;
        this.dailyRate = dailyRate;
    }
}
