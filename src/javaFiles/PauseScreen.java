package javaFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PauseScreen {
	
	VBox pausing5;
	Stage pausing = new Stage();
	Scene pausing2;
	
	Button returned, helpings, pauseQuit;		
	
	public PauseScreen() throws FileNotFoundException {
		
		
		
		Image resumed1 = new Image(new FileInputStream("./Draw_Build_Files/ResumeButton.png"));
		Image quits1 = new Image(new FileInputStream("./Draw_Build_Files/QuitButton.png"));
		ImageView resumed2 = new ImageView(resumed1);	resumed2.setFitWidth(250);	resumed2.setFitHeight(75);
		ImageView quits2 = new ImageView(quits1);		quits2.setFitWidth(250);	quits2.setFitHeight(75);
		
		returned = new Button("", resumed2);
		pauseQuit = new Button("", quits2);
		
	 
		
		
		
		pausing5 = new VBox(15);	pausing5.setAlignment(Pos.CENTER);
		pausing5.getChildren().addAll(returned, pauseQuit);
		
		pausing2 = new Scene(pausing5, 700, 500);
		pausing.setScene(pausing2);
		pausing.setTitle("Colección Game Paused");
		
	}

}
