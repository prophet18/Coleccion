package javaFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;
import java.util.Scanner;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
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
	String score, time, date;
	Button backMenu;
	int scores, times;	
	
	TableView<HighScoreScreen> tView;		TableColumn sc1, ti1, da1;
	ObservableList<HighScoreScreen> listScore = FXCollections.observableArrayList();
	
	
	public HighScoreScreen() throws Exception {
		
		
		
		
		tView = new TableView<HighScoreScreen>();
		
		
		
		
		sc1 = new TableColumn<>("Game Score");
		ti1 = new TableColumn<>("Time Limit");
		da1 = new TableColumn<>("Date, Time, & Zone");
		sc1.setCellValueFactory(new PropertyValueFactory<>("score"));
		ti1.setCellValueFactory(new PropertyValueFactory<>("time"));
		da1.setCellValueFactory(new PropertyValueFactory<>("date"));
		tView.setItems(listScore);
		tView.getColumns().addAll(sc1, ti1, da1);
		// tView.getItems().add(listScore);   
		
		
	
		
		scoring5 = new VBox(10);
		scoring5.getChildren().addAll(tView);
		
		scoring2 = new Scene(scoring5, 750, 650);
		scoring.setScene(scoring2);
		scoring.setTitle("High Scores!");
		
		
		
	}
	
	

	public HighScoreScreen(int scor, int tim, String dte) throws FileNotFoundException {
		scores = scor;		times = tim;		date = dte;
		
	}
	
	public HighScoreScreen(String scor, String tim, String dte) throws FileNotFoundException {
		score = scor;		time = tim;		date = dte;
		
	}

	
	

}
