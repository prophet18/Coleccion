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
		
	Stage s2 = new Stage();
	
	
	public static void main(String[] args) {				
        launch(args);
    }

	@Override
	public void start(Stage s1) throws Exception {
		
    	
    	 	
					
					
		Image bamboo2 = new Image(new FileInputStream("bamboo_scroll_art_2.jpg"));
		
		

		EntryScreen home = new EntryScreen();	 
				 
		// HomeScreen home1 = new HomeScreen();		 
				 
		Board board = new Board();	
		
		Scene sOne = new Scene(home.gridGo(), 1100, 900);		

		Scene sTwo = new Scene(board.goGrid(), 1400, 900);
		
		sOne.getStylesheets().add("file:css_styling_coleccion.css");
		
		sTwo.getStylesheets().add("file:css_styling_coleccion.css");
		
		EventHandler<ActionEvent> newGame = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				s2.setScene(sTwo);
				s2.setTitle("Colección");			
				s2.show();
				s1.close();
			}
		};
		
		
		
		
		home.button1.setOnAction(newGame);
		
		
		
		
		s1.setScene(sOne);
		s1.setTitle("Colección");
		s1.show();
		
		
		
		
		
		
	
	}
	
	

}





/*


*/


