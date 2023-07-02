// Class for board setup and function

package javaFiles;

import java.util.*;
import javaFiles.Card;
import javafx.scene.control.Button;

import java.io.*;

public class Board  {
	
	Card cardactive1, cardactive2, cardactive3;	
	
	
	public Board() throws FileNotFoundException {
		
		Deck Deck = new Deck();
		
		Collections.shuffle(Deck);
		
		GameButton gbutt = new GameButton();
		
		for (int e = 0; e < 12; e++) {
			GameButton f = new GameButton();
		}
		
		
		
		
		
		
		
		
		
		
		
		
    	
    	Card[] board = new Card[12];	
    	
    	Button[] buttons = new Button[12];
    	
    	for (int i = 0; i < 12; i++) {
    		board[i] = Deck.peek();
    		Deck.pop();    	
    		buttons[i] = new Button("", board[i].view);
    	}
    	
    	
    	
		
	}
	
	
	
	
	
	
	
	

}




/*

Listener




*/