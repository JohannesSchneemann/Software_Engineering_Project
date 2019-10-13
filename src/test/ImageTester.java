package test; 
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.ImageLoader;
import model.Suit;

class ImageTester {

	
	
	@BeforeAll //NO creation needed
	static void setUpBeforeClass() throws Exception {
	}

	
	
	@AfterAll //NO deletion needed 
	static void tearDownAfterClass() throws Exception {
	}

	
	
	@Test
	public final void testGetImageLocation() {
		
		Suit s = Suit.HEART;
		int value = 5;
		
		assertEquals("../../../resources/h5.png",
				 "../../../resources/h5.png",
					 ImageLoader.getImageLocation(s, value));
	}

}
