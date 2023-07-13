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
	
	ArrayList<GameButton> bor;
	
	Card cardactive1, cardactive2, cardactive3;	
	
	Random randoms = new Random(); 
	
	CheckMatch check, solve;
	
	Boolean unless = false;
	
	GameButton	gbu1, gbu2, gbu3, gbu4, gbu5, gbu6, gbu7, gbu8, gbu9, gbu10, gbu11, gbu12;

	HashMap<Integer, GameButton> botton = new HashMap<Integer, GameButton>();
	HashMap<Integer, Card> cardmap = new HashMap<Integer, Card>();
	
	int ncarda = 0; int nca = 0;
	
	ScorePile score;
	
	GameButton gbu13 = new GameButton();
	
	
	public Board() throws FileNotFoundException {
		
		
		bor = new ArrayList<GameButton>();
		
		
		
		
		int rcardss = randoms.nextInt(143);
		
		int rcard = (int) Math.random()*100;
		
		
		DeckV3 Deck = new DeckV3();
		
		Collections.shuffle(Deck);
	
		Card[] cards = new Card[144];   
		
		GameButton[] gbs = new GameButton[144];
    	
    	for (int i = 0; i < 143; i++) {
    		cards[i] = Deck.peek();
    		Deck.pop();    	
    	}
    	
    	for (int h = 0; h < 143; h++) {
    		gbs[h] = new GameButton(cards[h]);    	
    		botton.put(h, gbs[h]);
    	}
    	
    	for (int w = 0; w < 12; w++) {
    		bor.add(gbs[w]);
    	}
    	
     	
    	score = new ScorePile();
  
		
		
			
    	
		
		/*
		EventHandler<ActionEvent> ehnu2  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (gbu.active == true) {
				gbu.active = false;
				nca--;
				System.out.println(nca);
				switch (nca) {
				case 1:
					cardmap.remove(1, gbu.card);
					break;
				case 2:
					cardmap.remove(2, gbu.card);
					break;
				case 3:
					cardmap.remove(3, gbu.card);
					break;
				}
			} else {
				gbu.active = true;
				nca++;
				System.out.println(nca);
				switch (nca) {
				case 1:
					cardmap.put(1, gbu.card);
					break;
				case 2:
					cardmap.put(2, gbu.card);
					break;
				case 3:
					cardmap.put(3, gbu.card);
					break;
				}    		
			}
			
			if (nca == 3) {
				solve = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				solve.result();
				
				
				if (solve.matchCheck == true) {
					score.push(cardmap.get(1));
					botton.put(place, gbs[12]);
					score.push(cardmap.get(2));
					botton.put(place, gbs[13]);
					score.push(cardmap.get(3));
					botton.put(place, gbs[14]);
					cardmap.clear();
					
					System.out.println("hulk hogan");
					nca = 0;
					
					
				} else {
					nca = 0;
					System.out.println("shit");
					
				}
			}
			
		}
		
		
		*/
		
		
		
		
	
		

			
			
		for (Entry<Integer, GameButton> entry : botton.entrySet()) {
			
			Integer place = entry.getKey();
			GameButton gbu = entry.getValue();
			
			
			EventHandler<ActionEvent> ehnu  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
				if (gbu.active == true) {
					gbu.active = false;
					nca--;
					System.out.println(nca);
					switch (nca) {
					case 1:
						cardmap.remove(1, gbu.card);
						break;
					case 2:
						cardmap.remove(2, gbu.card);
						break;
					case 3:
						cardmap.remove(3, gbu.card);
						break;
					}
				} else {
					gbu.active = true;
					nca++;
					System.out.println(nca);
					switch (nca) {
					case 1:
						cardmap.put(1, gbu.card);
						break;
					case 2:
						cardmap.put(2, gbu.card);
						break;
					case 3:
						cardmap.put(3, gbu.card);
						break;
					}    		
				}
				
				if (nca == 3) {
					solve = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
					solve.result();
					
					
					if (solve.matchCheck == true) {
						score.push(cardmap.get(1));
						botton.put(place, gbs[12]);
						score.push(cardmap.get(2));
						botton.put(place, gbs[13]);
						score.push(cardmap.get(3));
						botton.put(place, gbs[14]);
						cardmap.clear();
						
						System.out.println("hulk hogan");
						nca = 0;
						
						
					} else {
						nca = 0;
						System.out.println("shit");
						
					}
				}
				
			}
			};
				gbu.setOnAction(ehnu);
			}
			
			
		}
				
				
			
	
			
			
			
		
		
	
	
	public GridPane goGrid() throws FileNotFoundException {	
		
		
		 GridPane goGrid = new GridPane();	goGrid.setMinSize(1000, 800);		goGrid.setPadding(new Insets(5, 5, 5, 5));
		 goGrid.setVgap(10);				goGrid.setHgap(10);					goGrid.setAlignment(Pos.CENTER);

		 goGrid.add(botton.get(1), 0, 0);	goGrid.add(botton.get(2), 0, 1);	goGrid.add(botton.get(3), 0, 2);		 goGrid.add(botton.get(4), 1, 0);
		 goGrid.add(botton.get(5), 1, 1);	goGrid.add(botton.get(6), 1, 2);	goGrid.add(botton.get(7), 2, 0);		 goGrid.add(botton.get(8), 2, 1);
		 goGrid.add(botton.get(9), 2, 2);	goGrid.add(botton.get(10), 3, 0);	goGrid.add(botton.get(11), 3, 1);		 goGrid.add(botton.get(12), 3, 2);
		 
		 
		 Image bamboo2 = new Image(new FileInputStream("C://Users//deane//GitHub//Coleccion//bamboo_scroll_art_2.jpg"));
		 
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
	
	
	
	
	
	
	public Boolean matching() {
		
		for (int w : botton.keySet()) {
			
					
			
			
			System.out.println(w + " " + botton.get(w).card.color);
		}
	
		
		
		unless = true;
		return unless;
		
	}
	
	
	
	

}




/*


*/