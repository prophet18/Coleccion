// GUI

// Card sizes: Total - 672 x 1056 pixels		Scaled down - 168 x 264 		OR		84 x 132
// Background size: 4000 x 2340 px				Scaled down - 2000 x 1170		OR		1000 x 585

// 

package javaFiles;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.EventListener;
import java.util.Scanner;
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
		
	Stage s1 = new Stage();		
	
	public static void main(String[] args) {				
        launch(args);
    }

	@Override
	public void start(Stage s1) throws Exception {
		
		// Lines 52 --> 60		Instantiate the core classes (objects) used for the game
		
		Board board = new Board();
    	
		HighScoreScreen allScores = new HighScoreScreen();
		
		GameHelp help2 = new GameHelp();

		EntryScreen home = new EntryScreen();
		
		SettingsMenu setMenu = new SettingsMenu();
		
		// Lines 64 --> 102		Setting up the action events for the major buttons in the game
				 
		EventHandler<ActionEvent> pauseExit = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {	
				board.psnu.pausing.close();
				board.age3.close();
				home.age4.show();
			}
		};	
		board.psnu.pauseQuit.setOnAction(pauseExit);	
	
		EventHandler<ActionEvent> newGame = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {			
				board.goGrid.setBackground(setMenu.Choice);
				board.age3.show();
				board.timer.schedule(board.task, 1000, 1000);
				board.f = setMenu.timeLimit;
				home.age4.close();
			}
		};					
		home.button1.setOnAction(newGame);		
		
		EventHandler<ActionEvent> hScores = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {			
				allScores.scoring.show();
			}
		};			
		home.button2.setOnAction(hScores);
		
		EventHandler<ActionEvent> settingsButton = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				setMenu.age6.show();				
			}
		};		
		home.button3.setOnAction(settingsButton);		
		
		EventHandler<ActionEvent> helpButton = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				help2.age1.show();				
			}
		};		
		home.button4.setOnAction(helpButton);		
		
		// Display the entry screen to start the program
		home.age4.show();
		
		
		
		
		
		
	
	}
	
	

	

}





/*


*/


