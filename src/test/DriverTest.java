package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import blackjack.BlackJackDriver;

class DriverTest {
	
	static BlackJackDriver blackjack = new BlackJackDriver();
	
	@BeforeAll //NO creation needed
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll //NO deletion needed 
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	public static void testGameDriver() {
		BlackJackDriver blackjack2 = new BlackJackDriver();
		assertEquals(blackjack, blackjack2);
	}
}
