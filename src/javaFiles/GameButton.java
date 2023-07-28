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

<<<<<<< HEAD
public class GameButton extends Button {	
	
	boolean active; 
	
	int index;
	
	CheckMatch solve;
	
	Card card;
	
	ScorePile score;
	
	public GameButton() {
		active = false;
=======
public class GameButton extends Button {
	 
	
	Boolean active;
	Image images; ImageView views;
	int index;
	
	CheckMatch chk1;
	Card card;
	
	Card[] cards;
	
	HashMap<Integer, Card> upcards;
	
	
	public GameButton() {
		active = false; 
>>>>>>> main
	}
	
	/*
	
	public GameButton(Card c) {
		
<<<<<<< HEAD
		this.card = c;	
		
		score = new ScorePile();
				
		active = false;
		
		this.setGraphic(card.view);				
=======
		active = false;
		
		card = c;	views = card.view;
		
		upcards = new HashMap<Integer, Card>();
		
		this.setGraphic(views);
				
>>>>>>> main
		
	}	
*/

	public void info() {
		System.out.println("Color --> " + this.card.color + "     Number --> " + this.card.number + "     Type --> " + this.card.shape + "     Fill --> " + this.card.fill);
	}
	
<<<<<<< HEAD
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

=======
	public GameButton(int t, Card c) {
		
		index = t;
		
		active = false;
		
		card = c;	views = card.view;
		
		upcards = new HashMap<Integer, Card>();
		
		this.setGraphic(views);
				
		
	}
	
	public void replace(Card d) {
		
		card = d;	views = card.view;
		
		this.setGraphic(views);
		
	}
	
	public void replace(int i, Card d) {
		
		index = i;
		
		card = d;	views = card.view;
		
		this.setGraphic(views);
		
	}
		
	
		
		
		
		
	
	public void info() {
		System.out.println("Card Properties: ");
		System.out.println("	Color --> " + this.card.color);
		System.out.println("	Number --> " + this.card.number);
		System.out.println("	Type --> " + this.card.shape);
		System.out.println("	Fill --> " + this.card.fill);
	}
	
	
	
	
    

}


>>>>>>> main
