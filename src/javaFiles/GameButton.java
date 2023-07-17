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
	int aa1 = 0; 
	
	String color, shape, fill, path; int number; Boolean active;
	Image image; ImageView views;
	
	int nca;
	
	CheckMatch chk1;
	Card card, mental1, mental2, mental3;
	
	HashMap<Integer, Card> upcards;
	
	

	
	
	
	public GameButton() {
		isOn = false; color = null; number = 0; shape = null; fill = null; nca = 0; 
	}
	
	
	
	public GameButton(Card c) {
		
		card = c;	views = c.view;
		
		upcards = new HashMap<Integer, Card>();
		
		color = c.color; number = c.number; shape = c.shape; fill = c.fill; 
		
		isOn = false; nca = 1;
		
		this.setGraphic(c.view);
		
		EventHandler<ActionEvent> beh1  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			
			
			if (card.active == true) {
				card.active = false;
				System.out.println(nca);
				nca--;
				switch (nca) {
				case 1:
					upcards.remove(1, card);
					break;
				case 2:
					upcards.remove(2, card);
					break;
				case 3:
					upcards.remove(3, card);
					break;
			}    			
				
			} else {
				card.active = true;	
				System.out.println(nca);
				nca++;
				switch (nca) {
				case 1:
					upcards.put(1, card);
					break;
				case 2:
					upcards.put(2, card);
					break;
				case 3:
					upcards.put(3, card);
					break;
			}    			
			}
			
			if (nca == 3) {
				chk1 = new CheckMatch (upcards.get(1), upcards.get(2), upcards.get(3));
				chk1.result();
			
			
			
		}
		};
		
	};
	
	this.setOnAction(beh1);
	
	}
		
	
		
		
		
		
	
	public void info() {
		System.out.println("Card Properties: ");
		System.out.println("	Color --> " + this.color);
		System.out.println("	Number --> " + this.number);
		System.out.println("	Type --> " + this.shape);
		System.out.println("	Fill --> " + this.fill);
	}
	
	
	






}


