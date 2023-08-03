// Class to create cards on board area

package javaFiles;

import java.io.FileNotFoundException;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class CardArea {
		
	CheckMatch check;
	
	ScorePile score;
	
	Boolean active;
		
	GameButton[] gbs;
	
	HashMap<Integer, GameButton> buttons;
	
	ArrayList<GameButton> algb;
	
	HashMap<Integer, Card> cardmap;
	
	HashMap<Integer, Integer> indexmap;
	
	int nca = 0, u = 13, c = 1;
	
	Label scoreKeep;
	
	String scoreLabel;
		
	public CardArea() throws FileNotFoundException {		
		
		Deck Deck = new Deck();
		
		Collections.shuffle(Deck);
	
		Card[] cards = new Card[144];   
		
		gbs = new GameButton[12];
		
		algb = new ArrayList<GameButton>();
		
		cardmap = new HashMap<Integer, Card>();
		
		score = new ScorePile();
		
		buttons = new HashMap<Integer, GameButton>();
		
		indexmap = new HashMap<Integer, Integer>();
		
		scoreLabel = new String("0");
		
		scoreKeep = new Label(scoreLabel);
		scoreKeep.getStyleClass().add("ScoreLabel");
		
		
    	for (int i = 0; i < 144; i++) {
    		cards[i] = Deck.peek();
    		Deck.pop();    	
    	}
    	
    	for (int k = 0; k < 12; k++) {
    	    gbs[k] = new GameButton((k+1), cards[k]); 
    	    
    	    gbs[k].getStyleClass().add("GameButton");
    	    
    	    algb.add(gbs[k]);    	    
    	};    	
    	
    	for (GameButton btn : algb) {			
			
			EventHandler<ActionEvent> handler1  = new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
				
				if (btn.active == true) {
	    			btn.active = false;	
	    			btn.getStyleClass().remove("ActiveButton");
	    			nca--;
	    			switch (nca) {
					case 1:
						cardmap.remove(1);
						buttons.remove(1);
						indexmap.remove(1);
						break;
					case 2:
						cardmap.remove(2);
						buttons.remove(2);
						indexmap.remove(2);
						break;
				}    System.out.println(indexmap.get(1) + " " + indexmap.get(2) + " " + indexmap.get(3) + "     " + nca);			
	    			
	    		} else {
	    			btn.active = true;
	    			nca++;
	    			
	    			btn.getStyleClass().add("ActiveButton");
	    			switch (nca) {
					case 1:
						cardmap.put(1, btn.card);
						buttons.put(1, btn);
						indexmap.put(1, btn.index);
						break;
					case 2:
						cardmap.put(2, btn.card);
						buttons.put(2, btn);
						indexmap.put(2, btn.index);
						break;
					case 3:
						cardmap.put(3, btn.card);
						buttons.put(3, btn);
						indexmap.put(3, btn.index);
						break;
				}    			
	    			System.out.println(indexmap.get(1) + " " + indexmap.get(2) + " " + indexmap.get(3) + "     " + nca);	    			
	    		}
				
				if (nca == 3) {
					check = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
					check.result();
					
					if (check.matchCheck == true) {
						
						score.push(cardmap.get(1));		score.push(cardmap.get(2));		score.push(cardmap.get(3));
						
						buttons.get(1).replace(cards[u]);		buttons.get(2).replace(cards[u+1]);		buttons.get(3).replace(cards[u+2]);
						
						u = u + 3;						
						
						System.out.println(u + "     " + score.scoreTotal());
						System.out.println(score.scoreFinal());
						scoreLabel = score.scoreFinal();						
						
					} else {
						System.out.println("Wrong");
						
						System.out.println(u);
						btn.getStyleClass().remove("ActiveButton");
						btn.getStyleClass().add("GameButton");
					}
					
					nca = 0;
					
					scoreKeep.setText(scoreLabel);
					
					buttons.get(1).active = false;		buttons.get(2).active = false;		buttons.get(3).active = false;
					
					buttons.get(1).getStyleClass().remove("ActiveButton");		buttons.get(2).getStyleClass().remove("ActiveButton");		buttons.get(3).getStyleClass().remove("ActiveButton");
					
					cardmap.clear();		buttons.clear();	indexmap.clear();
					check = null;										
				}					
	    	}
	    	};
	    	
	    	btn.setOnAction(handler1);			
		};				
	}		
}
