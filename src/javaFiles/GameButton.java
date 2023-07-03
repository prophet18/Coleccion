// Buttons

package javaFiles;

import java.util.ArrayList;
import java.util.Stack;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class GameButton extends Button {
	
	boolean isOn;
	int cardA = 0;
	Stack<Card> cards3 = new Stack<Card>();
	CheckMatch blah;
	Card actcard1, actcard2, actcard3;
	
	ArrayList<Card> toots = new ArrayList<Card>();
	
	public GameButton() {
		isOn = false;
	}
	
	
	
	public GameButton(Card c) {
		isOn = false;
		int cardB = 0;
		
		
		
		EventHandler<ActionEvent> gb = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			
			
			
			if (c.active == true) {
				c.active = false;
				isOn = false;
				cards3.pop();
				downcard(); 
			} else {
				c.active = true;
				isOn = true;
				cards3.push(c);
				upcard(); 
				toots.add(c);
				
			}
			
			toots.get(0).info();
			
				
				/*
				
				
				actcard1 = cards3.peek();	cards3.pop();
				actcard2 = cards3.peek();	cards3.pop();
				actcard3 = cards3.peek();	cards3.pop();
				
				blah = new CheckMatch(actcard1, actcard2, actcard3);
			
				System.out.println(blah.matchCheck);
			*/
			
		}
		};
		
		
		
		
		this.setGraphic(c.view);
		// this.setOnAction(gb);
		
		
	}
	
	

	public void upcard () {
		cardA = cardA + 1;		
	}
	public void downcard () {
		cardA--;
	}
}
