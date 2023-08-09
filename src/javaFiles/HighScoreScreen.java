package javaFiles;

import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HighScoreScreen {
	
	
	VBox scoring5;
	Stage scoring = new Stage();
	Scene scoring2;
	
	Button backMenu;
	
	TextArea tahs;			Board board;	int score, time;	String date;
	
	TableView tView;		TableColumn<HighScoreScreen, Integer> sc1, ti1;		TableColumn<HighScoreScreen, String> da1;
	ObservableList listScore;
	
	
	public HighScoreScreen() throws FileNotFoundException {
		
		tView = new TableView();	sc1 = new TableColumn<>("Game Score");		ti1 = new TableColumn<>("Time Limit");
		da1 = new TableColumn<>("Date, Time, & Zone");
		sc1.setCellValueFactory(new PropertyValueFactory<>("score"));
		ti1.setCellValueFactory(new PropertyValueFactory<>("time"));
		da1.setCellValueFactory(new PropertyValueFactory<>("date"));
		tView.getColumns().addAll(sc1, ti1, da1);
		// tView.getItems().add(listScore);   
		
		
		tahs = new TextArea("Colección Results! \n");	board = new Board();		
		
		Scanner fileRead = new Scanner(board.highScores);
		while (fileRead.hasNextLine()) {
			String data = fileRead.nextLine();
			tahs.appendText(data + "\n");
		}
		fileRead.close();			
		
		scoring5 = new VBox(10);
		scoring5.getChildren().addAll(tView);
		
		scoring2 = new Scene(scoring5, 750, 650);
		scoring.setScene(scoring2);
		scoring.setTitle("High Scores!");
		
	}
	
	public HighScoreScreen(int scor, int tim, String dte) throws FileNotFoundException {
		score = scor;		time = tim;		date = dte;
		
	}
	
	

}
