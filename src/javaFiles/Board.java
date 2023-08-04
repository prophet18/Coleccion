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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.*;

public class Board {			
	
	CardArea allcard;	Boolean active;		PauseScreen psnu;		Text ulose;		Label timerKeep;	File highScores;
	
	TimerTask task;		Timer timer;
	
	Stage age3 = new Stage();		Scene bscene, ending;		VBox scored1;	VBox timed1;		HBox uuugh = new HBox(5);
	
	ProgressBar timebar = new ProgressBar();	Button doPause;		 int f = 70;	int h;
	
	public Board() throws FileNotFoundException {
		
		
		active = false;		psnu = new PauseScreen();		ulose = new Text("You are a loser!"); 	uuugh.getChildren().addAll(ulose);
		
		allcard = new CardArea();
		
		task = new GameTime();
		
		timer = new Timer();	
		
		timerKeep = new Label();	timerKeep.getStyleClass().add("TimerLabel");
		
		Image bamboo2 = new Image(new FileInputStream("./bamboo_scroll_art_2.jpg"));
		 
		 Image pausebtn2 = new Image(new FileInputStream("./Draw_Build_Files/PauseIcon.png"));
		 Image scoreicon2 = new Image(new FileInputStream("./Draw_Build_Files/ScoreIcon.png"));
		 Image timericon2 = new Image(new FileInputStream("./Draw_Build_Files/TimerIcon.png"));
		 
		 ImageView pausebtn = new ImageView(pausebtn2);		pausebtn.setFitWidth(250);		pausebtn.setFitHeight(75);
		 ImageView scoreicon = new ImageView(scoreicon2);	scoreicon.setFitWidth(240);		scoreicon.setFitHeight(75);
		 ImageView timericon = new ImageView(timericon2);	timericon.setFitWidth(250);		timericon.setFitHeight(75);	
		 
		 doPause = new Button("", pausebtn);
		 
		 EventHandler<ActionEvent> pauseNow = new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {				
					
					if (active == true) {
						ResumeGame();
					} else {						
						StopGame();						
					}
				}				
			};
		 
			doPause.setOnAction(pauseNow);			 doPause.getStyleClass().add("GameButton");			
			psnu.returned.setOnAction(pauseNow);
		 
		 
		 
		 
		 
		 
						
		BackgroundImage bamboo4 = new BackgroundImage(bamboo2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
							new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));

		Background bamboo5 = new Background(bamboo4);
		
		scored1 = new VBox(5);		timed1 = new VBox(5);		scored1.setAlignment(Pos.CENTER);	timed1.setAlignment(Pos.CENTER);
		
		scored1.getChildren().addAll(scoreicon, allcard.scoreKeep);
		
		timed1.getChildren().addAll(timericon, timerKeep);
		 
		GridPane goGrid = new GridPane();	goGrid.setMinSize(1000, 800);		goGrid.setPadding(new Insets(5, 5, 5, 5));
		  goGrid.setVgap(10);		goGrid.setHgap(10);					goGrid.setAlignment(Pos.CENTER);

		  goGrid.add(allcard.algb.get(0), 0, 0);	goGrid.add(allcard.algb.get(1), 0, 1);	goGrid.add(allcard.algb.get(2), 0, 2);		 goGrid.add(allcard.algb.get(3), 1, 0);
		  goGrid.add(allcard.algb.get(4), 1, 1);	goGrid.add(allcard.algb.get(5), 1, 2);	goGrid.add(allcard.algb.get(6), 2, 0);		 goGrid.add(allcard.algb.get(7), 2, 1);
		  goGrid.add(allcard.algb.get(8), 2, 2);	goGrid.add(allcard.algb.get(9), 3, 0);	goGrid.add(allcard.algb.get(10), 3, 1);		 goGrid.add(allcard.algb.get(11), 3, 2);
		  goGrid.add(scored1, 4, 0);				goGrid.add(doPause, 4, 1);				goGrid.add(timed1, 4, 2);		 
		 
		goGrid.setBackground(bamboo5);
		
		bscene = new Scene(goGrid, 1200, 800);							ending = new Scene(uuugh, 900, 500);
		bscene.getStylesheets().add("file:Coleccion_Styling.css");	
		age3.setScene(bscene);
		age3.setTitle("Colección!");
		
		this.CreateFile();
		
	}
	
	
    	

	class GameTime extends TimerTask {
	    
	    public void run() {
	    	
	    	Platform.runLater(() -> {
	    		 
	        timerKeep.setText(--f + " Seconds Left");
	        
	        if (f == 0) {
	        	AddHighScore();
	        	timer.cancel();
	        	age3.setScene(ending);
	        }
	    });
	    };	    
	}	
	
	public void StopGame() {
		
		active = true;
		h = f;
		timer.cancel();
		
		psnu.pausing.show();		
	}

	public void ResumeGame() {
		
		active = false;
		
		f = h;
		
		timer = new Timer();
		
		task = new GameTime();
			
		timer.schedule(task, 1000, 1000);	
		
		psnu.pausing.close();
			
	}

	public void CreateFile() {
		 try {
			 highScores = new File("./Draw_Build_Files/HighScores.txt");
		     if (highScores.createNewFile()) {
		        System.out.println("File created: " + highScores.getName());
		     } else {
		        System.out.println("File already exists.");
		     }
		 } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		 }
	}
	
	public void AddHighScore() {
		try {
		      FileWriter addHS1 = new FileWriter("./Draw_Build_Files/HighScores.txt", true);
		      BufferedWriter addHS = new BufferedWriter(addHS1);
		      addHS.write("Score last game: " + allcard.score.scoreTotal());	addHS.newLine();	addHS.close();		      
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

	
	
	
	
	
	
	
	
	
	
	

}




/*


*/