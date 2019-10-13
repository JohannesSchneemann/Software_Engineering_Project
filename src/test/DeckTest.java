//package test;
//
//import org.junit.Before;
//import org.junit.Test;
//import model.Card;
//import model.Deck;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import static org.junit.Assert.assertTrue;
//
//public class DeckTest {
//	private Deck<Card> d1;
//
//    @Before
//    public void setUp(){
//        d1 = new Deck<Card>();
//    }
//
//    @Test
//    public void testDrawCard() throws Exception {
//        //int count = 52;
//        Card c = null;
//        for(int i = 52; i > 0; i--){
//            c = d1.dealCard();
//            assertTrue(d1.getClass() == Deck.class);
//        }
//        // try to draw a deck from an empty deck;
//        c = d1.dealCard();
//        assertTrue(c == null);
//    }
//    
//    /**
//     * Shuffle the deck and make sure
//     * that there are 52 unique cards after the shuffle
//     * @throws Exception
//     */
//    @Test
//    public void testShuffle() throws Exception{
//        d1.shuffle();
//        assertTrue(d1.size() == 104);
//        HashSet<Card> cards = new HashSet<Card>();
//        for(int i = 1; i <= 52; i++){
//            cards.add(d1.peek(i));
//        }
//        assertTrue(cards.size() == 52);
//    }
//    
//    /**
//     * @throws Exception
//     */
//    @Test
//    public void testExampleText() throws Exception{
//        Deck deck = new Deck();
//        // Shuffling deck ...
//        deck.shuffle();
//
//        ArrayList<Card> hand = new ArrayList<Card>();
//        // Drawing a hand ...
//        for(int i = 0; i < 5; i++){
//            deck.dealCard().toString();
//        }
//    }
//    /**
//     * tests the size of a deck
//     * @throws Exception
//     */
//    @Test
//    public void testSize() throws Exception {
//        assertTrue(d1.size() == 52);
//        for(int i = 10; i > 0; i--){
//            d1.dealCard();
//        }
//        assertTrue(d1.size() == 42);
//        for(int i = 42; i > 0; i--){
//            d1.dealCard();
//        }
//        assertTrue(d1.size() == 0);
//    }
//    
//}
