package javaFiles;

import java.beans.EventHandler;
import java.util.HashMap;

import javafx.event.ActionEvent;

public class CheckCards extends ActionEvent {
	
	boolean isOn, active;
	int nca = 0;
	CheckMatch chk1;
	HashMap<Integer, Card> upcards;
	Card card;
	
	public void handle(CheckCards e) {
		if (this.active == true) {
			this.isOn = false;
			System.out.println(nca);
			--nca;
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
			this.isOn = true;	
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
		
	}
	
	};  
	
	
	
	


