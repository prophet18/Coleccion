// Choose background and time

package javaFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SettingsMenu {
	
	Stage age6 = new Stage();
	Scene settings2;
	VBox smvbox;
	MenuButton mb;
	MenuItem mi1, mi2, mi3, mi4, mi5, mi6, mi7, mi8;	
	Label limTime, bgOpt, timeSelect;
	TextField timLim, tEntry;
	int timeLimit = 60;
	
	Image aurora1, boston1, rho1, sunset1, train1, trees1, bamboo2, coast2, solar2;
	BackgroundImage aurora2, boston2, rho2, sunset2, train2, trees2, bamboo4, coast1, solar1;
	Background Aurora, Boston, Space, Sunset, Mountains, Forest, Bamboo, Coast, Choice, Solar;
	String bgSetter;	
	
	public SettingsMenu() throws FileNotFoundException {		
		
		bgOpt  = new Label("Background Selected: ");		
		mb = new MenuButton("Choose Your Background!");
		mi1 = new MenuItem("Aurora");		mi2 = new MenuItem("Boston");		mi3 = new MenuItem("Space");
		mi4 = new MenuItem("Sunset");		mi5 = new MenuItem("Mountains");	mi6 = new MenuItem("Forest");
		mi7 = new MenuItem("Bamboo");		mi8 = new MenuItem("Coast");
		mb.getItems().addAll(mi1, mi2, mi3, mi4, mi5, mi6, mi7, mi8);
		
		bamboo2 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/bamboo_scroll_art_2.jpg"));		
		aurora1 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/aurora_over_Canada_2016.jpg"));
		boston1 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/Boston_Financial_District_skyline.jpg"));
		rho1 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/Dark_Clouds_of_Rho_Ophiuchus.jpg"));
		sunset1 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/Sunset-with-birds.png"));
		train1 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/Train-mountains-winter.jpg"));
		trees1 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/Trees_and_mountains_and_clouds_and_sky.jpg"));
		coast2 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/South_Oregon_Coast_18499357.jpeg"));
		solar2 = new Image(new FileInputStream("./Draw_Build_Files/Game_Backgrounds/Screensaver_Solarwinds.jpg"));		
		
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
		bamboo4 = new BackgroundImage(bamboo2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));
		coast1 = new BackgroundImage(coast2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));
		solar1 = new BackgroundImage(solar2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));
		
		Aurora = new Background(aurora2);		Boston = new Background(boston2);		Space = new Background(rho2);
		Sunset = new Background(sunset2);		Mountains = new Background(train2);		Forest = new Background(trees2);
		Bamboo = new Background(bamboo4);		Coast = new Background(coast1);			Solar = new Background(solar1);
				
		Choice = Bamboo;		
		
		EventHandler<ActionEvent> menuItems = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                bgOpt.setText(((MenuItem)e.getSource()).getText() + " selected for background.");
                                
                String again = ((MenuItem)e.getSource()).getText(); 
                
                switch(again) {
                	case "Aurora":
                		Choice = Aurora;
                		break;
                	case "Boston":
                		Choice = Boston;
                		break;
                	case "Space":
                		Choice = Space;
                		break;
                	case "Sunset":
                		Choice = Sunset;
                		break;
                	case "Mountains":
                		Choice = Mountains;
                		break;
                	case "Forest":
                		Choice = Forest;
                		break;
                	case "Bamboo":
                		Choice = Bamboo;
                		break;
                	case "Coast":
                		Choice = Coast;
                		break;
                }
            }
        };
        mi1.setOnAction(menuItems);		mi2.setOnAction(menuItems);		mi3.setOnAction(menuItems);
        mi4.setOnAction(menuItems);		mi5.setOnAction(menuItems);		mi6.setOnAction(menuItems);        
        mi7.setOnAction(menuItems);		mi8.setOnAction(menuItems);
        
        limTime = new Label("Enter Time Limit: ");
        
        tEntry = new TextField("");       
        
        EventHandler<ActionEvent> eventTime = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                timeSelect.setText(tEntry.getText());
                timeLimit = Integer.parseInt(tEntry.getText());
            }
        };
 
        // when enter is pressed
        tEntry.setOnAction(eventTime);     
		
		timeSelect = new Label(" ");
        
        limTime.getStyleClass().add("big-yellow");
        tEntry.getStyleClass().add("big-yellow");
        bgOpt.getStyleClass().add("light-gray");
        mb.getStyleClass().add("dark-gray");
        
        smvbox = new VBox(25);	smvbox.setAlignment(Pos.CENTER);
        smvbox.getChildren().addAll(mb, bgOpt, limTime, tEntry, timeSelect);
        
        smvbox.setSpacing(15);	smvbox.setPadding(new Insets(10, 10, 10, 10));
        settings2 = new Scene(smvbox, 800, 600);
        
        smvbox.setBackground(Solar);
        settings2.getStylesheets().add("file:Coleccion_Styling.css");	
		age6.setScene(settings2);
		age6.setTitle("Colección Settings");
		
		
	}
	
	
	

}
