// GUI

// Card sizes: Total - 672 x 1056 pixels		Scaled down - 168 x 264 		OR		84 x 132
// Background size: 4000 x 2340 px				Scaled down - 2000 x 1170		OR		1000 x 585

// Filepath for JavaFX on Cronus - /usr/lib/jvm/java-20-openjdk/
// Filepath for JavaFX on Grendel -



package javaFiles;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.EventListener;
import java.util.HashMap;
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
	Boolean iAct = false;
		
	BooleanProperty isAct = new SimpleBooleanProperty(false);
	
	Board bord;
	
	HashMap<Integer, Card> mappin = new HashMap<Integer, Card>();
	
	
	public static void main(String[] args) {				
        launch(args);
    }

	@Override
	public void start(Stage s1) throws Exception {
		
		DeckV3 Deck = new DeckV3();		
		
    	Collections.shuffle(Deck);
    	
    	Card[] board = new Card[12];	
    	
    	Button[] buttons = new Button[12];
    	
    	// GameButton[] pooped = new GameButton[12];
    	
    	for (int i = 0; i < 12; i++) {
    		board[i] = Deck.peek();
    		Deck.pop();    	
    		buttons[i] = new Button("", board[i].view);
    		// pooped[i] = new GameButton(board[i]);
    	    		
    	}
    	
    	
    	/*
    	for (int weed = 0; weed < 12; weed++) {
    	
    	EventHandler<ActionEvent> newE = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
 			
 			
  			 
			
			
				if (board[weed].active == true) {
					board[weed].active = false; 
					System.out.println("Wroooong");
					xyz--;
				} else {
					board[weed].active = true; 
					xyz++;
				}	
				
				System.out.println(xyz);
				
				switch (xyz) {
					case 1:
						System.out.println("ones");
						mappin.put(1, board[weed]);
						break;
					case 2:
						System.out.println("twos");
						mappin.put(2, board[weed]);
						break;
					case 3:
						System.out.println("threeees");
						mappin.put(3, board[weed]);
						break;			
						
				}
				
				
			}
 		};
	}		 
	
	
	
	*/
    		
    	
		
	
		
		
		
    	
    	
    	GridPane cGrid = new GridPane();	cGrid.setMinSize(1000, 800);		cGrid.setPadding(new Insets(5, 5, 5, 5));
				 cGrid.setVgap(10);			cGrid.setHgap(10);					cGrid.setAlignment(Pos.CENTER);
				 
				 cGrid.add(buttons[0], 0, 0);		cGrid.add(buttons[1], 0, 1);		cGrid.add(buttons[2], 0, 2);		 cGrid.add(buttons[3], 1, 0);
				 cGrid.add(buttons[4], 1, 1);		cGrid.add(buttons[5], 1, 2);		cGrid.add(buttons[6], 2, 0);		 cGrid.add(buttons[7], 2, 1);
				 cGrid.add(buttons[8], 2, 2);		cGrid.add(buttons[9], 3, 0);		cGrid.add(buttons[10], 3, 1);		 cGrid.add(buttons[11], 3, 2);
    	
    	
				 
		
				 /*
				 
				 
		GridPane bGrid = new GridPane();	bGrid.setMinSize(1000, 800);		bGrid.setPadding(new Insets(5, 5, 5, 5));
				 bGrid.setVgap(10);			bGrid.setHgap(10);					bGrid.setAlignment(Pos.CENTER);
				 
				 bGrid.add(pooped[0], 0, 0);		bGrid.add(pooped[1], 0, 1);		bGrid.add(pooped[2], 0, 2);		 bGrid.add(pooped[3], 1, 0);
				 bGrid.add(pooped[4], 1, 1);		bGrid.add(pooped[5], 1, 2);		bGrid.add(pooped[6], 2, 0);		 bGrid.add(pooped[7], 2, 1);
				 bGrid.add(pooped[8], 2, 2);		bGrid.add(pooped[9], 3, 0);		bGrid.add(pooped[10], 3, 1);		 bGrid.add(pooped[11], 3, 2);		 
				 
				 
		 
				 
*/
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 /*
				 
				 
				 

		EventHandler<ActionEvent> eve1 = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			
			if (iAct == true) {
				iAct = false;
			} else {
				iAct = true;
				xyz++;
			}
			
			if (board[0].active == true) {
				board[0].active = false; 
				System.out.println("Wroooong");
			} else {
				board[0].active = true; 
			}	
			
			System.out.println(xyz);
			
			switch (xyz) {
				case 1:
					System.out.println("ones");
					mappin.put(1, board[0]);
					break;
				case 2:
					System.out.println("twos");
					mappin.put(2, board[0]);
					break;
				case 3:
					System.out.println("threeees");
					mappin.put(3, board[0]);
					break;			
					
			}
			
			
			if (xyz == 4) {
				System.out.println("booyakashah");
			}
			
			
		}
		};
		EventHandler<ActionEvent> eve2 = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {if (board[1].active == true) {board[1].active = false; } else {board[1].active = true; }}};
		EventHandler<ActionEvent> eve3 = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {if (board[2].active == true) {board[2].active = false; } else {board[2].active = true; }}};
		EventHandler<ActionEvent> eve4 = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {if (board[3].active == true) {board[3].active = false; } else {board[3].active = true; }}};
		EventHandler<ActionEvent> eve5 = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {if (board[4].active == true) {board[4].active = false; } else {board[4].active = true; }}};
		EventHandler<ActionEvent> eve6 = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {if (board[5].active == true) {board[5].active = false; } else {board[5].active = true; }}};
		EventHandler<ActionEvent> eve7 = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {if (board[6].active == true) {board[6].active = false; } else {board[6].active = true; }}};
		EventHandler<ActionEvent> eve8 = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {if (board[7].active == true) {board[7].active = false; } else {board[7].active = true; }}};
		EventHandler<ActionEvent> eve9 = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {if (board[8].active == true) {board[8].active = false; } else {board[8].active = true; }}};
		EventHandler<ActionEvent> eve10 = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {if (board[9].active == true) {board[9].active = false; } else {board[9].active = true; }}};
		EventHandler<ActionEvent> eve11 = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {if (board[10].active == true) {board[10].active = false; } else {board[10].active = true; }}};
		EventHandler<ActionEvent> eve12 = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {if (board[11].active == true) {board[11].active = false; } else {board[11].active = true; }}};
		
		buttons[0].setOnAction(eve1); buttons[1].setOnAction(eve2); buttons[2].setOnAction(eve3); buttons[3].setOnAction(eve4); buttons[4].setOnAction(eve5); buttons[5].setOnAction(eve6);
		buttons[6].setOnAction(eve7); buttons[7].setOnAction(eve8); buttons[8].setOnAction(eve9); buttons[9].setOnAction(eve10); buttons[10].setOnAction(eve11); buttons[11].setOnAction(eve12);
		
		if (board[0].active == false) {
			System.out.println("Card Properties: ");
		};
		
				 	 
				 
				 
				 buttons[0].setOnAction(eve1); buttons[1].setOnAction(eve2); buttons[2].setOnAction(eve3); buttons[3].setOnAction(eve4); buttons[4].setOnAction(eve5); buttons[5].setOnAction(eve6);
					buttons[6].setOnAction(eve7); buttons[7].setOnAction(eve8); buttons[8].setOnAction(eve9); buttons[9].setOnAction(eve10); buttons[10].setOnAction(eve11); buttons[11].setOnAction(eve12);
				 

	
					
					
		*/
					
					
					
					
					
		Scene sTwo = new Scene(cGrid, 1100, 900);
					
		Image bamboo2 = new Image(new FileInputStream("C://Users//deane//GitHub//Coleccion//bamboo_scroll_art_2.jpg"));
		
		// Filepath for images on Grendel - C://Users//deane//MEGAsync//Colección//bamboo_scroll_art_2.jpg
		// Filepath for images on Cronus - /home/cronus/GitHub/Coleccion/bamboo_scroll_art_2.jpg
					
		BackgroundImage bgImg2 = new BackgroundImage(bamboo2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
						new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));

		Background bgImg3 = new Background(bgImg2);
					
		cGrid.setBackground(bgImg3);
					
		s1.setScene(sTwo);

		s1.setTitle("Colección");
		s1.show();
		
	}

	
	

}





