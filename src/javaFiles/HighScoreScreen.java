package javaFiles;

import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HighScoreScreen {
	
	
	VBox scoring5;
	Stage scoring = new Stage();
	Scene scoring2;
	
	Button backMenu;
	
	TextArea tahs;			Board board;	int score, time;	Date date;
	
	TableView tView;
	
	
	public HighScoreScreen() throws FileNotFoundException {
		
		tView = new TableView();
		
		tahs = new TextArea("Colección Results! \n");	board = new Board();		
		
		Scanner fileRead = new Scanner(board.highScores);
		while (fileRead.hasNextLine()) {
			String data = fileRead.nextLine();
			tahs.appendText(data + "\n");
		}
		fileRead.close();			
		
		scoring5 = new VBox(10);
		scoring5.getChildren().addAll(tahs);
		
		scoring2 = new Scene(scoring5, 750, 650);
		scoring.setScene(scoring2);
		scoring.setTitle("High Scores!");
		
	}
	
	public HighScoreScreen(int scor, int tim, Date dte) throws FileNotFoundException {
		score = scor;		time = tim;		date = dte;
		
	}
	
	

}
