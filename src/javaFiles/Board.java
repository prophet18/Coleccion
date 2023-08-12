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
import java.text.SimpleDateFormat;

public class Board {			
	
	// Line 43		Instantiate custom game classes/objects	
	SettingsMenu smnu;		CardArea allcard;		PauseScreen psnu;			FindHint fh1;		GameOverScreen gos;		HighScoreScreen hss, highS;
	
	// Line 46		Instantiate regular data types
	Boolean active;		int h, f;		Date date;		SimpleDateFormat dateFormat;

	// Line 49		Instantiate objects for display/organization
	Stage age3 = new Stage();		Scene bscene;		VBox scored1, timed1, rBox;		
	Button doPause, hintButton, rButton;		Label timerKeep;			GridPane goGrid;
	
	// Line 53		Other instantiated objects
	File highScores, csvScores;		TimerTask task;		Timer timer;
	
	
	public Board() throws FileNotFoundException {
		
		// Create basic values from above, to set up basic conditions for Board object constructor
		
		smnu = new SettingsMenu();		allcard = new CardArea();		psnu = new PauseScreen();		gos = new GameOverScreen();		// highS = new HighScoreScreen();	
		
		active = false;		date = new Date();		dateFormat = new SimpleDateFormat("dd MMMM yyyy, HH:mm z");				
		
		task = new GameTime();		timer = new Timer();		timerKeep = new Label();	timerKeep.getStyleClass().add("TimerLabel");
	 
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
		doPause.setOnAction(pauseNow);		psnu.returned.setOnAction(pauseNow);
		doPause.setId("NObg"); 
		
		scored1 = new VBox(5);		timed1 = new VBox(5);	rBox = new VBox(5);		scored1.setAlignment(Pos.CENTER);	timed1.setAlignment(Pos.CENTER);	rBox.setAlignment(Pos.CENTER);
		
		scored1.getChildren().addAll(scoreicon, allcard.scoreKeep, allcard.setResult);
		
		timed1.getChildren().addAll(timericon, timerKeep);
		 
		rButton = new Button("Lost? \nRandomize Cards");
		rBox.getChildren().addAll(doPause, rButton);
		
		
		  goGrid = new GridPane();	goGrid.setMinSize(1000, 800);		goGrid.setPadding(new Insets(5, 5, 5, 5));
		  goGrid.setVgap(10);		goGrid.setHgap(10);					goGrid.setAlignment(Pos.CENTER);

		  goGrid.add(allcard.algb.get(0), 0, 0);	goGrid.add(allcard.algb.get(1), 0, 1);	goGrid.add(allcard.algb.get(2), 0, 2);		 goGrid.add(allcard.algb.get(3), 1, 0);
		  goGrid.add(allcard.algb.get(4), 1, 1);	goGrid.add(allcard.algb.get(5), 1, 2);	goGrid.add(allcard.algb.get(6), 2, 0);		 goGrid.add(allcard.algb.get(7), 2, 1);
		  goGrid.add(allcard.algb.get(8), 2, 2);	goGrid.add(allcard.algb.get(9), 3, 0);	goGrid.add(allcard.algb.get(10), 3, 1);		 goGrid.add(allcard.algb.get(11), 3, 2);
		  goGrid.add(scored1, 4, 0);				goGrid.add(rBox, 4, 1);					goGrid.add(timed1, 4, 2);						 
		 
		
		
		bscene = new Scene(goGrid, 1200, 800);							
		bscene.getStylesheets().add("file:Coleccion_Styling.css");	
		age3.setScene(bscene);
		age3.setTitle("Colección!");
		
		CreateFile();
		
		EventHandler<ActionEvent> rBevent = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				try {
					allcard.newCards();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		};
				rButton.setOnAction(rBevent);
				
	}
	
	
    	

	class GameTime extends TimerTask {
	    
	    public void run() {
	    	
	    	Platform.runLater(() -> {
	    		
	    			    		 
	        timerKeep.setText(--f + " Seconds Left");
	        
	        if (f == 0) {
	        	AddHighScore();
	        	timer.cancel();
	        	age3.setScene(gos.ending);
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
			 csvScores = new File("./Draw_Build_Files/csvHighScores.csv");
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
		      FileWriter csvHS1 = new FileWriter("./Draw_Build_Files/csvHighScores.csv", true);
		      BufferedWriter addHS = new BufferedWriter(addHS1);
		      BufferedWriter csvHS = new BufferedWriter(csvHS1);
		      addHS.write("Score: ;" + allcard.score.scoreTotal() + ";" + " on " + dateFormat.format(date));	addHS.newLine();	addHS.close();	
		      csvHS.write("Score: " + allcard.score.scoreTotal() + " on " + dateFormat.format(date));	csvHS.newLine();	csvHS.close();
		      
		      hss = new HighScoreScreen(allcard.score.scoreTotal(), smnu.timeLimit, dateFormat.format(date));
		      
		      // highS.tView.getItems().add(hss);
		      
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

	
	
	
	
	
	
	
	
	
	
	

}




/*


*/