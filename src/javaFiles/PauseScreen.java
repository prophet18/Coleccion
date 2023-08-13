// Code for pause screen of the game

package javaFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PauseScreen {
	
	VBox pausing5;
	Stage pausing = new Stage();
	Scene pausing2;
	Image swans2;		
	Background swans;	
	Button returned, helpings, pauseQuit;		
	
	public PauseScreen() throws FileNotFoundException {		
		
		Image resumed1 = new Image(new FileInputStream("./Draw_Build_Files/ResumeButton.png"));
		Image quits1 = new Image(new FileInputStream("./Draw_Build_Files/QuitButton.png"));
		swans2 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/swan_scroll_art_1.jpg"));
		ImageView resumed2 = new ImageView(resumed1);	resumed2.setFitWidth(250);	resumed2.setFitHeight(75);
		ImageView quits2 = new ImageView(quits1);		quits2.setFitWidth(250);	quits2.setFitHeight(75);
		
		returned = new Button("", resumed2);	
		pauseQuit = new Button("", quits2);		
		returned.setId("NObg");
		pauseQuit.setId("NObg");
	 
		pausing5 = new VBox(15);	pausing5.setAlignment(Pos.CENTER);
		pausing5.setSpacing(15);	pausing5.setPadding(new Insets(10, 10, 10, 10));
		pausing5.getChildren().addAll(returned, pauseQuit);
		
		BackgroundImage swans3 = new BackgroundImage(swans2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));

		Background bgSwan = new Background(swans3);
		pausing5.setBackground(bgSwan);
		
		pausing2 = new Scene(pausing5, 700, 500);
		pausing2.getStylesheets().add("file:Coleccion_Styling.css");
		pausing.setScene(pausing2);
		pausing.setTitle("Colección Game Paused");		
	}
}
