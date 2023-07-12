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
	Card actcard1, actcard2, actcard3, ugh;
	
	ArrayList<Card> toots = new ArrayList<Card>();
	
	public GameButton() {
		isOn = false;
	}
	
	
	
	public GameButton(Card c) {
		isOn = false;
		int cardB = 0;
		c = ugh;
		
		
		
		EventHandler<ActionEvent> gb = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			
			
			
			if (ugh.active == true) {
				ugh.active = false;
				isOn = false;
				cards3.pop();
				downcard(); 
			} else {
				ugh.active = true;
				isOn = true;
				cards3.push(ugh);
				upcard(); 
				toots.add(ugh);
				
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
	
	public void info2() {
		System.out.println("Card Properties: ");
		System.out.println("	Color --> " + this.ugh.color);
		System.out.println("	Number --> " + this.ugh.number);
		System.out.println("	Type --> " + this.ugh.shape);
		System.out.println("	Fill --> " + this.ugh.fill);
	}

	public void upcard () {
		cardA = cardA + 1;		
	}
	public void downcard () {
		cardA--;
	}
}
