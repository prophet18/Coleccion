// Choose background and time

package javaFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.stage.Stage;

public class SettingsMenu {
	
	Stage age6 = new Stage();
	Scene settngs2;
	
	Label limTime = new Label("Enter Time Limit: ");
	TextField timLim = new TextField("Default = 120 Seconds");
	
	int timeLimit; String tLimit;
	
	RadioButton rb1, rb2, rb3, rb4, rb5, rb6;
	
	Image aurora1, boston1, rho1, sunset1, train1, trees1;
	BackgroundImage aurora2, boston2, rho2, sunset2, train2, trees2;
	Background aurora, boston, rho, sunset, train, trees;
	
	
	
	
	
	
	public SettingsMenu() throws FileNotFoundException {
		
		
		aurora1 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/aurora_over_Canada_2016.jpg"));
		boston1 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/Boston_Financial_District_skyline.jpg"));
		rho1 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/Dark_Clouds_of_Rho_Ophiuchus.jpg"));
		sunset1 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/Sunset-with-birds.png"));
		train1 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/Train-mountains-winter.jpg"));
		trees1 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/Trees_and_mountains_and_clouds_and_sky.jpg"));
		
		aurora2 = new BackgroundImage(aurora1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
				  new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));
		boston2 = new BackgroundImage(boston1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
				  new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));
		rho2 = new BackgroundImage(rho1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
				  new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));
		sunset2 = new BackgroundImage(sunset1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
				  new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));
		train2 = new BackgroundImage(train1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
				  new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));
		trees2 = new BackgroundImage(trees1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
				  new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));
		aurora = new Background(aurora2);
		boston = new Background(boston2);
		rho = new Background(rho2);
		sunset = new Background(sunset2);
		train = new Background(train2);
		trees = new Background(trees2);
		
		tLimit = timLim.getText();		timeLimit = Integer.parseInt(tLimit);
		
	}
	
	
	

}
