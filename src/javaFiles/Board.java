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
<<<<<<< HEAD
=======
import javafx.scene.control.Label;
>>>>>>> main
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
<<<<<<< HEAD

=======
>>>>>>> main
import java.io.*;

public class Board  {
		
	
<<<<<<< HEAD
	Random randoms = new Random(); 
=======
	Card card, cardactive1, cardactive2, cardactive3;	
	
	String scoreLabel;
	
	CheckMatch check;
	
	ScorePile score;
	
	Boolean isOn, active;
	
	GameButton	gbu1, gbu2, gbu3, gbu4, gbu5, gbu6, gbu7, gbu8, gbu9, gbu10, gbu11, gbu12, tgbu;
	
	GameButton[] gbs;
	
	Label scoreKeep;

	HashMap<Integer, GameButton> buttons;
	ArrayList<GameButton> algb;
	HashMap<Integer, Card> upcards = new HashMap<Integer, Card>();
	HashMap<Integer, Card> cardmap;
	HashMap<Integer, Integer> indexmap;
	
	int nca = 0, u = 13, c = 1;
	
>>>>>>> main
	
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
<<<<<<< HEAD
    	
    	for (int i = 0; i < 143; i++) {
=======
		
		algb = new ArrayList<GameButton>();
		
		cardmap = new HashMap<Integer, Card>();
		
		score = new ScorePile();
		
		buttons = new HashMap<Integer, GameButton>();
		
		indexmap = new HashMap<Integer, Integer>();
		
		scoreLabel = new String("0");
		
		scoreKeep = new Label(scoreLabel);
		
		
    	
    	for (int i = 0; i < 144; i++) {
>>>>>>> main
    		cards[i] = Deck.peek();
    		Deck.pop();    	
    	}
    	
<<<<<<< HEAD
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
  
		
	
			
			
=======
    	for (int k = 0; k < 12; k++) {
    	    gbs[k] = new GameButton((k+1), cards[k]); 
    	    
    	    gbs[k].getStyleClass().add("GameButton");
    	    
    	    algb.add(gbs[k]);
    	    
    	    
    	    
    	    // gbs[k].info();
    	};
    	   
    	
			
    		
    	
    	
    			
		
		gbu1	=	new	GameButton(cards[13]);		gbu2	=	new	GameButton(cards[1]);		gbu3	=	new	GameButton(cards[2]);		gbu4	=	new	GameButton(cards[3]);
		gbu5	=	new	GameButton(cards[4]);		gbu6	=	new	GameButton(cards[5]);		gbu7	=	new	GameButton(cards[6]);		gbu8	=	new	GameButton(cards[7]);
		gbu9	=	new	GameButton(cards[8]);		gbu10	=	new	GameButton(cards[9]);		gbu11	=	new	GameButton(cards[10]);		gbu12	=	new	GameButton(cards[11]);

		
		for (GameButton btn : algb) {
			
			
			
			EventHandler<ActionEvent> handler1  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
				
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
	    			// btn.setStyle("-fx-background-color: yellow; -fx-text-fill: black;");
	    			
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
						
						
						
						
						
						/*
						switch (c) {
						case 1:
						}
						
						btn.replace(indexmap.get(1), cards[u]);
						btn.replace(indexmap.get(2), cards[u+1]);
						btn.replace(indexmap.get(3), cards[u+2]);
						*/
						
						
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
>>>>>>> main
		
		
	
	
	public GridPane goGrid() throws FileNotFoundException {	
		
		
<<<<<<< HEAD
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
=======
>>>>>>> main
	}
    	
		
		
	
	
	public GridPane goGrid() throws FileNotFoundException {
		
		 
		 
		 
		
		 /*
		 
		    goGrid.add(gbs[0], 0, 0);	goGrid.add(gbs[1], 0, 1);	goGrid.add(gbs[2], 0, 2);		 goGrid.add(gbs[3], 1, 0);
		 	 goGrid.add(gbs[4], 1, 1);	goGrid.add(gbs[5], 1, 2);	goGrid.add(gbs[6], 2, 0);		 goGrid.add(gbs[7], 2, 1);
		 	 goGrid.add(gbs[8], 2, 2);	goGrid.add(gbs[9], 3, 0);	goGrid.add(gbs[10], 3, 1);		 goGrid.add(gbs[11], 3, 2);
		  
		
		*/
		
		/*
		 goGrid.add(bottons.get(1), 0, 0);	goGrid.add(bottons.get(2), 0, 1);	goGrid.add(bottons.get(3), 0, 2);		 goGrid.add(bottons.get(4), 1, 0);
		 goGrid.add(bottons.get(5), 1, 1);	goGrid.add(bottons.get(6), 1, 2);	goGrid.add(bottons.get(7), 2, 0);		 goGrid.add(bottons.get(8), 2, 1);
		 goGrid.add(bottons.get(9), 2, 2);	goGrid.add(bottons.get(10), 3, 0);	goGrid.add(bottons.get(11), 3, 1);		 goGrid.add(bottons.get(12), 3, 2);
		 */
		 
		 Image bamboo2 = new Image(new FileInputStream("./bamboo_scroll_art_2.jpg"));
		 
		 
		 Image pausebtn2 = new Image(new FileInputStream("./Draw_Build_Files/PauseIcon.png"));
		 Image scoreicon2 = new Image(new FileInputStream("./Draw_Build_Files/ScoreIcon.png"));
		 Image timericon2 = new Image(new FileInputStream("./Draw_Build_Files/TimerIcon.png"));
		 
		 ImageView pausebtn = new ImageView(pausebtn2);		pausebtn.setFitWidth(500);		pausebtn.setFitHeight(151);
		 ImageView scoreicon = new ImageView(scoreicon2);	scoreicon.setFitWidth(480);		scoreicon.setFitHeight(151);
		 ImageView timericon = new ImageView(timericon2);	timericon.setFitWidth(500);		timericon.setFitHeight(151);
		
						
		BackgroundImage bgImg2 = new BackgroundImage(bamboo2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
							new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));

		Background bgImg3 = new Background(bgImg2);
		 
		GridPane goGrid = new GridPane();	goGrid.setMinSize(1000, 800);		goGrid.setPadding(new Insets(5, 5, 5, 5));
		  goGrid.setVgap(10);		goGrid.setHgap(10);					goGrid.setAlignment(Pos.CENTER);


		  goGrid.add(algb.get(0), 0, 0);	goGrid.add(algb.get(1), 0, 1);	goGrid.add(algb.get(2), 0, 2);		 goGrid.add(algb.get(3), 1, 0);
		  goGrid.add(algb.get(4), 1, 1);	goGrid.add(algb.get(5), 1, 2);	goGrid.add(algb.get(6), 2, 0);		 goGrid.add(algb.get(7), 2, 1);
		  goGrid.add(algb.get(8), 2, 2);	goGrid.add(algb.get(9), 3, 0);	goGrid.add(algb.get(10), 3, 1);		 goGrid.add(algb.get(11), 3, 2);
		  goGrid.add(scoreicon, 4, 0);		goGrid.add(timericon, 4, 1);	goGrid.add(scoreKeep, 4, 2);
		 
		goGrid.setBackground(bgImg3);
		 
		return goGrid;
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

