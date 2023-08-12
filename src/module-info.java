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
 *
 */

module Colección {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.base;
	requires javafx.fxml;
	requires java.desktop;
	requires java.sql;
	
	exports frameworks;
	exports javaFiles;
}