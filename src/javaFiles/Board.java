// Class for board setup and function

package javaFiles;

import java.util.*;
import javaFiles.Card;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.io.*;

public class Board  {
	
	BooleanProperty isAct = new SimpleBooleanProperty(false);
	Card cardactive1, cardactive2, cardactive3;	
	
	
	public Board() throws FileNotFoundException {
		
		DeckV2 Deck = new DeckV2();
		
		Collections.shuffle(Deck);
	
		Card[] cards = new Card[12];    	
    	
    	for (int i = 0; i < 12; i++) {
    		cards[i] = Deck.peek();
    		Deck.pop();    	
    	}
    	
    	GameButton	gBone = new GameButton(	cards[0]);
    	GameButton	gBtwo = new GameButton(	cards[1]);
    	GameButton	gBthree = new GameButton(	cards[2]);
    	GameButton	gBfour = new GameButton(	cards[3]);
    	GameButton	gBfive = new GameButton(	cards[4]);
    	GameButton	gBsix = new GameButton(	cards[5]);
    	GameButton	gBseven = new GameButton(	cards[6]);
    	GameButton	gBeight = new GameButton(	cards[7]);
    	GameButton	gBnine= new GameButton(	cards[8]);
    	GameButton	gBten = new GameButton(	cards[9]);
    	GameButton	gBeleven= new GameButton(	cards[10]);
    	GameButton	gBtwelve= new GameButton(	cards[11]);
    	
    	EventHandler<ActionEvent> 	event1  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e)
    		{if (cards[0].active == true) {
    			cards[0].active = false;
    			} else {
    				cards[0].active = true;
    				
    				System.out.println(" DPPPPNS ");
    				}
    			}
    	};
    	
    	EventHandler<ActionEvent> 	event2  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e)	{if (cards[1].active == true) {cards[1].active = false;} else {cards[1].active = true;}}};
    	EventHandler<ActionEvent> 	event3  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e)	{if (cards[2].active == true) {cards[2].active = false;} else {cards[2].active = true;}}};
    	EventHandler<ActionEvent> 	event4  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e)	{if (cards[3].active == true) {cards[3].active = false;} else {cards[3].active = true;}}};
    	EventHandler<ActionEvent> 	event5 = new EventHandler<ActionEvent>() {public void handle(ActionEvent e)		{if (cards[4].active == true) {cards[4].active = false;} else {cards[4].active = true;}}};
    	EventHandler<ActionEvent> 	event6  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e)	{if (cards[5].active == true) {cards[5].active = false;} else {cards[5].active = true;}}};
    	EventHandler<ActionEvent> 	event7  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e)	{if (cards[6].active == true) {cards[6].active = false;} else {cards[6].active = true;}}};
    	EventHandler<ActionEvent> 	event8  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e)	{if (cards[7].active == true) {cards[7].active = false;} else {cards[7].active = true;}}};
    	EventHandler<ActionEvent> 	event9  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e)	{if (cards[8].active == true) {cards[8].active = false;} else {cards[8].active = true;}}};
    	EventHandler<ActionEvent> 	event10  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e)	{if (cards[9].active == true) {cards[9].active = false;} else {cards[9].active = true;}}};
    	EventHandler<ActionEvent> 	event11  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e)	{if (cards[10].active == true) {cards[10].active = false;} else {cards[10].active = true;}}};
    	EventHandler<ActionEvent> 	event12  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e)	{if (cards[11].active == true) {cards[11].active = false;} else {cards[11].active = true;}}};

    	gBone.setOnAction	(event1);
    	gBtwo.setOnAction	(event2);
    	gBthree.setOnAction	(event3);
    	gBfour.setOnAction	(event4);
    	gBfive.setOnAction	(event5);
    	gBsix.setOnAction	(event6);
    	gBseven.setOnAction	(event7);
    	gBeight.setOnAction	(event8);
    	gBnine.setOnAction	(event9);
    	gBten.setOnAction	(event10);
    	gBeleven.setOnAction	(event11);
    	gBtwelve.setOnAction	(event12);
    	
    	
    	
    	
    	
    	
    	ChangeListener<Boolean> boot = new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
				isAct.set(true);
				System.out.println(" chacha ");
			}

			

			
		};
    	
		isAct.addListener(boot);
		
		
		
		
		
		
		
		
		
		
    	
    	
    	
    	
    	
		
	}
	
	
	
	
	
	
	
	

}




/*


*/