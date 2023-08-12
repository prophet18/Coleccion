package javaFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameOverScreen {
	
	
	Stage theEnd = new Stage();
	Scene ending;
	
	Image movStars;				BackgroundImage movStars1;		Background bgStars;
	
	HBox ehbox = new HBox(25);
	Text gover = new Text(" ");
	
	
	
	public GameOverScreen() throws FileNotFoundException {
		
		movStars = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/StarfieldSimulation.gif"));
		
		movStars1 = new BackgroundImage(movStars, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));

		bgStars = new Background(movStars1);
		
		ehbox.setBackground(bgStars);
		
		gover.setText("Time's Up!");		ehbox.getChildren().addAll(gover);
		
		ending = new Scene(ehbox, 900, 500);
		
		
	}
	

}
