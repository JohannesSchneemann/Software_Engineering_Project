package test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//import model.Card;
//import model.Rank;
//import model.Suit;
//
//import static junit.framework.Assert.assertEquals;
//import static junit.framework.Assert.assertTrue;
//
//
//class CardTest {
//	private Card c1;
//	
//	@Test
//    public void testGetSuit() throws Exception {
//        assertEquals(c1.getSuit(), Suit.CLUB);
//    }
//	@Test
//	public void testGetNumber() throws Exception {
//		assertEquals(c1.getNumber(), Rank.KING);
//	}
//	@Test
//    public void testToString() throws Exception {
//        assertTrue(c1.toString().equals("KING-CLUBS"));
//    }
//}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Card;
import model.Rank;
import model.Suit;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;


class CardTest {
	private Card card;
	
	@Test
    public void testGetSuit() throws Exception {
        assertEquals(card.getSuit(), Suit.CLUB);
        card.hashCode();
    }
	@Test
	public void testGetNumber() throws Exception {
		assertEquals(card.getNumber(), Rank.KING);
	}
	@Test
    public void testToString() throws Exception {
        assertTrue(card.toString().equals("KING-CLUBS"));
    }
}
