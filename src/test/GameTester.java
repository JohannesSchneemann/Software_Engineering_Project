package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.junit.Test;

import controller.BlackJackController;
import model.*;
import view.BlackJackView;



public class GameTester {
	
	//Designed to test game launch 
	@Test
	public void testBlackJackGame() {
	
		BlackJackModel game = new BlackJackModel();
		BlackJackView view = new BlackJackView();
		//BlackJackController controller = new BlackJackController(game, view);
		
	}

	@Test
	public final void testSetDealer() {
		Deck deck = new Deck(); 
		Dealer dealer = new BlackJackDealer(deck); 
		Dealer dealer2 = new BlackJackDealer(deck);
		
		//TODO need to make sure dealer is set. 
		
		
	}

}