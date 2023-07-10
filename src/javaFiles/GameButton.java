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
	
	int nca;
	
	CheckMatch blah;
	Card card, mental1, mental2, mental3;
	
	HashMap<Integer, Card> upcards;
	
	ScorePile pooped = new ScorePile();
	
	
	
	
	
	public GameButton() {
		isOn = false; color = null; number = 0; shape = null; fill = null; nca = 0; 
	}
	
	
	
	public GameButton(Card c) {
		
		card = c;	views = c.view;
		
		upcards = new HashMap<Integer, Card>();
		
		color = c.color; number = c.number; shape = c.shape; fill = c.fill; 
		
		isOn = false; nca = 0;
		
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
	}
}


