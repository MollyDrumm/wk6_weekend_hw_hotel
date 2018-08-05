import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class HotelTest {

   private Bedroom bedroom;
   private Guest guest;
   private Hotel hotel;

    @Before
    public void before(){
        bedroom = new Bedroom(new ArrayList<Guest>(), 4, 27, BedroomType.FAMILY, 170);

    }

//
//    @Test
//    public void checkInGuest(Guest guest) {
//        assertEquals(1, hotel.checkInGuest(guest));
//    }
}
