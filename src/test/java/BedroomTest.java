import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom( new ArrayList<Guest>(), 1, 20, BedroomType.SINGLE, 70);
        guest = new Guest();
    }


    @Test
    public void addGuest() {
        this.bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }
}
