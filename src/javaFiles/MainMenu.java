package javaFiles;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

public class MainMenu extends Application {
	
	public static void main(String[] args) {				
        launch(args);
    }

	@Override
	public void start(Stage s2) throws Exception {
		
		
		
		
		
		
		
		
		
		
		Image logoImg = new Image(new FileInputStream("C://Users//deane//GitHub//Coleccion//Draw_Build_Files//Collection_Logo_2.png"));
		Image ngButtonImg = new Image(new FileInputStream("C://Users//deane//GitHub//Coleccion//Draw_Build_Files//StartGameButton.png"));	
		Image cButtonImg = new Image(new FileInputStream("C://Users//deane//GitHub//Coleccion//Draw_Build_Files//ContinueGameButton.png"));
		Image sButtonImg = new Image(new FileInputStream("C://Users//deane//GitHub//Coleccion//Draw_Build_Files//SettingsButton.png"));
		Image hButtonImg = new Image(new FileInputStream("C://Users//deane//GitHub//Coleccion//Draw_Build_Files//HelpButton.png"));
		
		ImageView logoI = new ImageView(logoImg);		
		ImageView ngI = new ImageView(ngButtonImg);
		ImageView cI = new ImageView(cButtonImg);
		ImageView sI = new ImageView(sButtonImg);
		ImageView hI = new ImageView(hButtonImg);
		
		
		Button button1 = new Button("", ngI);	button1.setFocusTraversable(false);
		Button button2 = new Button("", cI);
		Button button3 = new Button("", sI);
		Button button4 = new Button("", hI);
		
		HBox row1, row2, row3, row4, row5;
		
		VBox col1;
		
		row1 = new HBox(10);	row1.getChildren().addAll(logoI); 
		row2 = new HBox(10);	row2.getChildren().addAll(button1);
		row3 = new HBox(10);	row3.getChildren().addAll(button2);
		row4 = new HBox(10);	row4.getChildren().addAll(button3);
		row5 = new HBox(10);	row5.getChildren().addAll(button4);
		
		col1 = new VBox(5);		col1.getChildren().addAll(row1, row2, row3, row4, row5);
		
		
		
		
		
		GridPane container2 = new GridPane();	container2.setMinSize(1000, 800);		container2.setPadding(new Insets(15, 15, 15, 15));
			container2.setVgap(20);			container2.setHgap(10);					container2.setAlignment(Pos.CENTER);

			container2.add(logoI, 0, 0);		container2.add(ngI, 0, 1);	container2.add(cI, 0, 2);
			container2.add(sI, 0, 3);		container2.add(hI, 0, 4);
		
		
		GridPane container = new GridPane();	container.setMinSize(1000, 800);		container.setPadding(new Insets(15, 15, 15, 15));
		 				container.setVgap(20);			container.setHgap(20);					container.setAlignment(Pos.CENTER);
		
		 				container.add(logoI, 0, 0);		container.add(button1, 0, 1);	container.add(button2, 0, 2);
		 				container.add(button3, 0, 3);	container.add(button4, 0, 4);
		
		
		
		
		
		
		
		// Scene sThree = new Scene(bGrid, 1100, 900);
		
		
		
		
		
		Image swan2 = new Image(new FileInputStream("C://Users//deane//MEGAsync//Colección//swan_scroll_art_1.jpg"));
		BackgroundImage bgImg3 = new BackgroundImage(swan2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
						new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));

		Background bgSwan = new Background(bgImg3);
		
		Scene sThree = new Scene(container, 1100, 900);
		
		container.setBackground(bgSwan);
		
		s2.setScene(sThree);
		s2.setTitle("Colección");
		s2.show();
		
	}

}
