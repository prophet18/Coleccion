package javaFiles;

import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameOverScreen {
	
	
	Stage theEnd = new Stage();
	Scene ending;
	
	HBox ehbox = new HBox(10);
	Text gover = new Text(" ");
	
	
	
	public GameOverScreen() {
		
		gover.setText("Time's Up!");		ehbox.getChildren().addAll(gover);
		
		ending = new Scene(ehbox, 900, 500);
		
		
	}
	

}
