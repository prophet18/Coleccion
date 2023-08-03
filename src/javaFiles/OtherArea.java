package javaFiles;

import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class OtherArea {
	
	TimeKeeper timekeeper;
	
	Timer timer;
	
	TimerTask task;
	
	Label timerKeep;
	String timerLabel;
	
	Boolean noTime;
	
	Button huh;
	
	int pok;
	
	public OtherArea() {
		
		huh = new Button("huhs");
		
		noTime = false;
		
		timerLabel = " "; 
		timer = new Timer();
		

		timerKeep = new Label(timerLabel);
		
		timekeeper = new TimeKeeper();
		
		
		// timer.schedule(task, 1000, 1000);
		
		timerKeep.getStyleClass().add("TimerLabel");
		
		pok = 21;
		
	}
	
	
	
	
	}
