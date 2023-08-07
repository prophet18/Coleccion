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
		
	Button button1, button2, button3, button4;
	
	Stage age4 = new Stage();		Scene escene;
	
	public EntryScreen() throws FileNotFoundException {		

		Image logoImg = new Image(new FileInputStream("./Draw_Build_Files/Collection_Logo_2.png"));
		Image ngButtonImg = new Image(new FileInputStream("./Draw_Build_Files/Menu_Icons/NewGameBtn2.png"));	
		Image cButtonImg = new Image(new FileInputStream("./Draw_Build_Files/Menu_Icons/HighScoreBtn2.png"));		
		Image sButtonImg = new Image(new FileInputStream("./Draw_Build_Files/Menu_Icons/SettingsBtn2.png"));
		Image hButtonImg = new Image(new FileInputStream("./Draw_Build_Files/Menu_Icons/HelpBtn2.png"));		
		
		ImageView logoI = new ImageView(logoImg);		logoI.setFitWidth(600);		logoI.setFitHeight(150);
		ImageView ngI = new ImageView(ngButtonImg);		ngI.setFitWidth(600);	ngI.setFitHeight(150);
		ImageView cI = new ImageView(cButtonImg);		cI.setFitWidth(600);	cI.setFitHeight(150);
		ImageView sI = new ImageView(sButtonImg);		sI.setFitWidth(600);	sI.setFitHeight(150);
		ImageView hI = new ImageView(hButtonImg);		hI.setFitWidth(600);	hI.setFitHeight(150);				
		
		button1 = new Button ("", ngI);		button1.setId("NewGame");	
		button2 = new Button ("", cI);		button2.setId("NewGame");
		button3 = new Button ("", sI);		button3.setId("NewGame");
		button4 = new Button ("", hI);		button4.setId("NewGame");	
		
		

		GridPane container = new GridPane();	container.setMinSize(1000, 800);		container.setPadding(new Insets(15, 15, 15, 15));
		 container.setVgap(20);			container.setHgap(20);					container.setAlignment(Pos.CENTER);

		 container.add(logoI, 0, 0);	container.add(button1, 0, 1);			container.add(button2, 0, 2);
		 container.add(button3, 0, 3);	container.add(button4, 0, 4);
	

		 Image swan2 = new Image(new FileInputStream("./swan_scroll_art_1.jpg"));
		 BackgroundImage bgImg3 = new BackgroundImage(swan2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
					new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));

		 Background bgSwan = new Background(bgImg3);

		 container.setBackground(bgSwan);
		
				
		 escene = new Scene(container, 1200, 800);
			escene.getStylesheets().add("file:Coleccion_Styling.css");		
			age4.setScene(escene);
			age4.setTitle("Welcome to Colección!");
		
		
		
		
	}
	
	

}