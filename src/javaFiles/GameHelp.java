// Help Screen GUI...

package javaFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameHelp {
	
	Stage age1 = new Stage();
	Stage age2 = new Stage();
	
	HBox ghhb1, ghhb2;
	VBox ghvb1, ghvb2;
	Scene ghsc1, ghsc2;
	Label title, intro;
	TextArea props, examples;
	Image help;
	ImageView helps;
	Button help2, help3;	
	
	public GameHelp() throws FileNotFoundException {
		
		help2 = new Button("Next Page");
		help3 = new Button("Previous Page");
		
		title = new Label("Colección");
		intro = new Label("How to play: \n"	+ "The goal of Colección is to find sets of three cards, \n" +
				"that fulfill the requirements for matching as rapidly as possible. \n" +
				"There are 4 properties that define the image on each card: \n");
		props = new TextArea("Color \n" + "Each card has 1 of 4 possible colors: \n Blue, Orange, Green, and Red. \n" +
				"Number \n" + "The number of shapes present on the card: \n 1, 2, or 3. \n" +
				"Type \n" + "There are 4 different kinds of shapes in the game: \n Triangles, Parallelograms, Semicircles, and Rectangles \n" +
				"Fill \n" + "Each shape will have 1 of 3 patterns: \n Solid, Empty, or Grid.");
		examples = new TextArea("A “Colección” is a set where 3 cards either share the same characteristic for a property, \n" +
				"or have different, unique characteristics, for all 4 properties. \n" +
				"Example – Color \n" + "If three cards are all Blue, the color property for a Colección is satisfied. \n" +
				"If one card is Blue, the second Red, and the third Green, the color property is likewise satisfied. \n" +
				"If two cards are Orange, and one Blue, the color property is NOT satisfied. \n" +
				"Example – Number \n" + "If three cards each have one shape on them, the number property is satisfied. \n" +
				"If one card has one shape, another, two shapes, and the third has three shapes, the number property is likewise satisfied. \n" +
				"If one card has two shapes, and the other two have three shapes, the number property is NOT satisfiied. \n" +
				"Example – Type \n" + "If all three cards are semicircle shaped, the type property is satisfied. \n" +
				"If one card is rectangular, another, triangular, and the last, a parallelogram, the type property is likewise satisfied. \n" +
				"If two cards are semicircles, and the third is a triangle, the type property is NOT satisfied. \n" +
				"Example – Fill \n" + "If all three cards have a fill of empty, the fill property is satisfied. \n" +
				"If one card has a solid fill, another, grid, and a third, empty, the fill property is satisfied. \n" +
				"If two cards have a grid filling, and the third, solid, the fill property is NOT satisfied. \n" +
				"A coleccion is not valid unless the requirements for ALL four properties are fulfilled.");		
		
		props.setEditable(false);		examples.setEditable(false);
		props.setWrapText(true); 		examples.setWrapText(true);		examples.setMinSize(500, 500);		
		
		help = new Image(new FileInputStream("./Draw_Build_Files/CardHelpInfo1.png"));
		helps = new ImageView(help);
		helps.setFitWidth(400);
		helps.setFitHeight(380);
		
		// title.setId("HsTitle");		intro.setId("HsIntro");		props.setId("HsProps");		examples.setId("HsExamples");
		
		title.setId("HsTitle");		intro.setId("HsIntro");		props.setId("HsProps");		examples.setId("HsExamples");
		
		
		Image qmi1 = new Image(new FileInputStream("./Draw_Build_Files/Question_mark_uno.jpg"));
		BackgroundImage qmi2 = new BackgroundImage(qmi1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true));

		Background qmi3 = new Background(qmi2);		
		
		ghhb1 = new HBox(10);		ghhb2 = new HBox(10);		ghvb1 = new VBox(10);		ghvb2 = new VBox(10);
		
		ghhb1.setAlignment(Pos.CENTER);		ghhb2.setAlignment(Pos.CENTER);
		
		ghvb1.setAlignment(Pos.CENTER);		ghvb2.setAlignment(Pos.CENTER);
		
		ghhb1.getChildren().addAll(props, helps);
		
		ghvb1.getChildren().addAll(title, intro, ghhb1, help2);
				
		ghvb2.getChildren().addAll(examples, help3);		
		
		ghvb1.setBackground(qmi3);		ghvb2.setBackground(qmi3);
		
		ghsc1 = new Scene(ghvb1, 920, 630);		
		ghsc2 = new Scene(ghvb2, 920, 630);
		
		age1.setScene(ghsc1);
		age1.setTitle("Colección Help: Page 1");
		
		age2.setScene(ghsc2);
		age2.setTitle("Colección Help: Page 2");

		EventHandler<ActionEvent> pnext = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				age2.show();
				age1.close();
			}
		};
		
		help2.setOnAction(pnext);
		
		EventHandler<ActionEvent> pprev = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				age1.show();
				age2.close();
			}
		};
		
		help3.setOnAction(pprev);
		
		ghsc1.getStylesheets().add("file:Coleccion_Styling.css");			
		ghsc2.getStylesheets().add("file:Coleccion_Styling.css");			
		
	}
}

