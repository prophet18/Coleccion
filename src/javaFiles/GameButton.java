// Buttons

package javaFiles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GameButton extends Button {
	
	boolean isOn, theTest;
	 int aa1 = 1; int aa2 = 2; int aa3 = 3; int cidnew; 
	
	String color, shape, fill, path; int number; Boolean active;
	Image image; ImageView views;
	
	int numbAct = 0;
	
	CheckMatch blah;
	Card gb01, mental1, mental2, mental3;
	
	HashMap<Integer, Card> upcards;
	
	ScorePile pooped = new ScorePile();
	
	
	
	
	
	public GameButton() {
		isOn = false; color = null; number = 0; shape = null; fill = null;
	}
	
	
	
	public GameButton(Card c) {
		
		gb01 = c;	views = c.view;
		
		int cardA = 0;
		
		upcards = new HashMap<Integer, Card>();
		
		color = c.color; number = c.number; shape = c.shape; fill = c.fill; 
		
		isOn = false;
		this.setGraphic(c.view);	
		
	}
	
	public void info() {
		System.out.println("Card Properties: ");
		System.out.println("	Color --> " + this.color);
		System.out.println("	Number --> " + this.number);
		System.out.println("	Type --> " + this.shape);
		System.out.println("	Fill --> " + this.fill);
	}
	






























public GameButton(Card c, int yupp) {
	
	HashMap<Integer, Card> upcards = new HashMap<Integer, Card>();
	
	color = c.color; number = c.number; shape = c.shape; fill = c.fill; cidnew = yupp;
	
	isOn = false;
	this.setGraphic(c.view);
	
	
	
	
	
	EventHandler<ActionEvent> gb = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
		
		
		if (numbAct == 3) { 
		}
		
		
		if (isOn == false) {
			isOn = true;
			numbAct++;
			c.active = true;
		} else {
			isOn = false;
			numbAct--;
			c.active = false;
		}
		
		switch (numbAct) {
		
			case 1:
				upcards.put(1, c);
				break;
			
			case 2:
				upcards.put(2,  c);
			
			case 3:
				upcards.put(3, c);
		}
		
		
		
		
		
			
			/*
			
			
			actcard1 = cards3.peek();	cards3.pop();
			actcard2 = cards3.peek();	cards3.pop();
			actcard3 = cards3.peek();	cards3.pop();
			
			blah = new CheckMatch(actcard1, actcard2, actcard3);
		
			System.out.println(blah.matchCheck);
		*/
		
	}
	};
	
	
	
	
	
	// this.setOnAction(gb);
	
	
}
}
