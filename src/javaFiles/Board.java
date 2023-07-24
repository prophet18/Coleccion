// Class for board setup and function

package javaFiles;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.IntStream;

import javaFiles.Card;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;

import java.io.*;

public class Board  {
		
	
	Random randoms = new Random(); 
	
	CheckMatch solve;
	
	GameButton	gbu1, gbu2, gbu3, gbu4, gbu5, gbu6, gbu7, gbu8, gbu9, gbu10, gbu11, gbu12;

	HashMap<Integer, Card> cardmap;
	HashMap<Integer, Integer> indexmap;
	
	int ncarda = 0; int nca = 0;
	
	int u = 13;
	
	ScorePile score;
	
	GameButton[] gbs;
		
	
	public Board() throws FileNotFoundException {
		
	
		
		cardmap = new HashMap<Integer, Card>();
		indexmap = new HashMap<Integer, Integer>();
		
		
		int rcardss = randoms.nextInt(143);
		
		int rcard = (int) Math.random()*100;
		
		
		DeckV2 Deck = new DeckV2();
		
		Collections.shuffle(Deck);
	
		Card[] cards = new Card[144];   
		
		gbs = new GameButton[12];
    	
    	for (int i = 0; i < 143; i++) {
    		cards[i] = Deck.peek();
    		Deck.pop();    	
    	}
    	
    	for (int h = 0; h < 12; h++) {
    		gbs[h] = new GameButton(h, cards[h]);  
    	}
    	
    	for (GameButton j : gbs) {
    		EventHandler<ActionEvent> eh1  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
    			actions();
    		}
    		
    		public void actions() {
    			if (j.active == true) {
    				j.active = false;	
    				--nca;
    				switch (nca) {
    				case 1:
    					cardmap.remove(1, j.card);
    					indexmap.remove(1, j.index);
    					break;
    				case 2:
    					cardmap.remove(2, j.card);
    					indexmap.remove(2, j.index);
    					break;
    				case 3:
    					cardmap.remove(3, j.card);
    					indexmap.remove(3, j.index);
    					break;
    			}    			
    				
    			} else {
    				j.active = true;
    				nca++;
    				switch (nca) {
    				case 1:
    					cardmap.put(1, j.card);
    					indexmap.put(1, j.index);
    					break;
    				case 2:
    					cardmap.put(2, j.card);
    					indexmap.put(2, j.index);
    					break;
    				case 3:
    					cardmap.put(3, j.card);
    					indexmap.put(3, j.index);
    					break;
    			}    			
    				System.out.println(j.index);
    				j.info();
    			}
    			
    			if (nca == 3) {
    				solve = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
    				solve.result();
    				
    				if(solve.matchCheck == true) {
    					j.setCard(indexmap.get(1), cards[u]);
    					j.setCard(indexmap.get(2), cards[u+1]);
    					j.setCard(indexmap.get(3), cards[u+2]);
    					u = u + 3;
    				} else {
    					System.out.println("Wrong" + u);
    				}
    				
    				cardmap.clear();
    				indexmap.clear();
    				nca = 0;
    				
    				
    				
    			}	
    			
    		}

    		
    		};
    		
