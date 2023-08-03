// Class for board setup and function

package javaFiles;

import java.util.*;
import javaFiles.Card;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.*;

public class Board {			
	
	CardArea allcard;
	
	OtherArea allother;
	
	AnimationTimer anothertime;
	
	TimerTask task;		Timer timer;
	
	Stage age3 = new Stage();		Scene bscene;
	
	ProgressBar timebar = new ProgressBar();
	
	public Board() throws FileNotFoundException {
		
		
		anothertime = new TimerMethod();
		
		allcard = new CardArea();
		
		allother = new OtherArea();
		
		anothertime.start();
		
		task = new GameTime();
		
		timer = new Timer();
		
		timer.schedule(task, 1000, 1000);
		
		
		Image bamboo2 = new Image(new FileInputStream("./bamboo_scroll_art_2.jpg"));
		 
		 Image pausebtn2 = new Image(new FileInputStream("./Draw_Build_Files/PauseIcon.png"));
		 Image scoreicon2 = new Image(new FileInputStream("./Draw_Build_Files/ScoreIcon.png"));
		 Image timericon2 = new Image(new FileInputStream("./Draw_Build_Files/TimerIcon.png"));
		 
		 ImageView pausebtn = new ImageView(pausebtn2);		pausebtn.setFitWidth(250);		pausebtn.setFitHeight(75);
		 ImageView scoreicon = new ImageView(scoreicon2);	scoreicon.setFitWidth(240);		scoreicon.setFitHeight(75);
		 ImageView timericon = new ImageView(timericon2);	timericon.setFitWidth(250);		timericon.setFitHeight(75);		
						
		BackgroundImage bamboo4 = new BackgroundImage(bamboo2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
							new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));

		Background bamboo5 = new Background(bamboo4);
		 
		GridPane goGrid = new GridPane();	goGrid.setMinSize(1000, 800);		goGrid.setPadding(new Insets(5, 5, 5, 5));
		  goGrid.setVgap(10);		goGrid.setHgap(10);					goGrid.setAlignment(Pos.CENTER);

		  goGrid.add(allcard.algb.get(0), 0, 0);	goGrid.add(allcard.algb.get(1), 0, 1);	goGrid.add(allcard.algb.get(2), 0, 2);		 goGrid.add(allcard.algb.get(3), 1, 0);
		  goGrid.add(allcard.algb.get(4), 1, 1);	goGrid.add(allcard.algb.get(5), 1, 2);	goGrid.add(allcard.algb.get(6), 2, 0);		 goGrid.add(allcard.algb.get(7), 2, 1);
		  goGrid.add(allcard.algb.get(8), 2, 2);	goGrid.add(allcard.algb.get(9), 3, 0);	goGrid.add(allcard.algb.get(10), 3, 1);		 goGrid.add(allcard.algb.get(11), 3, 2);
		  goGrid.add(scoreicon, 4, 0);		goGrid.add(allother.timerKeep, 4, 1);	goGrid.add(allcard.scoreKeep, 4, 2);		 goGrid.add(pausebtn, 5, 0);
		 
		goGrid.setBackground(bamboo5);
		
		bscene = new Scene(goGrid, 1200, 800);
		bscene.getStylesheets().add("file:Coleccion_Styling.css");	
		age3.setScene(bscene);
		age3.setTitle("Colección!");
		
	}
	
	class TimerMethod extends AnimationTimer {

		@Override
		public void handle(long arg0) {
			// System.out.println("U fucked son");
			
		}
		
	}
	
	
	
    	

	class GameTime extends TimerTask {
	    public static int f = 10;
	    public void run() {
	    	
	    	Platform.runLater(() -> {
	        // System.out.println("Timer ran " + --f);
	        
	        allother.timerKeep.setText("Timer ran " + --f);
	        
	        ;
	        
	        if (f == 1) {
	        	age3.close();
	        }
	        
	       
	        if (f == -2) {
	        	timer.cancel();
	        }
	    });
	    };
	    
	}






	
	
	
	
	
	
	
	
	
	
	

}




/*


*/