/*


*/



/*

@Override
public void start(Stage primaryStage) throws Exception {
    String[] ingredients = new String[]{
        "Pepperoni",
        "Cheese",
        "Tomato",
        "Olives",
        "Chicken"
    };
    final int maxCount = 3;
    final Set<CheckBox> activeBoxes = new LinkedHashSet<>();

    ChangeListener<Boolean> listener = (o, oldValue, newValue) -> {
        // get checkbox containing property
        CheckBox cb = (CheckBox) ((ReadOnlyProperty) o).getBean();

        if (newValue) {
            activeBoxes.add(cb);
            if (activeBoxes.size() > maxCount) {
                // get first checkbox to be activated
                cb = activeBoxes.iterator().next();

                // unselect; change listener will remove
                cb.setSelected(false);
            }
        } else {
            activeBoxes.remove(cb);
        }
    };

    VBox root = new VBox();

    // create checkboxes
    for (int i = 0; i < ingredients.length; i++) {
        CheckBox cb = new CheckBox(ingredients[i]);
        cb.selectedProperty().addListener(listener);
        root.getChildren().add(cb);
    }

    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
}


*/


/*

final CheckBox[] checkBoxes = new CheckBox[ingredients.length];

ChangeListener<Boolean> listener = new ChangeListener<Boolean>() {

    private int activeCount = 0;

    public void changed(ObservableValue<? extends Boolean> o, Boolean oldValue, Boolean newValue) {
        if (newValue) {
            activeCount++;
            if (activeCount == maxCount) {
                // disable unselected CheckBoxes
                for (CheckBox cb : checkBoxes) {
                    if (!cb.isSelected()) {
                        cb.setDisable(true);
                    }
                }
            }
        } else {
            if (activeCount == maxCount) {
                // reenable CheckBoxes
                for (CheckBox cb : checkBoxes) {
                    cb.setDisable(false);
                }
            }
            activeCount--;
        }
    }
};

VBox root = new VBox();

// create checkboxes
for (int i = 0; i < ingredients.length; i++) {
    CheckBox cb = new CheckBox(ingredients[i]);
    cb.selectedProperty().addListener(listener);
    root.getChildren().add(cb);
    checkBoxes[i] = cb;
}



 */