    		j.setOnAction(eh1);
    	}
    
    	
     	
    	score = new ScorePile();
    	
	}
  
		
	
			
			
		
		
	
	
	public GridPane goGrid() throws FileNotFoundException {	
		
		
		 GridPane goGrid = new GridPane();	goGrid.setMinSize(1000, 800);		goGrid.setPadding(new Insets(5, 5, 5, 5));
		 goGrid.setVgap(10);				goGrid.setHgap(10);					goGrid.setAlignment(Pos.CENTER);

		 goGrid.add(gbs[0], 0, 0);	goGrid.add(gbs[1], 0, 1);	goGrid.add(gbs[2], 0, 2);		 goGrid.add(gbs[3], 1, 0);
		 goGrid.add(gbs[4], 1, 1);	goGrid.add(gbs[5], 1, 2);	goGrid.add(gbs[6], 2, 0);		 goGrid.add(gbs[7], 2, 1);
		 goGrid.add(gbs[8], 2, 2);	goGrid.add(gbs[9], 3, 0);	goGrid.add(gbs[10], 3, 1);		 goGrid.add(gbs[11], 3, 2);
		 
		 
		 Image bamboo2 = new Image(new FileInputStream("/home/cronus/GitHub/Coleccion/bamboo_scroll_art_2.jpg"));
		 
		 /*
		 Image pausebtn2 = new Image(new FileInputStream("C://Users//deane//GitHub//Coleccion//Draw_Build_Files//PauseIcon.png"));
		 Image scoreicon2 = new Image(new FileInputStream("C://Users//deane//GitHub//Coleccion//Draw_Build_Files//ScoreIcon.png"));
		 Image timericon2 = new Image(new FileInputStream("C://Users//deane//GitHub//Coleccion//Draw_Build_Files//TimerIcon.png"));
		 
		 ImageView pausebtn = new ImageView(pausebtn2);
		 ImageView scoreicon = new ImageView(scoreicon2);
		 ImageView timericon = new ImageView(timericon2);
		*/
						
		BackgroundImage bgImg2 = new BackgroundImage(bamboo2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
							new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));

		Background bgImg3 = new Background(bgImg2);
		 
		goGrid.setBackground(bgImg3);
		 
		return goGrid;
	}
	
	/*
	
	public void actions() {
		if (gbu1.active == true && botton.get(1).isOn == true) {
			gbu1.active = false;	botton.get(1).isOn = false;
			--ncarda;
			switch (ncarda) {
			case 1:
				cardmap.remove(1, cards[0]);
				break;
			case 2:
				cardmap.remove(2, cards[0]);
				break;
			case 3:
				cardmap.remove(3, cards[0]);
				break;
		}    			
			
		} else {
			cards[0].active = true;	botton.get(1).isOn = true;
			ncarda++;
			switch (ncarda) {
			case 1:
				cardmap.put(1, cards[0]);
				break;
			case 2:
				cardmap.put(2, cards[0]);
				break;
			case 3:
				cardmap.put(3, cards[0]);
				break;
		}    			
			gbu1.info();
		}
		
		if (ncarda == 3) {
			bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
			bobo.result();
		}			
	}
	
	
	
	/*
	public class cardAdd implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent eon) {
			if (eon.getSource() == gbu1) {
				
			}
			
		}
		
	}
	
	*/
	
	

}




/*
 * Hi wonderful members of Stack Overflow!

I am designing and coding a game similar to set (https://en.wikipedia.org/wiki/Set_(card_game)).
My goal is to keep the game dynamics generally intact, but I've made new card types and designs.

Basically, I've made a Card class that will create a Card object to track the cards' properties (Color, Number, Shape, and Fill), and a stack of cards to make the deck. I've made imageviews to place the card image onto a button (I am playing around with a separate button class, specific to my cards). My issue is I can't track what buttons / cards are being selected, and I'm not sure how to trigger the analysis once 3 cards are selected (the matching algorithm class does work, thankfully).

So I would say I need help with something to track whether a card is selected or not, store which cards is selected, and after 3 cards are selected, run the analysis method / class. Ideally, the tracking mechanism would allow players to deselect a card, and remove that from the active / stored cards.

Any suggestions or input would be greatly appreciated!
 * 
 * I've created a class called "board" that will take the deck (stack with card objects), and deal cards which are matched to buttons in a gridpane. I can't figure out how to track selection of 3 cards, analyze if it's a match, and if it is, move the correct set of cards to a score pile, and activate a method / event to deal 3 more cards onto the board (the board, at this point, has 12 buttons / cards). Another class I've made is called "game" that is the launcher class for JavaFX, for this project setup. 

Most of the mechanics otherwise are working, visual aspects, card paths, etc.

Thanks again!

 * 
 * 
 * 

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

