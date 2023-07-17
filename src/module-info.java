import java.io.FileInputStream;

import javaFiles.CheckMatch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

/**
 * @author deane
 * 
 * Notes
 * 
 * 
 * Filepath for JavaFX on Grendel -
 * Filepath for JavaFX on Cronus - /usr/lib/jvm/java-20-openjdk/
 * Filepath for images on Cronus - /home/cronus/GitHub/Coleccion/bamboo_scroll_art_2.jpg
 * Filepath for images on Grendel - C://Users//deane//GitHub//Coleccion//bamboo_scroll_art_2.jpg
 * 
 * Filepath for icons / buttons on Grendel - C://Users//deane//GitHub//Coleccion//Draw_Build_Files//PauseIcon.png
 * 											 C://Users//deane//GitHub//Coleccion//Draw_Build_Files//ScoreIcon.png
 * 											 C://Users//deane//GitHub//Coleccion//Draw_Build_Files//TimerIcon.png
 * 
 * Filepath for icons / buttons on Cronus - /home/cronus/GitHub/Coleccion/Draw_Build_Files/PauseIcon.png
 * 											/home/cronus/GitHub/Coleccion/Draw_Build_Files/ScoreIcon.png
 * 											/home/cronus/GitHub/Coleccion/Draw_Build_Files/TimerIcon.png
 * 
 * Filepath for Main Menu Items on Grendel -	C://Users//deane//GitHub//Coleccion//Collection_Logo_2.png
 * 												C://Users//deane//GitHub//Coleccion//Draw_Build_Files//StartGameButton.png
 * 												C://Users//deane//GitHub//Coleccion//Draw_Build_Files//ContinueGameButton.png
 * 												C://Users//deane//GitHub//Coleccion//SettingsButton.png
 * 												C://Users//deane//GitHub//Coleccion//Draw_Build_Files//HelpButton.png * 
 * 
 * Filepath for Main Menu Items on Cronus -	/home/cronus/GitHub/Coleccion/Collection_Logo_2.png
 * 											/home/cronus/GitHub/Coleccion/Draw_Build_Files/StartGameButton.png
 * 											/home/cronus/GitHub/Coleccion/Draw_Build_Files/ContinueGameButton.png
 * 											/home/cronus/GitHub/Coleccion/SettingsButton.png
 * 											/home/cronus/GitHub/Coleccion/Draw_Build_Files/HelpButton.png
 * 
 * 
 * 
 * 
 * Filepath for CSS in Cronus - /home/cronus/GitHub/Coleccion/css_styling_coleccion.css
 * 
 * 
 * 
 * c<ActionEvent> gbeh  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e;

		public void handle(ActionEvent e) {
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
			
			if (aa1 == 3) {
				chk1 = new CheckMatch (upcards.get(1), upcards.get(2), upcards.get(3));
				chk1.result();
			}			
			
		}
		
		};  
		
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * EventHandler<ActionEvent> eh1  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[0].active == true && botton.get(1).isOn == true) {
    			cards[0].active = false;	botton.get(1).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[0]);
					break;
				case 2:
					cardmap.remove(2, cards[0]);
					break;
				case 3:
					cardmap.remove(3, cards[0]);
					break;
			}    			
    			
    		} else {
    			cards[0].active = true;	botton.get(1).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[0]);
					break;
				case 2:
					cardmap.put(2, cards[0]);
					break;
				case 3:
					cardmap.put(3, cards[0]);
					break;
			}    			
    			gbu1.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}			
			
    	}
    	};
			
    	gbu1.setOnAction(eh1);	gbu1.setId("gamebutton");
			
    	EventHandler<ActionEvent> eh2  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[1].active == true && botton.get(2).isOn == true) {
    			cards[1].active = false;	botton.get(2).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[1]);
					break;
				case 2:
					cardmap.remove(2, cards[1]);
					break;
				case 3:
					cardmap.remove(3, cards[1]);
					break;
			}    			
    			
    		} else {
    			cards[1].active = true;	botton.get(2).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[1]);
					break;
				case 2:
					cardmap.put(2, cards[1]);
					break;
				case 3:
					cardmap.put(3, cards[1]);
					break;
			}    			
    			gbu2.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu2.setOnAction(eh2);	gbu2.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh3  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[2].active == true && botton.get(3).isOn == true) {
    			cards[2].active = false;	botton.get(3).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[2]);
					break;
				case 2:
					cardmap.remove(2, cards[2]);
					break;
				case 3:
					cardmap.remove(3, cards[2]);
					break;
			}    			
    			
    		} else {
    			cards[2].active = true;	botton.get(3).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[2]);
					break;
				case 2:
					cardmap.put(2, cards[2]);
					break;
				case 3:
					cardmap.put(3, cards[2]);
					break;
			}    			
    			gbu3.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    
    	gbu3.setOnAction(eh3);	gbu3.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh4  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[3].active == true && botton.get(4).isOn == true) {
    			cards[3].active = false;	botton.get(4).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[3]);
					break;
				case 2:
					cardmap.remove(2, cards[3]);
					break;
				case 3:
					cardmap.remove(3, cards[3]);
					break;
			}    			
    			
    		} else {
    			cards[3].active = true;	botton.get(4).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[3]);
					break;
				case 2:
					cardmap.put(2, cards[3]);
					break;
				case 3:
					cardmap.put(3, cards[3]);
					break;
			}    			
    			gbu4.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu4.setOnAction(eh4);	gbu4.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh5  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[4].active == true && botton.get(5).isOn == true) {
    			cards[4].active = false;	botton.get(5).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[4]);
					break;
				case 2:
					cardmap.remove(2, cards[4]);
					break;
				case 3:
					cardmap.remove(3, cards[4]);
					break;
			}    			
    			
    		} else {
    			cards[4].active = true;	botton.get(5).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[4]);
					break;
				case 2:
					cardmap.put(2, cards[4]);
					break;
				case 3:
					cardmap.put(3, cards[4]);
					break;
			}    			
    			gbu5.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu5.setOnAction(eh5);	gbu5.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh6  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[5].active == true && botton.get(6).isOn == true) {
    			cards[5].active = false;	botton.get(6).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[5]);
					break;
				case 2:
					cardmap.remove(2, cards[5]);
					break;
				case 3:
					cardmap.remove(3, cards[5]);
					break;
			}    			
    			
    		} else {
    			cards[5].active = true;	botton.get(6).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[5]);
					break;
				case 2:
					cardmap.put(2, cards[5]);
					break;
				case 3:
					cardmap.put(3, cards[5]);
					break;
			}    			
    			gbu6.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu6.setOnAction(eh6);	gbu6.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh7  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[6].active == true && botton.get(7).isOn == true) {
    			cards[6].active = false;	botton.get(7).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[6]);
					break;
				case 2:
					cardmap.remove(2, cards[6]);
					break;
				case 3:
					cardmap.remove(3, cards[6]);
					break;
			}    			
    			
    		} else {
    			cards[6].active = true;	botton.get(7).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[6]);
					break;
				case 2:
					cardmap.put(2, cards[6]);
					break;
				case 3:
					cardmap.put(3, cards[6]);
					break;
			}    			
    			gbu7.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu7.setOnAction(eh7);	gbu7.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh8  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[7].active == true && botton.get(8).isOn == true) {
    			cards[7].active = false;	botton.get(8).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[7]);
					break;
				case 2:
					cardmap.remove(2, cards[7]);
					break;
				case 3:
					cardmap.remove(3, cards[7]);
					break;
			}    			
    			
    		} else {
    			cards[7].active = true;	botton.get(8).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[7]);
					break;
				case 2:
					cardmap.put(2, cards[7]);
					break;
				case 3:
					cardmap.put(3, cards[7]);
					break;
			}    			
    			gbu8.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu8.setOnAction(eh8);	gbu8.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh9  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[8].active == true && botton.get(9).isOn == true) {
    			cards[8].active = false;	botton.get(9).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[8]);
					break;
				case 2:
					cardmap.remove(2, cards[8]);
					break;
				case 3:
					cardmap.remove(3, cards[8]);
					break;
			}    			
    			
    		} else {
    			cards[8].active = true;	botton.get(9).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[8]);
					break;
				case 2:
					cardmap.put(2, cards[8]);
					break;
				case 3:
					cardmap.put(3, cards[8]);
					break;
			}    			
    			gbu9.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu9.setOnAction(eh9);	gbu9.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh10  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[9].active == true && botton.get(10).isOn == true) {
    			cards[9].active = false;	botton.get(10).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[9]);
					break;
				case 2:
					cardmap.remove(2, cards[9]);
					break;
				case 3:
					cardmap.remove(3, cards[9]);
					break;
			}    			
    			
    		} else {
    			cards[9].active = true;	botton.get(10).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[9]);
					break;
				case 2:
					cardmap.put(2, cards[9]);
					break;
				case 3:
					cardmap.put(3, cards[9]);
					break;
			}    			
    			gbu10.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu10.setOnAction(eh10);	gbu10.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh11  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[10].active == true && botton.get(11).isOn == true) {
    			cards[10].active = false;	botton.get(11).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[10]);
					break;
				case 2:
					cardmap.remove(2, cards[10]);
					break;
				case 3:
					cardmap.remove(3, cards[10]);
					break;
			}    			
    			
    		} else {
    			cards[10].active = true;	botton.get(11).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[10]);
					break;
				case 2:
					cardmap.put(2, cards[10]);
					break;
				case 3:
					cardmap.put(3, cards[10]);
					break;
			}    			
    				
    			gbu11.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu11.setOnAction(eh11);	gbu11.setId("gamebutton");
    	
    	EventHandler<ActionEvent> eh12  = new EventHandler<ActionEvent>() {public void handle(ActionEvent e) {
			if (cards[11].active == true && botton.get(12).isOn == true) {
    			cards[11].active = false;	botton.get(12).isOn = false;
    			--ncarda;
    			switch (ncarda) {
				case 1:
					cardmap.remove(1, cards[11]);
					break;
				case 2:
					cardmap.remove(2, cards[11]);
					break;
				case 3:
					cardmap.remove(3, cards[11]);
					break;
			}    			
    			
    		} else {
    			cards[11].active = true;	botton.get(12).isOn = true;
    			ncarda++;
    			switch (ncarda) {
				case 1:
					cardmap.put(1, cards[11]);
					break;
				case 2:
					cardmap.put(2, cards[11]);
					break;
				case 3:
					cardmap.put(3, cards[11]);
					break;
			}    			
    				
    			gbu12.info();
    		}
			
			if (ncarda == 3) {
				bobo = new CheckMatch (cardmap.get(1), cardmap.get(2), cardmap.get(3));
				bobo.result();
			}
			
			
    	}
    	};
    	
    	gbu12.setOnAction(eh12);	gbu12.setId("gamebutton");
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *
 */

module Colección {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.base;
	requires javafx.fxml;
	requires java.desktop;
	
	exports frameworks;
	exports javaFiles;
}