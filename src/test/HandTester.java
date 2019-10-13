/*package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.*;


class HandTester{
	

     @Test
    *
     * Test the hard total of a hand with multiple cards.
     *
    public void testHandTotalWithMultipleCards() {
        Hand hand = new Hand();
        extracted(hand);
        
        
        // new Card needs Suit and Rank(face value)
        // I added the rank class just for test purposes
        
       
        hand.addCard(new Card(Suit.CLUB, Rank.KING));
        hand.addCard(new Card(Suit.CLUB, Rank.QUEEN));
        assertEquals(22, hand.score().getTotal());
    }

	private void extracted(Hand hand) {
		hand.addCard(new Card(Suit.CLUB));
	}

    @Test
    /**
     * Test the soft total of a hand with multiple cards.
     *
    public void testHardHandWithMultipleCards() {
        Hand hand = new Hand();
        hand.addCard(new Card(Suit.CLUB, Rank.TWO));
        hand.addCard(new Card(Suit.CLUB, Rank.KING));
        hand.addCard(new Card(Suit.CLUB, Rank.ACE));
        HandTotal handTotal = hand.calculateTotal();
        assertEquals(13, handTotal.getTotal());
        assertFalse(handTotal.isSoft());
    }

    @Test
    public void testHandIsPair() {
        Hand hand = new Hand();
        hand.addCard(new Card(Suit.CLUB, Rank.TWO));
        hand.addCard(new Card(Suit.CLUB, Rank.TWO));
        assertTrue(hand.isPair());
    }

    @Test
    public void testHandIsPairWithMoreThan2Cards() {
        Hand hand = new Hand();
        hand.add(new Card(Suit.CLUB, Rank.TWO));
        hand.add(new Card(Suit.CLUB, Rank.TWO));
        hand.add(new Card(Suit.CLUB, Rank.THREE));
        assertFalse(hand.isPair());
    }

    @Test
    public void testHandNotPair() {
        Hand hand = new Hand();
        hand.add(new Card(Suit.CLUB, Rank.TWO));
        hand.add(new Card(Suit.CLUB, Rank.KING));
        assertFalse(hand.isPair());
    }

    @Test
    public void testSoftTotal() {
        Hand hand = new Hand();
        hand.add(new Card(Suit.CLUB, Rank.ACE));
        hand.add(new Card(Suit.CLUB, Rank.KING));
        HandTotal handTotal = hand.calculateTotal();
        assertEquals(21, handTotal.getTotal());
        assertTrue(handTotal.isSoft());
    }

    @Test
    public void testSoftTotalWithTwoAces() {
        Hand hand = new Hand();
        hand.add(new Card(Suit.CLUB, Rank.ACE));
        hand.add(new Card(Suit.CLUB, Rank.ACE));
        hand.add(new Card(Suit.CLUB, Rank.TWO));
        HandTotal handTotal = hand.calculateTotal();
        assertEquals(14, handTotal.getTotal());
        assertTrue(handTotal.isSoft());
    }
    
}
*/
