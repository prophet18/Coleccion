// Class for board setup and function

package javaFiles;

import java.util.*;
import javaFiles.Card;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

import java.io.*;

public class Board  {		
	
	String scoreLabel, timerLabel;
	
	CheckMatch check;
	
	ScorePile score;
	
	Boolean active;
		
	GameButton[] gbs;
	
	Label scoreKeep, timerKeep;
	
	Timeline timeline;

	HashMap<Integer, GameButton> buttons;
	ArrayList<GameButton> algb;
	HashMap<Integer, Card> cardmap;
	HashMap<Integer, Integer> indexmap;
	
	int nca = 0, u = 13, c = 1;
	
	TimeKeeper timekeeper;
	
	public Board() throws FileNotFoundException {
		
		Deck Deck = new Deck();
		
		Collections.shuffle(Deck);
	
		Card[] cards = new Card[144];   
		
		gbs = new GameButton[12];
		
		algb = new ArrayList<GameButton>();
		
		cardmap = new HashMap<Integer, Card>();
		
		score = new ScorePile();
		
		buttons = new HashMap<Integer, GameButton>();
		
		indexmap = new HashMap<Integer, Integer>();
		
		timekeeper = new TimeKeeper();
		
		scoreLabel = new String("0");
		
		scoreKeep = new Label(scoreLabel);
		scoreKeep.getStyleClass().add("ScoreLabel");
		
		timerKeep = new Label();	
		
		
		
    	
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
    	
		
		
	
	
	public GridPane goGrid() throws FileNotFoundException {
		
		 

		
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
		  goGrid.add(scoreicon, 4, 0);		goGrid.add(timericon, 4, 1);	goGrid.add(scoreKeep, 4, 2);		 goGrid.add(timekeeper.text, 5, 0);
		 
		goGrid.setBackground(bgImg3);
		 
		return goGrid;
	}
	
	
	
	
	
	
	
	
	
	

}




/*


*/