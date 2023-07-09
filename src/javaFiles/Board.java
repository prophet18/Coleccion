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
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;

import java.io.*;

public class Board  {
	
	BooleanProperty isAct = new SimpleBooleanProperty(false);
	Card cardactive1, cardactive2, cardactive3;	
	
	CheckMatch bobo, bobo2, bobo3, bobo4, bobo5, bobo6;
	
	Boolean unless = false;
	
	GameButton	gbu1;
	GameButton	gbu2;
	GameButton	gbu3;
	GameButton	gbu4;
	GameButton	gbu5;
	GameButton	gbu6;
	GameButton	gbu7;
	GameButton	gbu8;
	GameButton	gbu9;
	GameButton	gbu10;
	GameButton	gbu11;
	GameButton	gbu12;

	HashMap<Integer, GameButton> botton;
	
	
	
	public Board() throws FileNotFoundException {
		
		DeckV3 Deck = new DeckV3();
		
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
		
		
		
		gbu1	=	new	GameButton(cards[0]);
		gbu2	=	new	GameButton(cards[1]);
		gbu3	=	new	GameButton(cards[2]);
		gbu4	=	new	GameButton(cards[3]);
		gbu5	=	new	GameButton(cards[4]);
		gbu6	=	new	GameButton(cards[5]);
		gbu7	=	new	GameButton(cards[6]);
		gbu8	=	new	GameButton(cards[7]);
		gbu9	=	new	GameButton(cards[8]);
		gbu10	=	new	GameButton(cards[9]);
		gbu11	=	new	GameButton(cards[10]);
		gbu12	=	new	GameButton(cards[11]);


		
		
		
		botton = new HashMap<Integer, GameButton>();
			botton.put(1, gbu1);	botton.put(2, gbu2);	botton.put(3, gbu3);	botton.put(4, gbu4);
			botton.put(5, gbu5);	botton.put(6, gbu6);	botton.put(7, gbu7);	botton.put(8, gbu8);
			botton.put(9, gbu9);	botton.put(10, gbu10);	botton.put(11, gbu11);	botton.put(12, gbu12);
			
		
			
			
			
			
			
			
			
			
		
		bobo = new CheckMatch (botton.get(2).gb01, botton.get(3).gb01, botton.get(4).gb01);
		
		bobo2 = new CheckMatch (botton.get(5).gb01, botton.get(6).gb01, botton.get(7).gb01);
		
		bobo3 = new CheckMatch (botton.get(9).gb01, botton.get(10).gb01, botton.get(11).gb01);
		
		bobo4 = new CheckMatch (botton.get(1).gb01, botton.get(3).gb01, botton.get(5).gb01);
		
		bobo5 = new CheckMatch (botton.get(2).gb01, botton.get(4).gb01, botton.get(6).gb01);
		
		bobo6 = new CheckMatch (botton.get(7).gb01, botton.get(5).gb01, botton.get(10).gb01);
		
			
			
		if (bobo.matchCheck == true) {
			bobo.listCards();
		} else if (bobo2.matchCheck == true) {
			bobo2.listCards();
		} else if (bobo3.matchCheck == true) {
			bobo3.listCards();
		} else if (bobo4.matchCheck == true) {
			bobo4.listCards();
		} else if (bobo4.matchCheck == true) {
			bobo4.listCards();
		} else if (bobo5.matchCheck == true) {
			bobo5.listCards();    	
    	
		
	}
		
		
		
		
		
	
		/*
	
		GridPane goGrid = new GridPane();	goGrid.setMinSize(1000, 800);		goGrid.setPadding(new Insets(5, 5, 5, 5));
		 		 goGrid.setVgap(10);		goGrid.setHgap(10);					goGrid.setAlignment(Pos.CENTER);
		 
		goGrid.add(botton.get(1), 0, 0);	goGrid.add(botton.get(2), 0, 1);	goGrid.add(botton.get(3), 0, 2);		 goGrid.add(botton.get(4), 1, 0);
		goGrid.add(botton.get(5), 1, 1);	goGrid.add(botton.get(6), 1, 2);	goGrid.add(botton.get(7), 2, 0);		 goGrid.add(botton.get(8), 2, 1);
		goGrid.add(botton.get(9), 2, 2);	goGrid.add(botton.get(10), 3, 0);	goGrid.add(botton.get(11), 3, 1);		 goGrid.add(botton.get(12), 3, 2);
		
		*/
		
	}
	
	
	public GridPane goGrid() throws FileNotFoundException{
		
		
		
		
		
		 GridPane goGrid = new GridPane();	goGrid.setMinSize(1000, 800);		goGrid.setPadding(new Insets(5, 5, 5, 5));
		 goGrid.setVgap(10);				goGrid.setHgap(10);					goGrid.setAlignment(Pos.CENTER);

		 goGrid.add(botton.get(1), 0, 0);	goGrid.add(botton.get(2), 0, 1);	goGrid.add(botton.get(3), 0, 2);		 goGrid.add(botton.get(4), 1, 0);
		 goGrid.add(botton.get(5), 1, 1);	goGrid.add(botton.get(6), 1, 2);	goGrid.add(botton.get(7), 2, 0);		 goGrid.add(botton.get(8), 2, 1);
		 goGrid.add(botton.get(9), 2, 2);	goGrid.add(botton.get(10), 3, 0);	goGrid.add(botton.get(11), 3, 1);		 goGrid.add(botton.get(12), 3, 2);
		 
		 
		 Image bamboo2 = new Image(new FileInputStream("C://Users//deane//GitHub//Coleccion//bamboo_scroll_art_2.jpg"));
			
			// Filepath for images on Grendel - C://Users//deane//MEGAsync//Colección//bamboo_scroll_art_2.jpg
			// Filepath for images on Cronus - /home/cronus/GitHub/Coleccion/bamboo_scroll_art_2.jpg
						
			BackgroundImage bgImg2 = new BackgroundImage(bamboo2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
							new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));

			Background bgImg3 = new Background(bgImg2);
		 
		 
		 
		 goGrid.setBackground(bgImg3);
		 
		return goGrid;
	}
	
	public Boolean matching() {
		
		for (int w : botton.keySet()) {
			
			
			
			
			
			
			
			
			
			System.out.println(w + " " + botton.get(w).gb01.color);
		}
	
		
		
		unless = true;
		return unless;
		
	}
	
	
	
	

}




/*


*/