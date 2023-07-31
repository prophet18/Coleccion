// Keep / track time for board class / app

package javaFiles;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TimeKeeper {
	
	Text text;
	Timeline timeline;
	int mins = 0, secs = 0, millis = 0;
	boolean sos = true;
	
	void change(Text text) {
		
		
		if(secs == 60) {
			mins++;
			secs = 0;
		}
		text.setText((((mins/10) == 0) ? "0" : "") + mins + ":"
			 	+ (((secs/10) == 0) ? "0" : "") + secs++);
	}
    
	public TimeKeeper() {
		
		
		
		text = new Text("00:00");
		
		timeline = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
            	change(text);
			}
		}));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.setAutoReverse(false);
		
		timeline.play();
		
		
		
	}


}

