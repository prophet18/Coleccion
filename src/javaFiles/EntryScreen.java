// Class constructor for Main Menu --> use with regular Game.java launch file for the standard run.

package javaFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EntryScreen {
	
	// Line 27		Instantiate buttons for main actions on entry screen	
	Button button1, button2, button3, button4;
	
	Stage age4 = new Stage();		Scene escene;
	
	// Constructor for main screen object
	public EntryScreen() throws FileNotFoundException {		

		Image logoImg = new Image(new FileInputStream("./Draw_Build_Files/Collection_Logo_2.png"));
		Image ngButtonImg = new Image(new FileInputStream("./Draw_Build_Files/Menu_Icons/NewGameBtn2.png"));	
		Image cButtonImg = new Image(new FileInputStream("./Draw_Build_Files/Menu_Icons/HighScoreBtn2.png"));		
		Image sButtonImg = new Image(new FileInputStream("./Draw_Build_Files/Menu_Icons/SettingsBtn2.png"));
		Image hButtonImg = new Image(new FileInputStream("./Draw_Build_Files/Menu_Icons/HelpBtn2.png"));		
		Image dRains = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/Digital_rain.gif"));
		Image swan2 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/swan_scroll_art_1.jpg"));
		
		ImageView logoI = new ImageView(logoImg);		logoI.setFitWidth(1000);		logoI.setFitHeight(150);
		ImageView ngI = new ImageView(ngButtonImg);		ngI.setFitWidth(500);	ngI.setFitHeight(125);
		ImageView cI = new ImageView(cButtonImg);		cI.setFitWidth(500);	cI.setFitHeight(125);
		ImageView sI = new ImageView(sButtonImg);		sI.setFitWidth(500);	sI.setFitHeight(125);
		ImageView hI = new ImageView(hButtonImg);		hI.setFitWidth(300);	hI.setFitHeight(125);				
		
		button1 = new Button ("", ngI);		button1.setId("NewGame");	
		button2 = new Button ("", cI);		button2.setId("NewGame");
		button3 = new Button ("", sI);		button3.setId("NewGame");
		button4 = new Button ("", hI);		button4.setId("NewGame");			

		GridPane container = new GridPane();			container.setMinSize(1000, 800);		container.setPadding(new Insets(15, 15, 15, 15));
				 container.setVgap(20);					container.setHgap(20);					container.setAlignment(Pos.CENTER);

				 container.add(logoI, 0, 0, 2, 1);		container.add(button1, 0, 1, 1, 1);		container.add(button2, 1, 2, 1, 1);
				 container.add(button3, 0, 3, 1, 1);	container.add(button4, 1, 4, 1, 1);
	

		 
		 BackgroundImage bgImg3 = new BackgroundImage(swan2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
					new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));

		 Background bgSwan = new Background(bgImg3);
		 
		 BackgroundImage dRains1 = new BackgroundImage(dRains, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
					new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));

		 Background bgRains = new Background(dRains1);

		 container.setBackground(bgRains);		
				
		 escene = new Scene(container, 1200, 800);
			escene.getStylesheets().add("file:Coleccion_Styling.css");		
			age4.setScene(escene);
			age4.setTitle("Welcome to Colección!");
							
	}
	
	
}
