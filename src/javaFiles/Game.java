// GUI

// Card sizes: Total - 672 x 1056 pixels		Scaled down - 168 x 264 		OR		84 x 132
// Background size: 4000 x 2340 px				Scaled down - 2000 x 1170		OR		1000 x 585

// 

package javaFiles;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.EventListener;
import java.util.Stack;
import javax.swing.JCheckBox;
import frameworks.CardInfo;
import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableBooleanValue;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Game extends Application {	
	
	int xyz = 0;
	
	BooleanProperty isAct = new SimpleBooleanProperty(false);
	
	Board bord;
	
	
	public static void main(String[] args) {				
        launch(args);
    }

	@Override
	public void start(Stage s1) throws Exception {
		
		DeckV3 Deck = new DeckV3();		
		
    	Collections.shuffle(Deck);
    	
    	Card[] board = new Card[12];	
    	
    	Button[] buttons = new Button[12];
    	
    	GameButton[] pooped = new GameButton[12];
    	
    	for (int i = 0; i < 12; i++) {
    		board[i] = Deck.peek();
    		Deck.pop();    	
    		buttons[i] = new Button("", board[i].view);
    		pooped[i] = new GameButton(board[i]);
    		
    	}
    	
    	// pooped[4].info();
		
		EventHandler<ActionEvent> checker = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			
			for (int p = 0; p < 12; p++) {
				if (board[p].active == true) {
					board[p].active = false;  
					System.out.println("Wroooong");
				} else {
					board[p].active = true;
					xyz++;
				}
	    	}
			
			
			}

		};
		
		EventHandler<ActionEvent> cadd = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			for (int t = 0; t < 12; t++) {   	
	    		if (pooped[t].isOn == true) {
	    			System.out.println("Wroooong");
	    		}
	    	};
		}
		};
		
		for (int t = 0; t < 12; t++) {   	
    		pooped[t].setOnAction(cadd);
    	}
		
		
    	
    	
    	GridPane cGrid = new GridPane();	cGrid.setMinSize(1000, 800);		cGrid.setPadding(new Insets(5, 5, 5, 5));
				 cGrid.setVgap(10);			cGrid.setHgap(10);					cGrid.setAlignment(Pos.CENTER);
				 
				 cGrid.add(buttons[0], 0, 0);		cGrid.add(buttons[1], 0, 1);		cGrid.add(buttons[2], 0, 2);		 cGrid.add(buttons[3], 1, 0);
				 cGrid.add(buttons[4], 1, 1);		cGrid.add(buttons[5], 1, 2);		cGrid.add(buttons[6], 2, 0);		 cGrid.add(buttons[7], 2, 1);
				 cGrid.add(buttons[8], 2, 2);		cGrid.add(buttons[9], 3, 0);		cGrid.add(buttons[10], 3, 1);		 cGrid.add(buttons[11], 3, 2);
    	
    	
				 
				 
		GridPane bGrid = new GridPane();	bGrid.setMinSize(1000, 800);		bGrid.setPadding(new Insets(5, 5, 5, 5));
				 bGrid.setVgap(10);			bGrid.setHgap(10);					bGrid.setAlignment(Pos.CENTER);
				 
				 bGrid.add(pooped[0], 0, 0);		bGrid.add(pooped[1], 0, 1);		bGrid.add(pooped[2], 0, 2);		 bGrid.add(pooped[3], 1, 0);
				 bGrid.add(pooped[4], 1, 1);		bGrid.add(pooped[5], 1, 2);		bGrid.add(pooped[6], 2, 0);		 bGrid.add(pooped[7], 2, 1);
				 bGrid.add(pooped[8], 2, 2);		bGrid.add(pooped[9], 3, 0);		bGrid.add(pooped[10], 3, 1);		 bGrid.add(pooped[11], 3, 2);		 
				 
				 

				 
				 
				 
				 
		Board haha1 = new Board();	
		
		

		Scene sTwo = new Scene(haha1.goGrid(), 1100, 900);
		
		sTwo.getStylesheets().add("C://Users//deane//GitHub//Coleccion//css_styling_coleccion.css");
		
		
		
		s1.setScene(sTwo);

		s1.setTitle("Colección");
		s1.show();
		
	}

	
	

}





/*


*/



/*

*/
