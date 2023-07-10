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
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;

import java.io.*;

public class Board  {
	
	BooleanProperty isAct = new SimpleBooleanProperty(false);
	Card cardactive1, cardactive2, cardactive3;	
	
	CheckMatch bobo, bobo2, bobo3, bobo4, bobo5, bobo6;
	
	Boolean unless = false;
	
	GameButton	gbu1, gbu2, gbu3, gbu4, gbu5, gbu6, gbu7, gbu8, gbu9, gbu10, gbu11, gbu12;

	HashMap<Integer, GameButton> botton;
	HashMap<Integer, Card> cardmap = new HashMap<Integer, Card>();
	
	int ncarda = 0;
	
	
	
	public Board() throws FileNotFoundException {
		
		DeckV2 Deck = new DeckV2();
		
		Collections.shuffle(Deck);
	
		Card[] cards = new Card[12];    	
    	
    	for (int i = 0; i < 12; i++) {
    		cards[i] = Deck.peek();
    		Deck.pop();    	
    	}
    	
    			
		
		gbu1	=	new	GameButton(cards[0]);
		gbu2	=	new	GameButton(cards[1]);
		gbu3	=	new	GameButton(cards[2]);
		gbu4	=	new	GameButton(cards[3]);
		gbu5	=	new	GameButton(cards[4]);
		gbu6	=	new	GameButton(cards[5]);
		gbu7	=	new	GameButton(cards[6]);
		gbu8	=	new	GameButton(cards[7]);
		gbu9	=	new	GameButton(cards[8]);
		gbu10	=	new	GameButton(cards[9]);
		gbu11	=	new	GameButton(cards[10]);
		gbu12	=	new	GameButton(cards[11]);


		
		
		
		botton = new HashMap<Integer, GameButton>();
			botton.put(1, gbu1);	botton.put(2, gbu2);	botton.put(3, gbu3);	botton.put(4, gbu4);
			botton.put(5, gbu5);	botton.put(6, gbu6);	botton.put(7, gbu7);	botton.put(8, gbu8);
			botton.put(9, gbu9);	botton.put(10, gbu10);	botton.put(11, gbu11);	botton.put(12, gbu12);
			
		
		
		EventHandler<ActionEvent> eh1  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[0].active == true && botton.get(1).isOn == true) {
    			cards[0].active = false;	botton.get(1).isOn = false;
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
    	};
			
    	gbu1.setOnAction(eh1);	gbu1.setId("gamebutton");
			
