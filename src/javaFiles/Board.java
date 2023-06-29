// Class for board setup and function

package javaFiles;

import java.util.*;
import javaFiles.Card;
import javafx.scene.control.Button;

import java.io.*;

public class Board  {
	
	Card cardactive1, cardactive2, cardactive3;	
	
	
	public Board() throws FileNotFoundException {
		
		Deck2 deck5 = new Deck2();
		
		Collections.shuffle(deck5);
    	
    	Card[] board = new Card[12];	
    	
    	Button[] buttons = new Button[12];
    	
    	for (int i = 0; i < 12; i++) {
    		board[i] = deck5.peek();
    		deck5.pop();    	
    		buttons[i] = new Button("", board[i].view);
    	}
    	
    	HashMap<Button, Card> halo = new HashMap<Button, Card>();
    	
    	for (int i = 0; i < 12; i++) {
    		halo.put(buttons[i], board[i]);
    	}
    	
    	Button pushme = new Button();
    	
		
	}
	
	
	
	
	
	
	
	

}
