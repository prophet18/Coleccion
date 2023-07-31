// Class constructor for Main Menu --> use with regular Game.java launch file for the standard run.

package javaFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
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

public class EntryScreen {
	
	ImageView logoI;
	Button button1, button2, button3, button4;
	
	
	
	
	public EntryScreen() throws FileNotFoundException {
		
		

		
		
		Image logoImg = new Image(new FileInputStream("./Draw_Build_Files/Collection_Logo_2.png"));
		Image ngButtonImg = new Image(new FileInputStream("./Draw_Build_Files/StartGameButton.png"));	
		Image cButtonImg = new Image(new FileInputStream("./Draw_Build_Files/ContinueGameButton.png"));
		Image sButtonImg = new Image(new FileInputStream("./Draw_Build_Files/SettingsButton.png"));
		Image hButtonImg = new Image(new FileInputStream("./Draw_Build_Files/HelpButton.png"));
		
		logoI = new ImageView(logoImg);		
		ImageView ngI = new ImageView(ngButtonImg);
		ImageView cI = new ImageView(cButtonImg);
		ImageView sI = new ImageView(sButtonImg);
		ImageView hI = new ImageView(hButtonImg);		
		
		ngI.setFitWidth(660);
		ngI.setFitHeight(160);
		
		button1 = new Button ("", ngI);		button1.setId("NewGame");
		button2 = new Button ("", cI);		button2.setId("NewGame");
		button3 = new Button ("", sI);		button3.setId("NewGame");
		button4 = new Button ("", hI);		button4.setId("NewGame");
		
		
		
	}
	
	public GridPane gridGo() throws FileNotFoundException {
		
		GridPane container = new GridPane();	container.setMinSize(1000, 800);		container.setPadding(new Insets(15, 15, 15, 15));
				 container.setVgap(20);			container.setHgap(20);					container.setAlignment(Pos.CENTER);

				 container.add(logoI, 0, 0);	container.add(button1, 0, 1);			container.add(button2, 0, 2);
				 container.add(button3, 0, 3);	container.add(button4, 0, 4);
			

		Image swan2 = new Image(new FileInputStream("./swan_scroll_art_1.jpg"));
		BackgroundImage bgImg3 = new BackgroundImage(swan2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
							new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));

		Background bgSwan = new Background(bgImg3);

		container.setBackground(bgSwan);
		
		return container;
		
	}

}