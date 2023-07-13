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
	
	
	
	boolean active, isOn; 
	
	String color, shape, fill; int number;
	Image image; ImageView view;
	
	int nca = 0;
	
	CheckMatch solve;
	Card card;
	
	HashMap<Integer, Card> cardmap;
	
	ScorePile score;
	
	
	
	
	
	
	public GameButton() {
		active = false; color = null; number = 0; shape = null; fill = null; nca = 0; 
	}
	
	
	
	public GameButton(Card c) {
		
		card = c;	view = c.view;
		
		cardmap = new HashMap<Integer, Card>();
		
		score = new ScorePile();
		
		color = c.color; number = c.number; shape = c.shape; fill = c.fill; 
		
		active = false; nca = 0;
		
		this.setGraphic(c.view);	
		
		
	}
	
	public void info() {
		System.out.println("Card Properties: ");
		System.out.println("	Color --> " + this.color);
		System.out.println("	Number --> " + this.number);
		System.out.println("	Type --> " + this.shape);
		System.out.println("	Fill --> " + this.fill);
	}
		
	
		
			

/*

	public GameButton(Card c, int yupp) {
	
		HashMap<Integer, Card> upcards = new HashMap<Integer, Card>();
	
		color = c.color; number = c.number; shape = c.shape; fill = c.fill; cidnew = yupp;
	
		active = false;
		this.setGraphic(c.view);
	}
	*/
}

