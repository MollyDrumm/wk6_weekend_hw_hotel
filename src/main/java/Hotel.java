import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> collectionOfRooms;

    public Hotel() {
        this.collectionOfRooms = new ArrayList<>();
    }



}

    //}
//    public static ArrayList<Card> makeNewDeck() {
//        ArrayList<Card> deck = new ArrayList<>();  //create new deck, albeit an empty one.
//
//        SuitType[] allSuits = SuitType.values(); //create array of all suit types
//        NumberType[] allNumbers = NumberType.values(); //create array of all numbers
//
//        for (NumberType number : allNumbers) {  //
//            for (SuitType suit : allSuits) {
//                Card newCard = new Card(suit, number);
//                deck.add(newCard);
//            }
//        }
//        return deck;
