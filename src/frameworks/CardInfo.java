// File for properties of cards, obtaining info and image addition

package frameworks;

import java.util.*;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.*;

/*
import java.awt.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.Element;
import javax.swing.text.html.ImageView;
*/

/*
import javafx.fxml.FXML;
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.Node;
import javafx.scene.control.Button;  
import javafx.scene.layout.StackPane; 
import javafx.scene.image.*;
import javafx.stage.Stage; .*/


public class CardInfo {
	
	String shapeColor, shapeType, shapeFill, filePath; int shapeNumber;
	
	File imagePath;		FileInputStream inputImage;		
	
	
	Image cardImage;
	
	ImageView cardImg;	Button cardButton;
	
	/*
	BufferedImage cardImage1;	JLabel cardLabel;	JPanel cardPanel;	JFrame cardFrame;
	*/
	
	
	public CardInfo(String sColor, int sNumber, String sType, String sFill) {
		shapeColor = sColor;
		shapeNumber = sNumber;
		shapeType = sType;
		shapeFill = sFill;
	}
	
	public CardInfo(String sColor, int sNumber, String sType, String sFill, String pathFile) {
		shapeColor = sColor;
		shapeNumber = sNumber;
		shapeType = sType;
		shapeFill = sFill;
		filePath = pathFile;
		cardImage = null;
	}
	
	public CardInfo(String sColor, int sNumber, String sType, String sFill, ImageView cImg) {
		shapeColor = sColor;
		shapeNumber = sNumber;
		shapeType = sType;
		shapeFill = sFill;
		cardImg = cImg;
	}
	
	public void imad (Image cImg) {
		cardImage = cImg;
	}

	public void addImage (String pathFile) throws IOException {
		filePath = pathFile;
		imagePath = new File (filePath);
		inputImage = new FileInputStream(imagePath);		
		// cardImage = new Image(filePath);		
		// cardImg = new ImageView(cardImage);
		// cardButton.setGraphic(cardImg);
		
		/*
		cardImage1 = ImageIO.read(imagePath);
		cardLabel = new JLabel(new ImageIcon(cardImage1));
		cardPanel = new JPanel();
		cardPanel.add(cardLabel);
		cardFrame = new JFrame();
		cardFrame.setSize(800, 800);
		cardFrame.add(cardPanel);
		cardFrame.setVisible(true);
		*/
	}
	
	public void shapeInfo() {
		System.out.println("Card Properties: ");
		System.out.println("	Color --> " + this.shapeColor);
		System.out.println("	Number --> " + this.shapeNumber);
		System.out.println("	Type --> " + this.shapeType);
		System.out.println("	Fill --> " + this.shapeFill);
	}
	
	
	
}

