// First step for card setup / data import
// Windows 10
// Elliot Dean
// 19 June 22023

package javaFiles;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Card {
	
	String color, shape, fill, path; int number; Boolean active;
	Image image; ImageView view;
	
	public Card (String sColor, int sNumber, String sType, String sFill, String pathFile) {
		color = sColor;
		number = sNumber;
		shape = sType;
		fill = sFill;
		path = pathFile;
		image = null;
		view = null;
		active = false;
	}
	
	public void imgAdd (Image cImg) {
		image = cImg;
		view = new ImageView(image);
		view.setFitWidth(84);
		view.setFitHeight(132);
	}
	
	public boolean isActive () {
		return active;
	}
	
	/*
	
	*/
	
}