    	EventHandler<ActionEvent> eh2  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[1].active == true && botton.get(2).isOn == true) {
    			cards[1].active = false;	botton.get(2).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[1]);
					break;
				case 2:
					cardmap.remove(2, cards[1]);
					break;
				case 3:
					cardmap.remove(3, cards[1]);
					break;
			}    			
    			
    		} else {
    			cards[1].active = true;	botton.get(2).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[1]);
					break;
				case 2:
					cardmap.put(2, cards[1]);
					break;
				case 3:
					cardmap.put(3, cards[1]);
					break;
			}    			
    			gbu2.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu2.setOnAction(eh2);	gbu2.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh3  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[2].active == true && botton.get(3).isOn == true) {
    			cards[2].active = false;	botton.get(3).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[2]);
					break;
				case 2:
					cardmap.remove(2, cards[2]);
					break;
				case 3:
					cardmap.remove(3, cards[2]);
					break;
			}    			
    			
    		} else {
    			cards[2].active = true;	botton.get(3).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[2]);
					break;
				case 2:
					cardmap.put(2, cards[2]);
					break;
				case 3:
					cardmap.put(3, cards[2]);
					break;
			}    			
    			gbu3.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    
    	gbu3.setOnAction(eh3);	gbu3.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh4  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[3].active == true && botton.get(4).isOn == true) {
    			cards[3].active = false;	botton.get(4).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[3]);
					break;
				case 2:
					cardmap.remove(2, cards[3]);
					break;
				case 3:
					cardmap.remove(3, cards[3]);
					break;
			}    			
    			
    		} else {
    			cards[3].active = true;	botton.get(4).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[3]);
					break;
				case 2:
					cardmap.put(2, cards[3]);
					break;
				case 3:
					cardmap.put(3, cards[3]);
					break;
			}    			
    			gbu4.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu4.setOnAction(eh4);	gbu4.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh5  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[4].active == true && botton.get(5).isOn == true) {
    			cards[4].active = false;	botton.get(5).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[4]);
					break;
				case 2:
					cardmap.remove(2, cards[4]);
					break;
				case 3:
					cardmap.remove(3, cards[4]);
					break;
			}    			
    			
    		} else {
    			cards[4].active = true;	botton.get(5).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[4]);
					break;
				case 2:
					cardmap.put(2, cards[4]);
					break;
				case 3:
					cardmap.put(3, cards[4]);
					break;
			}    			
    			gbu5.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu5.setOnAction(eh5);	gbu5.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh6  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[5].active == true && botton.get(6).isOn == true) {
    			cards[5].active = false;	botton.get(6).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[5]);
					break;
				case 2:
					cardmap.remove(2, cards[5]);
					break;
				case 3:
					cardmap.remove(3, cards[5]);
					break;
			}    			
    			
    		} else {
    			cards[5].active = true;	botton.get(6).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[5]);
					break;
				case 2:
					cardmap.put(2, cards[5]);
					break;
				case 3:
					cardmap.put(3, cards[5]);
					break;
			}    			
    			gbu6.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu6.setOnAction(eh6);	gbu6.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh7  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[6].active == true && botton.get(7).isOn == true) {
    			cards[6].active = false;	botton.get(7).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[6]);
					break;
				case 2:
					cardmap.remove(2, cards[6]);
					break;
				case 3:
					cardmap.remove(3, cards[6]);
					break;
			}    			
    			
    		} else {
    			cards[6].active = true;	botton.get(7).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[6]);
					break;
				case 2:
					cardmap.put(2, cards[6]);
					break;
				case 3:
					cardmap.put(3, cards[6]);
					break;
			}    			
    			gbu7.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu7.setOnAction(eh7);	gbu7.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh8  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[7].active == true && botton.get(8).isOn == true) {
    			cards[7].active = false;	botton.get(8).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[7]);
					break;
				case 2:
					cardmap.remove(2, cards[7]);
					break;
				case 3:
					cardmap.remove(3, cards[7]);
					break;
			}    			
    			
    		} else {
    			cards[7].active = true;	botton.get(8).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[7]);
					break;
				case 2:
					cardmap.put(2, cards[7]);
					break;
				case 3:
					cardmap.put(3, cards[7]);
					break;
			}    			
    			gbu8.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu8.setOnAction(eh8);	gbu8.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh9  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[8].active == true && botton.get(9).isOn == true) {
    			cards[8].active = false;	botton.get(9).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[8]);
					break;
				case 2:
					cardmap.remove(2, cards[8]);
					break;
				case 3:
					cardmap.remove(3, cards[8]);
					break;
			}    			
    			
    		} else {
    			cards[8].active = true;	botton.get(9).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[8]);
					break;
				case 2:
					cardmap.put(2, cards[8]);
					break;
				case 3:
					cardmap.put(3, cards[8]);
					break;
			}    			
    			gbu9.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu9.setOnAction(eh9);	gbu9.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh10  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[9].active == true && botton.get(10).isOn == true) {
    			cards[9].active = false;	botton.get(10).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[9]);
					break;
				case 2:
					cardmap.remove(2, cards[9]);
					break;
				case 3:
					cardmap.remove(3, cards[9]);
					break;
			}    			
    			
    		} else {
    			cards[9].active = true;	botton.get(10).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[9]);
					break;
				case 2:
					cardmap.put(2, cards[9]);
					break;
				case 3:
					cardmap.put(3, cards[9]);
					break;
			}    			
    			gbu10.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu10.setOnAction(eh10);	gbu10.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh11  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[10].active == true && botton.get(11).isOn == true) {
    			cards[10].active = false;	botton.get(11).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[10]);
					break;
				case 2:
					cardmap.remove(2, cards[10]);
					break;
				case 3:
					cardmap.remove(3, cards[10]);
					break;
			}    			
    			
    		} else {
    			cards[10].active = true;	botton.get(11).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[10]);
					break;
				case 2:
					cardmap.put(2, cards[10]);
					break;
				case 3:
					cardmap.put(3, cards[10]);
					break;
			}    			
    				
    			gbu11.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu11.setOnAction(eh11);	gbu11.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh12  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[11].active == true && botton.get(12).isOn == true) {
    			cards[11].active = false;	botton.get(12).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[11]);
					break;
				case 2:
					cardmap.remove(2, cards[11]);
					break;
				case 3:
					cardmap.remove(3, cards[11]);
					break;
			}    			
    			
    		} else {
    			cards[11].active = true;	botton.get(12).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[11]);
					break;
				case 2:
					cardmap.put(2, cards[11]);
					break;
				case 3:
					cardmap.put(3, cards[11]);
					break;
			}    			
    				
    			gbu12.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu12.setOnAction(eh12);	gbu12.setId("gamebutton");
    	
    	
			
			
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
			
			
		
		// bobo = new CheckMatch (botton.get(2).card, botton.get(3).card, botton.get(4).card);	
		// if (bobo.matchCheck == true) {bobo.listCards();} 
		
	
		/*
	
		GridPane goGrid = new GridPane();	goGrid.setMinSize(1000, 800);		goGrid.setPadding(new Insets(5, 5, 5, 5));
		 		 goGrid.setVgap(10);		goGrid.setHgap(10);					goGrid.setAlignment(Pos.CENTER);
		 
		goGrid.add(botton.get(1), 0, 0);	goGrid.add(botton.get(2), 0, 1);	goGrid.add(botton.get(3), 0, 2);		 goGrid.add(botton.get(4), 1, 0);
		goGrid.add(botton.get(5), 1, 1);	goGrid.add(botton.get(6), 1, 2);	goGrid.add(botton.get(7), 2, 0);		 goGrid.add(botton.get(8), 2, 1);
		goGrid.add(botton.get(9), 2, 2);	goGrid.add(botton.get(10), 3, 0);	goGrid.add(botton.get(11), 3, 1);		 goGrid.add(botton.get(12), 3, 2);
		
		*/
		
	}
	
	
	public GridPane goGrid() throws FileNotFoundException{	
		
		
		 GridPane goGrid = new GridPane();	goGrid.setMinSize(1000, 800);		goGrid.setPadding(new Insets(5, 5, 5, 5));
		 goGrid.setVgap(10);				goGrid.setHgap(10);					goGrid.setAlignment(Pos.CENTER);

		 goGrid.add(botton.get(1), 0, 0);	goGrid.add(botton.get(2), 0, 1);	goGrid.add(botton.get(3), 0, 2);		 goGrid.add(botton.get(4), 1, 0);
		 goGrid.add(botton.get(5), 1, 1);	goGrid.add(botton.get(6), 1, 2);	goGrid.add(botton.get(7), 2, 0);		 goGrid.add(botton.get(8), 2, 1);
		 goGrid.add(botton.get(9), 2, 2);	goGrid.add(botton.get(10), 3, 0);	goGrid.add(botton.get(11), 3, 1);		 goGrid.add(botton.get(12), 3, 2);
		 
		 
		 Image bamboo2 = new Image(new FileInputStream("/home/cronus/GitHub/Coleccion/bamboo_scroll_art_2.jpg"));
			
						
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