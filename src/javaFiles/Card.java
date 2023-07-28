// Class for card setup / data import
// Defines card properties, basic functions
// Windows 10
// Elliot Dean
// 19 June 22023

package javaFiles;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Card {
	
	String color, shape, fill, path; int number; Boolean active2;
	Image image; ImageView view;
	
	public Card (String sColor, int sNumber, String sType, String sFill, String pathFile) {
		color = sColor;
		number = sNumber;
		shape = sType;
		fill = sFill;
		path = pathFile;
		image = null;
		view = null;
		active2 = false;
	}
	
	public void imgAdd (Image cImg) {
		image = cImg;
		view = new ImageView(image);
		view.setFitWidth(160);
		view.setFitHeight(251);
	}
	
	public boolean isActive2 () {
		return active2;
	}
	
	public void info() {
		System.out.println("Card Properties: ");
		System.out.println("	Color --> " + this.color);
		System.out.println("	Number --> " + this.number);
		System.out.println("	Type --> " + this.shape);
		System.out.println("	Fill --> " + this.fill);
	}
	
	/*
	
	*/
	
}
