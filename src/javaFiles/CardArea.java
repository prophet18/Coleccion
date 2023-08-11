// Class to create cards on board area

package javaFiles;

import java.io.FileNotFoundException;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class CardArea {
	
	// Lines 15 --> 19		Instantiate custom game classes/objects		
	CheckMatch check, chk;		ScorePile score;		Boolean active, randomizeCards;			GameButton[] gbs;		Card card1, card2, card3;		Card[] cards;	Deck Deck;
	
	HashMap<Integer, GameButton> buttons;			ArrayList<GameButton> algb;
	
	HashMap<Integer, Card> cardmap;					HashMap<Integer, Integer> indexmap;
	
	// Line 22		Instantiate regular data types	
	int nca = 0, u = 13, c = 1, u2 = 13;						String scoreLabel;		Label scoreKeep, setResult;	
	
	// Constructor for main components of Board object	
	public CardArea() throws FileNotFoundException {		
		
		Deck = new Deck();		Collections.shuffle(Deck);				cards = new Card[144];   
		
		gbs = new GameButton[12];										algb = new ArrayList<GameButton>();
		
		cardmap = new HashMap<Integer, Card>();							score = new ScorePile();
		
		buttons = new HashMap<Integer, GameButton>();					indexmap = new HashMap<Integer, Integer>();
		
		scoreLabel = new String("0");									scoreKeep = new Label(scoreLabel);
		
		setResult = new Label("");										scoreKeep.getStyleClass().add("ScoreLabel");		
		
    	for (int i = 0; i < 144; i++) {
    		cards[i] = Deck.peek();
    		Deck.pop();  
    		
    		if (Deck.size() == 0) {
    			Deck = new Deck();
    			Collections.shuffle(Deck);
    			cards[i] = Deck.peek();
        		Deck.pop();    			
    		}
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
	    			}  	    			
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
	    		}				
				if (nca == 3) {
					check = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
					
					if (check.matchCheck == true) {						
						score.push(cardmap.get(1));				score.push(cardmap.get(2));				score.push(cardmap.get(3));
						
						buttons.get(1).replace(cards[u]);		buttons.get(2).replace(cards[u+1]);		buttons.get(3).replace(cards[u+2]);
						
						u = u + 3;											
						scoreLabel = score.scoreFinal();						
						setResult.setText("Correct!");
						
					} else {
						System.out.println("Wrong");
						setResult.setText("Wrong...");
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
	
	public void newCards() throws FileNotFoundException {
		
		if (u >= 130) {
			u = 13;
			Collections.shuffle(Deck);
		}
		
		for (GameButton btn : algb) {
			for (int r = 0; r < 12; r++) {
				algb.get(r).replace(cards[u + r]);
				
				
			}
		}
		u = u + 12;
		setResult.setText("Active Cards Were Randomized!");
	}
	
	
	/*
	
	
	public void giveHint() {
		for (GameButton btn : algb) {
			
			
			for (int y = 0; y < 10; y++) {
				card1 = algb.get(y).card;
				card2 = algb.get(y + 1).card;
				card3 = algb.get(y + 2).card;
				
				chk = new CheckMatch(card1, card2, card3);
				
				if (chk.matchCheck == true) {
					card1.info();
					card2.info();
					card3.info();
				}
				
			}
		*/	
			
			/*
					chk = new CheckMatch(gbs[c].card, gbs[d].card, gbs[e].card);
					
					if (chk.matchCheck == true) {
						gbs[c].info();
						gbs[d].info();
						gbs[e].info();
					}
				*/
		
	}
	/*
	public void reShuffle() throws FileNotFoundException {
		
		 
    		
    		if (Deck.size() <= 14) {
    			Deck = new Deck();
    			Collections.shuffle(Deck);
    			for (int i = 0; i < 144; i++) {
    	    		cards[i] = Deck.peek();
    	    		Deck.pop();     			
    		}
    			u = 13;
    	}    
	}
		*/
	


