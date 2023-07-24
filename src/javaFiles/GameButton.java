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
	
	boolean active; 
	
	int index;
	
	CheckMatch solve;
	
	Card card;
	
	ScorePile score;
	
	public GameButton() {
		active = false;
	}
	
	/*
	
	public GameButton(Card c) {
		
		this.card = c;	
		
		score = new ScorePile();
				
		active = false;
		
		this.setGraphic(card.view);				
		
	}	
*/

	public void info() {
		System.out.println("Color --> " + this.card.color + "     Number --> " + this.card.number + "     Type --> " + this.card.shape + "     Fill --> " + this.card.fill);
	}
	
	public void setCard(int index2, Card t) {
		this.card = t;
	}
	
	public void setCard(Card t) {
		this.card = t;
	}
		
	public GameButton(int index2, Card c) {
		
		index = index2;		card = c;	
		
		score = new ScorePile();
				
		active = false;
		
		this.setGraphic(c.view);		
	}
	
}

