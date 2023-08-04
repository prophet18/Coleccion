package javaFiles;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HighScoreScreen {
	
	
	VBox scoring5;
	Stage scoring = new Stage();
	Scene scoring2;
	
	Button backMenu;
	
	TextArea tahs;			Board board;
	
	
	public HighScoreScreen() throws FileNotFoundException {
		
		tahs = new TextArea("Colección Results! \n");	board = new Board();
		
		
		Scanner fileRead = new Scanner(board.highScores);
		while (fileRead.hasNextLine()) {
			String data = fileRead.nextLine();
			System.out.println(data);
			tahs.appendText(data + "\n");
		}
		fileRead.close();	
		
		
		scoring5 = new VBox(10);
		scoring5.getChildren().addAll(tahs);
		
		scoring2 = new Scene(scoring5, 750, 650);
		scoring.setScene(scoring2);
		scoring.setTitle("High Scores!");
		
	}
	
	
	
	

}
