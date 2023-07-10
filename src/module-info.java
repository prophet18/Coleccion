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
 * Filepath for CSS in Cronus - /home/cronus/GitHub/Coleccion/css_styling_coleccion.css
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