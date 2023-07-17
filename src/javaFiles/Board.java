// Class for board setup and function

package javaFiles;

import java.util.*;
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
	
	Card card, cardactive1, cardactive2, cardactive3;	
	
	CheckMatch chk1, bobo, bobo2, bobo3, bobo4, bobo5, bobo6;
	
	Boolean isOn, active;
	
	GameButton	gbu1, gbu2, gbu3, gbu4, gbu5, gbu6, gbu7, gbu8, gbu9, gbu10, gbu11, gbu12;

	HashMap<Integer, GameButton> bottons;
	ArrayList<GameButton> algb;
	HashMap<Integer, Card> upcards = new HashMap<Integer, Card>() ;
	HashMap<Integer, Card> cardmap = new HashMap<Integer, Card>();
	
	int aa1, nca;
	
	
	
	public Board() throws FileNotFoundException {
		
		DeckV2 Deck = new DeckV2();
		
		Collections.shuffle(Deck);
	
		Card[] cards = new Card[12];   
		
		GameButton[] gbs = new GameButton[12];
    	
    	for (int i = 0; i < 12; i++) {
    		cards[i] = Deck.peek();
    		Deck.pop();    	
    	}
    	
    	for (int k = 0; k < 12; k++) {
    	    gbs[k] = new GameButton(cards[k]);    	    
    	    // gbs[k].info();
    	};
    	   
 	
    	
    	
    			
		
		gbu1	=	new	GameButton(cards[0]);		gbu2	=	new	GameButton(cards[1]);		gbu3	=	new	GameButton(cards[2]);		gbu4	=	new	GameButton(cards[3]);
		gbu5	=	new	GameButton(cards[4]);		gbu6	=	new	GameButton(cards[5]);		gbu7	=	new	GameButton(cards[6]);		gbu8	=	new	GameButton(cards[7]);
		gbu9	=	new	GameButton(cards[8]);		gbu10	=	new	GameButton(cards[9]);		gbu11	=	new	GameButton(cards[10]);		gbu12	=	new	GameButton(cards[11]);

		
		
		
		bottons = new HashMap<Integer, GameButton>();
		
		algb = new ArrayList<GameButton>();
		
		for (int y = 0; y < 12; y++) {
    	    algb.add(gbs[y]);    	    
    	    System.out.println(algb.get(y).card.color);
		}
    	
		int a = 0;
		
		
		
		EventHandler<ActionEvent> eh1  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[0].active == true) {
    			cards[0].active = false;
    			--nca;
    			switch (nca) {
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
    			cards[0].active = true;
    			nca++;
    			switch (nca) {
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
			
			if (nca == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}			
			
    	}
    	};
		
		
		
		
    	    
		}
    	
		
		
	
	
	public GridPane goGrid() throws FileNotFoundException {
		
		GridPane goGrid = new GridPane();	goGrid.setMinSize(1000, 800);		goGrid.setPadding(new Insets(5, 5, 5, 5));
		 goGrid.setVgap(10);				goGrid.setHgap(10);					goGrid.setAlignment(Pos.CENTER);

		 goGrid.add(algb.get(0), 0, 0);	goGrid.add(algb.get(1), 0, 1);	goGrid.add(algb.get(2), 0, 2);		 goGrid.add(algb.get(3), 1, 0);
		 goGrid.add(algb.get(4), 1, 1);	goGrid.add(algb.get(5), 1, 2);	goGrid.add(algb.get(6), 2, 0);		 goGrid.add(algb.get(7), 2, 1);
		 goGrid.add(algb.get(8), 2, 2);	goGrid.add(algb.get(9), 3, 0);	goGrid.add(algb.get(10), 3, 1);		 goGrid.add(algb.get(11), 3, 2);
		
		
		
		
		/*
		 GridPane goGrid = new GridPane();	goGrid.setMinSize(1000, 800);		goGrid.setPadding(new Insets(5, 5, 5, 5));
		 goGrid.setVgap(10);				goGrid.setHgap(10);					goGrid.setAlignment(Pos.CENTER);

		 goGrid.add(bottons.get(1), 0, 0);	goGrid.add(bottons.get(2), 0, 1);	goGrid.add(bottons.get(3), 0, 2);		 goGrid.add(bottons.get(4), 1, 0);
		 goGrid.add(bottons.get(5), 1, 1);	goGrid.add(bottons.get(6), 1, 2);	goGrid.add(bottons.get(7), 2, 0);		 goGrid.add(bottons.get(8), 2, 1);
		 goGrid.add(bottons.get(9), 2, 2);	goGrid.add(bottons.get(10), 3, 0);	goGrid.add(bottons.get(11), 3, 1);		 goGrid.add(bottons.get(12), 3, 2);
		 */
		 
		 Image bamboo2 = new Image(new FileInputStream("./bamboo_scroll_art_2.jpg"));
		 
		 /*
		 Image pausebtn2 = new Image(new FileInputStream("./PauseIcon.png"));
		 Image scoreicon2 = new Image(new FileInputStream("./ScoreIcon.png"));
		 Image timericon2 = new Image(new FileInputStream("./TimerIcon.png"));
		 
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
	
	
	
	
	
	
	
	
	
	

}




/*


*/